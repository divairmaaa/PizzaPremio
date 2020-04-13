package com.example.divairmaa.pizzapremio;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.*;
import android.view.View.*;
import android.view.View;
import android.widget.*;

public class pilihan extends Activity{
    ImageView img1,img2,img3,img4;
    Spinner men;
    Button ok;
    TextView t1,t2,t3,t4;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihan);
        men = (Spinner)findViewById(R.id.menu);
        ok = (Button)findViewById(R.id.proses);
        t1=(TextView)findViewById(R.id.d1);
        t2=(TextView)findViewById(R.id.d2);
        t3=(TextView)findViewById(R.id.d3);
        t4=(TextView)findViewById(R.id.d4);
        img1=(ImageView)findViewById(R.id.g1);
        img2=(ImageView)findViewById(R.id.g2);
        img3=(ImageView)findViewById(R.id.g3);
        img4=(ImageView)findViewById(R.id.g4);
        ok.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String nama1="MeatLovers\nRp 190.000";
                String nama2="Frankfurter BBQ\nRp 145.000";
                String nama3="Cheeseburger Pizza\nRp 130.000";
                String nama4="American Favourite\nRp 98.000";
                String nama5="Beef Spaghetti\nRp 35.000";
                String nama6="Chicken Fusili\nRp 30.000";
                String nama7="Black Pepper Beef\nRp 35.000";
                String nama8="Choco Mint\nRp 15.000";
                String nama9="Strawberry Milkshake\nRp 20.000";
                String nama10="Avocado Float\nRp 20.000";
                String nama11="Tomato Juice\nRp 15.000";
                String nama12="Banana Split\nRp 20.000";
                String nama13="Vanilla Oreo\nRp 20.000";
                String nama14="Strawberry Cookies\nRp 20.000";
                String nama15="Black Pepper Chicken\nRp 40.000";
                String nama16="Oriental Chicken\nRp 35.000";
                String nama17="Cheese Beef Fusilli\nRp 35.000";
                String nama18="Choco Devil\nRp 20.000";
                String nama19="Meatballs Beef Mushroom Sauce\nRp 35.000";
                String nama20="Beef Steak\nRp 30.000";
                if(men.getSelectedItem().toString().equals("Pizza")){
                    t1.setText(String.valueOf(nama1));
                    t2.setText(String.valueOf(nama2));
                    t3.setText(String.valueOf(nama3));
                    t4.setText(String.valueOf(nama4));
                    img1.setImageResource(R.drawable.meatlovers);
                    img2.setImageResource(R.drawable.frank);
                    img3.setImageResource(R.drawable.cheese);
                    img4.setImageResource(R.drawable.american);

                }
                if(men.getSelectedItem().toString().equals("Pasta")){
                    t1.setText(String.valueOf(nama5));
                    t2.setText(String.valueOf(nama6));
                    t3.setText(String.valueOf(nama7));
                    t4.setText(String.valueOf(nama17));
                    img1.setImageResource(R.drawable.beefspa);
                    img2.setImageResource(R.drawable.fusili);
                    img3.setImageResource(R.drawable.bpepperbeef);
                    img4.setImageResource(R.drawable.cheesebeef);

                }
                if(men.getSelectedItem().toString().equals("Minuman")){
                    t1.setText(String.valueOf(nama8));
                    t2.setText(String.valueOf(nama9));
                    t3.setText(String.valueOf(nama10));
                    t4.setText(String.valueOf(nama11));
                    img1.setImageResource(R.drawable.choco);
                    img2.setImageResource(R.drawable.straw);
                    img3.setImageResource(R.drawable.avocado);
                    img4.setImageResource(R.drawable.tomato);
                }
                if(men.getSelectedItem().toString().equals("Dessert")){
                    t1.setText(String.valueOf(nama12));
                    t2.setText(String.valueOf(nama13));
                    t3.setText(String.valueOf(nama14));
                    t4.setText(String.valueOf(nama18));
                    img1.setImageResource(R.drawable.split);
                    img2.setImageResource(R.drawable.oreo);
                    img3.setImageResource(R.drawable.cookies);
                    img4.setImageResource(R.drawable.chocod);
                }
                if(men.getSelectedItem().toString().equals("Nasi")){
                    t1.setText(String.valueOf(nama15));
                    t2.setText(String.valueOf(nama16));
                    t3.setText(String.valueOf(nama19));
                    t4.setText(String.valueOf(nama20));
                    img1.setImageResource(R.drawable.bpepperchicken);
                    img2.setImageResource(R.drawable.orichicken);
                    img3.setImageResource(R.drawable.meatballs);
                    img4.setImageResource(R.drawable.bsteak);
                }
            }
        });
    }
}
