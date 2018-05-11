package tourguide.example.talal.newtourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by talal on 21/04/18.
 */

public class HistoriacalAdapter extends BaseAdapter {

    ArrayList<Historical> historicals;
    Context context;


    public HistoriacalAdapter(ArrayList<Historical> historicals, Context context) {
        this.historicals = historicals;
        this.context = context;
    }

    @Override
    public int getCount() {
        return historicals.size();
    }

    @Override
    public Historical getItem(int i) {
        return historicals.get(i);
    }


    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.itemhistorical, viewGroup, false);
        TextView descrtion = view.findViewById(R.id.desc);
        ImageView imageView= view.findViewById(R.id.imageView);


        descrtion.setText(getItem(i).getDecs());
        imageView.setImageResource(getItem(i).getImgRecurceID());

        return view;
    }
}

