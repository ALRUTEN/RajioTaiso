package com.example.apprenti.rajiotaiso.UserModel;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by apprenti on 16/10/17.
 */

public class UserModel implements Parcelable {

    private String userName;


    public UserModel(String userName) {
        this.userName = userName;
    }

    protected UserModel(Parcel in) {
        userName = in.readString();
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

    public String getUserName() {
        return userName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(userName);
    }


}
