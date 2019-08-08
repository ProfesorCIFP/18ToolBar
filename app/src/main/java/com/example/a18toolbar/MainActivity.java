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

    private Toolbar tbMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbMenu = findViewById(R.id.tbMenu);

        setSupportActionBar(tbMenu);
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
                Toast.makeText(getApplicationContext(), "NUEVO", Toast.LENGTH_SHORT).show();
                Log.i("ActionBar", "Nuevo!");
                return true;
            case R.id.action_buscar:
                Toast.makeText(getApplicationContext(), "BUSCAR", Toast.LENGTH_SHORT).show();
                Log.i("ActionBar", "Buscar!");
                ;
                return true;
            case R.id.action_settings:
                Toast.makeText(getApplicationContext(), "SETTING", Toast.LENGTH_SHORT).show();
                Log.i("ActionBar", "Settings!");
                ;
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
