package com.example.adri9ps.menusconandroidstudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    LinearLayout ly;
    TextView adri, quetal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        ly = (LinearLayout) findViewById(R.id.baseLY);

        adri = (TextView) findViewById(R.id.id_adri);
        quetal = (TextView) findViewById(R.id.id_quetal);


        adri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                PopupMenu popupMenu = new PopupMenu(MainActivity.this, adri);
                popupMenu.getMenuInflater().inflate(R.menu.popupmenu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.op1:
                                Toast.makeText(MainActivity.this, "Has pulsado la opcion 1", Toast.LENGTH_LONG).show();
                                break;
                            case R.id.op2:
                                Toast.makeText(MainActivity.this, "Has pulsado la opcion 2", Toast.LENGTH_LONG).show();
                                break;
                        }
                        return false;
                    }
                });

                popupMenu.show();
            }
        });


        registerForContextMenu(ly);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mMenuInflater = getMenuInflater();
        mMenuInflater.inflate(R.menu.menu_option, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.op3:
                Toast.makeText(MainActivity.this, "Has pulsado la opcion 3", Toast.LENGTH_LONG).show();
                break;
            case R.id.op4:
                Toast.makeText(MainActivity.this, "Has pulsado la opcion 4", Toast.LENGTH_LONG).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.menu_context, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.op5:
                Toast.makeText(MainActivity.this, "Has pulsado la opcion 5", Toast.LENGTH_LONG).show();
                break;
            case R.id.op6:
                Toast.makeText(MainActivity.this, "Has pulsado la opcion 6", Toast.LENGTH_LONG).show();

            case R.id.op7:
                Toast.makeText(MainActivity.this, "Has pulsado la opcion 7", Toast.LENGTH_LONG).show();


        }
        return super.onContextItemSelected(item);
    }
}