package helloandroid.ut3.com.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {
    private int cnt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this);
        tv.setText("Hello, Android");
        tv.setOnTouchListener(this);

        setContentView(tv);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (cnt != 10 && event.getAction() == MotionEvent.ACTION_DOWN)
            cnt++;
        else if (cnt == 10)
            System.exit(RESULT_OK);

        //float posx = event.getX();
        //float posy = event.getY();

        return true;
    }
}