package com.example.lab22;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<String>countries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
countries=new ArrayList<>();
countries.add("España");


        LinearLayout principal = new LinearLayout(this);
        principal.setOrientation(LinearLayout.VERTICAL);
        setContentView(principal);

        LinearLayout buttons = new LinearLayout(this);
        buttons.setOrientation(LinearLayout.HORIZONTAL);
        Button b = new Button(this);
        b.setText("Add");



        Button e = new Button(this);
        e.setText("Edit");

        Button r = new Button(this);
        r.setText("Remove");


        buttons.addView(b);
        buttons.addView(e);
        buttons.addView(r);

        principal.addView(buttons);





    final EditText et = new EditText(this);
       et.setText("Type here");
      principal.addView(et);

        ListView countries_v = new ListView(this);
        principal.addView(countries_v);

        final ArrayAdapter<String>arrayc=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,countries);
        countries_v.setAdapter(arrayc);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayc.add(et.getText().toString());
            }
        });
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayc.remove(et.getText().toString());
            }
        });




    }
}
