package com.gparagon.tema4ejercicio2;

import android.os.Bundle;
import android.view.Menu;
import com.google.android.material.navigation.NavigationView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Seteo de toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Seteo del menu lateral
        DrawerLayout drawer = findViewById(R.id.drawer_layout); // se le dice que elemento es el DrawerLayout, el fondo en general
        NavigationView navigationView = findViewById(R.id.nav_view); // y aqui se le dice que elemento es el navigationview, el menu lateral literal

        // "Contructor" del menu lateral y según el item pulsado va a su navigation AUTOMATICO
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_food, R.id.nav_providers, R.id.nav_contact, R.id.button_exit)
                .setOpenableLayout(drawer)
                .build();
        // Le indica donde colocar el menu lateral
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        // Actualizacion del titulo de la pagina
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    // Creacion del menu de 3 puntos derecha arriba, añade todos los items al menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    // Control de la navegacion hacia arriba
    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration) || super.onSupportNavigateUp();
    }
}