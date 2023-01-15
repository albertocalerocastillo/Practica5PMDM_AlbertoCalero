package com.example.practica5pmdmalbertocalero;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.Toast;
import com.example.practica5pmdmalbertocalero.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration myAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.appBarMain.toolbar);
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;

        myAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_pintor, R.id.nav_escultor, R.id.nav_cientifico, R.id.nav_inventor)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, myAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, myAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.action_alta:
                Toast.makeText(this, "Has elegido Alta", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_baja:
                Toast.makeText(this, "Has elegido Baja", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_modificacion:
                Toast.makeText(this, "Has elegido Modificación", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}