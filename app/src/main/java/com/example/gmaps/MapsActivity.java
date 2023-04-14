package com.example.gmaps;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.gmaps.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;
    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        b1=findViewById(R.id.floating_button1);
        b2=findViewById(R.id.floating_button2);
        b3=findViewById(R.id.floating_button3);
        b4=findViewById(R.id.floating_button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LatLng au = new LatLng(33.825273240421915, 72.42671235195147);
                mMap.addMarker(new MarkerOptions().position(au).title("Air University Kamra"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(au));
                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setCompassEnabled(true);
                mMap.getUiSettings().setRotateGesturesEnabled(true);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LatLng au = new LatLng(33.825273240421915, 72.42671235195147);
                mMap.addMarker(new MarkerOptions().position(au).title("Air University Kamra"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(au));
                mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setCompassEnabled(true);
                mMap.getUiSettings().setRotateGesturesEnabled(true);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LatLng au = new LatLng(33.825273240421915, 72.42671235195147);
                mMap.addMarker(new MarkerOptions().position(au).title("Air University Kamra"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(au));
                mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setCompassEnabled(true);
                mMap.getUiSettings().setRotateGesturesEnabled(true);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LatLng au = new LatLng(33.825273240421915, 72.42671235195147);
                mMap.addMarker(new MarkerOptions().position(au).title("Air University Kamra"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(au));
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setCompassEnabled(true);
                mMap.getUiSettings().setRotateGesturesEnabled(true);
            }
        });

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Air University, Kamra.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng au = new LatLng(33.825273240421915, 72.42671235195147);
        mMap.addMarker(new MarkerOptions().position(au).title("Air University Kamra"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(au));
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);
        mMap.getUiSettings().setRotateGesturesEnabled(true);

    }
}