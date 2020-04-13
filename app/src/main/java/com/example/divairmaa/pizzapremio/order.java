package com.example.divairmaa.pizzapremio;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.*;
import android.view.View.*;
import android.view.View;
import android.widget.*;

public class order extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        final CheckBox meat=(CheckBox)findViewById(R.id.pizza1);
        final CheckBox bbq=(CheckBox)findViewById(R.id.pizza2);
        final CheckBox cheese=(CheckBox)findViewById(R.id.pizza3);
        final CheckBox american=(CheckBox)findViewById(R.id.pizza4);
        final CheckBox beef=(CheckBox)findViewById(R.id.pasta1);
        final CheckBox chicken=(CheckBox)findViewById(R.id.pasta2);
        final CheckBox pepper=(CheckBox)findViewById(R.id.pasta3);
        final CheckBox beeffu=(CheckBox)findViewById(R.id.pasta4);
        final CheckBox choco=(CheckBox)findViewById(R.id.minum1);
        final CheckBox milk=(CheckBox)findViewById(R.id.minum2);
        final CheckBox avocado=(CheckBox)findViewById(R.id.minum3);
        final CheckBox tomato=(CheckBox)findViewById(R.id.minum4);
        final CheckBox banana=(CheckBox)findViewById(R.id.d1);
        final CheckBox vanilla=(CheckBox)findViewById(R.id.d2);
        final CheckBox cookies=(CheckBox)findViewById(R.id.d3);
        final CheckBox chocod=(CheckBox)findViewById(R.id.d4);
        final CheckBox black=(CheckBox)findViewById(R.id.nasi1);
        final CheckBox oriental=(CheckBox)findViewById(R.id.nasi2);
        final CheckBox meatb=(CheckBox)findViewById(R.id.nasi3);
        final CheckBox last=(CheckBox)findViewById(R.id.nasi4);

        final EditText jmeat=(EditText)findViewById(R.id.j1);
        final EditText jbbq=(EditText)findViewById(R.id.j2);
        final EditText jcheese=(EditText)findViewById(R.id.j3);
        final EditText jamerican=(EditText)findViewById(R.id.j4);
        final EditText jbeef=(EditText)findViewById(R.id.j5);
        final EditText jchicken=(EditText)findViewById(R.id.j6);
        final EditText jpepper=(EditText)findViewById(R.id.j7);
        final EditText jchoco=(EditText)findViewById(R.id.j8);
        final EditText jmilk=(EditText)findViewById(R.id.j9);
        final EditText javocado=(EditText)findViewById(R.id.j10);
        final EditText jtomato=(EditText)findViewById(R.id.j11);
        final EditText jbanana=(EditText)findViewById(R.id.j12);
        final EditText jvanilla=(EditText)findViewById(R.id.j13);
        final EditText jcookies=(EditText)findViewById(R.id.j14);
        final EditText jblack=(EditText)findViewById(R.id.j15);
        final EditText joriental=(EditText)findViewById(R.id.j16);
        final EditText jbeeffu=(EditText)findViewById(R.id.j17);
        final EditText jchocod=(EditText)findViewById(R.id.j18);
        final EditText jmeatb=(EditText)findViewById(R.id.j19);
        final EditText jlast=(EditText)findViewById(R.id.j20);
        final EditText name=(EditText)findViewById(R.id.nama);

        final int hmeat= 90000;
        final int hbbq= 85000;
        final int hcheese= 90000;
        final int hamerican= 98000;
        final int hbeef= 35000;
        final int hchicken= 30000;
        final int hpepper= 35000;
        final int hchoco= 15000;
        final int hmilk= 20000;
        final int havocado= 20000;
        final int htomato= 15000;
        final int hbanana= 20000;
        final int hvanilla= 20000;
        final int hcookies= 20000;
        final int hblack= 40000;
        final int horiental= 35000;
        final int hcbf= 35000;
        final int hchocod= 20000;
        final int hmeatb= 35000;
        final int hlast= 30000;

        Button pesan=(Button)findViewById(R.id.book);

        pesan.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                String nm = name.getText().toString();
                String summOrder="";
                int totOrder=0;
                if(meat.isChecked()){
                    String txt="- Meat Lovers";
                    int jml=Integer.parseInt(String.valueOf(jmeat.getText()));
                    int calc=jml*hmeat;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if(bbq.isChecked()){
                    String txt="- Frankfurter BBQ";
                    int jml=Integer.parseInt(String.valueOf(jbbq.getText()));
                    int calc=jml*hbbq;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if(cheese.isChecked()){
                    String txt="- Cheeseburger Pizza";
                    int jml=Integer.parseInt(String.valueOf(jcheese.getText()));
                    int calc=jml*hcheese;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if(american.isChecked()){
                    String txt="- American Favourite";
                    int jml=Integer.parseInt(String.valueOf(jamerican.getText()));
                    int calc=jml*hamerican;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if(beef.isChecked()){
                    String txt="- Beef Spaghetti";
                    int jml=Integer.parseInt(String.valueOf(jbeef.getText()));
                    int calc=jml*hbeef;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if(chicken.isChecked()){
                    String txt="- Chicken Fusili";
                    int jml=Integer.parseInt(String.valueOf(jchicken.getText()));
                    int calc=jml*hchicken;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if(pepper.isChecked()){
                    String txt="- Black Pepper Beef";
                    int jml=Integer.parseInt(String.valueOf(jpepper.getText()));
                    int calc=jml*hpepper;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if(choco.isChecked()){
                    String txt="- Choco Mint";
                    int jml=Integer.parseInt(String.valueOf(jchoco.getText()));
                    int calc=jml*hchoco;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if(milk.isChecked()){
                    String txt="- Strawberry Milkshake";
                    int jml=Integer.parseInt(String.valueOf(jmilk.getText()));
                    int calc=jml*hmilk;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if(avocado.isChecked()){
                    String txt="- Avocado Float";
                    int jml=Integer.parseInt(String.valueOf(javocado.getText()));
                    int calc=jml*havocado;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if(tomato.isChecked()){
                    String txt="- Tomato Juice";
                    int jml=Integer.parseInt(String.valueOf(jtomato.getText()));
                    int calc=jml*htomato;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if(banana.isChecked()){
                    String txt="- Banana Split";
                    int jml=Integer.parseInt(String.valueOf(jbanana.getText()));
                    int calc=jml*hbanana;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if(vanilla.isChecked()){
                    String txt="- Vanilla Oreo";
                    int jml=Integer.parseInt(String.valueOf(jvanilla.getText()));
                    int calc=jml*hvanilla;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if(cookies.isChecked()){
                    String txt="- Strawberry Cookies";
                    int jml=Integer.parseInt(String.valueOf(jcookies.getText()));
                    int calc=jml*hcookies;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if(black.isChecked()){
                    String txt="- Black Pepper Chicken";
                    int jml=Integer.parseInt(String.valueOf(jblack.getText()));
                    int calc=jml*hblack;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if(oriental.isChecked()){
                    String txt="- Oriental Chicken";
                    int jml=Integer.parseInt(String.valueOf(joriental.getText()));
                    int calc=jml*horiental;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if(beeffu.isChecked()){
                    String txt="- Cheese Beef Fusilli";
                    int jml=Integer.parseInt(String.valueOf(jbeeffu.getText()));
                    int calc=jml*hcbf;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if(chocod.isChecked()){
                    String txt="- Choco Devil";
                    int jml=Integer.parseInt(String.valueOf(jchocod.getText()));
                    int calc=jml*hchocod;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if(meatb.isChecked()){
                    String txt="- Meatballs Beef Mushroom Sauce";
                    int jml=Integer.parseInt(String.valueOf(jmeatb.getText()));
                    int calc=jml*hmeatb;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                if(last.isChecked()){
                    String txt="- Beef Steak";
                    int jml=Integer.parseInt(String.valueOf(jlast.getText()));
                    int calc=jml*hlast;
                    summOrder += txt+" "+jml+"\n";
                    totOrder += calc;
                }
                Intent i = new Intent (order.this,struk.class);
                i.putExtra("jeneng",nm);
                i.putExtra("summaryOrder",summOrder);
                i.putExtra("totalOrder", totOrder);
                startActivity(i);
            }
        });
    }
}