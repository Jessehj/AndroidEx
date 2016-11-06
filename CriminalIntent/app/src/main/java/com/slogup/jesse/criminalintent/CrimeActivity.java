package com.slogup.jesse.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

public class CrimeActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        FragmentManager fm = getSupportFragmentManager();

        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {

            fragment = new CrimeFragment();

            fm.beginTransaction().add(R.id.fragment_container, fragment).commit(); // 새로운 프래그먼트 트랜잭션 인스턴스를 생성하고 그 인스턴스에 프래그먼트 객체를 추가한 후 커밋한다.
        }
    }
}
