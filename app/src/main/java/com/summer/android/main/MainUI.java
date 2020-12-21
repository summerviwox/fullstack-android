package com.summer.android.main;

import android.view.View;

import com.summer.android.databinding.CtMainBinding;
import com.summer.x.base.ui.UI;

public class MainUI extends UI<CtMainBinding> implements BottomView.OnTabSelected {

    @Override
    public void initUI() {
        super.initUI();
        getUI().bottomview.setOnTabSelected((BottomView.OnTabSelected) getXActivity());
        getUI().viewpager.setAdapter(new PageAdapter(getXActivity().getSupportFragmentManager()));
    }


    @Override
    public void onTabSelected(int index, View view) {
        getUI().viewpager.setCurrentItem(index);
    }
}