package helloandroid.ut3.com.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchToCaptorView(View view)
    {
        Intent switchToCaptorViewIntent = new Intent(this, CaptorActivity.class);
        startActivity(switchToCaptorViewIntent);
    }
}
