package com.example.test;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.test.databinding.FragmentFirstBindingImpl;
import com.example.test.databinding.FragmentPageLoginBindingImpl;
import com.example.test.databinding.FragmentTest2BindingImpl;
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
  private static final int LAYOUT_FRAGMENTFIRST = 1;

  private static final int LAYOUT_FRAGMENTPAGELOGIN = 2;

  private static final int LAYOUT_FRAGMENTTEST2 = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.test.R.layout.fragment_first, LAYOUT_FRAGMENTFIRST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.test.R.layout.fragment_page_login, LAYOUT_FRAGMENTPAGELOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.test.R.layout.fragment_test2, LAYOUT_FRAGMENTTEST2);
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
        case  LAYOUT_FRAGMENTFIRST: {
          if ("layout/fragment_first_0".equals(tag)) {
            return new FragmentFirstBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_first is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPAGELOGIN: {
          if ("layout/fragment_page_login_0".equals(tag)) {
            return new FragmentPageLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_page_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTEST2: {
          if ("layout/fragment_test2_0".equals(tag)) {
            return new FragmentTest2BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_test2 is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_first_0", com.example.test.R.layout.fragment_first);
      sKeys.put("layout/fragment_page_login_0", com.example.test.R.layout.fragment_page_login);
      sKeys.put("layout/fragment_test2_0", com.example.test.R.layout.fragment_test2);
    }
  }
}
