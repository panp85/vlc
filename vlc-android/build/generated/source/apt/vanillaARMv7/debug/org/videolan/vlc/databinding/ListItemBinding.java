package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.view.View;
public class ListItemBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    public final android.widget.ImageView icon;
    public final android.widget.LinearLayout layoutItem;
    private final android.support.v7.widget.CardView mboundView0;
    public final android.widget.TextView subtitle;
    public final android.widget.TextView title;
    // variables
    private int mBgColor;
    private org.videolan.medialibrary.media.MediaWrapper mMedia;
    private int mPosition;
    private org.videolan.vlc.gui.HistoryAdapter.ViewHolder mHolder;
    // values
    // listeners
    private OnClickListenerImpl mHolderOnClickAndroidViewViewOnClickListener;
    private OnLongClickListenerImpl mHolderOnLongClickAndroidViewViewOnLongClickListener;
    // Inverse Binding Event Handlers

    public ListItemBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.icon = (android.widget.ImageView) bindings[2];
        this.icon.setTag(null);
        this.layoutItem = (android.widget.LinearLayout) bindings[1];
        this.layoutItem.setTag(null);
        this.mboundView0 = (android.support.v7.widget.CardView) bindings[0];
        this.subtitle = (android.widget.TextView) bindings[4];
        this.subtitle.setTag(null);
        this.title = (android.widget.TextView) bindings[3];
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            case BR.bgColor :
                setBgColor((int) variable);
                return true;
            case BR.media :
                setMedia((org.videolan.medialibrary.media.MediaWrapper) variable);
                return true;
            case BR.position :
                setPosition((int) variable);
                return true;
            case BR.holder :
                setHolder((org.videolan.vlc.gui.HistoryAdapter.ViewHolder) variable);
                return true;
        }
        return false;
    }

    public void setBgColor(int BgColor) {
        this.mBgColor = BgColor;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
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
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.media);
        super.requestRebind();
    }
    public org.videolan.medialibrary.media.MediaWrapper getMedia() {
        return mMedia;
    }
    public void setPosition(int Position) {
        this.mPosition = Position;
    }
    public int getPosition() {
        return mPosition;
    }
    public void setHolder(org.videolan.vlc.gui.HistoryAdapter.ViewHolder Holder) {
        this.mHolder = Holder;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.holder);
        super.requestRebind();
    }
    public org.videolan.vlc.gui.HistoryAdapter.ViewHolder getHolder() {
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
        boolean mediaArtistJavaLangObjectNull = false;
        java.lang.String mediaTitle = null;
        android.graphics.drawable.Drawable mediaTypeMediaWrapperTYPEVIDEOIconAndroidDrawableIcBrowserVideoNormalIconAndroidDrawableIcBrowserAudioNormal = null;
        int mediaType = 0;
        java.lang.String mediaArtist = null;
        android.view.View.OnClickListener holderOnClickAndroidViewViewOnClickListener = null;
        int bgColor = mBgColor;
        int mediaArtistJavaLangObjectNullViewINVISIBLEViewVISIBLE = 0;
        boolean mediaTypeMediaWrapperTYPEVIDEO = false;
        org.videolan.medialibrary.media.MediaWrapper media = mMedia;
        android.view.View.OnLongClickListener holderOnLongClickAndroidViewViewOnLongClickListener = null;
        org.videolan.vlc.gui.HistoryAdapter.ViewHolder holder = mHolder;

        if ((dirtyFlags & 0x11L) != 0) {
        }
        if ((dirtyFlags & 0x12L) != 0) {



                if (media != null) {
                    // read media.title
                    mediaTitle = media.getTitle();
                    // read media.type
                    mediaType = media.getType();
                    // read media.artist
                    mediaArtist = media.getArtist();
                }


                // read media.type == MediaWrapper.TYPE_VIDEO
                mediaTypeMediaWrapperTYPEVIDEO = (mediaType) == (org.videolan.medialibrary.media.MediaWrapper.TYPE_VIDEO);
                // read media.artist == null
                mediaArtistJavaLangObjectNull = (mediaArtist) == (null);
            if((dirtyFlags & 0x12L) != 0) {
                if(mediaTypeMediaWrapperTYPEVIDEO) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x12L) != 0) {
                if(mediaArtistJavaLangObjectNull) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }


                // read media.type == MediaWrapper.TYPE_VIDEO ? @android:drawable/ic_browser_video_normal : @android:drawable/ic_browser_audio_normal
                mediaTypeMediaWrapperTYPEVIDEOIconAndroidDrawableIcBrowserVideoNormalIconAndroidDrawableIcBrowserAudioNormal = ((mediaTypeMediaWrapperTYPEVIDEO) ? (getDrawableFromResource(icon, R.drawable.ic_browser_video_normal)) : (getDrawableFromResource(icon, R.drawable.ic_browser_audio_normal)));
                // read media.artist == null ? View.INVISIBLE : View.VISIBLE
                mediaArtistJavaLangObjectNullViewINVISIBLEViewVISIBLE = ((mediaArtistJavaLangObjectNull) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x18L) != 0) {



                if (holder != null) {
                    // read holder::onClick
                    holderOnClickAndroidViewViewOnClickListener = (((mHolderOnClickAndroidViewViewOnClickListener == null) ? (mHolderOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHolderOnClickAndroidViewViewOnClickListener).setValue(holder));
                    // read holder::onLongClick
                    holderOnLongClickAndroidViewViewOnLongClickListener = (((mHolderOnLongClickAndroidViewViewOnLongClickListener == null) ? (mHolderOnLongClickAndroidViewViewOnLongClickListener = new OnLongClickListenerImpl()) : mHolderOnLongClickAndroidViewViewOnLongClickListener).setValue(holder));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            android.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.icon, mediaTypeMediaWrapperTYPEVIDEOIconAndroidDrawableIcBrowserVideoNormalIconAndroidDrawableIcBrowserAudioNormal);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.subtitle, mediaArtist);
            this.subtitle.setVisibility(mediaArtistJavaLangObjectNullViewINVISIBLEViewVISIBLE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.title, mediaTitle);
        }
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.layoutItem, android.databinding.adapters.Converters.convertColorToDrawable(bgColor));
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(holderOnClickAndroidViewViewOnClickListener);
            this.mboundView0.setOnLongClickListener(holderOnLongClickAndroidViewViewOnLongClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.HistoryAdapter.ViewHolder value;
        public OnClickListenerImpl setValue(org.videolan.vlc.gui.HistoryAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClick(arg0);
        }
    }
    public static class OnLongClickListenerImpl implements android.view.View.OnLongClickListener{
        private org.videolan.vlc.gui.HistoryAdapter.ViewHolder value;
        public OnLongClickListenerImpl setValue(org.videolan.vlc.gui.HistoryAdapter.ViewHolder value) {
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

    public static ListItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ListItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ListItemBinding>inflate(inflater, org.videolan.vlc.R.layout.list_item, root, attachToRoot, bindingComponent);
    }
    public static ListItemBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ListItemBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.list_item, null, false), bindingComponent);
    }
    public static ListItemBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ListItemBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/list_item_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ListItemBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): bgColor
        flag 1 (0x2L): media
        flag 2 (0x3L): position
        flag 3 (0x4L): holder
        flag 4 (0x5L): null
        flag 5 (0x6L): media.type == MediaWrapper.TYPE_VIDEO ? @android:drawable/ic_browser_video_normal : @android:drawable/ic_browser_audio_normal
        flag 6 (0x7L): media.type == MediaWrapper.TYPE_VIDEO ? @android:drawable/ic_browser_video_normal : @android:drawable/ic_browser_audio_normal
        flag 7 (0x8L): media.artist == null ? View.INVISIBLE : View.VISIBLE
        flag 8 (0x9L): media.artist == null ? View.INVISIBLE : View.VISIBLE
    flag mapping end*/
    //end
}