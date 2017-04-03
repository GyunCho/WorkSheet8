package edu.temple.worksheet7;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;

import java.util.ArrayList;



public class PaletteFragment extends Fragment {
    PaletteInterface parent;
    Spinner spinner;

    public PaletteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_palette, container, false);

        spinner = (Spinner) layout.findViewById(R.id.spinner);
        //final View myLayout = findViewById(R.id.activity_palette);

        final ArrayList<String> myColors = new ArrayList<>();

        myColors.add("Red");
        myColors.add("Blue");
        myColors.add("Magenta");
        myColors.add("Gray");
        myColors.add("Yellow");
        myColors.add("White");
        myColors.add("Black");
        myColors.add("Cyan");
        myColors.add("Green");


        /*Resources res = getResources();
        String[] stringMyColors = res.getStringArray(R.array.color_array);
        final ArrayList<String> myColors = new ArrayList<>(Arrays.asList(stringMyColors));*/
        final ColorAdapter myAdapter = new ColorAdapter(getActivity(), myColors);

        spinner.setAdapter(myAdapter);

        AdapterView.OnItemSelectedListener oicl = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parents, View view, int position, long id) {
                //Intent newActivityIntent = new Intent(PaletteFragment.this, CanvasActivity.class);
                //newActivityIntent.putExtra("message", myColors.get(position));
                String colorText = myColors.get(position);
                if((getFragmentManager().findFragmentById(R.id.frag2)) != null)
                    parent.sendMessage(colorText);


                //startActivity(newActivityIntent);
                //myLayout.setBackgroundColor(Color.parseColor(colorText));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        };


        spinner.setOnItemSelectedListener(oicl);
        return layout;

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof PaletteInterface) {
            parent = (PaletteInterface) activity;
        } else {
            throw new RuntimeException("Not Implemented");
        }
    }

    public interface PaletteInterface {
        void sendMessage(String message);
    }
}





