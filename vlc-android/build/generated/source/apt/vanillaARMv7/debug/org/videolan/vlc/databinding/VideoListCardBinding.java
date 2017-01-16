package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.view.View;
public class VideoListCardBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    public final android.widget.ImageView itemMore;
    private final android.widget.LinearLayout mboundView0;
    private final android.widget.RelativeLayout mboundView2;
    public final android.widget.ProgressBar mlItemProgress;
    public final android.widget.TextView mlItemResolution;
    public final android.widget.ImageView mlItemThumbnail;
    public final android.widget.TextView mlItemTime;
    public final android.widget.TextView mlItemTitle;
    // variables
    private java.lang.String mResolution;
    private android.graphics.drawable.BitmapDrawable mCover;
    private android.widget.ImageView.ScaleType mScaleType;
    private java.lang.String mTime;
    private int mBgColor;
    private org.videolan.medialibrary.media.MediaWrapper mMedia;
    private int mMax;
    private int mProgress;
    private org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder mHolder;
    // values
    // listeners
    private OnClickListenerImpl mHolderOnMoreClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mHolderOnClickAndroidViewViewOnClickListener;
    private OnLongClickListenerImpl mHolderOnLongClickAndroidViewViewOnLongClickListener;
    // Inverse Binding Event Handlers

    public VideoListCardBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds);
        this.itemMore = (android.widget.ImageView) bindings[4];
        this.itemMore.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView2 = (android.widget.RelativeLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mlItemProgress = (android.widget.ProgressBar) bindings[7];
        this.mlItemProgress.setTag(null);
        this.mlItemResolution = (android.widget.TextView) bindings[6];
        this.mlItemResolution.setTag(null);
        this.mlItemThumbnail = (android.widget.ImageView) bindings[1];
        this.mlItemThumbnail.setTag(null);
        this.mlItemTime = (android.widget.TextView) bindings[5];
        this.mlItemTime.setTag(null);
        this.mlItemTitle = (android.widget.TextView) bindings[3];
        this.mlItemTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
            case BR.resolution :
                setResolution((java.lang.String) variable);
                return true;
            case BR.cover :
                setCover((android.graphics.drawable.BitmapDrawable) variable);
                return true;
            case BR.scaleType :
                setScaleType((android.widget.ImageView.ScaleType) variable);
                return true;
            case BR.time :
                setTime((java.lang.String) variable);
                return true;
            case BR.bgColor :
                setBgColor((int) variable);
                return true;
            case BR.media :
                setMedia((org.videolan.medialibrary.media.MediaWrapper) variable);
                return true;
            case BR.max :
                setMax((int) variable);
                return true;
            case BR.progress :
                setProgress((int) variable);
                return true;
            case BR.holder :
                setHolder((org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder) variable);
                return true;
        }
        return false;
    }

    public void setResolution(java.lang.String Resolution) {
        this.mResolution = Resolution;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.resolution);
        super.requestRebind();
    }
    public java.lang.String getResolution() {
        return mResolution;
    }
    public void setCover(android.graphics.drawable.BitmapDrawable Cover) {
        this.mCover = Cover;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.cover);
        super.requestRebind();
    }
    public android.graphics.drawable.BitmapDrawable getCover() {
        return mCover;
    }
    public void setScaleType(android.widget.ImageView.ScaleType ScaleType) {
        this.mScaleType = ScaleType;
    }
    public android.widget.ImageView.ScaleType getScaleType() {
        return mScaleType;
    }
    public void setTime(java.lang.String Time) {
        this.mTime = Time;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.time);
        super.requestRebind();
    }
    public java.lang.String getTime() {
        return mTime;
    }
    public void setBgColor(int BgColor) {
        this.mBgColor = BgColor;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.bgColor);
        super.requestRebind();
    }
    public int getBgColor() {
        return mBgColor;
    }
    public void setMedia(org.videolan.medialibrary.media.MediaWrapper Media) {
        this.mMedia = Media;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.media);
        super.requestRebind();
    }
    public org.videolan.medialibrary.media.MediaWrapper getMedia() {
        return mMedia;
    }
    public void setMax(int Max) {
        this.mMax = Max;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.max);
        super.requestRebind();
    }
    public int getMax() {
        return mMax;
    }
    public void setProgress(int Progress) {
        this.mProgress = Progress;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.progress);
        super.requestRebind();
    }
    public int getProgress() {
        return mProgress;
    }
    public void setHolder(org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder Holder) {
        this.mHolder = Holder;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.holder);
        super.requestRebind();
    }
    public org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder getHolder() {
        return mHolder;
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
        java.lang.String mediaTitle = null;
        java.lang.String resolution = mResolution;
        android.graphics.drawable.BitmapDrawable cover = mCover;
        android.view.View.OnClickListener holderOnMoreClickAndroidViewViewOnClickListener = null;
        boolean maxInt0 = false;
        java.lang.String time = mTime;
        android.view.View.OnClickListener holderOnClickAndroidViewViewOnClickListener = null;
        int bgColor = mBgColor;
        org.videolan.medialibrary.media.MediaWrapper media = mMedia;
        int max = mMax;
        int progress = mProgress;
        android.view.View.OnLongClickListener holderOnLongClickAndroidViewViewOnLongClickListener = null;
        org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder holder = mHolder;
        int maxInt0ViewINVISIBLEViewVISIBLE = 0;

        if ((dirtyFlags & 0x201L) != 0) {
        }
        if ((dirtyFlags & 0x202L) != 0) {
        }
        if ((dirtyFlags & 0x208L) != 0) {
        }
        if ((dirtyFlags & 0x210L) != 0) {
        }
        if ((dirtyFlags & 0x220L) != 0) {



                if (media != null) {
                    // read media.title
                    mediaTitle = media.getTitle();
                }
        }
        if ((dirtyFlags & 0x240L) != 0) {



                // read max == 0
                maxInt0 = (max) == (0);
            if((dirtyFlags & 0x240L) != 0) {
                if(maxInt0) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }


                // read max == 0 ? View.INVISIBLE : View.VISIBLE
                maxInt0ViewINVISIBLEViewVISIBLE = ((maxInt0) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x280L) != 0) {
        }
        if ((dirtyFlags & 0x300L) != 0) {



                if (holder != null) {
                    // read holder::onMoreClick
                    holderOnMoreClickAndroidViewViewOnClickListener = (((mHolderOnMoreClickAndroidViewViewOnClickListener == null) ? (mHolderOnMoreClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHolderOnMoreClickAndroidViewViewOnClickListener).setValue(holder));
                    // read holder::onClick
                    holderOnClickAndroidViewViewOnClickListener = (((mHolderOnClickAndroidViewViewOnClickListener == null) ? (mHolderOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mHolderOnClickAndroidViewViewOnClickListener).setValue(holder));
                    // read holder::onLongClick
                    holderOnLongClickAndroidViewViewOnLongClickListener = (((mHolderOnLongClickAndroidViewViewOnLongClickListener == null) ? (mHolderOnLongClickAndroidViewViewOnLongClickListener = new OnLongClickListenerImpl()) : mHolderOnLongClickAndroidViewViewOnLongClickListener).setValue(holder));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x300L) != 0) {
            // api target 1

            this.itemMore.setOnClickListener(holderOnMoreClickAndroidViewViewOnClickListener);
            this.mboundView0.setOnClickListener(holderOnClickAndroidViewViewOnClickListener);
            this.mboundView0.setOnLongClickListener(holderOnLongClickAndroidViewViewOnLongClickListener);
        }
        if ((dirtyFlags & 0x210L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView2, android.databinding.adapters.Converters.convertColorToDrawable(bgColor));
        }
        if ((dirtyFlags & 0x240L) != 0) {
            // api target 1

            this.mlItemProgress.setMax(max);
            this.mlItemProgress.setVisibility(maxInt0ViewINVISIBLEViewVISIBLE);
        }
        if ((dirtyFlags & 0x280L) != 0) {
            // api target 1

            this.mlItemProgress.setProgress(progress);
        }
        if ((dirtyFlags & 0x201L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mlItemResolution, resolution);
        }
        if ((dirtyFlags & 0x220L) != 0) {
            // api target 1

            org.videolan.vlc.gui.helpers.AsyncImageLoader.loadPicture(this.mlItemThumbnail, media);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mlItemTitle, mediaTitle);
        }
        if ((dirtyFlags & 0x202L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mlItemThumbnail, cover);
        }
        if ((dirtyFlags & 0x208L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mlItemTime, time);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder value;
        public OnClickListenerImpl setValue(org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onMoreClick(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder value;
        public OnClickListenerImpl1 setValue(org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClick(arg0);
        }
    }
    public static class OnLongClickListenerImpl implements android.view.View.OnLongClickListener{
        private org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder value;
        public OnLongClickListenerImpl setValue(org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public boolean onLongClick(android.view.View arg0) {
            return this.value.onLongClick(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static VideoListCardBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static VideoListCardBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<VideoListCardBinding>inflate(inflater, org.videolan.vlc.R.layout.video_list_card, root, attachToRoot, bindingComponent);
    }
    public static VideoListCardBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static VideoListCardBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.video_list_card, null, false), bindingComponent);
    }
    public static VideoListCardBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static VideoListCardBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/video_list_card_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new VideoListCardBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): resolution
        flag 1 (0x2L): cover
        flag 2 (0x3L): scaleType
        flag 3 (0x4L): time
        flag 4 (0x5L): bgColor
        flag 5 (0x6L): media
        flag 6 (0x7L): max
        flag 7 (0x8L): progress
        flag 8 (0x9L): holder
        flag 9 (0xaL): null
        flag 10 (0xbL): max == 0 ? View.INVISIBLE : View.VISIBLE
        flag 11 (0xcL): max == 0 ? View.INVISIBLE : View.VISIBLE
    flag mapping end*/
    //end
}