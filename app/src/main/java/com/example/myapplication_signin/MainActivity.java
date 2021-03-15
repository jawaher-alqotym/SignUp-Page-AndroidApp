package com.example.myapplication_signin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        //fro displaying the spiner maege // the drop down menu
        Spinner maregStatSpiner=(Spinner)findViewById(R.id.spinnerMareg);
        ArrayAdapter<String> maregstatAdapter= new ArrayAdapter<String>(MainActivity.this
                ,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.MaritalStatus));
        maregstatAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        maregStatSpiner.setAdapter(maregstatAdapter);


        // for displaying the spiner amiunt // the drop down menu
        Spinner AmountSpiner=(Spinner)findViewById(R.id.spinnerAmount);
        ArrayAdapter<String> AmountAdapter= new ArrayAdapter<String>(MainActivity.this
                ,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.AmountOfSpending));
        AmountAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        AmountSpiner.setAdapter(AmountAdapter);


        //for displaying the spiner education // the drop down menu
        Spinner EducationSpiner=(Spinner)findViewById(R.id.spinnerEducation);
        ArrayAdapter<String> EducationAdapter= new ArrayAdapter<String>(MainActivity.this
                ,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.EducationLevel));
        EducationAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        EducationSpiner.setAdapter(EducationAdapter);


        //for displaying the spiner Weather // the drop down menu
        Spinner WeatherSpiner=(Spinner)findViewById(R.id.spinnerWeather);
        ArrayAdapter<String> WeatherAdapter= new ArrayAdapter<String>(MainActivity.this
                ,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.PreferdWather));
        WeatherAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        WeatherSpiner.setAdapter(WeatherAdapter);


        //for displaying the spiner Wondring As // the drop down menu
        Spinner WondringAsSpiner=(Spinner)findViewById(R.id.spinnerWondringAs);
        ArrayAdapter<String> WondringAsAdapter= new ArrayAdapter<String>(MainActivity.this
                ,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.WandringAs));
        WondringAsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        WondringAsSpiner.setAdapter(WondringAsAdapter);


        //BUTTON Sign up
        Button button=(Button)findViewById(R.id.aaa);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               /* To Get the text input from user----------------
                ------------------------------------------
                ----------------------------------------
                -------------------------------------
                --------------------------------------------
                --------------------------------------------------------*/

                //  To GET THE selected marage ansower from the spiner
                String str1=maregStatSpiner.getSelectedItem().toString();
                Toast.makeText(maregstatAdapter.getContext(),str1, Toast.LENGTH_SHORT).show();

                //  To GET THE selected amount ansower from the spiner
                String str2=AmountSpiner.getSelectedItem().toString();
                Toast.makeText(AmountAdapter.getContext(),str2, Toast.LENGTH_SHORT).show();

                 //To GET THE selected education level ansower from the spiner
                String str3=EducationSpiner.getSelectedItem().toString();
                Toast.makeText(EducationAdapter.getContext(),str3, Toast.LENGTH_SHORT).show();


                //To GET THE selected Weather ansower from the spiner
                String str4=WeatherSpiner.getSelectedItem().toString();
                Toast.makeText(WeatherAdapter.getContext(),str4, Toast.LENGTH_SHORT).show();

                //To GET THE selected Wandring As ansower from the spiner
                String str5=WondringAsSpiner.getSelectedItem().toString();
                Toast.makeText(WondringAsAdapter.getContext(),str5, Toast.LENGTH_SHORT).show();
            }
        });

    }



}