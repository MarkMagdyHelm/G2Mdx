package com.example.dev_2.g2mdx;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.dev_2.g2mdx.dummy.DummyContent;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,Click,about2.OnFragmentInteractionListener, aboutFragment1.OnFragmentInteractionListener, Contact.OnFragmentInteractionListener,HomeFragment1.OnFragmentInteractionListener, RecyclFragment.OnListFragmentInteractionListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        if (savedInstanceState == null) {
            HomeFragment1 test = new HomeFragment1();
            test.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction().replace(R.id.rl, test, "your_fragment_tag").commit();
        } else {
            HomeFragment1 test = (HomeFragment1) getSupportFragmentManager().findFragmentByTag("your_fragment_tag");
        }

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            HomeFragment1 test = new HomeFragment1();
            test.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction().replace(R.id.rl, test, "your_fragment_tag").addToBackStack( "1" ).commit();
        } else if (id == R.id.nav_gallery) {
            aboutFragment1 firstFragmen = new aboutFragment1();
            firstFragmen.setArguments(getIntent().getExtras());
            FragmentManager fragManager = getSupportFragmentManager();
            FragmentTransaction transactio =
                    fragManager.beginTransaction().addToBackStack( "1" );
            transactio.replace(R.id.rl, firstFragmen);
            transactio.commit();
        } else if (id == R.id.nav_slideshow) {
            RecyclFragment firstFragmen = new RecyclFragment();
            firstFragmen.setArguments(getIntent().getExtras());
            FragmentManager fragManager = getSupportFragmentManager();
            FragmentTransaction transactio =
                    fragManager.beginTransaction();
            transactio.replace(R.id.rl, firstFragmen).addToBackStack( "1" );
            transactio.commit();
        } else if (id == R.id.nav_manage) {
            Contact firstFragmen = new Contact();
            firstFragmen.setArguments(getIntent().getExtras());
            FragmentManager fragManager = getSupportFragmentManager();
            FragmentTransaction transactio =
                    fragManager.beginTransaction();
            transactio.replace(R.id.rl, firstFragmen).addToBackStack( "1" );
            transactio.commit();
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onButtonClick(String s) {
        if (s.equals("about")) {
            aboutFragment1 firstFragmen = new aboutFragment1();
            firstFragmen.setArguments(getIntent().getExtras());
            FragmentManager fragManager = getSupportFragmentManager();
            FragmentTransaction transactio =
                    fragManager.beginTransaction();
            transactio.replace(R.id.rl, firstFragmen).addToBackStack( "1" );
            transactio.commit();
        } else if (s.equals("contact")) {
            Contact firstFragmen = new Contact();
            firstFragmen.setArguments(getIntent().getExtras());
            FragmentManager fragManager = getSupportFragmentManager();
            FragmentTransaction transactio =
                    fragManager.beginTransaction();
            transactio.replace(R.id.rl, firstFragmen).addToBackStack( "1" );
            transactio.commit();
        }else if (s.equals("home")){
           RecyclFragment firstFragmen = new RecyclFragment();
            firstFragmen.setArguments(getIntent().getExtras());
            FragmentManager fragManager = getSupportFragmentManager();
            FragmentTransaction transactio =
                    fragManager.beginTransaction();
            transactio.replace(R.id.rl, firstFragmen).addToBackStack( "1" );
            transactio.commit();
        }else if(s.equals("services")){
            RecyclFragment firstFragmen = new RecyclFragment();
            firstFragmen.setArguments(getIntent().getExtras());
            FragmentManager fragManager = getSupportFragmentManager();
            FragmentTransaction transactio =
                    fragManager.beginTransaction();
            transactio.replace(R.id.rl, firstFragmen).addToBackStack( "1" );
            transactio.commit();
        }else if(s.equals("about1")){
            Bundle bundle = new Bundle();
            bundle.putString("key", "1");
            about2 firstFragmen = new about2();
            firstFragmen.setArguments(bundle);
            FragmentManager fragManager = getSupportFragmentManager();
            FragmentTransaction transactio =
                    fragManager.beginTransaction();
            transactio.replace(R.id.rl, firstFragmen).addToBackStack( "1" );
            transactio.commit();
        }else if(s.equals("about2")){
            Bundle bundle = new Bundle();
            bundle.putString("key", "2");
            about2 firstFragmen = new about2();
            firstFragmen.setArguments(bundle);
            FragmentManager fragManager = getSupportFragmentManager();
            FragmentTransaction transactio =
                    fragManager.beginTransaction();
            transactio.replace(R.id.rl, firstFragmen).addToBackStack( "1" );
            transactio.commit();
        }else if(s.equals("about3")){
            Bundle bundle = new Bundle();
            bundle.putString("key", "3");
            about2 firstFragmen = new about2();
            firstFragmen.setArguments(bundle);
            FragmentManager fragManager = getSupportFragmentManager();
            FragmentTransaction transactio =
                    fragManager.beginTransaction();
            transactio.replace(R.id.rl, firstFragmen).addToBackStack( "1" );
            transactio.commit();
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}