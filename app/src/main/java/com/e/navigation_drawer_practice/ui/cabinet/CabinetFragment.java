package com.e.navigation_drawer_practice.ui.cabinet;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.e.navigation_drawer_practice.R;

public class CabinetFragment extends Fragment {

    public View root;
    TextView txt_home;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_cabinet, container, false);
        txt_home = root.findViewById(R.id.txt_home);
        txt_home.setText("Text changed");
        return root;
    }
}
