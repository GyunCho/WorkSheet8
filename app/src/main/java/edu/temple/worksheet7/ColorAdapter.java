package edu.temple.worksheet7;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by GyunCho on 3/29/17.
 */

public class ColorAdapter extends BaseAdapter {
    Context context;
    ArrayList<String> colors;

    public ColorAdapter(Context c, ArrayList<String> myColors) {
        this.context = c;
        this.colors = myColors;
    }

    @Override
    public int getCount() {
        return colors.size();
    }

    @Override
    public Object getItem(int position) {
        return colors.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView = new TextView(context);

        textView.setText(colors.get(position));

        if(colors.get(position).equals("Red")) {
            textView.setBackgroundColor(Color.RED);
        }

        if(colors.get(position).equals("Blue")) {
            textView.setBackgroundColor(Color.BLUE);
        }

        if(colors.get(position).equals("Magenta")) {
            textView.setBackgroundColor(Color.MAGENTA);
        }

        if(colors.get(position).equals("Gray")) {
            textView.setBackgroundColor(Color.GRAY);
        }

        if(colors.get(position).equals("Yellow")) {
            textView.setBackgroundColor(Color.YELLOW);
        }

        if(colors.get(position).equals("White")) {
            textView.setBackgroundColor(Color.WHITE);
        }

        if(colors.get(position).equals("Black")) {
            textView.setBackgroundColor(Color.BLACK);
        }

        if(colors.get(position).equals("Cyan")) {
            textView.setBackgroundColor(Color.CYAN);
        }

        if(colors.get(position).equals("Green")) {
            textView.setBackgroundColor(Color.GREEN);
        }

        if(colors.get(position).equals("Rojo")) {
            textView.setBackgroundColor(Color.RED);
        }

        if(colors.get(position).equals("Azul")) {
            textView.setBackgroundColor(Color.BLUE);
        }

        if(colors.get(position).equals("Magenta")) {
            textView.setBackgroundColor(Color.MAGENTA);
        }

        if(colors.get(position).equals("Gris")) {
            textView.setBackgroundColor(Color.GRAY);
        }

        if(colors.get(position).equals("Amarillo")) {
            textView.setBackgroundColor(Color.YELLOW);
        }

        if(colors.get(position).equals("Blanco")) {
            textView.setBackgroundColor(Color.WHITE);
        }

        if(colors.get(position).equals("Negro")) {
            textView.setBackgroundColor(Color.BLACK);
        }

        if(colors.get(position).equals("Ciánico")) {
            textView.setBackgroundColor(Color.CYAN);
        }

        if(colors.get(position).equals("Verde")) {
            textView.setBackgroundColor(Color.GREEN);
        }


        return textView;
    }
}
