package id.co.driveme.uts;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.app.AlertDialog;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import id.co.driveme.uts.databinding.ActivityNavigationDrawerBinding;

public class NavigationDrawerActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityNavigationDrawerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityNavigationDrawerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String userLogin = getIntent().getStringExtra("nama");
        String userTanggal = getIntent().getStringExtra("tanggalLahir");
        String userEmail = getIntent().getStringExtra("email");
        String userName = getIntent().getStringExtra("username");
        String userPass = getIntent().getStringExtra("password");

        setSupportActionBar(binding.appBarNavigationDrawer.toolbar);

        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;

        View headerview = navigationView.getHeaderView(0);
        TextView namaUser = (TextView) headerview.findViewById(R.id.Nama_User);
        TextView tanggalUser = (TextView) headerview.findViewById(R.id.Tanggal_User);
        TextView emailUser = (TextView) headerview.findViewById(R.id.Email_User);

        namaUser.setText(userLogin);
        tanggalUser.setText(userTanggal);
        emailUser.setText(userEmail);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.homeID, R.id.animeListID, R.id.animeRevID, R.id.contactUsID, R.id.logoutID)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_navigation_drawer);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
        navigationView.getMenu().findItem(R.id.logoutID).setOnMenuItemClickListener(MenuItem -> {
            logout();
            return true;
        });
    }

    private void logout() {
        AlertDialog.Builder builderAlert = new AlertDialog.Builder(this);
        builderAlert.setCancelable(false);
        builderAlert.setMessage("Konfirmasi Keluar dari Akun");
        builderAlert.setPositiveButton("Keluar", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                Intent put = getIntent();
                String put_data1 = put.getStringExtra("nama");
                String put_data2 = put.getStringExtra("tanggalLahir");
                String put_data3 = put.getStringExtra("email");
                String put_data4 = put.getStringExtra("username");
                String put_data5 = put.getStringExtra("password");

                Intent login = new Intent(NavigationDrawerActivity.this, LoginActivity.class);
                login.putExtra("nama",put_data1);
                login.putExtra("tanggalLahir",put_data2);
                login.putExtra("email",put_data3);
                login.putExtra("username",put_data4);
                login.putExtra("password",put_data5);

                startActivity(login);
                finish();
            }
        });
        builderAlert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog alert = builderAlert.create();
        alert.show();
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation_drawer, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_navigation_drawer);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}