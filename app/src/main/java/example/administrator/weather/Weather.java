package example.administrator.weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Weather extends AppCompatActivity {
    private  String[] data={"北京", "福建","浙江","西藏","广东","江西","天津","辽宁","山西","河北","湖南","山东","江苏","湖北"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(
                Weather.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.activity_weather);
        listView.setAdapter(adapter);

    }
}
