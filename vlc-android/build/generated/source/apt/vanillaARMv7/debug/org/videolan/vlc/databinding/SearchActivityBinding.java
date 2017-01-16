package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.view.View;
public class SearchActivityBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.search_edit_layout, 21);
        sViewsWithIds.put(R.id.search_edit_text, 22);
        sViewsWithIds.put(R.id.results_container, 23);
    }
    // views
    public final org.videolan.vlc.gui.view.ContextMenuRecyclerView albumsResults;
    public final org.videolan.vlc.gui.view.ContextMenuRecyclerView artistsResults;
    public final org.videolan.vlc.gui.view.ContextMenuRecyclerView episodesResults;
    public final org.videolan.vlc.gui.view.ContextMenuRecyclerView genresResults;
    private final android.widget.LinearLayout mboundView0;
    private final android.widget.ImageView mboundView1;
    private final android.widget.TextView mboundView10;
    private final android.widget.TextView mboundView12;
    private final android.widget.TextView mboundView14;
    private final android.widget.TextView mboundView16;
    private final android.widget.TextView mboundView18;
    private final android.widget.ImageView mboundView2;
    private final android.widget.TextView mboundView20;
    private final android.widget.ScrollView mboundView3;
    private final android.widget.TextView mboundView4;
    private final android.widget.TextView mboundView6;
    private final android.widget.TextView mboundView8;
    public final org.videolan.vlc.gui.view.ContextMenuRecyclerView moviesResults;
    public final org.videolan.vlc.gui.view.ContextMenuRecyclerView othersResults;
    public final org.videolan.vlc.gui.view.ContextMenuRecyclerView playlistsResults;
    public final android.widget.LinearLayout resultsContainer;
    public final android.support.design.widget.TextInputLayout searchEditLayout;
    public final android.widget.EditText searchEditText;
    public final org.videolan.vlc.gui.view.ContextMenuRecyclerView songsResults;
    // variables
    private org.videolan.medialibrary.media.SearchAggregate mSearchAggregate;
    private org.videolan.vlc.gui.SearchActivity.ClickHandler mHandler;
    // values
    // listeners
    private OnClickListenerImpl mHandlerOnCleanAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mHandlerOnBackAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public SearchActivityBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds);
        this.albumsResults = (org.videolan.vlc.gui.view.ContextMenuRecyclerView) bindings[5];
        this.albumsResults.setTag(null);
        this.artistsResults = (org.videolan.vlc.gui.view.ContextMenuRecyclerView) bindings[7];
        this.artistsResults.setTag(null);
        this.episodesResults = (org.videolan.vlc.gui.view.ContextMenuRecyclerView) bindings[13];
        this.episodesResults.setTag(null);
        this.genresResults = (org.videolan.vlc.gui.view.ContextMenuRecyclerView) bindings[9];
        this.genresResults.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView12 = (android.widget.TextView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView14 = (android.widget.TextView) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView16 = (android.widget.TextView) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView18 = (android.widget.TextView) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView20 = (android.widget.TextView) bindings[20];
        this.mboundView20.setTag(null);
        this.mboundView3 = (android.widget.ScrollView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.moviesResults = (org.videolan.vlc.gui.view.ContextMenuRecyclerView) bindings[15];
        this.moviesResults.setTag(null);
        this.othersResults = (org.videolan.vlc.gui.view.ContextMenuRecyclerView) bindings[17];
        this.othersResults.setTag(null);
        this.playlistsResults = (org.videolan.vlc.gui.view.ContextMenuRecyclerView) bindings[11];
        this.playlistsResults.setTag(null);
        this.resultsContainer = (android.widget.LinearLayout) bindings[23];
        this.searchEditLayout = (android.support.design.widget.TextInputLayout) bindings[21];
        this.searchEditText = (android.widget.EditText) bindings[22];
        this.songsResults = (org.videolan.vlc.gui.view.ContextMenuRecyclerView) bindings[19];
        this.songsResults.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.searchAggregate :
                setSearchAggregate((org.videolan.medialibrary.media.SearchAggregate) variable);
                return true;
            case BR.handler :
                setHandler((org.videolan.vlc.gui.SearchActivity.ClickHandler) variable);
                return true;
        }
        return false;
    }

    public void setSearchAggregate(org.videolan.medialibrary.media.SearchAggregate SearchAggregate) {
        this.mSearchAggregate = SearchAggregate;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.searchAggregate);
        super.requestRebind();
    }
    public org.videolan.medialibrary.media.SearchAggregate getSearchAggregate() {
        return mSearchAggregate;
    }
    public void setHandler(org.videolan.vlc.gui.SearchActivity.ClickHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public org.videolan.vlc.gui.SearchActivity.ClickHandler getHandler() {
        return mHandler;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int searchAggregatePlaylistsLength = 0;
        int searchAggregateAlbumsLength = 0;
        int searchAggregateMediaSearchAggregateMoviesLength = 0;
        android.view.View.OnClickListener handlerOnCleanAndroidViewViewOnClickListener = null;
        boolean searchAggregateMediaSearchAggregateTracksLengthInt0 = false;
        boolean searchAggregateMediaSearchAggregateEpisodesLengthInt0 = false;
        org.videolan.medialibrary.media.Artist[] searchAggregateArtists = null;
        org.videolan.medialibrary.media.Album[] searchAggregateAlbums = null;
        int searchAggregateMediaSearchAggregateOthersLength = 0;
        int searchAggregateArtistsLengthInt0ViewGONEViewVISIBLE = 0;
        boolean searchAggregateMediaSearchAggregateMoviesLengthInt0 = false;
        org.videolan.medialibrary.media.MediaSearchAggregate searchAggregateMediaSearchAggregate = null;
        org.videolan.medialibrary.media.SearchAggregate searchAggregate = mSearchAggregate;
        boolean searchAggregateMediaSearchAggregateOthersLengthInt0 = false;
        boolean searchAggregateGenresLengthInt0 = false;
        int searchAggregateMediaSearchAggregateMoviesLengthInt0ViewGONEViewVISIBLE = 0;
        int searchAggregateGenresLength = 0;
        boolean searchAggregatePlaylistsLengthInt0 = false;
        org.videolan.vlc.gui.SearchActivity.ClickHandler handler = mHandler;
        org.videolan.medialibrary.media.MediaWrapper[] searchAggregateMediaSearchAggregateMovies = null;
        int searchAggregateArtistsLength = 0;
        int searchAggregateIsEmptyViewVISIBLEViewGONE = 0;
        int searchAggregateGenresLengthInt0ViewGONEViewVISIBLE = 0;
        org.videolan.medialibrary.media.MediaWrapper[] searchAggregateMediaSearchAggregateEpisodes = null;
        int searchAggregateIsEmptyViewGONEViewVISIBLE = 0;
        int searchAggregatePlaylistsLengthInt0ViewGONEViewVISIBLE = 0;
        int searchAggregateMediaSearchAggregateTracksLength = 0;
        int searchAggregateMediaSearchAggregateEpisodesLength = 0;
        boolean searchAggregateAlbumsLengthInt0 = false;
        org.videolan.medialibrary.media.MediaWrapper[] searchAggregateMediaSearchAggregateTracks = null;
        org.videolan.medialibrary.media.MediaWrapper[] searchAggregateMediaSearchAggregateOthers = null;
        int searchAggregateAlbumsLengthInt0ViewGONEViewVISIBLE = 0;
        org.videolan.medialibrary.media.Playlist[] searchAggregatePlaylists = null;
        int searchAggregateMediaSearchAggregateOthersLengthInt0ViewGONEViewVISIBLE = 0;
        boolean searchAggregateIsEmpty = false;
        int searchAggregateMediaSearchAggregateEpisodesLengthInt0ViewGONEViewVISIBLE = 0;
        android.view.View.OnClickListener handlerOnBackAndroidViewViewOnClickListener = null;
        boolean searchAggregateArtistsLengthInt0 = false;
        int searchAggregateMediaSearchAggregateTracksLengthInt0ViewGONEViewVISIBLE = 0;
        org.videolan.medialibrary.media.Genre[] searchAggregateGenres = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (searchAggregate != null) {
                    // read searchAggregate.artists
                    searchAggregateArtists = searchAggregate.getArtists();
                    // read searchAggregate.albums
                    searchAggregateAlbums = searchAggregate.getAlbums();
                    // read searchAggregate.mediaSearchAggregate
                    searchAggregateMediaSearchAggregate = searchAggregate.getMediaSearchAggregate();
                    // read searchAggregate.playlists
                    searchAggregatePlaylists = searchAggregate.getPlaylists();
                    // read searchAggregate.isEmpty
                    searchAggregateIsEmpty = searchAggregate.isEmpty();
                    // read searchAggregate.genres
                    searchAggregateGenres = searchAggregate.getGenres();
                }
            if((dirtyFlags & 0x5L) != 0) {
                if(searchAggregateIsEmpty) {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x800L;
                }
            }


                if (searchAggregateArtists != null) {
                    // read searchAggregate.artists.length
                    searchAggregateArtistsLength = searchAggregateArtists.length;
                }
                if (searchAggregateAlbums != null) {
                    // read searchAggregate.albums.length
                    searchAggregateAlbumsLength = searchAggregateAlbums.length;
                }
                if (searchAggregateMediaSearchAggregate != null) {
                    // read searchAggregate.mediaSearchAggregate.movies
                    searchAggregateMediaSearchAggregateMovies = searchAggregateMediaSearchAggregate.getMovies();
                    // read searchAggregate.mediaSearchAggregate.episodes
                    searchAggregateMediaSearchAggregateEpisodes = searchAggregateMediaSearchAggregate.getEpisodes();
                    // read searchAggregate.mediaSearchAggregate.tracks
                    searchAggregateMediaSearchAggregateTracks = searchAggregateMediaSearchAggregate.getTracks();
                    // read searchAggregate.mediaSearchAggregate.others
                    searchAggregateMediaSearchAggregateOthers = searchAggregateMediaSearchAggregate.getOthers();
                }
                if (searchAggregatePlaylists != null) {
                    // read searchAggregate.playlists.length
                    searchAggregatePlaylistsLength = searchAggregatePlaylists.length;
                }
                // read searchAggregate.isEmpty ? View.VISIBLE : View.GONE
                searchAggregateIsEmptyViewVISIBLEViewGONE = ((searchAggregateIsEmpty) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read searchAggregate.isEmpty ? View.GONE : View.VISIBLE
                searchAggregateIsEmptyViewGONEViewVISIBLE = ((searchAggregateIsEmpty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                if (searchAggregateGenres != null) {
                    // read searchAggregate.genres.length
                    searchAggregateGenresLength = searchAggregateGenres.length;
                }


                // read searchAggregate.artists.length == 0
                searchAggregateArtistsLengthInt0 = (searchAggregateArtistsLength) == (0);
                // read searchAggregate.albums.length == 0
                searchAggregateAlbumsLengthInt0 = (searchAggregateAlbumsLength) == (0);
                // read searchAggregate.playlists.length == 0
                searchAggregatePlaylistsLengthInt0 = (searchAggregatePlaylistsLength) == (0);
                // read searchAggregate.genres.length == 0
                searchAggregateGenresLengthInt0 = (searchAggregateGenresLength) == (0);
            if((dirtyFlags & 0x5L) != 0) {
                if(searchAggregateArtistsLengthInt0) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
            if((dirtyFlags & 0x5L) != 0) {
                if(searchAggregateAlbumsLengthInt0) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }
            if((dirtyFlags & 0x5L) != 0) {
                if(searchAggregatePlaylistsLengthInt0) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }
            if((dirtyFlags & 0x5L) != 0) {
                if(searchAggregateGenresLengthInt0) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
                if (searchAggregateMediaSearchAggregateMovies != null) {
                    // read searchAggregate.mediaSearchAggregate.movies.length
                    searchAggregateMediaSearchAggregateMoviesLength = searchAggregateMediaSearchAggregateMovies.length;
                }
                if (searchAggregateMediaSearchAggregateEpisodes != null) {
                    // read searchAggregate.mediaSearchAggregate.episodes.length
                    searchAggregateMediaSearchAggregateEpisodesLength = searchAggregateMediaSearchAggregateEpisodes.length;
                }
                if (searchAggregateMediaSearchAggregateTracks != null) {
                    // read searchAggregate.mediaSearchAggregate.tracks.length
                    searchAggregateMediaSearchAggregateTracksLength = searchAggregateMediaSearchAggregateTracks.length;
                }
                if (searchAggregateMediaSearchAggregateOthers != null) {
                    // read searchAggregate.mediaSearchAggregate.others.length
                    searchAggregateMediaSearchAggregateOthersLength = searchAggregateMediaSearchAggregateOthers.length;
                }


                // read searchAggregate.artists.length == 0 ? View.GONE : View.VISIBLE
                searchAggregateArtistsLengthInt0ViewGONEViewVISIBLE = ((searchAggregateArtistsLengthInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read searchAggregate.albums.length == 0 ? View.GONE : View.VISIBLE
                searchAggregateAlbumsLengthInt0ViewGONEViewVISIBLE = ((searchAggregateAlbumsLengthInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read searchAggregate.playlists.length == 0 ? View.GONE : View.VISIBLE
                searchAggregatePlaylistsLengthInt0ViewGONEViewVISIBLE = ((searchAggregatePlaylistsLengthInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read searchAggregate.genres.length == 0 ? View.GONE : View.VISIBLE
                searchAggregateGenresLengthInt0ViewGONEViewVISIBLE = ((searchAggregateGenresLengthInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read searchAggregate.mediaSearchAggregate.movies.length == 0
                searchAggregateMediaSearchAggregateMoviesLengthInt0 = (searchAggregateMediaSearchAggregateMoviesLength) == (0);
                // read searchAggregate.mediaSearchAggregate.episodes.length == 0
                searchAggregateMediaSearchAggregateEpisodesLengthInt0 = (searchAggregateMediaSearchAggregateEpisodesLength) == (0);
                // read searchAggregate.mediaSearchAggregate.tracks.length == 0
                searchAggregateMediaSearchAggregateTracksLengthInt0 = (searchAggregateMediaSearchAggregateTracksLength) == (0);
                // read searchAggregate.mediaSearchAggregate.others.length == 0
                searchAggregateMediaSearchAggregateOthersLengthInt0 = (searchAggregateMediaSearchAggregateOthersLength) == (0);
            if((dirtyFlags & 0x5L) != 0) {
                if(searchAggregateMediaSearchAggregateMoviesLengthInt0) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x5L) != 0) {
                if(searchAggregateMediaSearchAggregateEpisodesLengthInt0) {
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x80000L;
                }
            }
            if((dirtyFlags & 0x5L) != 0) {
                if(searchAggregateMediaSearchAggregateTracksLengthInt0) {
                        dirtyFlags |= 0x400000L;
                }
                else {
                        dirtyFlags |= 0x200000L;
                }
            }
            if((dirtyFlags & 0x5L) != 0) {
                if(searchAggregateMediaSearchAggregateOthersLengthInt0) {
                        dirtyFlags |= 0x40000L;
                }
                else {
                        dirtyFlags |= 0x20000L;
                }
            }


                // read searchAggregate.mediaSearchAggregate.movies.length == 0 ? View.GONE : View.VISIBLE
                searchAggregateMediaSearchAggregateMoviesLengthInt0ViewGONEViewVISIBLE = ((searchAggregateMediaSearchAggregateMoviesLengthInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read searchAggregate.mediaSearchAggregate.episodes.length == 0 ? View.GONE : View.VISIBLE
                searchAggregateMediaSearchAggregateEpisodesLengthInt0ViewGONEViewVISIBLE = ((searchAggregateMediaSearchAggregateEpisodesLengthInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read searchAggregate.mediaSearchAggregate.tracks.length == 0 ? View.GONE : View.VISIBLE
                searchAggregateMediaSearchAggregateTracksLengthInt0ViewGONEViewVISIBLE = ((searchAggregateMediaSearchAggregateTracksLengthInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read searchAggregate.mediaSearchAggregate.others.length == 0 ? View.GONE : View.VISIBLE
                searchAggregateMediaSearchAggregateOthersLengthInt0ViewGONEViewVISIBLE = ((searchAggregateMediaSearchAggregateOthersLengthInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (handler != null) {
                    // read handler::onClean
                    handlerOnCleanAndroidViewViewOnClickListener = (((mHandlerOnCleanAndroidViewViewOnClickListener == null) ? (mHandlerOnCleanAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHandlerOnCleanAndroidViewViewOnClickListener).setValue(handler));
                    // read handler::onBack
                    handlerOnBackAndroidViewViewOnClickListener = (((mHandlerOnBackAndroidViewViewOnClickListener == null) ? (mHandlerOnBackAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mHandlerOnBackAndroidViewViewOnClickListener).setValue(handler));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.albumsResults.setVisibility(searchAggregateAlbumsLengthInt0ViewGONEViewVISIBLE);
            this.artistsResults.setVisibility(searchAggregateArtistsLengthInt0ViewGONEViewVISIBLE);
            this.episodesResults.setVisibility(searchAggregateMediaSearchAggregateEpisodesLengthInt0ViewGONEViewVISIBLE);
            this.genresResults.setVisibility(searchAggregateGenresLengthInt0ViewGONEViewVISIBLE);
            this.mboundView10.setVisibility(searchAggregatePlaylistsLengthInt0ViewGONEViewVISIBLE);
            this.mboundView12.setVisibility(searchAggregateMediaSearchAggregateEpisodesLengthInt0ViewGONEViewVISIBLE);
            this.mboundView14.setVisibility(searchAggregateMediaSearchAggregateMoviesLengthInt0ViewGONEViewVISIBLE);
            this.mboundView16.setVisibility(searchAggregateMediaSearchAggregateOthersLengthInt0ViewGONEViewVISIBLE);
            this.mboundView18.setVisibility(searchAggregateMediaSearchAggregateTracksLengthInt0ViewGONEViewVISIBLE);
            this.mboundView20.setVisibility(searchAggregateIsEmptyViewVISIBLEViewGONE);
            this.mboundView3.setVisibility(searchAggregateIsEmptyViewGONEViewVISIBLE);
            this.mboundView4.setVisibility(searchAggregateAlbumsLengthInt0ViewGONEViewVISIBLE);
            this.mboundView6.setVisibility(searchAggregateArtistsLengthInt0ViewGONEViewVISIBLE);
            this.mboundView8.setVisibility(searchAggregateGenresLengthInt0ViewGONEViewVISIBLE);
            this.moviesResults.setVisibility(searchAggregateMediaSearchAggregateMoviesLengthInt0ViewGONEViewVISIBLE);
            this.othersResults.setVisibility(searchAggregateMediaSearchAggregateOthersLengthInt0ViewGONEViewVISIBLE);
            this.playlistsResults.setVisibility(searchAggregatePlaylistsLengthInt0ViewGONEViewVISIBLE);
            this.songsResults.setVisibility(searchAggregateMediaSearchAggregateTracksLengthInt0ViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(handlerOnBackAndroidViewViewOnClickListener);
            this.mboundView2.setOnClickListener(handlerOnCleanAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.SearchActivity.ClickHandler value;
        public OnClickListenerImpl setValue(org.videolan.vlc.gui.SearchActivity.ClickHandler value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClean(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.SearchActivity.ClickHandler value;
        public OnClickListenerImpl1 setValue(org.videolan.vlc.gui.SearchActivity.ClickHandler value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onBack(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static SearchActivityBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static SearchActivityBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<SearchActivityBinding>inflate(inflater, org.videolan.vlc.R.layout.search_activity, root, attachToRoot, bindingComponent);
    }
    public static SearchActivityBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static SearchActivityBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.search_activity, null, false), bindingComponent);
    }
    public static SearchActivityBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static SearchActivityBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/search_activity_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new SearchActivityBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): searchAggregate
        flag 1 (0x2L): handler
        flag 2 (0x3L): null
        flag 3 (0x4L): searchAggregate.artists.length == 0 ? View.GONE : View.VISIBLE
        flag 4 (0x5L): searchAggregate.artists.length == 0 ? View.GONE : View.VISIBLE
        flag 5 (0x6L): searchAggregate.mediaSearchAggregate.movies.length == 0 ? View.GONE : View.VISIBLE
        flag 6 (0x7L): searchAggregate.mediaSearchAggregate.movies.length == 0 ? View.GONE : View.VISIBLE
        flag 7 (0x8L): searchAggregate.isEmpty ? View.VISIBLE : View.GONE
        flag 8 (0x9L): searchAggregate.isEmpty ? View.VISIBLE : View.GONE
        flag 9 (0xaL): searchAggregate.genres.length == 0 ? View.GONE : View.VISIBLE
        flag 10 (0xbL): searchAggregate.genres.length == 0 ? View.GONE : View.VISIBLE
        flag 11 (0xcL): searchAggregate.isEmpty ? View.GONE : View.VISIBLE
        flag 12 (0xdL): searchAggregate.isEmpty ? View.GONE : View.VISIBLE
        flag 13 (0xeL): searchAggregate.playlists.length == 0 ? View.GONE : View.VISIBLE
        flag 14 (0xfL): searchAggregate.playlists.length == 0 ? View.GONE : View.VISIBLE
        flag 15 (0x10L): searchAggregate.albums.length == 0 ? View.GONE : View.VISIBLE
        flag 16 (0x11L): searchAggregate.albums.length == 0 ? View.GONE : View.VISIBLE
        flag 17 (0x12L): searchAggregate.mediaSearchAggregate.others.length == 0 ? View.GONE : View.VISIBLE
        flag 18 (0x13L): searchAggregate.mediaSearchAggregate.others.length == 0 ? View.GONE : View.VISIBLE
        flag 19 (0x14L): searchAggregate.mediaSearchAggregate.episodes.length == 0 ? View.GONE : View.VISIBLE
        flag 20 (0x15L): searchAggregate.mediaSearchAggregate.episodes.length == 0 ? View.GONE : View.VISIBLE
        flag 21 (0x16L): searchAggregate.mediaSearchAggregate.tracks.length == 0 ? View.GONE : View.VISIBLE
        flag 22 (0x17L): searchAggregate.mediaSearchAggregate.tracks.length == 0 ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}