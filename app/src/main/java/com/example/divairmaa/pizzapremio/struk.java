package com.example.divairmaa.pizzapremio;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.*;
import android.view.View.*;
import android.view.View;
import android.widget.*;

public class struk extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_struk);

        TextView pesan=(TextView)findViewById(R.id.list);
        TextView hargatot=(TextView)findViewById(R.id.total);
        TextView nama=(TextView)findViewById(R.id.name);

        Intent t= getIntent();

        String nm = t.getStringExtra("jeneng");
        String sum = t.getStringExtra("summaryOrder");
        int tot = t.getIntExtra("totalOrder",0);

        nama.setText(nm);
        pesan.setText(sum);
        hargatot.setText("Rp. "+tot);
    }
}