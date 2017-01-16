package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.view.View;
public class VlcQuestionDialogBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    public final android.widget.Button action1;
    public final android.widget.Button action2;
    public final android.widget.Button cancel;
    private final android.widget.ScrollView mboundView0;
    public final android.widget.TextView text;
    // variables
    private org.videolan.vlc.gui.dialogs.VlcQuestionDialog mHandler;
    private org.videolan.libvlc.Dialog.QuestionDialog mDialog;
    // values
    // listeners
    private OnClickListenerImpl mHandlerOnCancelAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mHandlerOnAction1AndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mHandlerOnAction2AndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public VlcQuestionDialogBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.action1 = (android.widget.Button) bindings[4];
        this.action1.setTag(null);
        this.action2 = (android.widget.Button) bindings[3];
        this.action2.setTag(null);
        this.cancel = (android.widget.Button) bindings[2];
        this.cancel.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.text = (android.widget.TextView) bindings[1];
        this.text.setTag(null);
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
            case BR.handler :
                setHandler((org.videolan.vlc.gui.dialogs.VlcQuestionDialog) variable);
                return true;
            case BR.dialog :
                setDialog((org.videolan.libvlc.Dialog.QuestionDialog) variable);
                return true;
        }
        return false;
    }

    public void setHandler(org.videolan.vlc.gui.dialogs.VlcQuestionDialog Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public org.videolan.vlc.gui.dialogs.VlcQuestionDialog getHandler() {
        return mHandler;
    }
    public void setDialog(org.videolan.libvlc.Dialog.QuestionDialog Dialog) {
        this.mDialog = Dialog;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.dialog);
        super.requestRebind();
    }
    public org.videolan.libvlc.Dialog.QuestionDialog getDialog() {
        return mDialog;
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
        boolean textUtilsIsEmptyDialogAction2Text = false;
        java.lang.String dialogText = null;
        boolean textUtilsIsEmptyDialogCancelText = false;
        android.view.View.OnClickListener handlerOnCancelAndroidViewViewOnClickListener = null;
        java.lang.String dialogAction1Text = null;
        int textUtilsIsEmptyDialogAction1TextViewGONEViewVISIBLE = 0;
        org.videolan.vlc.gui.dialogs.VlcQuestionDialog handler = mHandler;
        org.videolan.libvlc.Dialog.QuestionDialog dialog = mDialog;
        java.lang.String dialogCancelText = null;
        android.view.View.OnClickListener handlerOnAction1AndroidViewViewOnClickListener = null;
        boolean textUtilsIsEmptyDialogAction1Text = false;
        java.lang.String dialogAction2Text = null;
        android.view.View.OnClickListener handlerOnAction2AndroidViewViewOnClickListener = null;
        java.lang.String textUtilsIsEmptyDialogCancelTextCancelAndroidStringCancelDialogCancelText = null;
        int textUtilsIsEmptyDialogAction2TextViewGONEViewVISIBLE = 0;

        if ((dirtyFlags & 0x5L) != 0) {



                if (handler != null) {
                    // read handler::onCancel
                    handlerOnCancelAndroidViewViewOnClickListener = (((mHandlerOnCancelAndroidViewViewOnClickListener == null) ? (mHandlerOnCancelAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHandlerOnCancelAndroidViewViewOnClickListener).setValue(handler));
                    // read handler::onAction1
                    handlerOnAction1AndroidViewViewOnClickListener = (((mHandlerOnAction1AndroidViewViewOnClickListener == null) ? (mHandlerOnAction1AndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mHandlerOnAction1AndroidViewViewOnClickListener).setValue(handler));
                    // read handler::onAction2
                    handlerOnAction2AndroidViewViewOnClickListener = (((mHandlerOnAction2AndroidViewViewOnClickListener == null) ? (mHandlerOnAction2AndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mHandlerOnAction2AndroidViewViewOnClickListener).setValue(handler));
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (dialog != null) {
                    // read dialog.text
                    dialogText = dialog.getText();
                    // read dialog.action1Text
                    dialogAction1Text = dialog.getAction1Text();
                    // read dialog.cancelText
                    dialogCancelText = dialog.getCancelText();
                    // read dialog.action2Text
                    dialogAction2Text = dialog.getAction2Text();
                }


                // read TextUtils.isEmpty(dialog.action1Text)
                textUtilsIsEmptyDialogAction1Text = android.text.TextUtils.isEmpty(dialogAction1Text);
                // read TextUtils.isEmpty(dialog.cancelText)
                textUtilsIsEmptyDialogCancelText = android.text.TextUtils.isEmpty(dialogCancelText);
                // read TextUtils.isEmpty(dialog.action2Text)
                textUtilsIsEmptyDialogAction2Text = android.text.TextUtils.isEmpty(dialogAction2Text);
            if((dirtyFlags & 0x6L) != 0) {
                if(textUtilsIsEmptyDialogAction1Text) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(textUtilsIsEmptyDialogCancelText) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(textUtilsIsEmptyDialogAction2Text) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }


                // read TextUtils.isEmpty(dialog.action1Text) ? View.GONE : View.VISIBLE
                textUtilsIsEmptyDialogAction1TextViewGONEViewVISIBLE = ((textUtilsIsEmptyDialogAction1Text) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read TextUtils.isEmpty(dialog.action2Text) ? View.GONE : View.VISIBLE
                textUtilsIsEmptyDialogAction2TextViewGONEViewVISIBLE = ((textUtilsIsEmptyDialogAction2Text) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished

        if ((dirtyFlags & 0x6L) != 0) {

                // read TextUtils.isEmpty(dialog.cancelText) ? @android:string/cancel : dialog.cancelText
                textUtilsIsEmptyDialogCancelTextCancelAndroidStringCancelDialogCancelText = ((textUtilsIsEmptyDialogCancelText) ? (cancel.getResources().getString(android.R.string.cancel)) : (dialogCancelText));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.action1, dialogAction1Text);
            this.action1.setVisibility(textUtilsIsEmptyDialogAction1TextViewGONEViewVISIBLE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.action2, dialogAction2Text);
            this.action2.setVisibility(textUtilsIsEmptyDialogAction2TextViewGONEViewVISIBLE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.cancel, textUtilsIsEmptyDialogCancelTextCancelAndroidStringCancelDialogCancelText);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.text, dialogText);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.action1.setOnClickListener(handlerOnAction1AndroidViewViewOnClickListener);
            this.action2.setOnClickListener(handlerOnAction2AndroidViewViewOnClickListener);
            this.cancel.setOnClickListener(handlerOnCancelAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.dialogs.VlcQuestionDialog value;
        public OnClickListenerImpl setValue(org.videolan.vlc.gui.dialogs.VlcQuestionDialog value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onCancel(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.dialogs.VlcQuestionDialog value;
        public OnClickListenerImpl1 setValue(org.videolan.vlc.gui.dialogs.VlcQuestionDialog value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onAction1(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.dialogs.VlcQuestionDialog value;
        public OnClickListenerImpl2 setValue(org.videolan.vlc.gui.dialogs.VlcQuestionDialog value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onAction2(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static VlcQuestionDialogBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static VlcQuestionDialogBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<VlcQuestionDialogBinding>inflate(inflater, org.videolan.vlc.R.layout.vlc_question_dialog, root, attachToRoot, bindingComponent);
    }
    public static VlcQuestionDialogBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static VlcQuestionDialogBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.vlc_question_dialog, null, false), bindingComponent);
    }
    public static VlcQuestionDialogBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static VlcQuestionDialogBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/vlc_question_dialog_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new VlcQuestionDialogBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): handler
        flag 1 (0x2L): dialog
        flag 2 (0x3L): null
        flag 3 (0x4L): TextUtils.isEmpty(dialog.action1Text) ? View.GONE : View.VISIBLE
        flag 4 (0x5L): TextUtils.isEmpty(dialog.action1Text) ? View.GONE : View.VISIBLE
        flag 5 (0x6L): TextUtils.isEmpty(dialog.cancelText) ? @android:string/cancel : dialog.cancelText
        flag 6 (0x7L): TextUtils.isEmpty(dialog.cancelText) ? @android:string/cancel : dialog.cancelText
        flag 7 (0x8L): TextUtils.isEmpty(dialog.action2Text) ? View.GONE : View.VISIBLE
        flag 8 (0x9L): TextUtils.isEmpty(dialog.action2Text) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}