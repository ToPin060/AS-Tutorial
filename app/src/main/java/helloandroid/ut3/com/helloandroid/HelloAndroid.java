package helloandroid.ut3.com.helloandroid;

import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;



public class HelloAndroid extends AppCompatActivity {
    // on défini un handler qui représentera notre timer :
    private Handler mHandler;

    // un Runnable qui sera appelé par le timer
    private Runnable mUpdateTimeTask = new Runnable() {
        public void run() {
            System.out.println("mUpdateTimeTask.run called");
            System.exit(RESULT_OK);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        System.out.println("onCreate handle");
        super.onCreate(savedInstanceState);

        mHandler = new Handler();
        mHandler.postDelayed(mUpdateTimeTask, 5000);
    }
}
