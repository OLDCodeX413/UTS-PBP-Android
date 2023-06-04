package id.co.driveme.uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import id.co.driveme.uts.Fragment.FragmentStateAdapter;
import id.co.driveme.uts.Fragment.Intro1;
import id.co.driveme.uts.Fragment.Intro2;
import id.co.driveme.uts.Fragment.Intro3;

public class FragmentActivity extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        setupViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager){
        FragmentStateAdapter adapter = new FragmentStateAdapter(getSupportFragmentManager());
        adapter.addFragment(new Intro1(),"");
        adapter.addFragment(new Intro2(),"");
        adapter.addFragment(new Intro3(),"");
        viewPager.setAdapter(adapter);
    }

    public void setPage(int page){
        viewPager.setCurrentItem(page);
    }
}