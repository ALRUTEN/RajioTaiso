package com.example.apprenti.rajiotaiso;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by apprenti on 16/10/17.
 */

public class UserModel implements Parcelable {

    private String userName;
    private String scool;
    private String language;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getScool() {
        return scool;
    }

    public String getLanguage() {
        return language;
    }


    public UserModel(String userName, String scool, String language) {
        this.userName = userName;
        this.scool = scool;
        this.language = language;

    }

    public UserModel(Parcel in) {
        this.userName = in.readString();
        this.scool = in.readString();
        this.language = in.readString();


    }

    public static final Creator<UserModel> CREATOR = new Creator<UserModel>() {
        @Override
        public UserModel createFromParcel(Parcel in) {
            return new UserModel(in);
        }

        @Override
        public UserModel[] newArray(int size) {
            return new UserModel[size];
        }
    };


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(userName);
        parcel.writeString(scool);
        parcel.writeString(language);

    }


}
