package com.example.pangestutitan.pangestu_1202154211_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TakeAway extends AppCompatActivity {
    EditText name, phone, alamat, catatan;
    Button btnPilih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

        name = (EditText)findViewById(R.id.name);
        phone = (EditText)findViewById(R.id.phone);
        alamat = (EditText)findViewById(R.id.alamat);
        catatan = (EditText)findViewById(R.id.catatan);
        btnPilih = (Button) findViewById(R.id.btnPilih);

        btnPilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameKey = name.getText().toString();
                String phoneKey = phone.getText().toString();
                String alamatKey = alamat.getText().toString();
                String catatanKey = catatan.getText().toString();

                Intent intent = new Intent(TakeAway.this, DaftarMenu.class);
                TakeAway.this.startActivity(intent);

            }
        });
    }
}
