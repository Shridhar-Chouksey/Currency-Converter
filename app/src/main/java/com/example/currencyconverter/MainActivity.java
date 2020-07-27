package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.LogWriter;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void convertcurrency(View view)
    {
     Log.i("Info","button clicked");

     EditText editText=(EditText)findViewById(R.id.editText);

    String dollarinString=editText.getText().toString();

    double dollarindouble =Double.parseDouble(dollarinString);
    double rupeesindouble= (dollarindouble*74.15);

     String rupeesinString= String.format("%0.2f",rupeesindouble);

     Toast.makeText(this," "+dollarinString+"dollar"+" = " + " "+rupeesinString+"Rs",Toast.LENGTH_LONG).show();





    }//editText.getText().toString(),Toast.LENGTH_LONG).show();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
