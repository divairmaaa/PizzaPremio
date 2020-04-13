package com.example.divairmaa.pizzapremio;

import android.content.Intent;
import android.os.Bundle;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.app.Activity;
import android.app.AlertDialog;

public class exit extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        close();
    }
    public void close() {
        AlertDialog.Builder e = new AlertDialog.Builder(this);
        e.setMessage("Apakah Anda ingin keluar?").setCancelable(false).setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                moveTaskToBack(true);
            }
        }).setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();

            }
        }).show();
    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent c = new Intent(exit.this,navbar.class);
            startActivity(c);
        }
        return super.onKeyDown(keyCode, event);
    }
}
