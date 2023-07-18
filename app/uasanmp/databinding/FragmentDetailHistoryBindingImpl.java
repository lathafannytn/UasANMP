package com.example.uasanmp.databinding;
import com.example.uasanmp.R;
import com.example.uasanmp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetailHistoryBindingImpl extends FragmentDetailHistoryBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardView, 7);
        sViewsWithIds.put(R.id.historytextView, 8);
        sViewsWithIds.put(R.id.historytextViewHArga, 9);
        sViewsWithIds.put(R.id.textView2, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailHistoryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentDetailHistoryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[7]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            );
        this.historyfoodImage.setTag(null);
        this.historyfoodName.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView14.setTag(null);
        this.textView5.setTag(null);
        this.textViewHistoryTanggal.setTag(null);
        this.textViewhHarga.setTag(null);
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
        if (BR.tanggal == variableId) {
            setTanggal((java.lang.String) variable);
        }
        else if (BR.order == variableId) {
            setOrder((com.example.uasanmp.model.Order) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTanggal(@Nullable java.lang.String Tanggal) {
        this.mTanggal = Tanggal;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.tanggal);
        super.requestRebind();
    }
    public void setOrder(@Nullable com.example.uasanmp.model.Order Order) {
        this.mOrder = Order;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.order);
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
        int orderHarga = 0;
        int orderJumlah = 0;
        java.lang.String orderPhotourl = null;
        java.lang.String tanggal = mTanggal;
        int orderTotalharga = 0;
        java.lang.String stringValueOfOrderJumlah = null;
        java.lang.String stringValueOfOrderHarga = null;
        java.lang.String stringValueOfOrderTotalharga = null;
        com.example.uasanmp.model.Order order = mOrder;
        java.lang.String orderNama = null;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (order != null) {
                    // read order.harga
                    orderHarga = order.getHarga();
                    // read order.jumlah
                    orderJumlah = order.getJumlah();
                    // read order.photourl
                    orderPhotourl = order.getPhotourl();
                    // read order.totalharga
                    orderTotalharga = order.getTotalharga();
                    // read order.nama
                    orderNama = order.getNama();
                }


                // read String.valueOf(order.harga)
                stringValueOfOrderHarga = java.lang.String.valueOf(orderHarga);
                // read String.valueOf(order.jumlah)
                stringValueOfOrderJumlah = java.lang.String.valueOf(orderJumlah);
                // read String.valueOf(order.totalharga)
                stringValueOfOrderTotalharga = java.lang.String.valueOf(orderTotalharga);
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.example.uasanmp.util.UtilKt.loadPhotoUrl(this.historyfoodImage, orderPhotourl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.historyfoodName, orderNama);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView14, stringValueOfOrderTotalharga);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView5, stringValueOfOrderJumlah);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewhHarga, stringValueOfOrderHarga);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewHistoryTanggal, tanggal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tanggal
        flag 1 (0x2L): order
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}