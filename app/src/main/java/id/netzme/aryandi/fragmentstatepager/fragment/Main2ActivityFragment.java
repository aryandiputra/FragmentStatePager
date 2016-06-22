package id.netzme.aryandi.fragmentstatepager.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import id.netzme.aryandi.fragmentstatepager.R;
import id.netzme.aryandi.fragmentstatepager.adapter.MyAdapter;

/**
 * A placeholder fragment containing a simple view.
 */
public class Main2ActivityFragment extends Fragment {

    private static final int NUM_ITEMS = 50;
    private MyAdapter mAdapter;
    private ViewPager mPager;

    public Main2ActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View convertView = inflater.inflate(R.layout.fragment_main2, container, false);

        mAdapter = new MyAdapter(getActivity().getSupportFragmentManager(), NUM_ITEMS);

        mPager = (ViewPager) convertView.findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        // Watch for button clicks.
        Button button = (Button)convertView.findViewById(R.id.goto_first);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mPager.setCurrentItem(0);
            }
        });
        button = (Button)convertView.findViewById(R.id.goto_last);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mPager.setCurrentItem(NUM_ITEMS-1);
            }
        });

        return convertView;


    }
}
