package com.example.android.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Elias on 17/05/2017.
 */

public class WhereToStayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_list);

        final ArrayList<Event> events = new ArrayList<Event>();
        events.add(new Event("Alambique de Ouro", R.drawable.ic_local_hotel_black_48dp, "Sitio da Gramenesa", "275774145", null));
        events.add(new Event("Hotel Samasa", R.drawable.ic_local_hotel_black_48dp, "Rua Vasco Da Gama", "275779930", null));
        events.add(new Event("Palace Hotel", R.drawable.ic_local_hotel_black_48dp, "Quinta Nova", "275779340", null));

        EventAdapter adapter = new EventAdapter(this, R.color.green900, events);
        ListView listView = (ListView) findViewById(R.id.event_listview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Event event = events.get(position);

                Uri uri = Uri.parse("http://www.google.com/#q=" + event.getmEventName() + " " + getResources().getString(R.string.city_name));
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}
