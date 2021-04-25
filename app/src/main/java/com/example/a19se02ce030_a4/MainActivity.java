package com.example.a19se02ce030_a4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap mapAPI;
    SupportMapFragment mapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapAPI);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mapAPI = googleMap;

        LatLng Maharastra =new LatLng(19.5916796786569, 75.70430536006025);

        mapAPI.addMarker(new MarkerOptions().position(Maharastra).title("Maharastra"));

        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(Maharastra));



        LatLng home =new LatLng(21.239353079048797, 72.8332864434168);

        mapAPI.addMarker(new MarkerOptions().position(home).title("home town"));

        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(home));



        LatLng PPSU =new LatLng(21.49840420435047, 73.00807746799308);

        mapAPI.addMarker(new MarkerOptions().position(PPSU).title("PPSU"));

        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(PPSU));



        LatLng xavier =new LatLng(21.17538998321066, 72.81002534099977);

        mapAPI.addMarker(new MarkerOptions().position(xavier).title("ST.XAVIER'S HIGH SCHOOL"));

        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(xavier));
    }
}