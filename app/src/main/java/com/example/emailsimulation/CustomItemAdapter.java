package com.example.emailsimulation;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class CustomItemAdapter extends BaseAdapter {

    Context context;
    List<CustomItemEmail> itemEmailList;

    public CustomItemAdapter(Context context, List<CustomItemEmail> itemEmailList) {
        this.context = context;
        this.itemEmailList = itemEmailList;
    }

    @Override
    public int getCount() {
        return itemEmailList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemEmailList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh_Temp;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.email_item, parent, false);
            vh_Temp = new ViewHolder();
            vh_Temp.tv_Avatar = convertView.findViewById(R.id.tv_Avatar);
            vh_Temp.tv_Subject = convertView.findViewById(R.id.tv_Subject);
            vh_Temp.tv_Details = convertView.findViewById(R.id.tv_Details);
            vh_Temp.tv_Time = convertView.findViewById(R.id.tv_Time);
            vh_Temp.cb_Star = convertView.findViewById(R.id.cb_Star);
            convertView.setTag(vh_Temp);
        }
        else
            vh_Temp = (ViewHolder) convertView.getTag();

        CustomItemEmail item = itemEmailList.get(position);
        vh_Temp.cb_Star.setChecked(item.isChecked());
        vh_Temp.tv_Details.setText(item.getDetails());
        vh_Temp.tv_Subject.setText(item.getSubject());
        vh_Temp.tv_Avatar.setText(item.getAvatar());
        vh_Temp.tv_Time.setText(item.getTime());


        return convertView;
    }

    private class ViewHolder {
        TextView tv_Avatar, tv_Subject, tv_Details, tv_Time;
        CheckBox cb_Star;
    }
}
