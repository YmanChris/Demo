package com.example.yman.demo;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by YYBJ on 2016/8/4.
 */
public class gridViewAdapter extends BaseAdapter{

    Context context;
    int resource;
    List<item> items;



    public gridViewAdapter(Context context, int resource, List<item> items) {
        this.context = context;
        this.resource = resource;
        this.items = items;
    }
    @Override
    public int getCount() {
        if(items == null)
            return 0;
        else
            return items.size();
    }

    @Override
    public item getItem(int position) {
        if(items == null)
            return null;
        else
            return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHodler hodler = null;
        if(convertView == null){
            hodler = new ViewHodler();
            convertView = LayoutInflater.from(context).inflate(resource,null);
            hodler.imageView = (ImageView) convertView.findViewById(R.id.i3_image);
            hodler.title = (TextView) convertView.findViewById(R.id.i3_title);
            hodler.detail = (TextView) convertView.findViewById(R.id.i3_detail);
            hodler.left = (TextView) convertView.findViewById(R.id.i3_left);
            hodler.right = (TextView) convertView.findViewById(R.id.i3_right);
            hodler.button = (Button) convertView.findViewById(R.id.i3_button);
            convertView.setTag(hodler);
        }
        else{
            hodler = (ViewHodler) convertView.getTag();
        }
        item i = items.get(position);
        String title = i.getTitle();
        String detail = i.getDetail();
        String left = i.getLeft();
        String right = i.getRight();
        int imageId = i.getImageId();
        hodler.imageView.setImageResource(imageId);
        hodler.title.setText(title);
        hodler.detail.setText(detail);
        hodler.left.setText(left);
        if(right == null){
            hodler.right.setVisibility(View.GONE);
            hodler.left.setTextColor(context.getResources().getColor(R.color.green));
        }
        else {
            hodler.right.setVisibility(View.VISIBLE);
            hodler.right.setText(right);
            hodler.left.getPaint().setFlags(Paint. STRIKE_THRU_TEXT_FLAG|Paint.ANTI_ALIAS_FLAG);
        }
        return convertView;
    }
    class ViewHodler{
        ImageView imageView;
        TextView title;
        TextView detail;
        TextView left;
        TextView right;
        Button button;
    }
}
