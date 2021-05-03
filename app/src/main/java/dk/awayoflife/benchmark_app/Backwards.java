package dk.awayoflife.benchmark_app;

import android.content.Intent;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Backwards extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backwards);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        
        Data.strings.add(message);
        Log.d("messageText", "Message recieved and added, now showing the list of words.");

        for (String msg : Data.strings) {
            Log.d("messageText", msg);
        }

    }

}