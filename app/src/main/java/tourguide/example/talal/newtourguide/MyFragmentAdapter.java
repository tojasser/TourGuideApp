package tourguide.example.talal.newtourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by talal on 20/04/18.
 */

public class MyFragmentAdapter extends FragmentStatePagerAdapter {
    public MyFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new InfoFragment();

            case 1:
                return new ResturantFragment();

            case 2:
                return new HistoricalFragment();

            case 3:
                return new EventFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return "Info";

            case 1:
                return "Resturant";

            case 2:
                return "Historical";

            case 3:
                return "event";
        }
        return super.getPageTitle(position);
    }
}
