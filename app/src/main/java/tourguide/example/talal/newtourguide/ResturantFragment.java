package tourguide.example.talal.newtourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ResturantFragment extends Fragment {

    ArrayList<Resturant> resturants = new ArrayList<>();
    ListView listView;

    public ResturantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        resturants.add(new Resturant(getString(R.string.rest_one), getString(R.string.rate_one)));
        resturants.add(new Resturant(getString(R.string.rest_tow), getString(R.string.rate_tow)));
        resturants.add(new Resturant(getString(R.string.rest_three), getString(R.string.rate_three)));
        resturants.add(new Resturant(getString(R.string.rest_four), getString(R.string.rate_four)));
        resturants.add(new Resturant(getString(R.string.rest_five), getString(R.string.rate_five)));
        // Inflate the layout for this fragment1
        View view = inflater.inflate(R.layout.fragment_resturant, container, false);
        TextView textView = view.findViewById(R.id.restNameView);
        listView = view.findViewById(R.id.list_view);
        ResturantAdapter adapter = new ResturantAdapter(resturants, getActivity());
        listView.setAdapter(adapter);
        return view;


    }


}
