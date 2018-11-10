package com.malik.usman.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


ArrayList<Model> cars=new ArrayList<>();
    GridView g1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        g1=findViewById(R.id.gridview);

        Model car=new Model();
        Model car1=new Model();
        Model car2=new Model();
        Model car3=new Model();
        Model car4=new Model();
        Model car5=new Model();
        Model car6=new Model();
        Model car7=new Model();

        car.setPic(R.drawable.mercedes4);
        car.setCarname("mercedes Luxury");
        car.setPrice("34 LAc");
        car.setCarmodel("2016");
        car.setLocation("Lahore");


        car1.setPic(R.drawable.mercedes20);
        car1.setCarname("mercedes Ultra");
        car1.setPrice("54 LAc");
        car1.setCarmodel("2019");
        car1.setLocation("Sialkot");


        car2.setPic(R.drawable.mercedes6);
        car2.setCarname("mercedes model");
        car2.setPrice("44 LAc");
        car2.setCarmodel("2013");
        car2.setLocation("GJW");


        car3.setPic(R.drawable.mercedes12);
        car3.setCarname("mercedes Cass");
        car3.setPrice("30 LAc");
        car3.setCarmodel("2012");
        car3.setLocation("Narowal");


        car4.setPic(R.drawable.mercedes14);
        car4.setCarname("mercedes Auto");
        car4.setPrice("40 LAc");
        car4.setCarmodel("2014");
        car4.setLocation("Islambad");


        car5.setPic(R.drawable.mercedes17);
        car5.setCarname("mercedes Auto-2");
        car5.setPrice("70 LAc");
        car5.setCarmodel("2019");
        car5.setLocation("Karachi");


        car6.setPic(R.drawable.mercedes20);
        car6.setCarname("mercedes Ultra-5");
        car6.setPrice("48 LAc");
        car6.setCarmodel("2015");
        car6.setLocation("Peshawer");

        cars.add(car);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);

        g1.setAdapter(new Adapter(this.cars,getApplicationContext()));

    }
}
