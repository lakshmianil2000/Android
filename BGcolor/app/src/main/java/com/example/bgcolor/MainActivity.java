package com.example.bgcolor;

import android.app.Activity;
        import android.graphics.Color;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;
        import java.util.Random;
public class MainActivity extends Activity {

    private int[] mColorChoices =
            { Color.BLACK, Color.BLUE, Color.CYAN,
                    Color.DKGRAY, Color.GRAY, Color.GREEN,
                    Color.LTGRAY, Color.MAGENTA, Color.RED,
                    Color.WHITE, Color.YELLOW };
    private TextView mTextRegion;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextRegion = (TextView)findViewById(R.id.textView);
    }
    public void randomizeColor(View button) {
        Random generator = new Random();
        int index = generator.nextInt(mColorChoices.length);
        mTextRegion.setBackgroundColor(mColorChoices[index]);
    }
}