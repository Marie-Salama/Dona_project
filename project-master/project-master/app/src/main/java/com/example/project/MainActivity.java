package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("OFFERS");


        List<Mobile> mobileList = new ArrayList<>();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv);
        MobileAdapter adapter = new MobileAdapter(mobileList , this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        Mobile mobile0 = new Mobile();
        mobile0.setMobileName("3 donuts");
        mobile0.setMobileManufacture("30 EGP");
        mobile0.setMobileImage(R.drawable.dona1);


        Mobile mobile11 = new Mobile();
        mobile11.setMobileName("2 fresh juices");
        mobile11.setMobileManufacture("35 EGP");
        mobile11.setMobileImage(R.drawable.juices);


        Mobile mobile = new Mobile();
        mobile.setMobileName("1donut and coffee");
        mobile.setMobileManufacture("25 EGP");
        mobile.setMobileImage(R.drawable.donatt);

        Mobile mobile1 = new Mobile();
        mobile1.setMobileName("3 coffee");
        mobile1.setMobileManufacture("45 EGP");
        mobile1.setMobileImage(R.drawable.donnaa);

        Mobile mobile2 = new Mobile();
        mobile2.setMobileName("2 donuts");
        mobile2.setMobileManufacture("25 EGP");
        mobile2.setMobileImage(R.drawable.do88);


        Mobile mobile3 = new Mobile();
        mobile3.setMobileName("2 coffee and 2 donut");
        mobile3.setMobileManufacture("60 EGP");
        mobile3.setMobileImage(R.drawable.coffee_donut);


        Mobile mobile9 = new Mobile();
        mobile9.setMobileName("2 DonaDay");
        mobile9.setMobileManufacture("50 EGP");
        mobile9.setMobileImage(R.drawable.sunday);


        Mobile mobile14 = new Mobile();
        mobile14.setMobileName("mokhito (Monday)");
        mobile14.setMobileManufacture("30 EGP");
        mobile14.setMobileImage(R.drawable.mokhito);


        Mobile mobile4 = new Mobile();
        mobile4.setMobileName("1 donut");
        mobile4.setMobileManufacture("10 EGP");
        mobile4.setMobileImage(R.drawable.donat);


        Mobile mobile5 = new Mobile();
        mobile5.setMobileName("2 dona ice");
        mobile5.setMobileManufacture("40 EGP");
        mobile5.setMobileImage(R.drawable.icecream);

        Mobile mobile8 = new Mobile();
        mobile8.setMobileName("4 coctail");
        mobile8.setMobileManufacture("120 EGP");
        mobile8.setMobileImage(R.drawable.infused_water);



        Mobile mobile6 = new Mobile();
        mobile6.setMobileName("Milkshake and dona ice");
        mobile6.setMobileManufacture("55 EGP");
        mobile6.setMobileImage(R.drawable.milkshake_icecream);

        Mobile mobile12 = new Mobile();
        mobile12.setMobileName("8 pieces of cookies (Monday)");
        mobile12.setMobileManufacture("50 EGP");
        mobile12.setMobileImage(R.drawable.cookies);




        mobileList.add(mobile0);
        mobileList.add(mobile11);
        mobileList.add(mobile);
        mobileList.add(mobile1);
        mobileList.add(mobile2);
        mobileList.add(mobile3);
        mobileList.add(mobile9);
        mobileList.add(mobile14);
        mobileList.add(mobile4);
        mobileList.add(mobile5);
        mobileList.add(mobile8);
        mobileList.add(mobile6);
        mobileList.add(mobile12);



    }
}