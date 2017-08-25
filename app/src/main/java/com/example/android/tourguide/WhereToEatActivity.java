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

public class WhereToEatActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_list);

        final ArrayList<Event> events = new ArrayList<Event>();
        events.add(new Event("Boguinhas", R.drawable.ic_restaurant_black_48dp, "Rua Gil Vicente, Lote 124", "275751794", null));
        events.add(new Event("Rock Pizza", R.drawable.ic_restaurant_black_48dp, "Rua de Haapsalu Lote 22", "275771480", null));
        events.add(new Event("As Tílias", R.drawable.ic_restaurant_black_48dp, "Rua dos Restauradores Loja B", "275772269", null));

        EventAdapter adapter = new EventAdapter(this, R.color.green700, events);
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
