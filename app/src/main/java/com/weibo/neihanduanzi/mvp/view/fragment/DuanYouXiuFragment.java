package com.weibo.neihanduanzi.mvp.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.weibo.neihanduanzi.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DuanYouXiuFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DuanYouXiuFragment extends BaseFragment {

    public DuanYouXiuFragment() {
        // Required empty public constructor
    }


    public static DuanYouXiuFragment newInstance() {
        DuanYouXiuFragment fragment = new DuanYouXiuFragment();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_duan_you_xiu;
    }
}
