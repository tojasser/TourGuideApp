package tourguide.example.talal.newtourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HistoricalFragment extends Fragment {

    ArrayList<Historical> historicals = new ArrayList<>();
    ListView listView;


    public HistoricalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        historicals.add(new Historical(getString(R.string.masmak),R.drawable.masmak));
        historicals.add(new Historical(getString(R.string.edge),R.drawable.edgeoftheearth));

        View view= inflater.inflate(R.layout.fragment_historical, container, false);

        listView=view.findViewById(R.id.list_view);

        HistoriacalAdapter adapter= new HistoriacalAdapter(historicals, getActivity());

        listView.setAdapter(adapter);


        return view;
    }

}
