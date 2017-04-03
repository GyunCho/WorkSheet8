package edu.temple.worksheet7;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class CanvasFragment extends Fragment {


    View secondLayout;

    public CanvasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

            View layout = inflater.inflate(R.layout.fragment_canvas, container, false);
            secondLayout = (View) layout.findViewById(R.id.fragment_canvas);
            return layout;

    }




    public void changeBackgroundColor(String message) {


            if (message.equals("Red"))
                secondLayout.setBackgroundColor(Color.RED);

            if (message.equals("Rojo"))
                secondLayout.setBackgroundColor(Color.RED);

            if (message.equals("Blue"))
                secondLayout.setBackgroundColor(Color.BLUE);

            if (message.equals("Azul"))
                secondLayout.setBackgroundColor(Color.BLUE);

            if (message.equals("Magenta"))
                secondLayout.setBackgroundColor(Color.MAGENTA);

            if (message.equals("Magenta"))
                secondLayout.setBackgroundColor(Color.MAGENTA);

            if (message.equals("Gray"))
                secondLayout.setBackgroundColor(Color.GRAY);

            if (message.equals("Gris"))
                secondLayout.setBackgroundColor(Color.GRAY);

            if (message.equals("Yellow"))
                secondLayout.setBackgroundColor(Color.YELLOW);

            if (message.equals("Amarillo"))
                secondLayout.setBackgroundColor(Color.YELLOW);

            if (message.equals("White"))
                secondLayout.setBackgroundColor(Color.WHITE);

            if (message.equals("Blanco"))
                secondLayout.setBackgroundColor(Color.WHITE);

            if (message.equals("Black"))
                secondLayout.setBackgroundColor(Color.BLACK);

            if (message.equals("Negro"))
                secondLayout.setBackgroundColor(Color.BLACK);

            if (message.equals("Cyan"))
                secondLayout.setBackgroundColor(Color.CYAN);

            if (message.equals("Ciánico"))
                secondLayout.setBackgroundColor(Color.CYAN);

            if (message.equals("Green"))
                secondLayout.setBackgroundColor(Color.GREEN);

            if (message.equals("Verde"))
                secondLayout.setBackgroundColor(Color.GREEN);

    }
}
