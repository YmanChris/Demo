package com.example.yman.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    listViewAdapter adapter;
    itemList itemlist;
    List<item> items = new ArrayList<>();
    List<itemList> itemlists = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initData();
    }
    public void initViews(){
        listView = (ListView) findViewById(R.id.listView);
    }
    public void initData(){
        item item1 = new item(R.drawable.l1_i2,"url","2017考研全程保姆班 (暑假特训版)","725小时直播课+名师答疑， 赠送700元复习资料","￥999","￥878");
        item item2 = new item(R.drawable.l1_i2,"url","四级全程通关班","基础+强化+冲刺全程辅导","￥919","￥199");
        item item3 = new item(R.drawable.l1_i2,"url","六级全程通关班","考神名师+定制真题+互动答疑","￥919","￥199");
        item item4 = new item(R.drawable.l1_i2,"url","title","detail","left","right");
        item item5 = new item(R.drawable.l1_i2,"url","title","detail","left","right");
        item item6 = new item(R.drawable.l1_i2,"url","title","detail","left","right");
        item item7 = new item(R.drawable.l1_i2,"url","title","detail","left","right");
        item item8 = new item(R.drawable.l1_i2,"url","title","detail","left","right");
        item item9 = new item(R.drawable.l1_i2,"url","title","detail","left","right");
        item item10 = new item(R.drawable.l1_i2,"url","title","detail","left","right");
        item item11 = new item(R.drawable.l1_i2,"url","title","detail","left","right");
        item item12 = new item(R.drawable.l1_i2,"url","title","detail","left","right");
        item item13 = new item(R.drawable.l1_i2,"url","title","detail","left","right");
        item item14 = new item(R.drawable.l1_i2,"url","title","detail","left","right");
        item item15 = new item(R.drawable.l1_i2,"url","title","detail","left","right");
        item item16 = new item(R.drawable.l1_i2,"url","title","detail","left","right");
        item item17 = new item(R.drawable.l1_i2,"url","title","detail","left","right");
        item item18 = new item(R.drawable.l1_i2,"url","1","detail","left","right");
        item item19 = new item(R.drawable.l1_i2,"url","2","detail","left","right");
        item item20 = new item(R.drawable.l1_i2,"url","3","detail","left","right");
        item item21 = new item(R.drawable.l1_i2,"url","4","detail","left","right");
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        items.add(item7);
        items.add(item8);
        items.add(item9);
        items.add(item10);
        items.add(item11);
        items.add(item12);
        items.add(item13);
        items.add(item14);
        items.add(item15);
        items.add(item16);
        items.add(item17);
        items.add(item18);
        items.add(item19);
        items.add(item20);
        items.add(item21);
        int[] icons ={R.drawable.l1_icon,R.drawable.l2_icon,R.drawable.l3_icon,R.drawable.l4_icon,R.drawable.l5_icon};
        for(int i = 0 ; i < 5 ; i++){
            List<item> list=new ArrayList<>();
            list.add(items.remove(0));
            list.add(items.remove(0));
            list.add(items.remove(0));
            list.add(items.remove(0));
            itemlist = new itemList(icons[i],item1,list,"www.baidu.com");
            itemlists.add(itemlist);
            item1 = null;
        }
        adapter = new listViewAdapter(this,R.layout.item1,itemlists);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
