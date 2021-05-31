package com.example.alertlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.TaskStackBuilder;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.menu_main,menu);
            return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.settings:{
                Toast.makeText(getApplicationContext(),"Settings",Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.contact:{
                Toast.makeText(getApplicationContext(),"Contact",Toast.LENGTH_SHORT).show();
                return true;

            }

        }

        return super.onOptionsItemSelected(item);

    }

}