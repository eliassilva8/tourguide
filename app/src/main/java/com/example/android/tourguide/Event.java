package com.example.android.tourguide;

import android.telephony.PhoneNumberUtils;

/**
 * Created by Elias on 17/05/2017.
 */

public class Event {
    private String mEventName;
    private int mEventPhotoId;
    private String mEventAdress;
    private String mEventDate;
    private String mEventPhoneNumber;

    public Event(String mEventName, int mEventPhotoId, String mEventAdress, String mEventPhoneNumber, String mEventDate) {

        this.mEventName = mEventName;
        this.mEventPhotoId = mEventPhotoId;
        this.mEventAdress = mEventAdress;
        this.mEventPhoneNumber = mEventPhoneNumber;
        this.mEventDate = mEventDate;
    }

    public Event(String mEventName, int mEventPhotoId, String mEventAdress) {

        this.mEventName = mEventName;
        this.mEventPhotoId = mEventPhotoId;
        this.mEventAdress = mEventAdress;
    }

    public String getmEventName() {
        return mEventName;
    }

    public int getmEventPhotoId() {
        return mEventPhotoId;
    }

    public String getmEventAdress() {
        return mEventAdress;
    }

    public String getmEventDate() {
        return mEventDate;
    }

    public String getmEventPhoneNumber() {
        return PhoneNumberUtils.formatNumber(mEventPhoneNumber);
    }
}
