package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.view.View;
public class AudioBrowserItemBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.audio_item_meta, 5);
    }
    // views
    public final android.widget.LinearLayout audioItemMeta;
    public final android.widget.ImageView itemMore;
    private final android.widget.RelativeLayout mboundView0;
    public final android.widget.ImageView mediaCover;
    public final android.widget.TextView subtitle;
    public final android.widget.TextView title;
    // variables
    private org.videolan.medialibrary.media.MediaLibraryItem mItem;
    private int mAlignMode;
    private android.graphics.drawable.BitmapDrawable mCover;
    private org.videolan.vlc.gui.audio.AudioBrowserAdapter.MediaItemViewHolder mHolder;
    // values
    // listeners
    private OnClickListenerImpl mHolderOnMoreClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mHolderOnClickAndroidViewViewOnClickListener;
    private OnLongClickListenerImpl mHolderOnLongClickAndroidViewViewOnLongClickListener;
    // Inverse Binding Event Handlers

    public AudioBrowserItemBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds);
        this.audioItemMeta = (android.widget.LinearLayout) bindings[5];
        this.itemMore = (android.widget.ImageView) bindings[4];
        this.itemMore.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mediaCover = (android.widget.ImageView) bindings[1];
        this.mediaCover.setTag(null);
        this.subtitle = (android.widget.TextView) bindings[3];
        this.subtitle.setTag(null);
        this.title = (android.widget.TextView) bindings[2];
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
            case BR.item :
                setItem((org.videolan.medialibrary.media.MediaLibraryItem) variable);
                return true;
            case BR.alignMode :
                setAlignMode((int) variable);
                return true;
            case BR.cover :
                setCover((android.graphics.drawable.BitmapDrawable) variable);
                return true;
            case BR.holder :
                setHolder((org.videolan.vlc.gui.audio.AudioBrowserAdapter.MediaItemViewHolder) variable);
                return true;
        }
        return false;
    }

    public void setItem(org.videolan.medialibrary.media.MediaLibraryItem Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public org.videolan.medialibrary.media.MediaLibraryItem getItem() {
        return mItem;
    }
    public void setAlignMode(int AlignMode) {
        this.mAlignMode = AlignMode;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.alignMode);
        super.requestRebind();
    }
    public int getAlignMode() {
        return mAlignMode;
    }
    public void setCover(android.graphics.drawable.BitmapDrawable Cover) {
        this.mCover = Cover;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.cover);
        super.requestRebind();
    }
    public android.graphics.drawable.BitmapDrawable getCover() {
        return mCover;
    }
    public void setHolder(org.videolan.vlc.gui.audio.AudioBrowserAdapter.MediaItemViewHolder Holder) {
        this.mHolder = Holder;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.holder);
        super.requestRebind();
    }
    public org.videolan.vlc.gui.audio.AudioBrowserAdapter.MediaItemViewHolder getHolder() {
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
        org.videolan.medialibrary.media.MediaLibraryItem item = mItem;
        int alignMode = mAlignMode;
        java.lang.String itemTitle = null;
        int itemGetItemTypeMediaLibraryItemTYPEALBUMMediaLibraryItemTYPEARTISTMediaLibraryItemTYPEMEDIAInt0ViewVISIBLEViewGONE = 0;
        boolean textUtilsIsEmptyItemDescription = false;
        android.graphics.drawable.BitmapDrawable cover = mCover;
        int itemGetItemTypeMediaLibraryItemTYPEALBUMMediaLibraryItemTYPEARTISTMediaLibraryItemTYPEMEDIA = 0;
        android.view.View.OnClickListener holderOnMoreClickAndroidViewViewOnClickListener = null;
        int itemGetItemType = 0;
        android.view.View.OnClickListener holderOnClickAndroidViewViewOnClickListener = null;
        java.lang.String itemDescription = null;
        boolean itemGetItemTypeMediaLibraryItemTYPEALBUMMediaLibraryItemTYPEARTISTMediaLibraryItemTYPEMEDIAInt0 = false;
        android.view.View.OnLongClickListener holderOnLongClickAndroidViewViewOnLongClickListener = null;
        boolean itemGetItemTypeMediaLibraryItemTYPEDUMMY = false;
        org.videolan.vlc.gui.audio.AudioBrowserAdapter.MediaItemViewHolder holder = mHolder;
        int textUtilsIsEmptyItemDescriptionViewGONEViewVISIBLE = 0;

        if ((dirtyFlags & 0x11L) != 0) {



                if (item != null) {
                    // read item.title
                    itemTitle = item.getTitle();
                    // read item.getItemType()
                    itemGetItemType = item.getItemType();
                    // read item.description
                    itemDescription = item.getDescription();
                }


                // read (item.getItemType()) & (((MediaLibraryItem.TYPE_ALBUM) | (MediaLibraryItem.TYPE_ARTIST)) | (MediaLibraryItem.TYPE_MEDIA))
                itemGetItemTypeMediaLibraryItemTYPEALBUMMediaLibraryItemTYPEARTISTMediaLibraryItemTYPEMEDIA = (itemGetItemType) & (((org.videolan.medialibrary.media.MediaLibraryItem.TYPE_ALBUM) | (org.videolan.medialibrary.media.MediaLibraryItem.TYPE_ARTIST)) | (org.videolan.medialibrary.media.MediaLibraryItem.TYPE_MEDIA));
                // read item.getItemType() != MediaLibraryItem.TYPE_DUMMY
                itemGetItemTypeMediaLibraryItemTYPEDUMMY = (itemGetItemType) != (org.videolan.medialibrary.media.MediaLibraryItem.TYPE_DUMMY);
                // read TextUtils.isEmpty(item.description)
                textUtilsIsEmptyItemDescription = android.text.TextUtils.isEmpty(itemDescription);
            if((dirtyFlags & 0x11L) != 0) {
                if(textUtilsIsEmptyItemDescription) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }


                // read (item.getItemType()) & (((MediaLibraryItem.TYPE_ALBUM) | (MediaLibraryItem.TYPE_ARTIST)) | (MediaLibraryItem.TYPE_MEDIA)) != 0
                itemGetItemTypeMediaLibraryItemTYPEALBUMMediaLibraryItemTYPEARTISTMediaLibraryItemTYPEMEDIAInt0 = (itemGetItemTypeMediaLibraryItemTYPEALBUMMediaLibraryItemTYPEARTISTMediaLibraryItemTYPEMEDIA) != (0);
                // read TextUtils.isEmpty(item.description) ? View.GONE : View.VISIBLE
                textUtilsIsEmptyItemDescriptionViewGONEViewVISIBLE = ((textUtilsIsEmptyItemDescription) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            if((dirtyFlags & 0x11L) != 0) {
                if(itemGetItemTypeMediaLibraryItemTYPEALBUMMediaLibraryItemTYPEARTISTMediaLibraryItemTYPEMEDIAInt0) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read (item.getItemType()) & (((MediaLibraryItem.TYPE_ALBUM) | (MediaLibraryItem.TYPE_ARTIST)) | (MediaLibraryItem.TYPE_MEDIA)) != 0 ? View.VISIBLE : View.GONE
                itemGetItemTypeMediaLibraryItemTYPEALBUMMediaLibraryItemTYPEARTISTMediaLibraryItemTYPEMEDIAInt0ViewVISIBLEViewGONE = ((itemGetItemTypeMediaLibraryItemTYPEALBUMMediaLibraryItemTYPEARTISTMediaLibraryItemTYPEMEDIAInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x12L) != 0) {
        }
        if ((dirtyFlags & 0x14L) != 0) {
        }
        if ((dirtyFlags & 0x18L) != 0) {



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
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.itemMore.setOnClickListener(holderOnMoreClickAndroidViewViewOnClickListener);
            this.mboundView0.setOnClickListener(holderOnClickAndroidViewViewOnClickListener);
            this.mboundView0.setOnLongClickListener(holderOnLongClickAndroidViewViewOnLongClickListener);
        }
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            this.mboundView0.setFocusable(itemGetItemTypeMediaLibraryItemTYPEDUMMY);
            org.videolan.vlc.gui.helpers.AsyncImageLoader.loadPicture(this.mediaCover, item);
            this.mediaCover.setVisibility(itemGetItemTypeMediaLibraryItemTYPEALBUMMediaLibraryItemTYPEARTISTMediaLibraryItemTYPEMEDIAInt0ViewVISIBLEViewGONE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.subtitle, itemDescription);
            this.subtitle.setVisibility(textUtilsIsEmptyItemDescriptionViewGONEViewVISIBLE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.title, itemTitle);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mediaCover, cover);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            org.videolan.vlc.gui.helpers.UiTools.setAlignModeByPref(this.title, alignMode);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.audio.AudioBrowserAdapter.MediaItemViewHolder value;
        public OnClickListenerImpl setValue(org.videolan.vlc.gui.audio.AudioBrowserAdapter.MediaItemViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onMoreClick(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.audio.AudioBrowserAdapter.MediaItemViewHolder value;
        public OnClickListenerImpl1 setValue(org.videolan.vlc.gui.audio.AudioBrowserAdapter.MediaItemViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClick(arg0);
        }
    }
    public static class OnLongClickListenerImpl implements android.view.View.OnLongClickListener{
        private org.videolan.vlc.gui.audio.AudioBrowserAdapter.MediaItemViewHolder value;
        public OnLongClickListenerImpl setValue(org.videolan.vlc.gui.audio.AudioBrowserAdapter.MediaItemViewHolder value) {
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

    public static AudioBrowserItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static AudioBrowserItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<AudioBrowserItemBinding>inflate(inflater, org.videolan.vlc.R.layout.audio_browser_item, root, attachToRoot, bindingComponent);
    }
    public static AudioBrowserItemBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static AudioBrowserItemBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.audio_browser_item, null, false), bindingComponent);
    }
    public static AudioBrowserItemBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static AudioBrowserItemBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/audio_browser_item_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new AudioBrowserItemBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): alignMode
        flag 2 (0x3L): cover
        flag 3 (0x4L): holder
        flag 4 (0x5L): null
        flag 5 (0x6L): (item.getItemType()) & (((MediaLibraryItem.TYPE_ALBUM) | (MediaLibraryItem.TYPE_ARTIST)) | (MediaLibraryItem.TYPE_MEDIA)) != 0 ? View.VISIBLE : View.GONE
        flag 6 (0x7L): (item.getItemType()) & (((MediaLibraryItem.TYPE_ALBUM) | (MediaLibraryItem.TYPE_ARTIST)) | (MediaLibraryItem.TYPE_MEDIA)) != 0 ? View.VISIBLE : View.GONE
        flag 7 (0x8L): TextUtils.isEmpty(item.description) ? View.GONE : View.VISIBLE
        flag 8 (0x9L): TextUtils.isEmpty(item.description) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}