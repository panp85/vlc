package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.view.View;
public class SearchItemBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    public final android.widget.TextView itemDescription;
    public final android.widget.ImageView itemImage;
    public final android.widget.TextView itemTitle;
    private final android.widget.RelativeLayout mboundView0;
    // variables
    private org.videolan.medialibrary.media.MediaLibraryItem mItem;
    private android.graphics.drawable.BitmapDrawable mCover;
    private org.videolan.vlc.gui.SearchActivity.ClickHandler mHandler;
    private org.videolan.vlc.gui.SearchResultAdapter.ViewHolder mHolder;
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SearchItemBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.itemDescription = (android.widget.TextView) bindings[3];
        this.itemDescription.setTag(null);
        this.itemImage = (android.widget.ImageView) bindings[1];
        this.itemImage.setTag(null);
        this.itemTitle = (android.widget.TextView) bindings[2];
        this.itemTitle.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        setRootTag(root);
        // listeners
        mCallback2 = new android.databinding.generated.callback.OnClickListener(this, 1);
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
            case BR.cover :
                setCover((android.graphics.drawable.BitmapDrawable) variable);
                return true;
            case BR.handler :
                setHandler((org.videolan.vlc.gui.SearchActivity.ClickHandler) variable);
                return true;
            case BR.holder :
                setHolder((org.videolan.vlc.gui.SearchResultAdapter.ViewHolder) variable);
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
    public void setHandler(org.videolan.vlc.gui.SearchActivity.ClickHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public org.videolan.vlc.gui.SearchActivity.ClickHandler getHandler() {
        return mHandler;
    }
    public void setHolder(org.videolan.vlc.gui.SearchResultAdapter.ViewHolder Holder) {
        this.mHolder = Holder;
    }
    public org.videolan.vlc.gui.SearchResultAdapter.ViewHolder getHolder() {
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
        java.lang.String itemTitle = null;
        android.graphics.drawable.BitmapDrawable cover = mCover;
        org.videolan.vlc.gui.SearchActivity.ClickHandler handler = mHandler;
        java.lang.String itemDescription = null;

        if ((dirtyFlags & 0x11L) != 0) {



                if (item != null) {
                    // read item.title
                    itemTitle = item.getTitle();
                    // read item.description
                    itemDescription = item.getDescription();
                }
        }
        if ((dirtyFlags & 0x12L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.itemDescription, itemDescription);
            org.videolan.vlc.gui.helpers.AsyncImageLoader.loadPicture(this.itemImage, item);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.itemTitle, itemTitle);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            android.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.itemImage, cover);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // handler
        org.videolan.vlc.gui.SearchActivity.ClickHandler handler = mHandler;
        // item
        org.videolan.medialibrary.media.MediaLibraryItem item = mItem;
        // handler != null
        boolean handlerJavaLangObjectNull = false;



        handlerJavaLangObjectNull = (handler) != (null);
        if (handlerJavaLangObjectNull) {



            handler.onItemClick(item);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static SearchItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static SearchItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<SearchItemBinding>inflate(inflater, org.videolan.vlc.R.layout.search_item, root, attachToRoot, bindingComponent);
    }
    public static SearchItemBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static SearchItemBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.search_item, null, false), bindingComponent);
    }
    public static SearchItemBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static SearchItemBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/search_item_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new SearchItemBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): cover
        flag 2 (0x3L): handler
        flag 3 (0x4L): holder
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}