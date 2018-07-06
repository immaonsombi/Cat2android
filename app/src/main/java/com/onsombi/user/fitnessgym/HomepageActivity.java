package com.onsombi.user.fitnessgym;


import android.content.Intent;
import android.media.MediaCas;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


import com.google.android.gms.maps.SupportMapFragment;

import java.util.ArrayList;
import java.util.List;


public class HomepageActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    public DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
private Button profile,session,instructors,gyms;
        Intent myIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

//        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//
//        viewPager = (ViewPager) findViewById(R.id.viewpager);
//        setupViewPager(viewPager);
//
//        tabLayout = (TabLayout) findViewById(R.id.tabs);
//        tabLayout.setupWithViewPager(viewPager);

//        mDrawerLayout=(DrawerLayout)findViewById(R.id.drawer);
//        mToggle=new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
//        mDrawerLayout.addDrawerListener(mToggle);
//        mToggle.syncState();
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        profile=(Button)findViewById(R.id.profile);
        session=(Button)findViewById(R.id.workout);
        instructors=(Button)findViewById(R.id.btinstructor);
        gyms=(Button)findViewById(R.id.btngym);


        session.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myIntent=new Intent(HomepageActivity.this, Sessionworkout.class);
                startActivity(myIntent);
            }
        });

        instructors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myIntent=new Intent(HomepageActivity.this, instructors.class);
                startActivity(myIntent);
            }
        });

        gyms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myIntent=new Intent(HomepageActivity.this, MapsActivity.class);
                startActivity(myIntent);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myIntent=new Intent(HomepageActivity.this, profileuser.class);
                startActivity(myIntent);
            }
        });
    }
}






//    }private void setupViewPager(ViewPager viewPager) {
//        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
//        adapter.addFragment(new instructor(), "Insructors");
//        adapter.addFragment(new Session(), "Workouts");
//        adapter.addFragment(new SupportMapFragment(),"maps");
//        viewPager.setAdapter(adapter);
//    }
//
//    class ViewPagerAdapter extends FragmentPagerAdapter {
//        private final List<Fragment> mFragmentList = new ArrayList<>();
//        private final List<String> mFragmentTitleList = new ArrayList<>();
//
//        public ViewPagerAdapter(FragmentManager manager) {
//            super(manager);
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            return mFragmentList.get(position);
//        }
//
//        @Override
//        public int getCount() {
//            return mFragmentList.size();
//        }
//
//        public void addFragment(Fragment fragment, String title) {
//            mFragmentList.add(fragment);
//            mFragmentTitleList.add(title);
//        }
//
//        @Override
//        public CharSequence getPageTitle(int position) {
//            return mFragmentTitleList.get(position);
//        }
//    }
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item){
//        if (mToggle.onOptionsItemSelected(item)){
//            return true;
//
//        }
//        return super.onOptionsItemSelected(item);
//
//    }
//}
