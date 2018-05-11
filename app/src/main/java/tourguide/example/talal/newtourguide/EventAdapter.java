package tourguide.example.talal.newtourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by talal on 21/04/18.
 */

public class EventAdapter extends BaseAdapter {

    ArrayList<Event> events;
    Context context;

    public EventAdapter(ArrayList<Event> events, Context context) {
        this.events = events;
        this.context = context;
    }

    @Override
    public int getCount() {
        return events.size();
    }

    @Override
    public Event getItem(int i) {
        return events.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.itemevent, viewGroup, false);
        TextView textView= view.findViewById(R.id.eventDesc);
        textView.setText(getItem(i).getEventDesc());

        return view;
    }
}
