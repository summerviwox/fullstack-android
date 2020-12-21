package com.summer.android.main;

import android.view.View;

import com.summer.x.base.ui.XActivity;
import com.summer.x.base.ui.XFragment;

public class MainCT extends XActivity<MainUI,MainDE,MainVA> implements BottomView.OnTabSelected {


    @Override
    public void onTabSelected(int index, View view) {
        getUI().onTabSelected(index,view);
    }
}