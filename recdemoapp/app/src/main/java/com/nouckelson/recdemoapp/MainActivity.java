package com.nouckelson.recdemoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    myAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Recycler and Card View Demo");
        rcv=(RecyclerView) findViewById(R.id.rclview);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        adapter=new myAdapter(dataqueue(),getApplicationContext());
        rcv.setAdapter(adapter);
       // LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        //rcv.setLayoutManager(layoutManager);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        rcv.setLayoutManager(gridLayoutManager);
    }

    public ArrayList<Model> dataqueue(){
        ArrayList<Model> holder=new ArrayList<>();

        //OB1
        Model ob1=new Model();
        ob1.setHeader("C Programming");
        ob1.setHeader("Desktop Programming");
        ob1.setImgname(R.drawable.cp);
        holder.add(ob1);
        //
        // OB2
        Model ob2=new Model();
        ob2.setHeader("C++ Programming");
        ob2.setHeader("Desktop Programming Language");
        ob2.setImgname(R.drawable.cpp);
        holder.add(ob2);
        //
        // OB3
        Model ob3=new Model();
        ob3.setHeader("Java Programming");
        ob3.setHeader("Desktop Programming Language");
        ob3.setImgname(R.drawable.java);
        holder.add(ob3);
        //
        // OB4
        Model ob4=new Model();
        ob4.setHeader("PHP Programming");
        ob4.setHeader("Web Programming Language");
        ob4.setImgname(R.drawable.php);
        holder.add(ob4);
        //
        // OB5
        Model ob5=new Model();
        ob5.setHeader(".NET Programming");
        ob5.setHeader("Desktop/Web Programming Language");
        ob5.setImgname(R.drawable.dotnet);
        holder.add(ob5);
        //
        // OB6
        Model ob6=new Model();
        ob6.setHeader("Wordpress Framework");
        ob6.setHeader("PHP based Blogging Framework");
        ob6.setImgname(R.drawable.wordpress);
        holder.add(ob6);
        //        //OB7
        Model ob7=new Model();
        ob7.setHeader("Magento Framework");
        ob7.setHeader("PHP based e-Comm Framework");
        ob7.setImgname(R.drawable.magento);
        holder.add(ob7);
        //
        // OB8
        Model ob8=new Model();
        ob1.setHeader("Shopify Framework");
        ob1.setHeader("PHP based e-Comm Framework");
        ob1.setImgname(R.drawable.shopify);
        holder.add(ob8);
        //
        // OB9
        Model ob9=new Model();
        ob9.setHeader("Angular Programming");
        ob9.setHeader("Web Programming");
        ob9.setImgname(R.drawable.angular);
        holder.add(ob9);
        //
        // OB10
        Model ob10=new Model();
        ob10.setHeader("Python Programming");
        ob10.setHeader("Desktop/Web based Programming");
        ob10.setImgname(R.drawable.python);
        holder.add(ob10);
        //
        // OB11
        Model ob11=new Model();
        ob11.setHeader("Node JS Programming");
        ob11.setHeader("Web based Programming");
        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob11);
        //
        return  holder;
    }
}