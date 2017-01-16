#include <stdlib.h>
#include <string>
#include <jni.h>
#include <medialibrary/IDeviceLister.h>
#define LOG_TAG "VLC/JNI/MediaLibrary"
#include "log.h"
#include "utils.h"
#include "AndroidMediaLibrary.h"

static JavaVM *myVm;
fields ml_fields;
bool m_IsInitialized = false;

#define CLASSPATHNAME "org/videolan/medialibrary/Medialibrary"

static inline void throw_IllegalStateException(JNIEnv *env, const char *p_error);
static inline void throw_IllegalArgumentException(JNIEnv *env, const char *p_error);
static AndroidMediaLibrary *MediaLibrary_getInstanceInternal(JNIEnv *env, jobject thiz);
AndroidMediaLibrary *MediaLibrary_getInstance(JNIEnv *env, jobject thiz);


static void
MediaLibrary_setInstance(JNIEnv *env, jobject thiz, AndroidMediaLibrary *p_obj);

void
setup(JNIEnv* env, jobject thiz) {
    AndroidMediaLibrary *aml = new  AndroidMediaLibrary(myVm, &ml_fields, thiz);
    MediaLibrary_setInstance(env, thiz, aml);
}

jboolean
init(JNIEnv* env, jobject thiz, jstring dbPath, jstring thumbsPath)
{
    const char *db_utfchars = env->GetStringUTFChars(dbPath, JNI_FALSE);
    const char *thumbs_utfchars = env->GetStringUTFChars(thumbsPath, JNI_FALSE);
    const std::string stringDbPath(db_utfchars), stringThumbsPath(thumbs_utfchars);
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    m_IsInitialized = aml->initML(stringDbPath, stringThumbsPath);
    env->ReleaseStringUTFChars(dbPath, db_utfchars);
    env->ReleaseStringUTFChars(thumbsPath, thumbs_utfchars);
    return m_IsInitialized;
}

void release(JNIEnv* env, jobject thiz)
{
    LOGD("/!\\ release medialib. /!\\");
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    delete aml;
    MediaLibrary_setInstance(env, thiz, NULL);
}

void
banFolder(JNIEnv* env, jobject thiz, jstring folderPath)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    const char *path = env->GetStringUTFChars(folderPath, JNI_FALSE);
    const std::string stringPath(path);
    aml->banFolder(stringPath);
    env->ReleaseStringUTFChars(folderPath, path);
}

void addDevice(JNIEnv* env, jobject thiz, jstring uuid, jstring storagePath, jboolean removable)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    const char *uuidChar = env->GetStringUTFChars(uuid, JNI_FALSE);
    const char *path = env->GetStringUTFChars(storagePath, JNI_FALSE);
    aml->addDevice(uuidChar, path, removable);
    env->ReleaseStringUTFChars(uuid, uuidChar);
    env->ReleaseStringUTFChars(storagePath, path);
}

jobjectArray
devices(JNIEnv* env, jobject thiz)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    auto devices = aml->devices();
    jobjectArray deviceRefs = (jobjectArray) env->NewObjectArray(devices.size(), env->FindClass("java/lang/String"), NULL);
    int index = -1;
    for(auto device : devices) {
        std::string path = std::get<1>(device);
        env->SetObjectArrayElement(deviceRefs, ++index, env->NewStringUTF(path.c_str()));
    }
    return deviceRefs;
}

void
discover(JNIEnv* env, jobject thiz, jstring storagePath)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    const char *path = env->GetStringUTFChars(storagePath, JNI_FALSE);
    aml->discover(path);
    env->ReleaseStringUTFChars(storagePath, path);
}

void
removeEntryPoint(JNIEnv* env, jobject thiz, jstring storagePath)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    const char *path = env->GetStringUTFChars(storagePath, JNI_FALSE);
    aml->removeEntryPoint(path);
    env->ReleaseStringUTFChars(storagePath, path);
}

jobjectArray
entryPoints(JNIEnv* env, jobject thiz)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    std::vector<medialibrary::FolderPtr> entryPoints = aml->entryPoints();
    entryPoints.erase(std::remove_if( begin( entryPoints ), end( entryPoints ), []( const medialibrary::FolderPtr f ) { return f->isPresent() == false; } ), end( entryPoints ));
    jobjectArray mediaRefs = (jobjectArray) env->NewObjectArray(entryPoints.size(), env->FindClass("java/lang/String"), NULL);
    int index = -1;
    for(medialibrary::FolderPtr const& entrypoint : entryPoints) {
        env->SetObjectArrayElement(mediaRefs, ++index, env->NewStringUTF(entrypoint->mrl().c_str()));
    }
    return mediaRefs;
}

jboolean
removeDevice(JNIEnv* env, jobject thiz, jstring uuid)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    const char *uuidChar = env->GetStringUTFChars(uuid, JNI_FALSE);
    const std::string stringUuid(uuidChar);
    jboolean removed = aml->removeDevice(stringUuid);
    env->ReleaseStringUTFChars(uuid, uuidChar);
    return removed;
}

jboolean
isWorking(JNIEnv* env, jobject thiz)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    return (jboolean) aml->isWorking();
}

void
setMediaUpdatedCbFlag(JNIEnv* env, jobject thiz, jint flags)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    aml->setMediaUpdatedCbFlag(flags);
}

void
setMediaAddedCbFlag(JNIEnv* env, jobject thiz, jint flags)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    aml->setMediaAddedCbFlag(flags);
}

void
pauseBackgroundOperations(JNIEnv* env, jobject thiz)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    aml->pauseBackgroundOperations();
}

void
resumeBackgroundOperations(JNIEnv* env, jobject thiz)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    aml->resumeBackgroundOperations();
}

void
reload(JNIEnv* env, jobject thiz)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    aml->reload();
}

void
reloadEntryPoint(JNIEnv* env, jobject thiz, jstring entryPoint)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    const char *path = env->GetStringUTFChars(entryPoint, JNI_FALSE);
    const std::string stringPath(path);
    aml->reload(stringPath);
    env->ReleaseStringUTFChars(entryPoint, path);
}

jboolean
increasePlayCount(JNIEnv* env, jobject thiz, jlong id)
{
    return MediaLibrary_getInstance(env, thiz)->increasePlayCount((int64_t)id);
}

jboolean
updateProgress(JNIEnv* env, jobject thiz, jlong id, jlong time)
{
    return MediaLibrary_getInstance(env, thiz)->updateProgress((int64_t)id, (int64_t) time);
}

jobjectArray
lastMediaPLayed(JNIEnv* env, jobject thiz)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    std::vector<medialibrary::MediaPtr> mediaPlayed = aml->lastMediaPlayed();
    jobjectArray mediaRefs = (jobjectArray) env->NewObjectArray(mediaPlayed.size(), ml_fields.MediaWrapper.clazz, NULL);
    int index = -1;
    for(medialibrary::MediaPtr const& media : mediaPlayed) {
        jobject item = mediaToMediaWrapper(env, &ml_fields, media);
        env->SetObjectArrayElement(mediaRefs, ++index, item);
        env->DeleteLocalRef(item);
    }
    return mediaRefs;
}

jboolean
addToHistory(JNIEnv* env, jobject thiz, jstring mrl, jstring title)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    const char *mrl_cstr = env->GetStringUTFChars(mrl, JNI_FALSE);
    const char *title_cstr = env->GetStringUTFChars(title, JNI_FALSE);
    jboolean ok = aml->addToHistory(mrl_cstr, title_cstr);
    env->ReleaseStringUTFChars(mrl, mrl_cstr);
    env->ReleaseStringUTFChars(title, title_cstr);
    return ok;
}

jobjectArray
lastStreamsPlayed(JNIEnv* env, jobject thiz)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    std::vector<medialibrary::HistoryPtr> streamsPlayed = aml->lastStreamsPlayed();
    jobjectArray streamRefs = (jobjectArray) env->NewObjectArray(streamsPlayed.size(), ml_fields.HistoryItem.clazz, NULL);
    int index = -1;
    for(medialibrary::HistoryPtr const& historyItem : streamsPlayed) {
        jobject item = convertHistoryItemObject(env, &ml_fields, historyItem);
        env->SetObjectArrayElement(streamRefs, ++index, item);
        env->DeleteLocalRef(item);
    }
    return streamRefs;
}

bool clearHistory(JNIEnv* env, jobject thiz)
{
    return MediaLibrary_getInstance(env, thiz)->clearHistory();
}

jobjectArray
getVideos(JNIEnv* env, jobject thiz)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    std::vector<medialibrary::MediaPtr> videoFiles = aml->videoFiles();
    jobjectArray videoRefs = (jobjectArray) env->NewObjectArray(videoFiles.size(), ml_fields.MediaWrapper.clazz, NULL);
    int index = -1;
    for(medialibrary::MediaPtr const& media : videoFiles) {
        jobject item = mediaToMediaWrapper(env, &ml_fields, media);
        env->SetObjectArrayElement(videoRefs, ++index, item);
        env->DeleteLocalRef(item);
    }
    return videoRefs;
}

jobjectArray
getAudio(JNIEnv* env, jobject thiz)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    std::vector<medialibrary::MediaPtr> audioFiles = aml->audioFiles();
    jobjectArray audioRefs = (jobjectArray) env->NewObjectArray(audioFiles.size(), ml_fields.MediaWrapper.clazz, NULL);
    int index = -1;
    for(medialibrary::MediaPtr const& media : audioFiles) {
        jobject item = mediaToMediaWrapper(env, &ml_fields, media);
        env->SetObjectArrayElement(audioRefs, ++index, item);
        env->DeleteLocalRef(item);
    }
    return audioRefs;
}

jobject
search(JNIEnv* env, jobject thiz, jstring query)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    const char *queryChar = env->GetStringUTFChars(query, JNI_FALSE);
    const std::string queryString(queryChar);
    jobject searchResult = convertSearchAggregateObject(env, &ml_fields, aml->search(queryString));
    env->ReleaseStringUTFChars(query, queryChar);
    return searchResult;
}

jint
getVideoCount(JNIEnv* env, jobject thiz) {
    return MediaLibrary_getInstance(env, thiz)->videoFiles().size();
}

jint
getAudioCount(JNIEnv* env, jobject thiz) {
    return MediaLibrary_getInstance(env, thiz)->audioFiles().size();
}

jobject
getMedia(JNIEnv* env, jobject thiz, jlong id) {
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    return mediaToMediaWrapper(env, &ml_fields, aml->media(id));
}

jobject
getMediaFromMrl(JNIEnv* env, jobject thiz, jstring mrl) {
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    const char *char_mrl = env->GetStringUTFChars(mrl, JNI_FALSE);
    const std::string stringMrl(char_mrl);
    jobject mw = mediaToMediaWrapper(env, &ml_fields, aml->media(stringMrl));
    env->ReleaseStringUTFChars(mrl, char_mrl);
    return mw;
}

jobject
addMedia(JNIEnv* env, jobject thiz, jstring mrl) {
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    const char *char_mrl = env->GetStringUTFChars(mrl, JNI_FALSE);
    jobject mw = mediaToMediaWrapper(env, &ml_fields, aml->addMedia(char_mrl));
    env->ReleaseStringUTFChars(mrl, char_mrl);
    return mw;
}

jobjectArray
getAlbums(JNIEnv* env, jobject thiz)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    std::vector<medialibrary::AlbumPtr> albums = aml->albums();
    jobjectArray albumRefs = (jobjectArray) env->NewObjectArray(albums.size(), ml_fields.Album.clazz, NULL);
    int index = -1;
    for(medialibrary::AlbumPtr const& album : albums) {
        jobject item = convertAlbumObject(env, &ml_fields, album);
        env->SetObjectArrayElement(albumRefs, ++index, item);
        env->DeleteLocalRef(item);
    }
    return albumRefs;
}

jobject
getAlbum(JNIEnv* env, jobject thiz, jlong id)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    medialibrary::AlbumPtr album = aml->album(id);
    return album != nullptr ? convertAlbumObject(env, &ml_fields, album) : nullptr;
}

jobjectArray
getArtists(JNIEnv* env, jobject thiz)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    std::vector<medialibrary::ArtistPtr> artists = aml->artists();
    jobjectArray artistRefs = (jobjectArray) env->NewObjectArray(artists.size(), ml_fields.Artist.clazz, NULL);
    int index = -1;
    for(medialibrary::ArtistPtr const& artist : artists) {
        jobject item = convertArtistObject(env, &ml_fields, artist);
        env->SetObjectArrayElement(artistRefs, ++index, item);
        env->DeleteLocalRef(item);
    }
    return artistRefs;
}

jobject
getArtist(JNIEnv* env, jobject thiz, jlong id)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    medialibrary::ArtistPtr artist = aml->artist(id);
    return artist != nullptr ? convertArtistObject(env, &ml_fields, artist) : nullptr;
}

jobjectArray
getGenres(JNIEnv* env, jobject thiz)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    std::vector<medialibrary::GenrePtr> genres = aml->genres();
    jobjectArray genreRefs = (jobjectArray) env->NewObjectArray(genres.size(), ml_fields.Genre.clazz, NULL);
    int index = -1;
    for(medialibrary::GenrePtr const& genre : genres) {
        jobject item = convertGenreObject(env, &ml_fields, genre);
        env->SetObjectArrayElement(genreRefs, ++index, item);
        env->DeleteLocalRef(item);
    }
    return genreRefs;
}

jobject
getGenre(JNIEnv* env, jobject thiz, jlong id)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    medialibrary::GenrePtr genre = aml->genre(id);
    return genre != nullptr ? convertGenreObject(env, &ml_fields, genre) : nullptr;
}

jobjectArray
getPlaylists(JNIEnv* env, jobject thiz)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    std::vector<medialibrary::PlaylistPtr> playlists = aml->playlists();
    jobjectArray playlistRefs = (jobjectArray) env->NewObjectArray(playlists.size(), ml_fields.Playlist.clazz, NULL);
    int index = -1;
    for(medialibrary::PlaylistPtr const& playlist : playlists) {
        jobject item = convertPlaylistObject(env, &ml_fields, playlist);
        env->SetObjectArrayElement(playlistRefs, ++index, item);
        env->DeleteLocalRef(item);
    }
    return playlistRefs;
}

jobject
getPlaylist(JNIEnv* env, jobject thiz, jlong id)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    medialibrary::PlaylistPtr playlist = aml->playlist(id);
    if (playlist != nullptr)
        return convertPlaylistObject(env, &ml_fields, playlist);
    return nullptr;
}

jobject
playlistCreate(JNIEnv* env, jobject thiz, jstring name)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, thiz);
    const char *buffer = env->GetStringUTFChars(name, JNI_FALSE);
    const std::string& playlistName(buffer);
    medialibrary::PlaylistPtr playlist = aml->PlaylistCreate(playlistName);
    env->ReleaseStringUTFChars(name, buffer);
    return convertPlaylistObject(env, &ml_fields, playlist);
}

/*
 * Album methods
 */


jobjectArray
getTracksFromAlbum(JNIEnv* env, jobject thiz, jobject medialibrary, jlong id)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, medialibrary);
    std::vector<medialibrary::MediaPtr> tracks = aml->tracksFromAlbum(id);
    jobjectArray mediaRefs = (jobjectArray) env->NewObjectArray(tracks.size(), ml_fields.MediaWrapper.clazz, NULL);
    int index = -1;
    jobject item = nullptr;
    for(medialibrary::MediaPtr const& media : tracks) {
        item = mediaToMediaWrapper(env, &ml_fields, media);
        env->SetObjectArrayElement(mediaRefs, ++index, item);
        env->DeleteLocalRef(item);
    }
    return mediaRefs;
}

/*
 * Artist methods
 */

jobjectArray
getMediaFromArtist(JNIEnv* env, jobject thiz, jobject medialibrary, jlong id)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, medialibrary);
    std::vector<medialibrary::AlbumPtr> albumList = aml->albumsFromArtist(id);
    std::vector<medialibrary::MediaPtr> mediaList;
    for (medialibrary::AlbumPtr album : albumList) {
        std::vector<medialibrary::MediaPtr> tracks = album->tracks();
        mediaList.insert(std::end(mediaList), std::begin(tracks), std::end(tracks));
    }
    jobjectArray mediaRefs = (jobjectArray) env->NewObjectArray(mediaList.size(), ml_fields.MediaWrapper.clazz, NULL);
    int index = -1;
    for(medialibrary::MediaPtr const& media : mediaList) {
        jobject item = mediaToMediaWrapper(env, &ml_fields, media);
        env->SetObjectArrayElement(mediaRefs, ++index, item);
        env->DeleteLocalRef(item);
    }
    return mediaRefs;
}

jobjectArray
getAlbumsFromArtist(JNIEnv* env, jobject thiz, jobject medialibrary, jlong id)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, medialibrary);
    std::vector<medialibrary::AlbumPtr> albums = aml->albumsFromArtist(id);
    jobjectArray albumsRefs = (jobjectArray) env->NewObjectArray(albums.size(), ml_fields.Album.clazz, NULL);
    int index = -1;
    for(medialibrary::AlbumPtr const& album : albums) {
        jobject item = convertAlbumObject(env, &ml_fields, album);
        env->SetObjectArrayElement(albumsRefs, ++index, item);
        env->DeleteLocalRef(item);
    }
    return albumsRefs;
}


/*
 * Genre methods
 */

jobjectArray
getMediaFromGenre(JNIEnv* env, jobject thiz, jobject medialibrary, jlong id)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, medialibrary);
    std::vector<medialibrary::MediaPtr> mediaList = aml->mediaFromGenre(id);
    jobjectArray mediaRefs = (jobjectArray) env->NewObjectArray(mediaList.size(), ml_fields.MediaWrapper.clazz, NULL);
    int index = -1;
    for(medialibrary::MediaPtr const& media : mediaList) {
        jobject item = mediaToMediaWrapper(env, &ml_fields, media);
        env->SetObjectArrayElement(mediaRefs, ++index, item);
        env->DeleteLocalRef(item);
    }
    return mediaRefs;
}

jobjectArray
getAlbumsFromGenre(JNIEnv* env, jobject thiz, jobject medialibrary, jlong id)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, medialibrary);
    std::vector<medialibrary::AlbumPtr> albums = aml->albumsFromGenre(id);
    jobjectArray albumRefs = (jobjectArray) env->NewObjectArray(albums.size(), ml_fields.Album.clazz, NULL);
    int index = -1;
    for(medialibrary::AlbumPtr const& album : albums) {
        jobject item = convertAlbumObject(env, &ml_fields, album);
        env->SetObjectArrayElement(albumRefs, ++index, item);
        env->DeleteLocalRef(item);
    }
    return albumRefs;
}

jobjectArray
getArtistsFromGenre(JNIEnv* env, jobject thiz, jobject medialibrary, jlong id)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, medialibrary);
    std::vector<medialibrary::ArtistPtr> artists = aml->artistsFromGenre(id);
    jobjectArray artistsRefs = (jobjectArray) env->NewObjectArray(artists.size(), ml_fields.Artist.clazz, NULL);
    int index = -1;
    for(medialibrary::ArtistPtr const& artist : artists) {
        jobject item = convertArtistObject(env, &ml_fields, artist);
        env->SetObjectArrayElement(artistsRefs, ++index, item);
        env->DeleteLocalRef(item);
    }
    return artistsRefs;
}


/*
 * Playlist methods
 */

jobjectArray
getMediaFromPlaylist(JNIEnv* env, jobject thiz, jobject medialibrary, jlong id)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, medialibrary);
    std::vector<medialibrary::MediaPtr> mediaList = aml->mediaFromPlaylist(id);
    jobjectArray mediaRefs = (jobjectArray) env->NewObjectArray(mediaList.size(), ml_fields.MediaWrapper.clazz, NULL);
    int index = -1;
    for(medialibrary::MediaPtr const& media : mediaList) {
        jobject item = mediaToMediaWrapper(env, &ml_fields, media);
        env->SetObjectArrayElement(mediaRefs, ++index, item);
        env->DeleteLocalRef(item);
    }
    return mediaRefs;
}

jboolean
playlistAppend(JNIEnv* env, jobject thiz, jobject medialibrary, jlong playlistId, jlong mediaId)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, medialibrary);
    return aml->playlistAppend(playlistId, mediaId);
}

jboolean
playlistAppendGroup(JNIEnv* env, jobject thiz, jobject medialibrary, jlong playlistId, jlongArray mediaIds)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, medialibrary);
    bool result = true;
    jsize len = env->GetArrayLength(mediaIds);
    jlong *ids = env->GetLongArrayElements(mediaIds, 0);
    for (int i = 0; i < len; ++i)
        result &= aml->playlistAppend(playlistId, (int64_t) ids[i]);
    env->ReleaseLongArrayElements(mediaIds, ids, 0);
    return result;
}

jboolean
playlistAdd(JNIEnv* env, jobject thiz, jobject medialibrary, jlong playlistId, jlong mediaId, jint position)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, medialibrary);
    return aml->playlistAdd(playlistId, mediaId, position);
}

jboolean
playlistMove(JNIEnv* env, jobject thiz, jobject medialibrary, jlong playlistId, jlong mediaId, jint position)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, medialibrary);
    return aml->playlistMove(playlistId, mediaId, position);
}

jboolean
playlistRemove(JNIEnv* env, jobject thiz, jobject medialibrary, jlong playlistId, jlong mediaId)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, medialibrary);
    return aml->playlistRemove(playlistId, mediaId);
}

jboolean
playlistDelete(JNIEnv* env, jobject thiz, jobject medialibrary, jlong playlistId)
{
    AndroidMediaLibrary *aml = MediaLibrary_getInstance(env, medialibrary);
    return aml->PlaylistDelete(playlistId);
}

 /*
  * JNI stuff
  */
static JNINativeMethod methods[] = {
    {"nativeSetup", "()V", (void*)setup },
    {"nativeInit", "(Ljava/lang/String;Ljava/lang/String;)Z", (void*)init },
    {"nativeRelease", "()V", (void*)release },
    {"nativeAddDevice", "(Ljava/lang/String;Ljava/lang/String;Z)V", (void*)addDevice },
    {"nativeDevices", "()[Ljava/lang/String;", (void*)devices },
    {"nativeDiscover", "(Ljava/lang/String;)V", (void*)discover },
    {"nativeRemoveEntryPoint", "(Ljava/lang/String;)V", (void*)removeEntryPoint },
    {"nativeEntryPoints", "()[Ljava/lang/String;", (void*)entryPoints },
    {"nativeRemoveDevice", "(Ljava/lang/String;)Z", (void*)removeDevice },
    {"nativeBanFolder", "(Ljava/lang/String;)V", (void*)banFolder },
    {"nativeLastMediaPlayed", "()[Lorg/videolan/medialibrary/media/MediaWrapper;", (void*)lastMediaPLayed },
    {"nativeLastStreamsPlayed", "()[Lorg/videolan/medialibrary/media/HistoryItem;", (void*)lastStreamsPlayed },
    {"nativeAddToHistory", "(Ljava/lang/String;Ljava/lang/String;)Z", (void*)addToHistory },
    {"nativeClearHistory", "()Z", (void*)clearHistory },
    {"nativeGetVideos", "()[Lorg/videolan/medialibrary/media/MediaWrapper;", (void*)getVideos },
    {"nativeGetAudio", "()[Lorg/videolan/medialibrary/media/MediaWrapper;", (void*)getAudio },
    {"nativeSearch", "(Ljava/lang/String;)Lorg/videolan/medialibrary/media/SearchAggregate;", (void*)search},
    {"nativeGetMedia", "(J)Lorg/videolan/medialibrary/media/MediaWrapper;", (void*)getMedia },
    {"nativeGetMediaFromMrl", "(Ljava/lang/String;)Lorg/videolan/medialibrary/media/MediaWrapper;", (void*)getMediaFromMrl },
    {"nativeAddMedia", "(Ljava/lang/String;)Lorg/videolan/medialibrary/media/MediaWrapper;", (void*)addMedia },
    {"nativeGetVideoCount", "()I", (void*)getVideoCount },
    {"nativeGetAudioCount", "()I", (void*)getAudioCount },
    {"nativeGetAlbums", "()[Lorg/videolan/medialibrary/media/Album;", (void*)getAlbums },
    {"nativeGetAlbum", "(J)Lorg/videolan/medialibrary/media/Album;", (void*)getAlbum },
    {"nativeGetArtists", "()[Lorg/videolan/medialibrary/media/Artist;", (void*)getArtists },
    {"nativeGetArtist", "(J)Lorg/videolan/medialibrary/media/Artist;", (void*)getArtist },
    {"nativeGetGenres", "()[Lorg/videolan/medialibrary/media/Genre;", (void*)getGenres },
    {"nativeGetGenre", "(J)Lorg/videolan/medialibrary/media/Genre;", (void*)getGenre },
    {"nativeGetPlaylists", "()[Lorg/videolan/medialibrary/media/Playlist;", (void*)getPlaylists },
    {"nativeGetPlaylist", "(J)Lorg/videolan/medialibrary/media/Playlist;", (void*)getPlaylist },
    {"nativeIsWorking", "()Z", (void*)isWorking },
    {"nativePauseBackgroundOperations", "()V", (void*)pauseBackgroundOperations },
    {"nativeResumeBackgroundOperations", "()V", (void*)resumeBackgroundOperations },
    {"nativeReload", "()V", (void*)reload },
    {"nativeReload", "(Ljava/lang/String;)V", (void*)reloadEntryPoint },
    {"nativeIncreasePlayCount", "(J)Z", (void*)increasePlayCount },
    {"nativeUpdateProgress", "(JJ)Z", (void*)updateProgress },
    {"nativeSetMediaUpdatedCbFlag", "(I)V", (void*)setMediaUpdatedCbFlag },
    {"nativeSetMediaAddedCbFlag", "(I)V", (void*)setMediaAddedCbFlag },
    {"nativePlaylistCreate", "(Ljava/lang/String;)Lorg/videolan/medialibrary/media/Playlist;", (void*)playlistCreate },
};

static JNINativeMethod album_methods[] = {
    {"nativeGetTracksFromAlbum", "(Lorg/videolan/medialibrary/Medialibrary;J)[Lorg/videolan/medialibrary/media/MediaWrapper;", (void*)getTracksFromAlbum },
};

static JNINativeMethod artist_methods[] = {
    {"nativeGetMediaFromArtist", "(Lorg/videolan/medialibrary/Medialibrary;J)[Lorg/videolan/medialibrary/media/MediaWrapper;", (void*)getMediaFromArtist },
    {"nativeGetAlbumsFromArtist", "(Lorg/videolan/medialibrary/Medialibrary;J)[Lorg/videolan/medialibrary/media/Album;", (void*)getAlbumsFromArtist },
};

static JNINativeMethod genre_methods[] = {
    {"nativeGetTracksFromGenre", "(Lorg/videolan/medialibrary/Medialibrary;J)[Lorg/videolan/medialibrary/media/MediaWrapper;", (void*)getMediaFromGenre },
    {"nativeGetAlbumsFromGenre", "(Lorg/videolan/medialibrary/Medialibrary;J)[Lorg/videolan/medialibrary/media/Album;", (void*)getAlbumsFromGenre },
    {"nativeGetArtistsFromGenre", "(Lorg/videolan/medialibrary/Medialibrary;J)[Lorg/videolan/medialibrary/media/Artist;", (void*)getArtistsFromGenre },
};

static JNINativeMethod playlist_methods[] = {
    {"nativeGetTracksFromPlaylist", "(Lorg/videolan/medialibrary/Medialibrary;J)[Lorg/videolan/medialibrary/media/MediaWrapper;", (void*)getMediaFromPlaylist },
    {"nativePlaylistAppend", "(Lorg/videolan/medialibrary/Medialibrary;JJ)Z", (void*)playlistAppend },
    {"nativePlaylistAppendGroup", "(Lorg/videolan/medialibrary/Medialibrary;J[J)Z", (void*)playlistAppendGroup },
    {"nativePlaylistAdd", "(Lorg/videolan/medialibrary/Medialibrary;JJI)Z", (void*)playlistAdd },
    {"nativePlaylistMove", "(Lorg/videolan/medialibrary/Medialibrary;JJI)Z", (void*)playlistMove },
    {"nativePlaylistRemove", "(Lorg/videolan/medialibrary/Medialibrary;JJ)Z", (void*)playlistRemove },
    {"nativePlaylistDelete", "(Lorg/videolan/medialibrary/Medialibrary;J)Z", (void*)playlistDelete },
};

/* This function is called when a thread attached to the Java VM is canceled or
 * exited */
static void jni_detach_thread(void *data)
{
    //JNIEnv *env = data;
    myVm->DetachCurrentThread();
}

jint JNI_OnLoad(JavaVM *vm, void *reserved)
{
    JNIEnv* env = NULL;
    // Keep a reference on the Java VM.
    myVm = vm;

    if (vm->GetEnv((void**) &env, VLC_JNI_VERSION) != JNI_OK)
        return -1;

#define GET_CLASS(clazz, str, b_globlal) do { \
    (clazz) = env->FindClass((str)); \
    if (!(clazz)) { \
    LOGE("FindClass(%s) failed", (str)); \
    return -1; \
} \
    if (b_globlal) { \
    (clazz) = (jclass) env->NewGlobalRef((clazz)); \
    if (!(clazz)) { \
    LOGE("NewGlobalRef(%s) failed", (str)); \
    return -1; \
} \
} \
} while (0)

#define GET_ID(get, id, clazz, str, args) do { \
    (id) = env->get((clazz), (str), (args)); \
    if (!(id)) { \
    LOGE(#get"(%s) failed", (str)); \
    return -1; \
} \
} while (0)


    jclass Version_clazz;
    jfieldID SDK_INT_fieldID;
    GET_CLASS(Version_clazz, "android/os/Build$VERSION", false);
    GET_ID(GetStaticFieldID, SDK_INT_fieldID, Version_clazz, "SDK_INT", "I");
    ml_fields.SDK_INT = env->GetStaticIntField(Version_clazz,
                                               SDK_INT_fieldID);

    GET_CLASS(ml_fields.IllegalStateException.clazz,
              "java/lang/IllegalStateException", true);
    GET_CLASS(ml_fields.IllegalArgumentException.clazz,
              "java/lang/IllegalArgumentException", true);

    GET_CLASS(ml_fields.MediaLibrary.clazz, CLASSPATHNAME, true);
    if (env->RegisterNatives(ml_fields.MediaLibrary.clazz, methods, sizeof(methods) / sizeof(methods[0])) < 0) {
        LOGE("RegisterNatives failed for '%s'", CLASSPATHNAME);
        return -1;
    }

    GET_CLASS(ml_fields.Artist.clazz, "org/videolan/medialibrary/media/Artist", true);
    if (env->RegisterNatives(ml_fields.Artist.clazz, artist_methods, sizeof(artist_methods) / sizeof(artist_methods[0])) < 0) {
        LOGE("RegisterNatives failed for org/videolan/medialibrary/media/Artist");
        return -1;
    }
    GET_ID(GetMethodID,
           ml_fields.Artist.initID,
           ml_fields.Artist.clazz,
           "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");

    GET_CLASS(ml_fields.Album.clazz, "org/videolan/medialibrary/media/Album", true);
    if (env->RegisterNatives(ml_fields.Album.clazz, album_methods, sizeof(album_methods) / sizeof(album_methods[0])) < 0) {
        LOGE("RegisterNatives failed for 'org/videolan/medialibrary/media/Album");
        return -1;
    }
    GET_ID(GetMethodID,
           ml_fields.Album.initID,
           ml_fields.Album.clazz,
           "<init>", "(JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;JII)V");

    GET_CLASS(ml_fields.Genre.clazz, "org/videolan/medialibrary/media/Genre", true);
    if (env->RegisterNatives(ml_fields.Genre.clazz, genre_methods, sizeof(genre_methods) / sizeof(genre_methods[0])) < 0) {
        LOGE("RegisterNatives failed for org/videolan/medialibrary/media/Genre");
        return -1;
    }
    GET_ID(GetMethodID,
           ml_fields.Genre.initID,
           ml_fields.Genre.clazz,
           "<init>", "(JLjava/lang/String;)V");

    GET_CLASS(ml_fields.Playlist.clazz, "org/videolan/medialibrary/media/Playlist", true);
    if (env->RegisterNatives(ml_fields.Playlist.clazz, playlist_methods, sizeof(playlist_methods) / sizeof(playlist_methods[0])) < 0) {
        LOGE("RegisterNatives failed for org/videolan/medialibrary/media/Playlist");
        return -1;
    }
    GET_ID(GetMethodID,
           ml_fields.Playlist.initID,
           ml_fields.Playlist.clazz,
           "<init>", "(JLjava/lang/String;)V");


    GET_CLASS(ml_fields.MediaWrapper.clazz,
              "org/videolan/medialibrary/media/MediaWrapper", true);

    GET_ID(GetMethodID,
           ml_fields.MediaWrapper.initID,
           ml_fields.MediaWrapper.clazz,
           "<init>", "(JLjava/lang/String;JJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;IIIIJ)V");

    ///
    GET_CLASS(ml_fields.HistoryItem.clazz,
              "org/videolan/medialibrary/media/HistoryItem", true);

    GET_ID(GetMethodID,
           ml_fields.HistoryItem.initID,
           ml_fields.HistoryItem.clazz,
           "<init>", "(Ljava/lang/String;Ljava/lang/String;JZ)V");
///
    GET_CLASS(ml_fields.MediaSearchAggregate.clazz, "org/videolan/medialibrary/media/MediaSearchAggregate", true);

    GET_ID(GetMethodID,
           ml_fields.MediaSearchAggregate.initID,
           ml_fields.MediaSearchAggregate.clazz,
           "<init>", "([Lorg/videolan/medialibrary/media/MediaWrapper;[Lorg/videolan/medialibrary/media/MediaWrapper;[Lorg/videolan/medialibrary/media/MediaWrapper;[Lorg/videolan/medialibrary/media/MediaWrapper;)V");

    GET_CLASS(ml_fields.SearchAggregate.clazz, "org/videolan/medialibrary/media/SearchAggregate", true);

    GET_ID(GetMethodID,
           ml_fields.SearchAggregate.initID,
           ml_fields.SearchAggregate.clazz,
           "<init>", "([Lorg/videolan/medialibrary/media/Album;[Lorg/videolan/medialibrary/media/Artist;[Lorg/videolan/medialibrary/media/Genre;Lorg/videolan/medialibrary/media/MediaSearchAggregate;[Lorg/videolan/medialibrary/media/Playlist;)V");

    GET_ID(GetFieldID,
           ml_fields.MediaLibrary.instanceID,
           ml_fields.MediaLibrary.clazz,
           "mInstanceID", "J");

    if (ml_fields.SDK_INT <= 13)
    {
        LOGE("fields.SDK_INT is less than 13 (honeycomb_mr2): using compat WeakReference");

        GET_CLASS(ml_fields.WeakReference.clazz,
                  "java/lang/ref/WeakReference", true);
        GET_ID(GetMethodID,
               ml_fields.WeakReference.getID,
               ml_fields.WeakReference.clazz,
               "get", "()Ljava/lang/Object;");
        GET_ID(GetMethodID,
               ml_fields.MediaLibrary.getWeakReferenceID,
               ml_fields.MediaLibrary.clazz,
               "getWeakReference", "()Ljava/lang/Object;");
    } else
    {
        ml_fields.MediaLibrary.getWeakReferenceID = NULL;
    }

    jmethodID onArtistsAddedId;
    jmethodID onArtistsModifiedId;
    jmethodID onArtistsDeletedId;
    jmethodID onAlbumsAddedId;
    jmethodID onAlbumsModifiedId;
    jmethodID onAlbumsDeletedId;
    GET_ID(GetMethodID,
           ml_fields.MediaLibrary.onMediaAddedId,
           ml_fields.MediaLibrary.clazz,
           "onMediaAdded", "([Lorg/videolan/medialibrary/media/MediaWrapper;)V");
    GET_ID(GetMethodID,
           ml_fields.MediaLibrary.onMediaUpdatedId,
           ml_fields.MediaLibrary.clazz,
           "onMediaUpdated", "([Lorg/videolan/medialibrary/media/MediaWrapper;)V");
    GET_ID(GetMethodID,
           ml_fields.MediaLibrary.onMediaDeletedId,
           ml_fields.MediaLibrary.clazz,
           "onMediaDeleted", "([J)V");
    GET_ID(GetMethodID,
           ml_fields.MediaLibrary.onArtistsAddedId,
           ml_fields.MediaLibrary.clazz,
           "onArtistsAdded", "()V");
    GET_ID(GetMethodID,
           ml_fields.MediaLibrary.onAlbumsAddedId,
           ml_fields.MediaLibrary.clazz,
           "onAlbumsAdded", "()V");
    GET_ID(GetMethodID,
           ml_fields.MediaLibrary.onArtistsDeletedId,
           ml_fields.MediaLibrary.clazz,
           "onArtistsDeleted", "([J)V");
    GET_ID(GetMethodID,
           ml_fields.MediaLibrary.onAlbumsDeletedId,
           ml_fields.MediaLibrary.clazz,
           "onAlbumsDeleted", "([J)V");
    GET_ID(GetMethodID,
           ml_fields.MediaLibrary.onArtistsModifiedId,
           ml_fields.MediaLibrary.clazz,
           "onArtistsModified", "()V");
    GET_ID(GetMethodID,
           ml_fields.MediaLibrary.onAlbumsModifiedId,
           ml_fields.MediaLibrary.clazz,
           "onAlbumsModified", "()V");
    GET_ID(GetMethodID,
           ml_fields.MediaLibrary.onDiscoveryStartedId,
           ml_fields.MediaLibrary.clazz,
           "onDiscoveryStarted", "(Ljava/lang/String;)V");
    GET_ID(GetMethodID,
           ml_fields.MediaLibrary.onDiscoveryProgressId,
           ml_fields.MediaLibrary.clazz,
           "onDiscoveryProgress", "(Ljava/lang/String;)V");
    GET_ID(GetMethodID,
           ml_fields.MediaLibrary.onDiscoveryCompletedId,
           ml_fields.MediaLibrary.clazz,
           "onDiscoveryCompleted", "(Ljava/lang/String;)V");
    GET_ID(GetMethodID,
           ml_fields.MediaLibrary.onParsingStatsUpdatedId,
           ml_fields.MediaLibrary.clazz,
           "onParsingStatsUpdated", "(I)V");

#undef GET_CLASS
#undef GET_ID

    LOGD("JNI interface loaded.");
    return VLC_JNI_VERSION;
}

void JNI_OnUnload(JavaVM* vm, void* reserved)
{
    LOGD("JNI interface unloaded.");
    JNIEnv* env = NULL;

    if (vm->GetEnv((void**) &env, VLC_JNI_VERSION) != JNI_OK)
        return;

    env->DeleteGlobalRef(ml_fields.IllegalArgumentException.clazz);
    env->DeleteGlobalRef(ml_fields.IllegalStateException.clazz);
    env->DeleteGlobalRef(ml_fields.MediaLibrary.clazz);
    env->DeleteGlobalRef(ml_fields.MediaWrapper.clazz);

}


static inline void throw_IllegalStateException(JNIEnv *env, const char *p_error)
{
    env->ThrowNew(ml_fields.IllegalStateException.clazz, p_error);
}

static inline void throw_IllegalArgumentException(JNIEnv *env, const char *p_error)
{
    env->ThrowNew(ml_fields.IllegalArgumentException.clazz, p_error);
}

static AndroidMediaLibrary *
MediaLibrary_getInstanceInternal(JNIEnv *env, jobject thiz)
{
    return (AndroidMediaLibrary*)(intptr_t) env->GetLongField(thiz,
                                                              ml_fields.MediaLibrary.instanceID);
}

AndroidMediaLibrary *
MediaLibrary_getInstance(JNIEnv *env, jobject thiz)
{
    AndroidMediaLibrary *p_obj = MediaLibrary_getInstanceInternal(env, thiz);
    if (!p_obj)
        throw_IllegalStateException(env, "can't get AndroidMediaLibrary instance");
    return p_obj;
}


static void
MediaLibrary_setInstance(JNIEnv *env, jobject thiz, AndroidMediaLibrary *p_obj)
{
    env->SetLongField(thiz,
                      ml_fields.MediaLibrary.instanceID,
                      (jlong)(intptr_t)p_obj);
}
