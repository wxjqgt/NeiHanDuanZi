package com.weibo.neihanduanzi.mvp.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.weibo.neihanduanzi.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DuanZiFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DuanZiFragment extends Fragment {

    public DuanZiFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment DuanZiFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DuanZiFragment newInstance() {
        DuanZiFragment fragment = new DuanZiFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_duan_zi, container, false);
    }

}
