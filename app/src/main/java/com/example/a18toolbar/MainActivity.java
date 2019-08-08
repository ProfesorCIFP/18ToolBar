package com.example.a18toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar tbMenuMain, tbMenuCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbMenuMain = findViewById(R.id.tbMenuMain);

        setSupportActionBar(tbMenuMain);

        tbMenuCard = findViewById(R.id.tbMenuCard);

        // tbMenuCard.setTitle("TIULO TRA");
        tbMenuCard.inflateMenu(R.menu.card_menu);

        tbMenuCard.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_card_nuevo:
                        Toast.makeText(getApplicationContext(), "NUEVO CARD", Toast.LENGTH_SHORT).show();
                        Log.i("ActionBar", "Nuevo Card!");
                        return true;
                    case R.id.action_card_buscar:
                        Toast.makeText(getApplicationContext(), "BUSCAR CARD", Toast.LENGTH_SHORT).show();
                        Log.i("ActionBar", "Buscar Card!");
                        return true;
                }

                return true;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_nuevo:
                Toast.makeText(getApplicationContext(), "NUEVO MAIN", Toast.LENGTH_SHORT).show();
                Log.i("ActionBar", "Nuevo Main!");
                return true;
            case R.id.action_buscar:
                Toast.makeText(getApplicationContext(), "BUSCAR MAIN", Toast.LENGTH_SHORT).show();
                Log.i("ActionBar", "Buscar Main!");
                ;
                return true;
            case R.id.action_settings:
                Toast.makeText(getApplicationContext(), "SETTING MAIN", Toast.LENGTH_SHORT).show();
                Log.i("ActionBar", "Settings Main!");
                ;
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
