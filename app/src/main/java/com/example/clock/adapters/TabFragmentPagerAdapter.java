package com.example.clock.adapters;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.clock.models.Tab;

import java.util.ArrayList;
import java.util.List;

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {

    private List<Tab> mListTabs = new ArrayList<>();

    public TabFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return mListTabs.get(i).getContent();
    }

    @Override
    public int getCount() {
        return mListTabs.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mListTabs.get(position).getTitle();
    }

    public void addNewTab(Tab tab) {
        mListTabs.add(tab);
    }

}
