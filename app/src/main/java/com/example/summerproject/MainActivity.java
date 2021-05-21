package com.example.summerproject;

//package com.example.summerproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.net.Uri;

import com.example.summerproject.R;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBCSlink();
            }
        });
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVMDTutorial();
            }
        });

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGPT3Examples();
            }
        });

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPclubML();
            }
        });

        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPClubCP();
            }
        });
    }

    public void openBCSlink(){
        goToUrl ( "https://discord.com/channels/833663718793412618/844552320070189087");
    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void openVMDTutorial(){
        goToUrl ( "http://www.ks.uiuc.edu/Training/Tutorials/vmd/tutorial-html/index.html");
    }
    public void openGPT3Examples(){
        goToUrl ( "https://beta.openai.com/dashboard?supportSignUp=true&supportForgotPassword=true&email=pushpans%40iitk.ac.in&message=Your%20email%20was%20verified.%20You%20can%20continue%20using%20the%20application.&success=true&code=success#");
    }
    public void openPclubML(){
        goToUrl ( "https://discord.com/channels/836686430062772275/844483237660721172");
    }
    public void openPClubCP(){
        goToUrl ( "https://discord.com/channels/836686430062772275/844483298268676107");
    }

}
