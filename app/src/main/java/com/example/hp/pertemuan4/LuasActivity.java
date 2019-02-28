package com.example.hp.pertemuan4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasActivity extends AppCompatActivity {
    private EditText edtPjg,edtLbr;
    private TextView txtLuas;
    private Button btnLuas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas);

        edtPjg = findViewById(R.id.edtPjg);
        edtLbr = findViewById(R.id.edtLbr);
        txtLuas = findViewById(R.id.txtLuas);
        btnLuas = findViewById(R.id.btnHtgLuas);

        edtPjg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float panjang = Float.parseFloat(edtPjg.getText().toString());
                Float lebar = Float.parseFloat(edtLbr.getText().toString());
                Float Luas = panjang * lebar;

                txtLuas.setText(Luas.toString());
            }
        });

    }

}
