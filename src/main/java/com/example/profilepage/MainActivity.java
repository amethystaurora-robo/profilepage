package com.example.profilepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

//import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    private ImageButton editName;
    private ImageButton editEmail;
    private ImageButton editPhone;
    private ImageButton editAboutme;
    private Button update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName = (ImageButton) findViewById(R.id.namebtn);
        editEmail = (ImageButton) findViewById(R.id.emailbtn);
        editPhone = (ImageButton) findViewById(R.id.phonebtn);
        editAboutme = (ImageButton) findViewById(R.id.aboutmebtn);
        update = (Button) findViewById(R.id.update);

        editName.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                updateName();
            }
        });

        editEmail.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                updateEmail();
            }
        });

        editPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updatePhone();
            }
        });

        editAboutme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateAboutMe();
            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnHome();
            }
        });


    }

    public void updateName() {
        Intent intent = new Intent(this, EditName.class);
        startActivity(intent);
    }

    public void updateEmail() {
        Intent intent = new Intent(this, EditEmail.class);
        startActivity(intent);
    }

    public void updatePhone() {
        Intent intent = new Intent(this, EditPhone.class);
        startActivity(intent);
    }

    public void updateAboutMe() {
        Intent intent = new Intent(this, EditAboutMe.class);
        startActivity(intent);

    }

    public void returnHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}