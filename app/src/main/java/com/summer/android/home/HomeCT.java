package com.summer.android.home;

import com.summer.x.base.ui.XFragment;

public class HomeCT extends XFragment<HomeUI,HomeDE,HomeVA> {

    public static HomeCT getInstance(){
        HomeCT homeCT = new HomeCT();
        return  homeCT;
    }
}