package com.example.pangestutitan.pangestu_1202154211_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class DineIn extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private static final String TAG = DineIn.class.getSimpleName();
    private String mSpinnerLabel = "";

    EditText name;
    Button button_pilih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        name = (EditText)findViewById(R.id.name);
        button_pilih = (Button) findViewById(R.id.button_pilih);

        Spinner spinner = (Spinner) findViewById(R.id.label_spinner);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.labels_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        if (spinner != null) {
            spinner.setAdapter(adapter);
        }

        button_pilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DineIn.this, DaftarMenu.class);
                DineIn.this.startActivity(intent);
                Toast.makeText(getApplicationContext(), mSpinnerLabel+ "Terpilih", Toast.LENGTH_SHORT).show();

            }
        });

    }

    public void showText(View view) {
        EditText editText = (EditText) findViewById(R.id.name);
        if (editText != null) {
            String showString = ("No Meja:");
            TextView nomorMejaResult = (TextView) findViewById(R.id.noMeja);
            if (nomorMejaResult != null) nomorMejaResult.setText(showString);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {
        mSpinnerLabel = adapterView.getItemAtPosition(pos).toString();
        showText(view);
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
        Log.d(TAG,"onNothingSelected: ");
    }






}
