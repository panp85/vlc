package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.view.View;
public class BrowserItemBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    public final android.widget.CheckBox browserCheckbox;
    public final android.widget.TextView dviIcon;
    public final android.widget.ImageView itemMore;
    private final android.support.constraint.ConstraintLayout mboundView0;
    public final android.widget.TextView text;
    public final android.widget.TextView title;
    // variables
    private org.videolan.medialibrary.media.MediaLibraryItem mItem;
    private boolean mChecked;
    private android.graphics.drawable.BitmapDrawable mCover;
    private boolean mHasContextMenu;
    private boolean mCheckEnabled;
    private java.lang.String mProtocol;
    private org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder mHolder;
    // values
    // listeners
    private OnClickListenerImpl mHolderOnCheckBoxClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mHolderOnMoreClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mHolderOnClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public BrowserItemBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds);
        this.browserCheckbox = (android.widget.CheckBox) bindings[1];
        this.browserCheckbox.setTag(null);
        this.dviIcon = (android.widget.TextView) bindings[2];
        this.dviIcon.setTag(null);
        this.itemMore = (android.widget.ImageView) bindings[5];
        this.itemMore.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.text = (android.widget.TextView) bindings[4];
        this.text.setTag(null);
        this.title = (android.widget.TextView) bindings[3];
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
            case BR.checked :
                setChecked((boolean) variable);
                return true;
            case BR.cover :
                setCover((android.graphics.drawable.BitmapDrawable) variable);
                return true;
            case BR.hasContextMenu :
                setHasContextMenu((boolean) variable);
                return true;
            case BR.checkEnabled :
                setCheckEnabled((boolean) variable);
                return true;
            case BR.protocol :
                setProtocol((java.lang.String) variable);
                return true;
            case BR.holder :
                setHolder((org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder) variable);
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
    public void setChecked(boolean Checked) {
        this.mChecked = Checked;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.checked);
        super.requestRebind();
    }
    public boolean getChecked() {
        return mChecked;
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
    public void setHasContextMenu(boolean HasContextMenu) {
        this.mHasContextMenu = HasContextMenu;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.hasContextMenu);
        super.requestRebind();
    }
    public boolean getHasContextMenu() {
        return mHasContextMenu;
    }
    public void setCheckEnabled(boolean CheckEnabled) {
        this.mCheckEnabled = CheckEnabled;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.checkEnabled);
        super.requestRebind();
    }
    public boolean getCheckEnabled() {
        return mCheckEnabled;
    }
    public void setProtocol(java.lang.String Protocol) {
        this.mProtocol = Protocol;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.protocol);
        super.requestRebind();
    }
    public java.lang.String getProtocol() {
        return mProtocol;
    }
    public void setHolder(org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder Holder) {
        this.mHolder = Holder;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.holder);
        super.requestRebind();
    }
    public org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder getHolder() {
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
        boolean checked = mChecked;
        android.view.View.OnClickListener holderOnCheckBoxClickAndroidViewViewOnClickListener = null;
        int itemGetItemTypeMediaLibraryItemTYPESTORAGEViewVISIBLEViewGONE = 0;
        java.lang.String itemTitle = null;
        boolean textUtilsIsEmptyItemDescription = false;
        android.graphics.drawable.BitmapDrawable cover = mCover;
        android.view.View.OnClickListener holderOnMoreClickAndroidViewViewOnClickListener = null;
        boolean hasContextMenu = mHasContextMenu;
        int itemGetItemType = 0;
        int hasContextMenuViewVISIBLEViewGONE = 0;
        android.view.View.OnClickListener holderOnClickAndroidViewViewOnClickListener = null;
        boolean holderJavaLangObjectNull = false;
        boolean hasContextMenuBooleanTrueItemGetItemTypeMediaLibraryItemTYPESTORAGE = false;
        java.lang.String itemDescription = null;
        boolean checkEnabled = mCheckEnabled;
        java.lang.String protocol = mProtocol;
        org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder holder = mHolder;
        boolean itemGetItemTypeMediaLibraryItemTYPESTORAGE = false;
        int textUtilsIsEmptyItemDescriptionViewGONEViewVISIBLE = 0;
        int itemGetItemTypeMediaLibraryItemTYPESTORAGEViewGONEViewVISIBLE = 0;

        if ((dirtyFlags & 0x81L) != 0) {



                if (item != null) {
                    // read item.title
                    itemTitle = item.getTitle();
                    // read item.getItemType()
                    itemGetItemType = item.getItemType();
                    // read item.description
                    itemDescription = item.getDescription();
                }


                // read item.getItemType() == MediaLibraryItem.TYPE_STORAGE
                itemGetItemTypeMediaLibraryItemTYPESTORAGE = (itemGetItemType) == (org.videolan.medialibrary.media.MediaLibraryItem.TYPE_STORAGE);
                // read TextUtils.isEmpty(item.description)
                textUtilsIsEmptyItemDescription = android.text.TextUtils.isEmpty(itemDescription);
            if((dirtyFlags & 0x81L) != 0) {
                if(itemGetItemTypeMediaLibraryItemTYPESTORAGE) {
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x10000L;
                }
            }
            if((dirtyFlags & 0x81L) != 0) {
                if(textUtilsIsEmptyItemDescription) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }


                // read item.getItemType() == MediaLibraryItem.TYPE_STORAGE ? View.VISIBLE : View.GONE
                itemGetItemTypeMediaLibraryItemTYPESTORAGEViewVISIBLEViewGONE = ((itemGetItemTypeMediaLibraryItemTYPESTORAGE) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read item.getItemType() == MediaLibraryItem.TYPE_STORAGE ? View.GONE : View.VISIBLE
                itemGetItemTypeMediaLibraryItemTYPESTORAGEViewGONEViewVISIBLE = ((itemGetItemTypeMediaLibraryItemTYPESTORAGE) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read TextUtils.isEmpty(item.description) ? View.GONE : View.VISIBLE
                textUtilsIsEmptyItemDescriptionViewGONEViewVISIBLE = ((textUtilsIsEmptyItemDescription) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x82L) != 0) {
        }
        if ((dirtyFlags & 0x84L) != 0) {
        }
        if ((dirtyFlags & 0xc9L) != 0) {

            if((dirtyFlags & 0x88L) != 0) {
                if(hasContextMenu) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }
            if((dirtyFlags & 0x89L) != 0) {
                if(hasContextMenu) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }

            if ((dirtyFlags & 0x88L) != 0) {

                    // read hasContextMenu ? View.VISIBLE : View.GONE
                    hasContextMenuViewVISIBLEViewGONE = ((hasContextMenu) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        if ((dirtyFlags & 0x90L) != 0) {
        }
        if ((dirtyFlags & 0xa0L) != 0) {
        }
        if ((dirtyFlags & 0xc8L) != 0) {


            if ((dirtyFlags & 0xc0L) != 0) {

                    if (holder != null) {
                        // read holder::onCheckBoxClick
                        holderOnCheckBoxClickAndroidViewViewOnClickListener = (((mHolderOnCheckBoxClickAndroidViewViewOnClickListener == null) ? (mHolderOnCheckBoxClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHolderOnCheckBoxClickAndroidViewViewOnClickListener).setValue(holder));
                        // read holder::onClick
                        holderOnClickAndroidViewViewOnClickListener = (((mHolderOnClickAndroidViewViewOnClickListener == null) ? (mHolderOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mHolderOnClickAndroidViewViewOnClickListener).setValue(holder));
                    }
                    // read holder != null
                    holderJavaLangObjectNull = (holder) != (null);
            }

                if (holder != null) {
                    // read holder::onMoreClick
                    holderOnMoreClickAndroidViewViewOnClickListener = (((mHolderOnMoreClickAndroidViewViewOnClickListener == null) ? (mHolderOnMoreClickAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mHolderOnMoreClickAndroidViewViewOnClickListener).setValue(holder));
                }
        }
        // batch finished

        if ((dirtyFlags & 0x1000L) != 0) {



                if (item != null) {
                    // read item.getItemType()
                    itemGetItemType = item.getItemType();
                }


                // read item.getItemType() == MediaLibraryItem.TYPE_STORAGE
                itemGetItemTypeMediaLibraryItemTYPESTORAGE = (itemGetItemType) == (org.videolan.medialibrary.media.MediaLibraryItem.TYPE_STORAGE);
            if((dirtyFlags & 0x81L) != 0) {
                if(itemGetItemTypeMediaLibraryItemTYPESTORAGE) {
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x10000L;
                }
            }
        }

        if ((dirtyFlags & 0x89L) != 0) {

                // read hasContextMenu ? true : item.getItemType() == MediaLibraryItem.TYPE_STORAGE
                hasContextMenuBooleanTrueItemGetItemTypeMediaLibraryItemTYPESTORAGE = ((hasContextMenu) ? (true) : (itemGetItemTypeMediaLibraryItemTYPESTORAGE));
        }
        // batch finished
        if ((dirtyFlags & 0x82L) != 0) {
            // api target 1

            android.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.browserCheckbox, checked);
        }
        if ((dirtyFlags & 0x90L) != 0) {
            // api target 1

            this.browserCheckbox.setEnabled(checkEnabled);
        }
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            this.browserCheckbox.setOnClickListener(holderOnCheckBoxClickAndroidViewViewOnClickListener);
            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.mboundView0, (android.view.View.OnClickListener)holderOnClickAndroidViewViewOnClickListener, holderJavaLangObjectNull);
        }
        if ((dirtyFlags & 0x81L) != 0) {
            // api target 1

            this.browserCheckbox.setVisibility(itemGetItemTypeMediaLibraryItemTYPESTORAGEViewVISIBLEViewGONE);
            org.videolan.vlc.gui.helpers.AsyncImageLoader.loadPicture(this.dviIcon, item);
            this.dviIcon.setVisibility(itemGetItemTypeMediaLibraryItemTYPESTORAGEViewGONEViewVISIBLE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.text, itemDescription);
            this.text.setVisibility(textUtilsIsEmptyItemDescriptionViewGONEViewVISIBLE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.title, itemTitle);
        }
        if ((dirtyFlags & 0x84L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.dviIcon, cover);
        }
        if ((dirtyFlags & 0xa0L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.dviIcon, protocol);
        }
        if ((dirtyFlags & 0x88L) != 0) {
            // api target 1

            this.itemMore.setVisibility(hasContextMenuViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.itemMore, (android.view.View.OnClickListener)holderOnMoreClickAndroidViewViewOnClickListener, hasContextMenu);
        }
        if ((dirtyFlags & 0x89L) != 0) {
            // api target 1

            this.mboundView0.setLongClickable(hasContextMenuBooleanTrueItemGetItemTypeMediaLibraryItemTYPESTORAGE);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder value;
        public OnClickListenerImpl setValue(org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onCheckBoxClick(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder value;
        public OnClickListenerImpl1 setValue(org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onMoreClick(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder value;
        public OnClickListenerImpl2 setValue(org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClick(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static BrowserItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static BrowserItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<BrowserItemBinding>inflate(inflater, org.videolan.vlc.R.layout.browser_item, root, attachToRoot, bindingComponent);
    }
    public static BrowserItemBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static BrowserItemBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.browser_item, null, false), bindingComponent);
    }
    public static BrowserItemBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static BrowserItemBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/browser_item_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new BrowserItemBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): checked
        flag 2 (0x3L): cover
        flag 3 (0x4L): hasContextMenu
        flag 4 (0x5L): checkEnabled
        flag 5 (0x6L): protocol
        flag 6 (0x7L): holder
        flag 7 (0x8L): null
        flag 8 (0x9L): item.getItemType() == MediaLibraryItem.TYPE_STORAGE ? View.VISIBLE : View.GONE
        flag 9 (0xaL): item.getItemType() == MediaLibraryItem.TYPE_STORAGE ? View.VISIBLE : View.GONE
        flag 10 (0xbL): hasContextMenu ? View.VISIBLE : View.GONE
        flag 11 (0xcL): hasContextMenu ? View.VISIBLE : View.GONE
        flag 12 (0xdL): hasContextMenu ? true : item.getItemType() == MediaLibraryItem.TYPE_STORAGE
        flag 13 (0xeL): hasContextMenu ? true : item.getItemType() == MediaLibraryItem.TYPE_STORAGE
        flag 14 (0xfL): TextUtils.isEmpty(item.description) ? View.GONE : View.VISIBLE
        flag 15 (0x10L): TextUtils.isEmpty(item.description) ? View.GONE : View.VISIBLE
        flag 16 (0x11L): item.getItemType() == MediaLibraryItem.TYPE_STORAGE ? View.GONE : View.VISIBLE
        flag 17 (0x12L): item.getItemType() == MediaLibraryItem.TYPE_STORAGE ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}