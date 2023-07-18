package com.example.uasanmp.databinding;
import com.example.uasanmp.R;
import com.example.uasanmp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSignUpBindingImpl extends FragmentSignUpBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textViewTitle, 7);
        sViewsWithIds.put(R.id.textViewAlreadyHaveAccount, 8);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mSignuplistenerOnButtonSignUpAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mSigninlistenerOnTextSignInAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editTextFullnameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of user.fullname
            //         is user.setFullname((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextFullname);
            // localize variables for thread safety
            // user.fullname
            java.lang.String userFullname = null;
            // user != null
            boolean userJavaLangObjectNull = false;
            // user
            com.example.uasanmp.model.User user = mUser;



            userJavaLangObjectNull = (user) != (null);
            if (userJavaLangObjectNull) {




                user.setFullname(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener editTextPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of user.password
            //         is user.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextPassword);
            // localize variables for thread safety
            // user != null
            boolean userJavaLangObjectNull = false;
            // user
            com.example.uasanmp.model.User user = mUser;
            // user.password
            java.lang.String userPassword = null;



            userJavaLangObjectNull = (user) != (null);
            if (userJavaLangObjectNull) {




                user.setPassword(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener editTextPhoneNumberandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of user.phonenumber
            //         is user.setPhonenumber((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextPhoneNumber);
            // localize variables for thread safety
            // user != null
            boolean userJavaLangObjectNull = false;
            // user
            com.example.uasanmp.model.User user = mUser;
            // user.phonenumber
            java.lang.String userPhonenumber = null;



            userJavaLangObjectNull = (user) != (null);
            if (userJavaLangObjectNull) {




                user.setPhonenumber(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener editTextUsernameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of user.username
            //         is user.setUsername((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextUsername);
            // localize variables for thread safety
            // user != null
            boolean userJavaLangObjectNull = false;
            // user
            com.example.uasanmp.model.User user = mUser;
            // user.username
            java.lang.String userUsername = null;



            userJavaLangObjectNull = (user) != (null);
            if (userJavaLangObjectNull) {




                user.setUsername(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public FragmentSignUpBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentSignUpBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[5]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[3]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            );
        this.buttonSignUp.setTag(null);
        this.editTextFullname.setTag(null);
        this.editTextPassword.setTag(null);
        this.editTextPhoneNumber.setTag(null);
        this.editTextUsername.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.txtSignIn.setTag(null);
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

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.signinlistener == variableId) {
            setSigninlistener((com.example.uasanmp.view.TextSignInListener) variable);
        }
        else if (BR.signuplistener == variableId) {
            setSignuplistener((com.example.uasanmp.view.ButtonSignUpListener) variable);
        }
        else if (BR.user == variableId) {
            setUser((com.example.uasanmp.model.User) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSigninlistener(@Nullable com.example.uasanmp.view.TextSignInListener Signinlistener) {
        this.mSigninlistener = Signinlistener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.signinlistener);
        super.requestRebind();
    }
    public void setSignuplistener(@Nullable com.example.uasanmp.view.ButtonSignUpListener Signuplistener) {
        this.mSignuplistener = Signuplistener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.signuplistener);
        super.requestRebind();
    }
    public void setUser(@Nullable com.example.uasanmp.model.User User) {
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
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
        android.view.View.OnClickListener signuplistenerOnButtonSignUpAndroidViewViewOnClickListener = null;
        com.example.uasanmp.view.TextSignInListener signinlistener = mSigninlistener;
        java.lang.String userUsername = null;
        java.lang.String userPassword = null;
        com.example.uasanmp.view.ButtonSignUpListener signuplistener = mSignuplistener;
        java.lang.String userPhonenumber = null;
        com.example.uasanmp.model.User user = mUser;
        java.lang.String userFullname = null;
        android.view.View.OnClickListener signinlistenerOnTextSignInAndroidViewViewOnClickListener = null;

        if ((dirtyFlags & 0x9L) != 0) {



                if (signinlistener != null) {
                    // read signinlistener::onTextSignIn
                    signinlistenerOnTextSignInAndroidViewViewOnClickListener = (((mSigninlistenerOnTextSignInAndroidViewViewOnClickListener == null) ? (mSigninlistenerOnTextSignInAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mSigninlistenerOnTextSignInAndroidViewViewOnClickListener).setValue(signinlistener));
                }
        }
        if ((dirtyFlags & 0xaL) != 0) {



                if (signuplistener != null) {
                    // read signuplistener::onButtonSignUp
                    signuplistenerOnButtonSignUpAndroidViewViewOnClickListener = (((mSignuplistenerOnButtonSignUpAndroidViewViewOnClickListener == null) ? (mSignuplistenerOnButtonSignUpAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mSignuplistenerOnButtonSignUpAndroidViewViewOnClickListener).setValue(signuplistener));
                }
        }
        if ((dirtyFlags & 0xcL) != 0) {



                if (user != null) {
                    // read user.username
                    userUsername = user.getUsername();
                    // read user.password
                    userPassword = user.getPassword();
                    // read user.phonenumber
                    userPhonenumber = user.getPhonenumber();
                    // read user.fullname
                    userFullname = user.getFullname();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.buttonSignUp.setOnClickListener(signuplistenerOnButtonSignUpAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextFullname, userFullname);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextPassword, userPassword);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextPhoneNumber, userPhonenumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextUsername, userUsername);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextFullname, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextFullnameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextPhoneNumber, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextPhoneNumberandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextUsername, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextUsernameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            this.txtSignIn.setOnClickListener(signinlistenerOnTextSignInAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.uasanmp.view.ButtonSignUpListener value;
        public OnClickListenerImpl setValue(com.example.uasanmp.view.ButtonSignUpListener value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onButtonSignUp(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.example.uasanmp.view.TextSignInListener value;
        public OnClickListenerImpl1 setValue(com.example.uasanmp.view.TextSignInListener value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onTextSignIn(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): signinlistener
        flag 1 (0x2L): signuplistener
        flag 2 (0x3L): user
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}