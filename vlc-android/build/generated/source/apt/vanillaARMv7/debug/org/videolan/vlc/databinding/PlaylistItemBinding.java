package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.view.View;
public class PlaylistItemBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    public final android.widget.TextView audioItemSubtitle;
    public final android.widget.TextView audioItemTitle;
    public final android.widget.ImageView itemMore;
    private final android.widget.RelativeLayout mboundView0;
    // variables
    private java.lang.String mSubTitle;
    private org.videolan.medialibrary.media.MediaWrapper mMedia;
    private org.videolan.vlc.gui.audio.PlaylistAdapter.ViewHolder mHolder;
    private int mTitleColor;
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    private OnClickListenerImpl mHolderOnMoreClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public PlaylistItemBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.audioItemSubtitle = (android.widget.TextView) bindings[2];
        this.audioItemSubtitle.setTag(null);
        this.audioItemTitle = (android.widget.TextView) bindings[1];
        this.audioItemTitle.setTag(null);
        this.itemMore = (android.widget.ImageView) bindings[3];
        this.itemMore.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        setRootTag(root);
        // listeners
        mCallback1 = new android.databinding.generated.callback.OnClickListener(this, 1);
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
            case BR.subTitle :
                setSubTitle((java.lang.String) variable);
                return true;
            case BR.media :
                setMedia((org.videolan.medialibrary.media.MediaWrapper) variable);
                return true;
            case BR.holder :
                setHolder((org.videolan.vlc.gui.audio.PlaylistAdapter.ViewHolder) variable);
                return true;
            case BR.titleColor :
                setTitleColor((int) variable);
                return true;
        }
        return false;
    }

    public void setSubTitle(java.lang.String SubTitle) {
        this.mSubTitle = SubTitle;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.subTitle);
        super.requestRebind();
    }
    public java.lang.String getSubTitle() {
        return mSubTitle;
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
    public void setHolder(org.videolan.vlc.gui.audio.PlaylistAdapter.ViewHolder Holder) {
        this.mHolder = Holder;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.holder);
        super.requestRebind();
    }
    public org.videolan.vlc.gui.audio.PlaylistAdapter.ViewHolder getHolder() {
        return mHolder;
    }
    public void setTitleColor(int TitleColor) {
        this.mTitleColor = TitleColor;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.titleColor);
        super.requestRebind();
    }
    public int getTitleColor() {
        return mTitleColor;
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
        android.view.View.OnClickListener holderOnMoreClickAndroidViewViewOnClickListener = null;
        boolean textUtilsIsEmptySubTitle = false;
        java.lang.String subTitle = mSubTitle;
        org.videolan.medialibrary.media.MediaWrapper media = mMedia;
        int textUtilsIsEmptySubTitleViewGONEViewVISIBLE = 0;
        org.videolan.vlc.gui.audio.PlaylistAdapter.ViewHolder holder = mHolder;
        int titleColor = mTitleColor;

        if ((dirtyFlags & 0x11L) != 0) {



                // read TextUtils.isEmpty(subTitle)
                textUtilsIsEmptySubTitle = android.text.TextUtils.isEmpty(subTitle);
            if((dirtyFlags & 0x11L) != 0) {
                if(textUtilsIsEmptySubTitle) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read TextUtils.isEmpty(subTitle) ? View.GONE : View.VISIBLE
                textUtilsIsEmptySubTitleViewGONEViewVISIBLE = ((textUtilsIsEmptySubTitle) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x12L) != 0) {



                if (media != null) {
                    // read media.title
                    mediaTitle = media.getTitle();
                }
        }
        if ((dirtyFlags & 0x14L) != 0) {



                if (holder != null) {
                    // read holder::onMoreClick
                    holderOnMoreClickAndroidViewViewOnClickListener = (((mHolderOnMoreClickAndroidViewViewOnClickListener == null) ? (mHolderOnMoreClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHolderOnMoreClickAndroidViewViewOnClickListener).setValue(holder));
                }
        }
        if ((dirtyFlags & 0x18L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.audioItemSubtitle, subTitle);
            this.audioItemSubtitle.setVisibility(textUtilsIsEmptySubTitleViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.audioItemTitle, mediaTitle);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.audioItemTitle.setTextColor(titleColor);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            this.itemMore.setOnClickListener(holderOnMoreClickAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.audio.PlaylistAdapter.ViewHolder value;
        public OnClickListenerImpl setValue(org.videolan.vlc.gui.audio.PlaylistAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onMoreClick(arg0);
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // media
        org.videolan.medialibrary.media.MediaWrapper media = mMedia;
        // holder
        org.videolan.vlc.gui.audio.PlaylistAdapter.ViewHolder holder = mHolder;
        // holder != null
        boolean holderJavaLangObjectNull = false;



        holderJavaLangObjectNull = (holder) != (null);
        if (holderJavaLangObjectNull) {




            holder.onClick(callbackArg_0, media);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static PlaylistItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static PlaylistItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<PlaylistItemBinding>inflate(inflater, org.videolan.vlc.R.layout.playlist_item, root, attachToRoot, bindingComponent);
    }
    public static PlaylistItemBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static PlaylistItemBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.playlist_item, null, false), bindingComponent);
    }
    public static PlaylistItemBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static PlaylistItemBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/playlist_item_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new PlaylistItemBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): subTitle
        flag 1 (0x2L): media
        flag 2 (0x3L): holder
        flag 3 (0x4L): titleColor
        flag 4 (0x5L): null
        flag 5 (0x6L): TextUtils.isEmpty(subTitle) ? View.GONE : View.VISIBLE
        flag 6 (0x7L): TextUtils.isEmpty(subTitle) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}