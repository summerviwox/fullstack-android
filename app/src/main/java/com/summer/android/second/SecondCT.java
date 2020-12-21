package com.summer.android.second;

import com.summer.x.base.ui.XFragment;

public class SecondCT extends XFragment<SecondUI,SecondDE,SecondVA> {

    public static SecondCT getInstance(){
        SecondCT secondCT = new SecondCT();
        return  secondCT;
    }
}