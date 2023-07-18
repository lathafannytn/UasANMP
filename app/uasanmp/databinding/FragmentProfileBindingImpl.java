package com.example.uasanmp.databinding;
import com.example.uasanmp.R;
import com.example.uasanmp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProfileBindingImpl extends FragmentProfileBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageViewProfilePicture, 7);
        sViewsWithIds.put(R.id.textView1, 8);
        sViewsWithIds.put(R.id.textView7, 9);
        sViewsWithIds.put(R.id.textView3, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mEditbuttonlistenerOnButtonEditProfileAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mLogoutlistenerOnButtonLogoutAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public FragmentProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[6]
            , (android.widget.Button) bindings[4]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            );
        this.btnLogout.setTag(null);
        this.buttonEditProfile.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewName.setTag(null);
        this.textViewNoTelp.setTag(null);
        this.textViewSaldo.setTag(null);
        this.textViewUsername.setTag(null);
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
        if (BR.user == variableId) {
            setUser((com.example.uasanmp.model.User) variable);
        }
        else if (BR.editbuttonlistener == variableId) {
            setEditbuttonlistener((com.example.uasanmp.view.ButtonEditProfileListener) variable);
        }
        else if (BR.logoutlistener == variableId) {
            setLogoutlistener((com.example.uasanmp.view.ButtonLogoutListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUser(@Nullable com.example.uasanmp.model.User User) {
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }
    public void setEditbuttonlistener(@Nullable com.example.uasanmp.view.ButtonEditProfileListener Editbuttonlistener) {
        this.mEditbuttonlistener = Editbuttonlistener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.editbuttonlistener);
        super.requestRebind();
    }
    public void setLogoutlistener(@Nullable com.example.uasanmp.view.ButtonLogoutListener Logoutlistener) {
        this.mLogoutlistener = Logoutlistener;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.logoutlistener);
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
        com.example.uasanmp.model.User user = mUser;
        android.view.View.OnClickListener editbuttonlistenerOnButtonEditProfileAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener logoutlistenerOnButtonLogoutAndroidViewViewOnClickListener = null;
        java.lang.String userUsername = null;
        com.example.uasanmp.view.ButtonEditProfileListener editbuttonlistener = mEditbuttonlistener;
        java.lang.String userFullname = null;
        java.lang.String stringValueOfUserSaldo = null;
        int userSaldo = 0;
        com.example.uasanmp.view.ButtonLogoutListener logoutlistener = mLogoutlistener;
        java.lang.String userPhonenumber = null;

        if ((dirtyFlags & 0x9L) != 0) {



                if (user != null) {
                    // read user.username
                    userUsername = user.getUsername();
                    // read user.fullname
                    userFullname = user.getFullname();
                    // read user.saldo
                    userSaldo = user.getSaldo();
                    // read user.phonenumber
                    userPhonenumber = user.getPhonenumber();
                }


                // read String.valueOf(user.saldo)
                stringValueOfUserSaldo = java.lang.String.valueOf(userSaldo);
        }
        if ((dirtyFlags & 0xaL) != 0) {



                if (editbuttonlistener != null) {
                    // read editbuttonlistener::onButtonEditProfile
                    editbuttonlistenerOnButtonEditProfileAndroidViewViewOnClickListener = (((mEditbuttonlistenerOnButtonEditProfileAndroidViewViewOnClickListener == null) ? (mEditbuttonlistenerOnButtonEditProfileAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mEditbuttonlistenerOnButtonEditProfileAndroidViewViewOnClickListener).setValue(editbuttonlistener));
                }
        }
        if ((dirtyFlags & 0xcL) != 0) {



                if (logoutlistener != null) {
                    // read logoutlistener::onButtonLogout
                    logoutlistenerOnButtonLogoutAndroidViewViewOnClickListener = (((mLogoutlistenerOnButtonLogoutAndroidViewViewOnClickListener == null) ? (mLogoutlistenerOnButtonLogoutAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mLogoutlistenerOnButtonLogoutAndroidViewViewOnClickListener).setValue(logoutlistener));
                }
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.btnLogout.setOnClickListener(logoutlistenerOnButtonLogoutAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.buttonEditProfile.setOnClickListener(editbuttonlistenerOnButtonEditProfileAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewName, userFullname);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewNoTelp, userPhonenumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewSaldo, stringValueOfUserSaldo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewUsername, userUsername);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.uasanmp.view.ButtonEditProfileListener value;
        public OnClickListenerImpl setValue(com.example.uasanmp.view.ButtonEditProfileListener value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onButtonEditProfile(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.example.uasanmp.view.ButtonLogoutListener value;
        public OnClickListenerImpl1 setValue(com.example.uasanmp.view.ButtonLogoutListener value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onButtonLogout(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): user
        flag 1 (0x2L): editbuttonlistener
        flag 2 (0x3L): logoutlistener
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}