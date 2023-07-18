package com.example.uasanmp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.uasanmp.databinding.FoodItemLayoutBindingImpl;
import com.example.uasanmp.databinding.FragmentDetailFoodBindingImpl;
import com.example.uasanmp.databinding.FragmentDetailHistoryBindingImpl;
import com.example.uasanmp.databinding.FragmentEditProfileBindingImpl;
import com.example.uasanmp.databinding.FragmentProfileBindingImpl;
import com.example.uasanmp.databinding.FragmentSignInBindingImpl;
import com.example.uasanmp.databinding.FragmentSignUpBindingImpl;
import com.example.uasanmp.databinding.HistoryItemLayoutBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FOODITEMLAYOUT = 1;

  private static final int LAYOUT_FRAGMENTDETAILFOOD = 2;

  private static final int LAYOUT_FRAGMENTDETAILHISTORY = 3;

  private static final int LAYOUT_FRAGMENTEDITPROFILE = 4;

  private static final int LAYOUT_FRAGMENTPROFILE = 5;

  private static final int LAYOUT_FRAGMENTSIGNIN = 6;

  private static final int LAYOUT_FRAGMENTSIGNUP = 7;

  private static final int LAYOUT_HISTORYITEMLAYOUT = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.uasanmp.R.layout.food_item_layout, LAYOUT_FOODITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.uasanmp.R.layout.fragment_detail_food, LAYOUT_FRAGMENTDETAILFOOD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.uasanmp.R.layout.fragment_detail_history, LAYOUT_FRAGMENTDETAILHISTORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.uasanmp.R.layout.fragment_edit_profile, LAYOUT_FRAGMENTEDITPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.uasanmp.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.uasanmp.R.layout.fragment_sign_in, LAYOUT_FRAGMENTSIGNIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.uasanmp.R.layout.fragment_sign_up, LAYOUT_FRAGMENTSIGNUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.uasanmp.R.layout.history_item_layout, LAYOUT_HISTORYITEMLAYOUT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FOODITEMLAYOUT: {
          if ("layout/food_item_layout_0".equals(tag)) {
            return new FoodItemLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for food_item_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDETAILFOOD: {
          if ("layout/fragment_detail_food_0".equals(tag)) {
            return new FragmentDetailFoodBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_detail_food is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDETAILHISTORY: {
          if ("layout/fragment_detail_history_0".equals(tag)) {
            return new FragmentDetailHistoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_detail_history is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEDITPROFILE: {
          if ("layout/fragment_edit_profile_0".equals(tag)) {
            return new FragmentEditProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_edit_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROFILE: {
          if ("layout/fragment_profile_0".equals(tag)) {
            return new FragmentProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSIGNIN: {
          if ("layout/fragment_sign_in_0".equals(tag)) {
            return new FragmentSignInBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_sign_in is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSIGNUP: {
          if ("layout/fragment_sign_up_0".equals(tag)) {
            return new FragmentSignUpBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_sign_up is invalid. Received: " + tag);
        }
        case  LAYOUT_HISTORYITEMLAYOUT: {
          if ("layout/history_item_layout_0".equals(tag)) {
            return new HistoryItemLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for history_item_layout is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(19);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "addlistener");
      sKeys.put(2, "alamatkirim");
      sKeys.put(3, "buylistener");
      sKeys.put(4, "cardlistener");
      sKeys.put(5, "editbuttonlistener");
      sKeys.put(6, "food");
      sKeys.put(7, "foodcardlistener");
      sKeys.put(8, "jumlah");
      sKeys.put(9, "logoutlistener");
      sKeys.put(10, "minlistener");
      sKeys.put(11, "namapembeli");
      sKeys.put(12, "order");
      sKeys.put(13, "savelistener");
      sKeys.put(14, "signinlistener");
      sKeys.put(15, "signuplistener");
      sKeys.put(16, "tanggal");
      sKeys.put(17, "user");
      sKeys.put(18, "visible");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/food_item_layout_0", com.example.uasanmp.R.layout.food_item_layout);
      sKeys.put("layout/fragment_detail_food_0", com.example.uasanmp.R.layout.fragment_detail_food);
      sKeys.put("layout/fragment_detail_history_0", com.example.uasanmp.R.layout.fragment_detail_history);
      sKeys.put("layout/fragment_edit_profile_0", com.example.uasanmp.R.layout.fragment_edit_profile);
      sKeys.put("layout/fragment_profile_0", com.example.uasanmp.R.layout.fragment_profile);
      sKeys.put("layout/fragment_sign_in_0", com.example.uasanmp.R.layout.fragment_sign_in);
      sKeys.put("layout/fragment_sign_up_0", com.example.uasanmp.R.layout.fragment_sign_up);
      sKeys.put("layout/history_item_layout_0", com.example.uasanmp.R.layout.history_item_layout);
    }
  }
}
