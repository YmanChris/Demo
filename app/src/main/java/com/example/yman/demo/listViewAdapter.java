package com.example.yman.demo;

import android.content.Context;
import android.graphics.Paint;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by YYBJ on 2016/8/4.
 */
public class listViewAdapter extends BaseAdapter{

    Context context;
    int resource;
    List<itemList> itemslist;
    gridViewAdapter gridAdapter;
    public listViewAdapter(Context context, int resource, List<itemList> itemslist){

        this.context = context;
        this.resource = resource;
        this.itemslist = itemslist;
    }
    @Override
    public int getCount() {
        if(itemslist == null)
            return 0;
        else
            return itemslist.size();
    }

    @Override
    public itemList getItem(int position) {
        if(itemslist == null)
            return null;
        else
            return itemslist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if(convertView == null){
            holder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(resource,null);
            holder.i1 = (ImageView) convertView.findViewById(R.id.i1_image);
            holder.i2 = (ImageView) convertView.findViewById(R.id.i2_image);
            holder.i4 = (ImageView) convertView.findViewById(R.id.more);
            holder.i2_title = (TextView) convertView.findViewById(R.id.i2_title);
            holder.i2_detail = (TextView) convertView.findViewById(R.id.i2_detail);
            holder.i2_left = (TextView) convertView.findViewById(R.id.i2_left);
            holder.i2_right = (TextView) convertView.findViewById(R.id.i2_right);
            holder.i2_bt = (Button) convertView.findViewById(R.id.i2_button);
            holder.gridView = (MyGridView) convertView.findViewById(R.id.gridView);
            holder.i2_layout = (LinearLayout) convertView.findViewById(R.id.i2_layout);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }
        itemList i = itemslist.get(position);
        holder.i1.setImageResource(i.getImageId());
        if(i.getI() == null){
            holder.i2_layout.setVisibility(View.GONE);
        }
        else {
            item it = i.getI();
            holder.i2_layout.setVisibility(View.VISIBLE);
            holder.i2.setImageResource(it.getImageId());
            holder.i2_title.setText(it.getTitle());
            holder.i2_detail.setText(it.getDetail());
            holder.i2_left.setText(it.getLeft());
            holder.i2_right.setText(it.getRight());
            holder.i2_left.getPaint().setFlags(Paint. STRIKE_THRU_TEXT_FLAG|Paint.ANTI_ALIAS_FLAG);
        }
        if(i.getUrl() == null){
            holder.i4.setVisibility(View.GONE);
        }
        else
            holder.i4.setVisibility(View.VISIBLE);
        gridAdapter = new gridViewAdapter(context,R.layout.item3,i.getItems());
        holder.gridView.setHorizontalSpacing(40);
        holder.gridView.setVerticalSpacing(40);
        holder.gridView.setAdapter(gridAdapter);
        gridAdapter.notifyDataSetChanged();

        return convertView;
    }
    class ViewHolder{
        ImageView i1;
        ImageView i2;
        ImageView i4;
        TextView i2_title;
        TextView i2_detail;
        TextView i2_left;
        TextView i2_right;
        Button i2_bt;
        GridView gridView;
        LinearLayout i2_layout;
    }
}
