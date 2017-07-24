package com.lebcirakram.mac.transports.Fournisseur;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.lebcirakram.mac.transports.Fournisseur.Fragment.ClientFragment;
import com.lebcirakram.mac.transports.Fournisseur.Fragment.FournisseurFragment;

/**
 * Created by mac on 7/17/17.
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0: return new ClientFragment();
            case 1: return new FournisseurFragment();
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
                return "Client";
            case 1:
                return "Fournisseur";
        }
        return null;
    }
}
