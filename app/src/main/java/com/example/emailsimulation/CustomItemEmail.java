package com.example.emailsimulation;

import android.widget.CheckBox;
import android.widget.TextView;

public class CustomItemEmail {
    String Avatar, Subject,  Details, Time;
    boolean isChecked;

    public CustomItemEmail(String avatar, String subject, String details, String time, boolean isChecked) {
        Avatar = avatar;
        Subject = subject;
        Details = details;
        Time = time;
        this.isChecked = isChecked;
    }

    public String getAvatar() {
        return Avatar;
    }

    public void setAvatar(String avatar) {
        Avatar = avatar;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
