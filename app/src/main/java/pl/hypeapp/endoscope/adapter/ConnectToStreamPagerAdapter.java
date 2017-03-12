package pl.hypeapp.endoscope.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.HashMap;


import pl.hypeapp.endoscope.ui.fragment.WriteIpAddressFragment;


public class ConnectToStreamPagerAdapter extends FragmentPagerAdapter {
    private static final int CONNECT_TO_STREAM_PAGES = 1;
    private HashMap<Integer, Fragment> fragmentHashMap = new HashMap<>();

    public ConnectToStreamPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new WriteIpAddressFragment();

            default:
                break;
        }
        return null;
    }

    @Override
    public int getCount() {
        return CONNECT_TO_STREAM_PAGES;
    }
}
