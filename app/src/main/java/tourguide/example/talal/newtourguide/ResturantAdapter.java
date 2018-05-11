package tourguide.example.talal.newtourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by talal on 07/04/18.
 */

public class ResturantAdapter extends BaseAdapter {
    ArrayList<Resturant> resturants;
    Context context;


    public ResturantAdapter(ArrayList<Resturant> resturants, Context context) {
        this.resturants = resturants;
        this.context = context;
    }

    @Override
    public int getCount() {
        return resturants.size();
    }

    @Override
    public Resturant getItem(int i) {
        return resturants.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.itemresturant, viewGroup, false);
        TextView resturant_name = view.findViewById(R.id.restNameView);
        TextView resturant_rate = view.findViewById(R.id.rateView);


        resturant_name.setText(getItem(i).getName());
        resturant_rate.setText(getItem(i).getRate());

        return view;
    }
}
