package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.view.View;
public class ExtensionItemViewBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    public final android.widget.TextView author;
    public final android.widget.ImageView extensionImage;
    public final android.widget.ImageView itemMore;
    private final android.widget.RelativeLayout mboundView0;
    public final android.widget.TextView title;
    // variables
    private org.videolan.vlc.extensions.api.VLCExtensionItem mItem;
    private android.graphics.drawable.BitmapDrawable mImage;
    private org.videolan.vlc.gui.browser.ExtensionAdapter.ViewHolder mHolder;
    // values
    // listeners
    private OnClickListenerImpl mHolderOnClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ExtensionItemViewBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.author = (android.widget.TextView) bindings[3];
        this.author.setTag(null);
        this.extensionImage = (android.widget.ImageView) bindings[1];
        this.extensionImage.setTag(null);
        this.itemMore = (android.widget.ImageView) bindings[4];
        this.itemMore.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.title = (android.widget.TextView) bindings[2];
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
                setItem((org.videolan.vlc.extensions.api.VLCExtensionItem) variable);
                return true;
            case BR.image :
                setImage((android.graphics.drawable.BitmapDrawable) variable);
                return true;
            case BR.holder :
                setHolder((org.videolan.vlc.gui.browser.ExtensionAdapter.ViewHolder) variable);
                return true;
        }
        return false;
    }

    public void setItem(org.videolan.vlc.extensions.api.VLCExtensionItem Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public org.videolan.vlc.extensions.api.VLCExtensionItem getItem() {
        return mItem;
    }
    public void setImage(android.graphics.drawable.BitmapDrawable Image) {
        this.mImage = Image;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.image);
        super.requestRebind();
    }
    public android.graphics.drawable.BitmapDrawable getImage() {
        return mImage;
    }
    public void setHolder(org.videolan.vlc.gui.browser.ExtensionAdapter.ViewHolder Holder) {
        this.mHolder = Holder;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.holder);
        super.requestRebind();
    }
    public org.videolan.vlc.gui.browser.ExtensionAdapter.ViewHolder getHolder() {
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
        org.videolan.vlc.extensions.api.VLCExtensionItem item = mItem;
        java.lang.String itemTitle = null;
        int itemTypeInt0ViewVISIBLEViewGONE = 0;
        int itemType = 0;
        boolean itemTypeInt0 = false;
        java.lang.String itemSubTitle = null;
        android.graphics.drawable.BitmapDrawable image = mImage;
        android.view.View.OnClickListener holderOnClickAndroidViewViewOnClickListener = null;
        org.videolan.vlc.gui.browser.ExtensionAdapter.ViewHolder holder = mHolder;

        if ((dirtyFlags & 0x9L) != 0) {



                if (item != null) {
                    // read item.title
                    itemTitle = item.getTitle();
                    // read item.type
                    itemType = item.getType();
                    // read item.subTitle
                    itemSubTitle = item.getSubTitle();
                }


                // read item.type != 0
                itemTypeInt0 = (itemType) != (0);
            if((dirtyFlags & 0x9L) != 0) {
                if(itemTypeInt0) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read item.type != 0 ? View.VISIBLE : View.GONE
                itemTypeInt0ViewVISIBLEViewGONE = ((itemTypeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0xaL) != 0) {
        }
        if ((dirtyFlags & 0xcL) != 0) {



                if (holder != null) {
                    // read holder::onClick
                    holderOnClickAndroidViewViewOnClickListener = (((mHolderOnClickAndroidViewViewOnClickListener == null) ? (mHolderOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHolderOnClickAndroidViewViewOnClickListener).setValue(holder));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.author, itemSubTitle);
            this.itemMore.setVisibility(itemTypeInt0ViewVISIBLEViewGONE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.title, itemTitle);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            android.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.extensionImage, image);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(holderOnClickAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.browser.ExtensionAdapter.ViewHolder value;
        public OnClickListenerImpl setValue(org.videolan.vlc.gui.browser.ExtensionAdapter.ViewHolder value) {
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

    public static ExtensionItemViewBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ExtensionItemViewBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ExtensionItemViewBinding>inflate(inflater, org.videolan.vlc.R.layout.extension_item_view, root, attachToRoot, bindingComponent);
    }
    public static ExtensionItemViewBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ExtensionItemViewBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.extension_item_view, null, false), bindingComponent);
    }
    public static ExtensionItemViewBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ExtensionItemViewBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/extension_item_view_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ExtensionItemViewBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): image
        flag 2 (0x3L): holder
        flag 3 (0x4L): null
        flag 4 (0x5L): item.type != 0 ? View.VISIBLE : View.GONE
        flag 5 (0x6L): item.type != 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}