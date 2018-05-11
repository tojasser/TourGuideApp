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
public class EventFragment extends Fragment {

    ArrayList<Event> events= new ArrayList<>();
    ListView listView;
    public EventFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_event, container, false);
        events.add(new Event(getString(R.string.event_one)));
        events.add(new Event(getString(R.string.event_tow)));
        events.add(new Event(getString(R.string.event_three)));
        events.add(new Event(getString(R.string.event_four)));
        events.add(new Event(getString(R.string.event_five)));
        listView= view.findViewById(R.id.list_view);
        EventAdapter adapter= new EventAdapter(events, getActivity());

        listView.setAdapter(adapter);


        return view;
    }

}
