package com.example.json2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView output = (TextView) findViewById(R.id.textView1);
        String strJson = "{\"Employee\":[{\"id\":\"101\",\"name\":\"Sonoo Jaiswal\",\"salary\":\"50000\"},{\"id\":\"102\",\"name\":\"Vimal Jaiswal\",\"Salary\":\"60000\"}] }";
        String data = "";
        try {
            JSONObject jsonRootObject = new JSONObject(strJson);
            JSONArray jsonArray= jsonRootObject.optJSONArray("Employee");
            for(int i=0;i < jsonArray.length();i++)
            {
                JSONObject jsonObject= jsonArray.getJSONObject(i);
                int id = Integer.parseInt(jsonObject.optString("id").toString());
                String name = jsonObject.optString("name").toString();
                float salary = Float.parseFloat(jsonObject.optString("salary").toString());
                data += "Node"+i+":\n id="+id+"\n Name = "+name+"\n Salary="+salary+"\n";

            }
            output.setText(data);

        }
        catch(JSONException e)
        {
            e.printStackTrace();
        }
    }
}