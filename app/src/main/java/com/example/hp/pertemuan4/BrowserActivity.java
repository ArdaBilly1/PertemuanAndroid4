package com.example.hp.pertemuan4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BrowserActivity extends AppCompatActivity {
    private Button btnGo;
    private EditText edtWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        btnGo = findViewById(R.id.BtnGo);
        edtWeb = findViewById(R.id.editBrowser);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = edtWeb.getText().toString();
                Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
                startActivity(i);
            }
        });

    }
}
