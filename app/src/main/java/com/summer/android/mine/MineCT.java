package com.summer.android.mine;

import com.summer.x.base.ui.XFragment;

public class MineCT extends XFragment<MineUI,MineDE,MineVA> {

    public static MineCT getInstance(){
        MineCT mineCT = new MineCT();
        return  mineCT;
    }
}