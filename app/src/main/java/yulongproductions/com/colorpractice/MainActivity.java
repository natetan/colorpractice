package yulongproductions.com.colorpractice;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;


public class MainActivity extends Activity {
    private EditText mEditText;
    private Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = (EditText)findViewById(R.id.colorEditText);
        mStartButton = (Button)findViewById(R.id.startButton);

        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String color = mEditText.getText().toString().toLowerCase();
                interact(color);
            }
        });

    }

    private void interact(String color) {
        Intent i = new Intent(this, ColorActivity.class);
        i.putExtra(getString(R.string.color), color);
        startActivity(i);
    }
}
