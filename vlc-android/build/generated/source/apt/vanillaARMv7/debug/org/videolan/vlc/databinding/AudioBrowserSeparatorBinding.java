package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.view.View;
public class AudioBrowserSeparatorBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    public final android.widget.TextView title;
    // variables
    private org.videolan.medialibrary.media.DummyItem mItem;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AudioBrowserSeparatorBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds);
        this.title = (android.widget.TextView) bindings[0];
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
            case BR.item :
                setItem((org.videolan.medialibrary.media.DummyItem) variable);
                return true;
        }
        return false;
    }

    public void setItem(org.videolan.medialibrary.media.DummyItem Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public org.videolan.medialibrary.media.DummyItem getItem() {
        return mItem;
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
        org.videolan.medialibrary.media.DummyItem item = mItem;
        java.lang.String itemTitle = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.title
                    itemTitle = item.getTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.title, itemTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static AudioBrowserSeparatorBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static AudioBrowserSeparatorBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<AudioBrowserSeparatorBinding>inflate(inflater, org.videolan.vlc.R.layout.audio_browser_separator, root, attachToRoot, bindingComponent);
    }
    public static AudioBrowserSeparatorBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static AudioBrowserSeparatorBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.audio_browser_separator, null, false), bindingComponent);
    }
    public static AudioBrowserSeparatorBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static AudioBrowserSeparatorBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/audio_browser_separator_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new AudioBrowserSeparatorBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}