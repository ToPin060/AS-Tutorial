package helloandroid.ut3.com.helloandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // on crée un nouveau TextView, qui est un widget permettant
        // d'afficher du texte
        TextView tv = new TextView(this);

        // configurer le texte à faire afficher par notre widget
        tv.setText("Hello, Android");

        setContentView(tv);
    }
}