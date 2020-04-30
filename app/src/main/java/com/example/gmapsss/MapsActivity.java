package com.example.gmapsss;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in SPBU and move the camera
        LatLng pom1 = new LatLng(-7.920553, 112.594997);
        mMap.addMarker(new MarkerOptions().position(pom1).title("SPBU UMM"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pom1));

        LatLng pom2 = new LatLng(-7.929391, 112.595796);
        mMap.addMarker(new MarkerOptions().position(pom2).title("POM Mini"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pom2));

        LatLng pom3 = new LatLng(-7.931343, 112.602913);
        mMap.addMarker(new MarkerOptions().position(pom3).title("SPBU Tlogomas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pom3));

        LatLng pom4 = new LatLng(-7.945607, 112.612158);
        mMap.addMarker(new MarkerOptions().position(pom4).title("Bensin Eceran"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pom4));

        LatLng pom5 = new LatLng(-7.944040, 112.617674);
        mMap.addMarker(new MarkerOptions().position(pom5).title("Pertamini"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pom5));
    }
}
