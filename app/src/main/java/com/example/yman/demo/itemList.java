package com.example.yman.demo;

import java.util.List;

/**
 * Created by YYBJ on 2016/8/4.
 */
public class itemList {
    int imageId;
    item i;
    List<item> items;
    String url;


    public itemList(int imageId , item i , List<item> items , String url){
        this.imageId = imageId;
        this.i = i;
        this.items = items;
        this.url = url;
    }

    public int getImageId() {
        return imageId;
    }

    public item getI() {
        return i;
    }

    public List<item> getItems() {
        return items;
    }

    public String getUrl() {
        return url;
    }
}
