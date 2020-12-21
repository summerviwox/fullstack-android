package com.summer.android.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.summer.android.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 主界面的底部切换控件
 */
public class BottomView extends LinearLayout implements View.OnClickListener{

    private OnTabSelected onTabSelected;

    View[] views;


    public BottomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    private void init(Context context, @Nullable AttributeSet attrs){
        setOrientation(LinearLayout.HORIZONTAL);
        LayoutInflater.from(getContext()).inflate(R.layout.layout_bottomview,this,true);
        ButterKnife.bind(this);
        views = new View[]{findViewById(R.id.main),findViewById(R.id.second),findViewById(R.id.mine)};
        for(int i=0;i<views.length;i++){
            views[i].setTag(R.id.position,i);
        }
        selectTab(0);
    }

    @OnClick({R.id.main,R.id.second,R.id.mine})
    public void onClick(View view) {
        for(int i=0;i<views.length;i++){
            views[i].setSelected(view==views[i]);
        }
        if(onTabSelected!=null){
            onTabSelected.onTabSelected((Integer) view.getTag(R.id.position),view);
        }
    }

    public void selectTab(int index){
        for(int i=0;i<views.length;i++){
            views[i].setSelected(i==index);
        }
    }

    public  interface OnTabSelected{

        public void onTabSelected(int index,View view);

    }

    /////////////////////////////////////////
    public OnTabSelected getOnTabSelected() {
        return onTabSelected;
    }

    public void setOnTabSelected(OnTabSelected onTabSelected) {
        this.onTabSelected = onTabSelected;
    }
}
