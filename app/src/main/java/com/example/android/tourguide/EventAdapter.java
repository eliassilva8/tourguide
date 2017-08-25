package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Elias on 17/05/2017.
 */

public class EventAdapter extends ArrayAdapter<Event> {

    private int mColor;

    public EventAdapter(@NonNull Context context, int color, @NonNull ArrayList<Event> events) {
        super(context, 0, events);
        this.mColor = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final Event currentEvent = getItem(position);

        View eventView = listItemView.findViewById(R.id.event_info_view);
        int color = ContextCompat.getColor(getContext(), mColor);
        eventView.setBackgroundColor(color);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.event_name_view);
        nameTextView.setText(currentEvent.getmEventName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.event_address_view);
        addressTextView.setText(currentEvent.getmEventAdress());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.event_image_view);
        imageView.setImageResource(currentEvent.getmEventPhotoId());

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.event_date_view);

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.event_number_view);

        if (currentEvent.getmEventDate() != null) {
            numberTextView.setVisibility(View.GONE);
            dateTextView.setText(currentEvent.getmEventDate());
        } else if (currentEvent.getmEventPhoneNumber() != null) {
            dateTextView.setVisibility(View.GONE);
            numberTextView.setText(currentEvent.getmEventPhoneNumber());
        }

        Log.v("Class name: ", currentEvent.getClass().getName());
        return listItemView;
    }
}
