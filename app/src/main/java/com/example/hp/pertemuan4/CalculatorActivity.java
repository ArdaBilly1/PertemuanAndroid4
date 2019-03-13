package com.example.hp.pertemuan4;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, btik, bC, bplus, bmin, bagi, bkali, bhasil;

    EditText edt1;

    float mbil1, mbil2;

    boolean mTambah, mKurang, mKali, mBagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        bplus = (Button) findViewById(R.id.bplus);
        bmin = (Button) findViewById(R.id.bmin);
        bkali = (Button) findViewById(R.id.bkali);
        bagi = (Button) findViewById(R.id.bagi);
        bC = (Button) findViewById(R.id.bC);
        btik = (Button) findViewById(R.id.btik);
        edt1 = (EditText) findViewById(R.id.edt1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "0");
            }
        });

        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1 == null) {
                    edt1.setText("");
                } else {
                    mbil1 = Float.parseFloat(edt1.getText() + "");
                    mTambah = true;
                    edt1.setText(null);
                }
            }
        });

        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1 == null) {
                    edt1.setText("");
                } else {
                    mbil1 = Float.parseFloat(edt1.getText() + "");
                    mKurang = true;
                    edt1.setText(null);

                }
            }

        });

        bkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1 == null) {
                    edt1.setText("");
                } else {
                    mbil1 = Float.parseFloat(edt1.getText() + "");
                    mKali = true;
                    edt1.setText(null);

                }
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1 == null) {
                    edt1.setText("");
                } else {
                    mbil1 = Float.parseFloat(edt1.getText() + "");
                    mBagi = true;
                    edt1.setText(null);

                }
            }
        });

        bhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mbil2 = Float.parseFloat(edt1.getText() + "");

                if (mTambah == true) {

                    edt1.setText(mbil1 + mbil2 + "");
                    mTambah = false;
                }


                if (mKurang == true) {
                    edt1.setText(mbil1 - mbil2 + "");
                    mKurang = false;
                }

                if (mKali == true) {
                    edt1.setText(mbil1 * mbil2 + "");
                    mKali = false;
                }

                if (mBagi == true) {
                    edt1.setText(mbil1 / mbil2 + "");
                    mBagi = false;
                }
            }
        });

        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
            }
        });

        btik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + ".");
            }
        });


    }
}