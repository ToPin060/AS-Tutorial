package helloandroid.ut3.com.helloandroid;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class HelloAndroid extends AppCompatActivity {
    private Handler mHandler;
    private TextView tv;

    // un Runnable qui sera appelé par le timer
    private Runnable mUpdateTimeTask = new Runnable() {
        public void run() {
            updateContent("MODEL: " + Build.MODEL + "\nSDK: " + Build.VERSION.SDK_INT);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tv = new TextView(this);
        mHandler = new Handler();
        mHandler.postDelayed(mUpdateTimeTask, 1000);
    }

    protected void updateContent(String text) {
        tv.setText(text);
        setContentView(tv);
    }
}
