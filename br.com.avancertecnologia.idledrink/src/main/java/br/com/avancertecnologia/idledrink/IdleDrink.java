package br.com.avancertecnologia.idledrink;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import br.com.avancertecnologia.GUI.*;


public class IdleDrink extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idle_drink);

        ViewPager viewPager = findViewById(R.id.viewPager);

        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        pagerAdapter.Add(new Personagem(),"Personagem");
        pagerAdapter.Add(new Personagem(), "Estabelicimento");
        pagerAdapter.Add(new Personagem(), "Funcionario");

        viewPager.setAdapter(pagerAdapter);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

        /*tabLayout.addTab(i);
        tabLayout.addTab(tabLayout.newTab().setText("Bebida"));
        tabLayout.addTab(tabLayout.newTab().setText("Loja"));
        tabLayout.addTab(tabLayout.newTab().setText("Funcionario"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);*/
    }
}
