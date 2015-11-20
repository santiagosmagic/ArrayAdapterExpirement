package com.example.timconverse.arrayadapterexpirement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Weather weather_data[] = new Weather[]{
                new Weather(R.drawable.cloud, "Cloudy"),
                new Weather(R.drawable.rain, "Rain"),
                new Weather(R.drawable.sun, "Sunny"),
                new Weather(R.drawable.cloud, "Cloudy"),
                new Weather(R.drawable.rain, "Rain"),
                new Weather(R.drawable.sun, "Sunny"),
                new Weather(R.drawable.cloud, "Cloudy"),
                new Weather(R.drawable.rain, "Rain"),
                new Weather(R.drawable.sun, "Sunny"),
                new Weather(R.drawable.cloud, "Cloudy"),
                new Weather(R.drawable.rain, "Rain"),
                new Weather(R.drawable.sun, "Sunny"),
                new Weather(R.drawable.cloud, "Cloudy"),
                new Weather(R.drawable.rain, "Rain"),
                new Weather(R.drawable.sun, "Sunny"),
                new Weather(R.drawable.cloud, "Cloudy"),
                new Weather(R.drawable.rain, "Rain"),
                new Weather(R.drawable.sun, "Sunny"),
                new Weather(R.drawable.cloud, "Cloudy"),
                new Weather(R.drawable.rain, "Rain"),
                new Weather(R.drawable.sun, "Sunny")
        };

        WeatherAdapter adapter = new WeatherAdapter(this,
                R.layout.listview_item_row,
                weather_data);

        listView1 = (ListView)findViewById(R.id.listView);

        View header = (View) getLayoutInflater().inflate(R.layout.listview_header_row, null);
        listView1.addHeaderView(header);

        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                //String item = ((TextView)view).getText().toString();
                String item = weather_data[position];
                Toast.makeText(getBaseContext(), item, Toast.LENGTH_LONG).show();
                }
            }
        );
    }

}
