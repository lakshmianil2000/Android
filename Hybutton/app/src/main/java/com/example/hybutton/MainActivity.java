package com.example.hybutton;

import android.app.Activity;
        import android.graphics.Color;
        import android.os.Bundle;
        import android.view.View;
import android.widget.Button;
import android.widget.TextView;
        import android.view.View.OnClickListener;
        import java.util.Random;
public class MainActivity extends Activity {
    private View mColorRegion;
    private int[] mColorChoices =
            { Color.BLACK, Color.BLUE, Color.CYAN,
                    Color.DKGRAY, Color.GRAY, Color.GREEN,
                    Color.LTGRAY, Color.MAGENTA, Color.RED,
                    Color.WHITE, Color.YELLOW };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mColorRegion = findViewById(R.id.textView);
        Button colorButton =
                (Button)findViewById(R.id.button);
        colorButton.setOnClickListener(new ColorRandomizer());
    }
    private void setRegionColor(int color) {
        mColorRegion.setBackgroundColor(color);
    }
    private class ColorRandomizer implements OnClickListener {


        public void onClick(View clickedButton) {
            Random generator = new Random();
            int index = generator.nextInt(mColorChoices.length);
            setRegionColor(mColorChoices[index]);
        }
    }
}