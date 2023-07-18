package com.example.uasanmp.databinding;
import com.example.uasanmp.R;
import com.example.uasanmp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FoodItemLayoutBindingImpl extends FoodItemLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mFoodcardlistenerOnFoodCardAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public FoodItemLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FoodItemLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.cardViewFoodList.setTag(null);
        this.imageViewTenant.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textNamaTenant.setTag(null);
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

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.food == variableId) {
            setFood((com.example.uasanmp.model.Food) variable);
        }
        else if (BR.foodcardlistener == variableId) {
            setFoodcardlistener((com.example.uasanmp.view.FoodCardListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFood(@Nullable com.example.uasanmp.model.Food Food) {
        this.mFood = Food;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.food);
        super.requestRebind();
    }
    public void setFoodcardlistener(@Nullable com.example.uasanmp.view.FoodCardListener Foodcardlistener) {
        this.mFoodcardlistener = Foodcardlistener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.foodcardlistener);
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
        com.example.uasanmp.model.Food food = mFood;
        java.lang.String foodPhotourl = null;
        java.lang.String foodNama = null;
        android.view.View.OnClickListener foodcardlistenerOnFoodCardAndroidViewViewOnClickListener = null;
        com.example.uasanmp.view.FoodCardListener foodcardlistener = mFoodcardlistener;
        int foodIdfood = 0;

        if ((dirtyFlags & 0x5L) != 0) {



                if (food != null) {
                    // read food.photourl
                    foodPhotourl = food.getPhotourl();
                    // read food.nama
                    foodNama = food.getNama();
                    // read food.idfood
                    foodIdfood = food.getIdfood();
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (foodcardlistener != null) {
                    // read foodcardlistener::onFoodCard
                    foodcardlistenerOnFoodCardAndroidViewViewOnClickListener = (((mFoodcardlistenerOnFoodCardAndroidViewViewOnClickListener == null) ? (mFoodcardlistenerOnFoodCardAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mFoodcardlistenerOnFoodCardAndroidViewViewOnClickListener).setValue(foodcardlistener));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.cardViewFoodList.setTag(foodIdfood);
            com.example.uasanmp.util.UtilKt.loadPhotoUrl(this.imageViewTenant, foodPhotourl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textNamaTenant, foodNama);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.cardViewFoodList.setOnClickListener(foodcardlistenerOnFoodCardAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.uasanmp.view.FoodCardListener value;
        public OnClickListenerImpl setValue(com.example.uasanmp.view.FoodCardListener value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onFoodCard(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): food
        flag 1 (0x2L): foodcardlistener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}