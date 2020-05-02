package com.thesarthakarora.patientdatachecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

public class DisplayActivity extends AppCompatActivity {
    String intentData;
    TextView name, email ,hospitalName, admissionDate, releaseDate,symptoms;
    Button ipfsButton;
    Button verifyAddresButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent intent = getIntent();
        intentData = intent.getStringExtra("intentData");
        Gson gson = new Gson();
        final UserDetails user = gson.fromJson(intentData, UserDetails.class);
        name =  findViewById(R.id.name);
        hospitalName = findViewById(R.id.hospital_name);
        admissionDate = findViewById(R.id.admission_date);
        releaseDate = findViewById(R.id.release_date);
        symptoms = findViewById(R.id.symptoms);
        email =  findViewById(R.id.email);
        ipfsButton = findViewById(R.id.ipfsButton);
        verifyAddresButton = findViewById(R.id.verfiyAddress);

        hospitalName.setText(user.getHospitalName());
        admissionDate.setText(user.getAdmissionDate());
        releaseDate.setText(user.getReleaseDate());
        symptoms.setText(user.getSymptoms());
        email.setText(user.getEmail());


        ipfsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse(user.getIpfsURL()));
                startActivity(Getintent);

            }
        });
        verifyAddresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse( "https://thewellpass.herokuapp.com/verify?address=" + user.getAddress()));
                startActivity(Getintent);

            }
        });


    }
}
