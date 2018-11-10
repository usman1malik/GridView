package com.malik.usman.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    Context activity_context;
    ArrayList<Model> cars=new ArrayList<>();
  LayoutInflater inflater;

    public Adapter(ArrayList<Model> cars, Context applicationContext) {
        this.activity_context=applicationContext;
        this.cars=cars;
    }


    @Override
    public int getCount()
    {
        return cars.size();
    }

    @Override
    public Object getItem(int i) {

        return null;
    }

    @Override
    public long getItemId(int i)
    {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null){
            inflater=LayoutInflater.from(activity_context);
            view=inflater.inflate(R.layout.design,null);
        }
        ImageView imgv=view.findViewById(R.id.imgv1d);
        TextView name=view.findViewById(R.id.txtvN);
        TextView price=view.findViewById(R.id.txtvp);
        TextView Model=view.findViewById(R.id.txtv2M);
        TextView Loc=view.findViewById(R.id.txtvL);

        imgv.setImageResource(cars.get(i).getPic());
        name.setText(cars.get(i).getCarname());
        price.setText(cars.get(i).getPrice());
        Model.setText(cars.get(i).getCarmodel());
        Loc.setText(cars.get(i).getLocation());
        return view;



    }
}
