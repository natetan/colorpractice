package yulongproductions.com.colorpractice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class ColorActivity extends Activity {
    private TextView mTextView;
    private ColorWheel mColorWheel;

    public static final String TAG = ColorActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        Intent i = getIntent();
        String color = i.getStringExtra(getString(R.string.color));
        if (color == null) {
            color = "green";
        }
        Log.d(TAG, color);
        final RelativeLayout  layout = (RelativeLayout)findViewById(R.id.colorRelativeLayout);
        mTextView = (TextView)findViewById(R.id.colorTextView);
        mTextView.setText(color + " is a nice color!");
        layout.setBackgroundColor(mColorWheel.getColor());
    }
}
