package com.example.android.portfolio;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        View.OnClickListener listener = new View.OnClickListener() {
            public void onClick(View v) {
                String text;
                if (v instanceof Button) {
                    Button b = (Button)v;
                    text = String.format("This will launch the '%s' app", b.getText());
                }
                else {
                    text = "This will launch an app";
                }
                Toast toast = Toast.makeText(
                        v.getContext(),
                        text,
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        };

        int [] ids = { R.id.button_build_it_bigger, R.id.button_capstone, R.id.button_material,
                R.id.button_popular_movies, R.id.button_stock_hawk, R.id.button_ubiquitous };

        for (int i = 0; i < ids.length; i++) {
            ((Button) rootView.findViewById(ids[i])).setOnClickListener(listener);
        }

        return rootView;
    }

}
