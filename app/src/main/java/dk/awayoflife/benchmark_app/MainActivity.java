package dk.awayoflife.benchmark_app;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "dk.awayoflife.benchmark_app.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendText(View view) {
        Intent intent = new Intent(this, Backwards.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = new StringBuilder(editText.getText().toString()).reverse().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}