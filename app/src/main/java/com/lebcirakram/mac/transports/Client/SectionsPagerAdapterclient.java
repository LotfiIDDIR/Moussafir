package com.lebcirakram.mac.transports.Client;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.lebcirakram.mac.transports.Client.Fragment.ListFragment;
import com.lebcirakram.mac.transports.Client.Fragment.MapFragment;
import com.lebcirakram.mac.transports.Fournisseur.Fragment.ClientFragment;
import com.lebcirakram.mac.transports.Fournisseur.Fragment.FournisseurFragment;

/**
 * Created by mac on 7/17/17.
 */

public class SectionsPagerAdapterclient extends FragmentPagerAdapter {

    public SectionsPagerAdapterclient(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0: return new ListFragment();
            case 1: return new MapFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return null;
            case 1:
                return null;
        }
        return null;
    }
}
