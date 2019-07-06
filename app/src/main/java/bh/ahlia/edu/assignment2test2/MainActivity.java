package bh.ahlia.edu.assignment2test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Debug;
import android.provider.Settings;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_foot, et_inches, et_km, et_mile, et_kg, et_pound;
    Button btn_convert, btn_clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_foot = (EditText)findViewById(R.id.et_foot);
        et_inches = (EditText)findViewById(R.id.et_inches);

        et_km = (EditText)findViewById(R.id.et_km);
        et_mile = (EditText)findViewById(R.id.et_mile);


        et_kg = (EditText)findViewById(R.id.et_kg);
        et_pound = (EditText)findViewById(R.id.et_pound);


        btn_convert = (Button)findViewById(R.id.btn_convert);
        btn_clear = (Button)findViewById(R.id.btn_clear);

        btn_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strCentimeter = et_foot.getText().toString();
                String strInches = et_inches.getText().toString();


                String strMile = et_mile.getText().toString();
                String strKM = et_km.getText().toString();

                String strPound = et_pound.getText().toString();
                String strKG = et_kg.getText().toString();


                if(!strCentimeter.equals("") && strInches.equals("")) {
                    double foot = Double.valueOf(et_foot.getText().toString());
                    double inches = foot / 2.54;
                    et_inches.setText(String.valueOf(inches));

                }else if (!strInches.equals("") && strCentimeter.equals("")){
                    double inches = Double.valueOf(et_inches.getText().toString());
                    double foot = inches * 2.54;
                    et_foot.setText(String.valueOf(foot));



                }else if (!strMile.equals("") && strKM.equals("")) {
                    double mile = Double.valueOf(et_mile.getText().toString());
                    double km = mile * 1.609;
                    et_km.setText(String.valueOf(km));


                }else if(!strKM.equals("") && strMile.equals("")) {
                     double km = Double.valueOf(et_km.getText().toString());
                     double mile = km / 1.609;
                     et_mile.setText(String.valueOf(mile));



                }else if (!strPound.equals("") && strKG.equals("")) {
                    double Pound = Double.valueOf(et_pound.getText().toString());
                    double kg = Pound / 2.205;
                    et_kg.setText(String.valueOf(kg));


                }else if(!strKG.equals("") && strPound.equals("")) {
                    double kg = Double.valueOf(et_kg.getText().toString());
                    double Pound = kg * 2.205;
                    et_pound.setText(String.valueOf(Pound));



                }else if(!strCentimeter.equals("") && !strInches.equals("")){
                    Toast.makeText(getApplicationContext(), "Please clear the text field first!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_foot.setText("");
                et_inches.setText("");

                et_km.setText("");
                et_mile.setText("");

                et_kg.setText("");
                et_pound.setText("");

            }
        });

    }
}
