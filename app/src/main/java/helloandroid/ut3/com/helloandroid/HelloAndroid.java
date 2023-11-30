package helloandroid.ut3.com.helloandroid;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class HelloAndroid extends AppCompatActivity {
    private Handler mHandler;
    private TextView tv;
    private int cnt = 0;

    // un Runnable qui sera appelé par le timer
    private Runnable mUpdateTimeTask = new Runnable() {
        public void run() {
            cnt++;

            if (cnt < 5) {
                updateContent("" + cnt);
            }
            else if (cnt == 5) {
                updateContent("Hello, Android");
            }
            else {
                System.exit(RESULT_OK);
            }
            mHandler.postDelayed(mUpdateTimeTask, 1000);
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
