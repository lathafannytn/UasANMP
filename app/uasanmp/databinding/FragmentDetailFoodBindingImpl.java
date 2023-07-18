package com.example.uasanmp.databinding;
import com.example.uasanmp.R;
import com.example.uasanmp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetailFoodBindingImpl extends FragmentDetailFoodBinding implements com.example.uasanmp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    private OnClickListenerImpl mMinlistenerOnMinQtyAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mAddlistenerOnAddQtyAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editTextAlamatKirimandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of alamatkirim
            //         is com.example.uasanmp.databinding.FragmentDetailFoodBindingImpl.this.setAlamatkirim(callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextAlamatKirim);
            // localize variables for thread safety
            // alamatkirim
            java.lang.String alamatkirim = mAlamatkirim;


            if ((com.example.uasanmp.databinding.FragmentDetailFoodBindingImpl.this) != (null)) {



                com.example.uasanmp.databinding.FragmentDetailFoodBindingImpl.this.setAlamatkirim(callbackArg_0);
            }
        }
    };
    private androidx.databinding.InverseBindingListener editTextNamaPembeliandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of namapembeli
            //         is com.example.uasanmp.databinding.FragmentDetailFoodBindingImpl.this.setNamapembeli(callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextNamaPembeli);
            // localize variables for thread safety
            // namapembeli
            java.lang.String namapembeli = mNamapembeli;


            if ((com.example.uasanmp.databinding.FragmentDetailFoodBindingImpl.this) != (null)) {



                com.example.uasanmp.databinding.FragmentDetailFoodBindingImpl.this.setNamapembeli(callbackArg_0);
            }
        }
    };

    public FragmentDetailFoodBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentDetailFoodBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[6]
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.EditText) bindings[10]
            , (android.widget.EditText) bindings[9]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[7]
            );
        this.btnAdd.setTag(null);
        this.btnBuy.setTag(null);
        this.btnMin.setTag(null);
        this.description.setTag(null);
        this.editTextAlamatKirim.setTag(null);
        this.editTextNamaPembeli.setTag(null);
        this.foodImage.setTag(null);
        this.foodName.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.price.setTag(null);
        this.textViewJumlah.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.uasanmp.generated.callback.OnClickListener(this, 1);
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

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.minlistener == variableId) {
            setMinlistener((com.example.uasanmp.view.MinQtyListener) variable);
        }
        else if (BR.food == variableId) {
            setFood((com.example.uasanmp.model.Food) variable);
        }
        else if (BR.alamatkirim == variableId) {
            setAlamatkirim((java.lang.String) variable);
        }
        else if (BR.jumlah == variableId) {
            setJumlah((java.lang.Integer) variable);
        }
        else if (BR.namapembeli == variableId) {
            setNamapembeli((java.lang.String) variable);
        }
        else if (BR.addlistener == variableId) {
            setAddlistener((com.example.uasanmp.view.AddQtyListener) variable);
        }
        else if (BR.buylistener == variableId) {
            setBuylistener((com.example.uasanmp.view.BuyButtonListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMinlistener(@Nullable com.example.uasanmp.view.MinQtyListener Minlistener) {
        this.mMinlistener = Minlistener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.minlistener);
        super.requestRebind();
    }
    public void setFood(@Nullable com.example.uasanmp.model.Food Food) {
        this.mFood = Food;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.food);
        super.requestRebind();
    }
    public void setAlamatkirim(@Nullable java.lang.String Alamatkirim) {
        this.mAlamatkirim = Alamatkirim;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.alamatkirim);
        super.requestRebind();
    }
    public void setJumlah(@Nullable java.lang.Integer Jumlah) {
        this.mJumlah = Jumlah;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.jumlah);
        super.requestRebind();
    }
    public void setNamapembeli(@Nullable java.lang.String Namapembeli) {
        this.mNamapembeli = Namapembeli;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.namapembeli);
        super.requestRebind();
    }
    public void setAddlistener(@Nullable com.example.uasanmp.view.AddQtyListener Addlistener) {
        this.mAddlistener = Addlistener;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.addlistener);
        super.requestRebind();
    }
    public void setBuylistener(@Nullable com.example.uasanmp.view.BuyButtonListener Buylistener) {
        this.mBuylistener = Buylistener;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.buylistener);
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
        java.lang.String stringValueOfJumlah = null;
        com.example.uasanmp.view.MinQtyListener minlistener = mMinlistener;
        com.example.uasanmp.model.Food food = mFood;
        java.lang.String foodPhotourl = null;
        java.lang.String foodNama = null;
        android.view.View.OnClickListener minlistenerOnMinQtyAndroidViewViewOnClickListener = null;
        int androidxDatabindingViewDataBindingSafeUnboxJumlah = 0;
        java.lang.String alamatkirim = mAlamatkirim;
        java.lang.Integer jumlah = mJumlah;
        java.lang.String namapembeli = mNamapembeli;
        android.view.View.OnClickListener addlistenerOnAddQtyAndroidViewViewOnClickListener = null;
        com.example.uasanmp.view.AddQtyListener addlistener = mAddlistener;
        java.lang.String foodDeskripsi = null;
        java.lang.String stringValueOfFoodHarga = null;
        com.example.uasanmp.view.BuyButtonListener buylistener = mBuylistener;
        int foodHarga = 0;

        if ((dirtyFlags & 0x81L) != 0) {



                if (minlistener != null) {
                    // read minlistener::onMinQty
                    minlistenerOnMinQtyAndroidViewViewOnClickListener = (((mMinlistenerOnMinQtyAndroidViewViewOnClickListener == null) ? (mMinlistenerOnMinQtyAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mMinlistenerOnMinQtyAndroidViewViewOnClickListener).setValue(minlistener));
                }
        }
        if ((dirtyFlags & 0x82L) != 0) {



                if (food != null) {
                    // read food.photourl
                    foodPhotourl = food.getPhotourl();
                    // read food.nama
                    foodNama = food.getNama();
                    // read food.deskripsi
                    foodDeskripsi = food.getDeskripsi();
                    // read food.harga
                    foodHarga = food.getHarga();
                }


                // read String.valueOf(food.harga)
                stringValueOfFoodHarga = java.lang.String.valueOf(foodHarga);
        }
        if ((dirtyFlags & 0x84L) != 0) {
        }
        if ((dirtyFlags & 0x88L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(jumlah)
                androidxDatabindingViewDataBindingSafeUnboxJumlah = androidx.databinding.ViewDataBinding.safeUnbox(jumlah);


                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(jumlah))
                stringValueOfJumlah = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxJumlah);
        }
        if ((dirtyFlags & 0x90L) != 0) {
        }
        if ((dirtyFlags & 0xa0L) != 0) {



                if (addlistener != null) {
                    // read addlistener::onAddQty
                    addlistenerOnAddQtyAndroidViewViewOnClickListener = (((mAddlistenerOnAddQtyAndroidViewViewOnClickListener == null) ? (mAddlistenerOnAddQtyAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mAddlistenerOnAddQtyAndroidViewViewOnClickListener).setValue(addlistener));
                }
        }
        // batch finished
        if ((dirtyFlags & 0xa0L) != 0) {
            // api target 1

            this.btnAdd.setOnClickListener(addlistenerOnAddQtyAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.btnBuy.setOnClickListener(mCallback1);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextAlamatKirim, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextAlamatKirimandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextNamaPembeli, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextNamaPembeliandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x81L) != 0) {
            // api target 1

            this.btnMin.setOnClickListener(minlistenerOnMinQtyAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x82L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.description, foodDeskripsi);
            com.example.uasanmp.util.UtilKt.loadPhotoUrl(this.foodImage, foodPhotourl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.foodName, foodNama);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.price, stringValueOfFoodHarga);
        }
        if ((dirtyFlags & 0x84L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextAlamatKirim, alamatkirim);
        }
        if ((dirtyFlags & 0x90L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextNamaPembeli, namapembeli);
        }
        if ((dirtyFlags & 0x88L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewJumlah, stringValueOfJumlah);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.uasanmp.view.MinQtyListener value;
        public OnClickListenerImpl setValue(com.example.uasanmp.view.MinQtyListener value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onMinQty(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.example.uasanmp.view.AddQtyListener value;
        public OnClickListenerImpl1 setValue(com.example.uasanmp.view.AddQtyListener value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onAddQty(arg0); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // food
        com.example.uasanmp.model.Food food = mFood;
        // buylistener
        com.example.uasanmp.view.BuyButtonListener buylistener = mBuylistener;
        // buylistener != null
        boolean buylistenerJavaLangObjectNull = false;
        // alamatkirim
        java.lang.String alamatkirim = mAlamatkirim;
        // jumlah
        java.lang.Integer jumlah = mJumlah;
        // namapembeli
        java.lang.String namapembeli = mNamapembeli;



        buylistenerJavaLangObjectNull = (buylistener) != (null);
        if (buylistenerJavaLangObjectNull) {







            buylistener.onBuyButton(callbackArg_0, food, jumlah, namapembeli, alamatkirim);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): minlistener
        flag 1 (0x2L): food
        flag 2 (0x3L): alamatkirim
        flag 3 (0x4L): jumlah
        flag 4 (0x5L): namapembeli
        flag 5 (0x6L): addlistener
        flag 6 (0x7L): buylistener
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}