package com.josepacheco.android.contadorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button mBotonContar, mBotonReiniciar;
    private EditText mTextoContar;
    int mContar = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBotonContar = (Button)findViewById(R.id.botonContar);
        mBotonReiniciar = (Button)findViewById(R.id.botonReiniciar);
        mTextoContar = (EditText)findViewById(R.id.campo_Conteo);


        mBotonContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mContar++;
                mTextoContar.setText(mContar+"");
            }
        });

        mBotonReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mContar = 0;
                mTextoContar.setText(mContar+"");
            }
        });




    }


}
