package com.example.uasanmp.databinding;
import com.example.uasanmp.R;
import com.example.uasanmp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HistoryItemLayoutBindingImpl extends HistoryItemLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView4, 10);
        sViewsWithIds.put(R.id.textView9, 11);
        sViewsWithIds.put(R.id.textView10, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.cardview.widget.CardView mboundView1;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mCardlistenerOnHistoryCardAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public HistoryItemLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private HistoryItemLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            );
        this.imageView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.cardview.widget.CardView) bindings[1];
        this.mboundView1.setTag(null);
        this.textView11.setTag(null);
        this.textView12.setTag(null);
        this.textView13.setTag(null);
        this.textView8.setTag(null);
        this.textViewJumlahTransaksi.setTag(null);
        this.textViewNameFood.setTag(null);
        this.textViewTanggal.setTag(null);
        setRootTag(root);
        // listeners
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

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.tanggal == variableId) {
            setTanggal((java.lang.String) variable);
        }
        else if (BR.cardlistener == variableId) {
            setCardlistener((com.example.uasanmp.view.HistoryCardListener) variable);
        }
        else if (BR.visible == variableId) {
            setVisible((java.lang.Boolean) variable);
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
    public void setCardlistener(@Nullable com.example.uasanmp.view.HistoryCardListener Cardlistener) {
        this.mCardlistener = Cardlistener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.cardlistener);
        super.requestRebind();
    }
    public void setVisible(@Nullable java.lang.Boolean Visible) {
        this.mVisible = Visible;
    }
    public void setOrder(@Nullable com.example.uasanmp.model.Order Order) {
        this.mOrder = Order;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
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
        java.lang.String orderNamapembeli = null;
        java.lang.String tanggal = mTanggal;
        java.lang.String charXStringValueOfOrderJumlah = null;
        java.lang.String orderAlamatkirim = null;
        java.lang.String stringValueOfOrderJumlah = null;
        java.lang.String stringValueOfOrderHarga = null;
        com.example.uasanmp.view.HistoryCardListener cardlistener = mCardlistener;
        android.view.View.OnClickListener cardlistenerOnHistoryCardAndroidViewViewOnClickListener = null;
        java.lang.String orderNama = null;
        int orderHarga = 0;
        int orderJumlah = 0;
        java.lang.String orderPhotourl = null;
        int orderTotalharga = 0;
        java.lang.String stringValueOfOrderTotalharga = null;
        int orderIdorder = 0;
        com.example.uasanmp.model.Order order = mOrder;

        if ((dirtyFlags & 0x11L) != 0) {
        }
        if ((dirtyFlags & 0x12L) != 0) {



                if (cardlistener != null) {
                    // read cardlistener::onHistoryCard
                    cardlistenerOnHistoryCardAndroidViewViewOnClickListener = (((mCardlistenerOnHistoryCardAndroidViewViewOnClickListener == null) ? (mCardlistenerOnHistoryCardAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mCardlistenerOnHistoryCardAndroidViewViewOnClickListener).setValue(cardlistener));
                }
        }
        if ((dirtyFlags & 0x18L) != 0) {



                if (order != null) {
                    // read order.namapembeli
                    orderNamapembeli = order.getNamapembeli();
                    // read order.alamatkirim
                    orderAlamatkirim = order.getAlamatkirim();
                    // read order.nama
                    orderNama = order.getNama();
                    // read order.harga
                    orderHarga = order.getHarga();
                    // read order.jumlah
                    orderJumlah = order.getJumlah();
                    // read order.photourl
                    orderPhotourl = order.getPhotourl();
                    // read order.totalharga
                    orderTotalharga = order.getTotalharga();
                    // read order.idorder
                    orderIdorder = order.getIdorder();
                }


                // read String.valueOf(order.harga)
                stringValueOfOrderHarga = java.lang.String.valueOf(orderHarga);
                // read String.valueOf(order.jumlah)
                stringValueOfOrderJumlah = java.lang.String.valueOf(orderJumlah);
                // read String.valueOf(order.totalharga)
                stringValueOfOrderTotalharga = java.lang.String.valueOf(orderTotalharga);


                // read ('x') + (String.valueOf(order.jumlah))
                charXStringValueOfOrderJumlah = ('x') + (stringValueOfOrderJumlah);
        }
        // batch finished
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            com.example.uasanmp.util.UtilKt.loadPhotoUrl(this.imageView, orderPhotourl);
            this.mboundView1.setTag(orderIdorder);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView11, stringValueOfOrderTotalharga);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView12, orderNamapembeli);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView13, orderAlamatkirim);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView8, stringValueOfOrderHarga);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewJumlahTransaksi, charXStringValueOfOrderJumlah);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewNameFood, orderNama);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(cardlistenerOnHistoryCardAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewTanggal, tanggal);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.uasanmp.view.HistoryCardListener value;
        public OnClickListenerImpl setValue(com.example.uasanmp.view.HistoryCardListener value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onHistoryCard(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tanggal
        flag 1 (0x2L): cardlistener
        flag 2 (0x3L): visible
        flag 3 (0x4L): order
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}