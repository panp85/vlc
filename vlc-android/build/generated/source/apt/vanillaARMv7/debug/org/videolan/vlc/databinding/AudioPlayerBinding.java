package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.view.View;
public class AudioPlayerBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.progressBar, 12);
        sViewsWithIds.put(R.id.header, 13);
        sViewsWithIds.put(R.id.audio_media_switcher, 14);
        sViewsWithIds.put(R.id.playlist_search_text, 15);
        sViewsWithIds.put(R.id.view_switcher, 16);
        sViewsWithIds.put(R.id.songs_list, 17);
        sViewsWithIds.put(R.id.cover_media_switcher, 18);
        sViewsWithIds.put(R.id.player_controls, 19);
        sViewsWithIds.put(R.id.time, 20);
        sViewsWithIds.put(R.id.timeline, 21);
        sViewsWithIds.put(R.id.length, 22);
    }
    // views
    public final android.widget.ImageButton advFunction;
    public final org.videolan.vlc.gui.view.HeaderMediaSwitcher audioMediaSwitcher;
    public final org.videolan.vlc.gui.view.CoverMediaSwitcher coverMediaSwitcher;
    public final android.widget.LinearLayout header;
    public final android.widget.ImageButton headerPlayPause;
    public final android.widget.TextView headerTime;
    public final android.widget.TextView length;
    private final android.widget.RelativeLayout mboundView0;
    public final android.widget.ImageButton next;
    public final android.widget.ImageButton playPause;
    public final android.widget.LinearLayout playerControls;
    public final android.widget.ImageButton playlistPlayasaudioOff;
    public final android.widget.ImageButton playlistSearch;
    public final android.support.design.widget.TextInputLayout playlistSearchText;
    public final android.widget.ImageButton playlistSwitch;
    public final android.widget.ImageButton previous;
    public final android.widget.ProgressBar progressBar;
    public final android.widget.ImageButton repeat;
    public final android.widget.ImageButton shuffle;
    public final android.support.v7.widget.RecyclerView songsList;
    public final android.widget.TextView time;
    public final android.widget.SeekBar timeline;
    public final android.widget.ViewSwitcher viewSwitcher;
    // variables
    private org.videolan.vlc.gui.audio.AudioPlayer mFragment;
    // values
    // listeners
    private OnClickListenerImpl mFragmentOnPlaylistSwitchClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mFragmentOnResumeToVideoClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mFragmentOnRepeatClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl3 mFragmentOnSearchClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl4 mFragmentShowAdvancedOptionsAndroidViewViewOnClickListener;
    private OnClickListenerImpl5 mFragmentOnPlayPauseClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl6 mFragmentOnTimeLabelClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl7 mFragmentOnShuffleClickAndroidViewViewOnClickListener;
    private OnLongClickListenerImpl mFragmentOnStopClickAndroidViewViewOnLongClickListener;
    private OnClickListenerImpl8 mFragmentOnPreviousClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl9 mFragmentOnNextClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public AudioPlayerBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds);
        this.advFunction = (android.widget.ImageButton) bindings[4];
        this.advFunction.setTag(null);
        this.audioMediaSwitcher = (org.videolan.vlc.gui.view.HeaderMediaSwitcher) bindings[14];
        this.coverMediaSwitcher = (org.videolan.vlc.gui.view.CoverMediaSwitcher) bindings[18];
        this.header = (android.widget.LinearLayout) bindings[13];
        this.headerPlayPause = (android.widget.ImageButton) bindings[6];
        this.headerPlayPause.setTag(null);
        this.headerTime = (android.widget.TextView) bindings[5];
        this.headerTime.setTag(null);
        this.length = (android.widget.TextView) bindings[22];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.next = (android.widget.ImageButton) bindings[10];
        this.next.setTag(null);
        this.playPause = (android.widget.ImageButton) bindings[9];
        this.playPause.setTag(null);
        this.playerControls = (android.widget.LinearLayout) bindings[19];
        this.playlistPlayasaudioOff = (android.widget.ImageButton) bindings[1];
        this.playlistPlayasaudioOff.setTag(null);
        this.playlistSearch = (android.widget.ImageButton) bindings[2];
        this.playlistSearch.setTag(null);
        this.playlistSearchText = (android.support.design.widget.TextInputLayout) bindings[15];
        this.playlistSwitch = (android.widget.ImageButton) bindings[3];
        this.playlistSwitch.setTag(null);
        this.previous = (android.widget.ImageButton) bindings[11];
        this.previous.setTag(null);
        this.progressBar = (android.widget.ProgressBar) bindings[12];
        this.repeat = (android.widget.ImageButton) bindings[8];
        this.repeat.setTag(null);
        this.shuffle = (android.widget.ImageButton) bindings[7];
        this.shuffle.setTag(null);
        this.songsList = (android.support.v7.widget.RecyclerView) bindings[17];
        this.time = (android.widget.TextView) bindings[20];
        this.timeline = (android.widget.SeekBar) bindings[21];
        this.viewSwitcher = (android.widget.ViewSwitcher) bindings[16];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            case BR.fragment :
                setFragment((org.videolan.vlc.gui.audio.AudioPlayer) variable);
                return true;
        }
        return false;
    }

    public void setFragment(org.videolan.vlc.gui.audio.AudioPlayer Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }
    public org.videolan.vlc.gui.audio.AudioPlayer getFragment() {
        return mFragment;
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
        android.view.View.OnClickListener fragmentOnPlaylistSwitchClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener fragmentOnResumeToVideoClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener fragmentOnRepeatClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener fragmentOnSearchClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener fragmentShowAdvancedOptionsAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener fragmentOnPlayPauseClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener fragmentOnTimeLabelClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener fragmentOnShuffleClickAndroidViewViewOnClickListener = null;
        org.videolan.vlc.gui.audio.AudioPlayer fragment = mFragment;
        android.view.View.OnLongClickListener fragmentOnStopClickAndroidViewViewOnLongClickListener = null;
        android.view.View.OnClickListener fragmentOnPreviousClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener fragmentOnNextClickAndroidViewViewOnClickListener = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (fragment != null) {
                    // read fragment::onPlaylistSwitchClick
                    fragmentOnPlaylistSwitchClickAndroidViewViewOnClickListener = (((mFragmentOnPlaylistSwitchClickAndroidViewViewOnClickListener == null) ? (mFragmentOnPlaylistSwitchClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mFragmentOnPlaylistSwitchClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onResumeToVideoClick
                    fragmentOnResumeToVideoClickAndroidViewViewOnClickListener = (((mFragmentOnResumeToVideoClickAndroidViewViewOnClickListener == null) ? (mFragmentOnResumeToVideoClickAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mFragmentOnResumeToVideoClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onRepeatClick
                    fragmentOnRepeatClickAndroidViewViewOnClickListener = (((mFragmentOnRepeatClickAndroidViewViewOnClickListener == null) ? (mFragmentOnRepeatClickAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mFragmentOnRepeatClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onSearchClick
                    fragmentOnSearchClickAndroidViewViewOnClickListener = (((mFragmentOnSearchClickAndroidViewViewOnClickListener == null) ? (mFragmentOnSearchClickAndroidViewViewOnClickListener = new OnClickListenerImpl3()) : mFragmentOnSearchClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::showAdvancedOptions
                    fragmentShowAdvancedOptionsAndroidViewViewOnClickListener = (((mFragmentShowAdvancedOptionsAndroidViewViewOnClickListener == null) ? (mFragmentShowAdvancedOptionsAndroidViewViewOnClickListener = new OnClickListenerImpl4()) : mFragmentShowAdvancedOptionsAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onPlayPauseClick
                    fragmentOnPlayPauseClickAndroidViewViewOnClickListener = (((mFragmentOnPlayPauseClickAndroidViewViewOnClickListener == null) ? (mFragmentOnPlayPauseClickAndroidViewViewOnClickListener = new OnClickListenerImpl5()) : mFragmentOnPlayPauseClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onTimeLabelClick
                    fragmentOnTimeLabelClickAndroidViewViewOnClickListener = (((mFragmentOnTimeLabelClickAndroidViewViewOnClickListener == null) ? (mFragmentOnTimeLabelClickAndroidViewViewOnClickListener = new OnClickListenerImpl6()) : mFragmentOnTimeLabelClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onShuffleClick
                    fragmentOnShuffleClickAndroidViewViewOnClickListener = (((mFragmentOnShuffleClickAndroidViewViewOnClickListener == null) ? (mFragmentOnShuffleClickAndroidViewViewOnClickListener = new OnClickListenerImpl7()) : mFragmentOnShuffleClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onStopClick
                    fragmentOnStopClickAndroidViewViewOnLongClickListener = (((mFragmentOnStopClickAndroidViewViewOnLongClickListener == null) ? (mFragmentOnStopClickAndroidViewViewOnLongClickListener = new OnLongClickListenerImpl()) : mFragmentOnStopClickAndroidViewViewOnLongClickListener).setValue(fragment));
                    // read fragment::onPreviousClick
                    fragmentOnPreviousClickAndroidViewViewOnClickListener = (((mFragmentOnPreviousClickAndroidViewViewOnClickListener == null) ? (mFragmentOnPreviousClickAndroidViewViewOnClickListener = new OnClickListenerImpl8()) : mFragmentOnPreviousClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onNextClick
                    fragmentOnNextClickAndroidViewViewOnClickListener = (((mFragmentOnNextClickAndroidViewViewOnClickListener == null) ? (mFragmentOnNextClickAndroidViewViewOnClickListener = new OnClickListenerImpl9()) : mFragmentOnNextClickAndroidViewViewOnClickListener).setValue(fragment));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.advFunction.setOnClickListener(fragmentShowAdvancedOptionsAndroidViewViewOnClickListener);
            this.headerPlayPause.setOnClickListener(fragmentOnPlayPauseClickAndroidViewViewOnClickListener);
            this.headerPlayPause.setOnLongClickListener(fragmentOnStopClickAndroidViewViewOnLongClickListener);
            this.headerTime.setOnClickListener(fragmentOnTimeLabelClickAndroidViewViewOnClickListener);
            this.next.setOnClickListener(fragmentOnNextClickAndroidViewViewOnClickListener);
            this.playPause.setOnClickListener(fragmentOnPlayPauseClickAndroidViewViewOnClickListener);
            this.playPause.setOnLongClickListener(fragmentOnStopClickAndroidViewViewOnLongClickListener);
            this.playlistPlayasaudioOff.setOnClickListener(fragmentOnResumeToVideoClickAndroidViewViewOnClickListener);
            this.playlistSearch.setOnClickListener(fragmentOnSearchClickAndroidViewViewOnClickListener);
            this.playlistSwitch.setOnClickListener(fragmentOnPlaylistSwitchClickAndroidViewViewOnClickListener);
            this.previous.setOnClickListener(fragmentOnPreviousClickAndroidViewViewOnClickListener);
            this.repeat.setOnClickListener(fragmentOnRepeatClickAndroidViewViewOnClickListener);
            this.shuffle.setOnClickListener(fragmentOnShuffleClickAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.audio.AudioPlayer value;
        public OnClickListenerImpl setValue(org.videolan.vlc.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onPlaylistSwitchClick(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.audio.AudioPlayer value;
        public OnClickListenerImpl1 setValue(org.videolan.vlc.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onResumeToVideoClick(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.audio.AudioPlayer value;
        public OnClickListenerImpl2 setValue(org.videolan.vlc.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onRepeatClick(arg0);
        }
    }
    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.audio.AudioPlayer value;
        public OnClickListenerImpl3 setValue(org.videolan.vlc.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onSearchClick(arg0);
        }
    }
    public static class OnClickListenerImpl4 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.audio.AudioPlayer value;
        public OnClickListenerImpl4 setValue(org.videolan.vlc.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.showAdvancedOptions(arg0);
        }
    }
    public static class OnClickListenerImpl5 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.audio.AudioPlayer value;
        public OnClickListenerImpl5 setValue(org.videolan.vlc.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onPlayPauseClick(arg0);
        }
    }
    public static class OnClickListenerImpl6 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.audio.AudioPlayer value;
        public OnClickListenerImpl6 setValue(org.videolan.vlc.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onTimeLabelClick(arg0);
        }
    }
    public static class OnClickListenerImpl7 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.audio.AudioPlayer value;
        public OnClickListenerImpl7 setValue(org.videolan.vlc.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onShuffleClick(arg0);
        }
    }
    public static class OnLongClickListenerImpl implements android.view.View.OnLongClickListener{
        private org.videolan.vlc.gui.audio.AudioPlayer value;
        public OnLongClickListenerImpl setValue(org.videolan.vlc.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public boolean onLongClick(android.view.View arg0) {
            return this.value.onStopClick(arg0);
        }
    }
    public static class OnClickListenerImpl8 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.audio.AudioPlayer value;
        public OnClickListenerImpl8 setValue(org.videolan.vlc.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onPreviousClick(arg0);
        }
    }
    public static class OnClickListenerImpl9 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.audio.AudioPlayer value;
        public OnClickListenerImpl9 setValue(org.videolan.vlc.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onNextClick(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static AudioPlayerBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static AudioPlayerBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<AudioPlayerBinding>inflate(inflater, org.videolan.vlc.R.layout.audio_player, root, attachToRoot, bindingComponent);
    }
    public static AudioPlayerBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static AudioPlayerBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.audio_player, null, false), bindingComponent);
    }
    public static AudioPlayerBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static AudioPlayerBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/audio_player_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new AudioPlayerBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): fragment
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}