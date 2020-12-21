package com.summer.android.main;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.summer.android.home.HomeCT;
import com.summer.android.mine.MineCT;
import com.summer.android.second.SecondCT;

public class PageAdapter extends FragmentStatePagerAdapter {

    Fragment[] fragments = new Fragment[]{HomeCT.getInstance(), SecondCT.getInstance(), MineCT.getInstance()};

    public PageAdapter(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }
}
