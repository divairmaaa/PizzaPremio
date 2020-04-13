package com.example.divairmaa.pizzapremio;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
public class navbar extends AppCompatActivity {
    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                if(menuItem.isChecked()) menuItem.setChecked(false);
                else menuItem.setChecked(true);
                drawerLayout.closeDrawers();
                switch (menuItem.getItemId()){
                    case R.id.navigation1:
                        Toast.makeText(getApplicationContext(), "Pilihan Menu Telah Dipilih", Toast.LENGTH_SHORT).show();
                        Intent i =new Intent (getApplicationContext(),pilihan.class);
                        startActivity(i);
                        return true;
                    case R.id.navigation2:
                        Toast.makeText(getApplicationContext(),"Order Telah Dipilih",Toast.LENGTH_SHORT).show();
                        Intent a =new Intent (navbar.this,order.class);
                        startActivity(a);
                        return true;
                    case R.id.navigation3:
                        Toast.makeText(getApplicationContext(), "Contact Us Telah Dipilih", Toast.LENGTH_SHORT).show();
                        Intent b = new Intent(getApplicationContext(),contact.class);
                        startActivity(b);
                        return true;
                    case R.id.navigation4:
                        Toast.makeText(getApplicationContext(), "About Us Telah Dipilih", Toast.LENGTH_SHORT).show();
                        Intent c = new Intent(getApplicationContext(),about.class);
                        startActivity(c);
                        return true;
                    case R.id.navigation5:
                        Toast.makeText(getApplicationContext(), "Terima kasih atas kunjungannya", Toast.LENGTH_SHORT).show();
                        Intent d = new Intent(getApplicationContext(),exit.class);
                        startActivity(d);
                        return true;
                    default:
                        Toast.makeText(getApplicationContext(),"Kesalahan Terjadi ",Toast.LENGTH_SHORT).show();
                        return true;
                }
            }
        });
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.openDrawer, R.string.closeDrawer){
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

        };
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();


            }}
