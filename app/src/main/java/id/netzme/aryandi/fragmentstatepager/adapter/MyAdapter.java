package id.netzme.aryandi.fragmentstatepager.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import id.netzme.aryandi.fragmentstatepager.fragment.ArrayListFragment;

/**
 * Created by aryandi on 6/21/16.
 */
public class MyAdapter extends FragmentStatePagerAdapter {

    private final int numItems;

    public MyAdapter(FragmentManager fm, int numItems) {
        super(fm);
        this.numItems = numItems;
    }

    @Override
    public int getCount() {
        return numItems;
    }

    @Override
    public Fragment getItem(int position) {
        return ArrayListFragment.newInstance(position);
    }
}
