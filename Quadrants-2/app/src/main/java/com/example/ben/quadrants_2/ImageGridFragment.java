package com.example.ben.quadrants_2;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

/**
 * Created by Ben on 11/20/15.
 */
public class ImageGridFragment extends Fragment {

    private ImageAdapter mImageAdapter;

    public ImageGridFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final Context context = getActivity();

        mImageAdapter = new ImageAdapter(context);

        // Create the rootView
        View rootView = inflater.inflate(R.layout.image_grid_fragment, container, false);

        //Get a reference to the GridView and attach this adapter to it
        GridView gridView = (GridView) rootView.findViewById(R.id.gridView);
        gridView.setAdapter(mImageAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(context,"" + position, Toast.LENGTH_LONG).show();
            }
        });

        // Inflate the layout for this fragment
        return rootView;
    }
}

