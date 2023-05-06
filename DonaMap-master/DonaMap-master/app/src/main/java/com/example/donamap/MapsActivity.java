package com.example.donamap;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.donamap.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // The SupportMapFragment object manages the life cycle of the map and is the parent element of the app's UI.
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
    //The GoogleMap object provides access to the map data and view. This is the main class of the Maps SDK for Android
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Smouha and move the camera to focus on it
        LatLng smouha = new LatLng(31.207508, 29.964782);
        mMap.addMarker(new MarkerOptions().position(smouha).title("Dona"));

        // Set the initial camera position and zoom level
        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(smouha) // Sets the center of the map to Smouha
                .zoom(14) // Sets the zoom level
                .build();

        // Update the camera to the desired position and zoom level
        mMap.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
    }
}
//31.210323, 29.953282