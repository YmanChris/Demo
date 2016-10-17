package com.example.yman.demo;

/**
 * Created by YYBJ on 2016/8/4.
 */
public class item {
    int imageId;
    String url;
    String title;
    String detail;
    String left;
    String right;
    public item(int imageId,String url,String title,String detail,String left,String right){
        this.url = url;
        this.title = title;
        this.detail = detail;
        this.left = left;
        this.right = right;
        this.imageId=imageId;
    }

    public String getUrl() {
        return url;
    }

    public String getDetail() {
        return detail;
    }

    public String getLeft() {
        return left;
    }

    public String getRight() {
        return right;
    }

    public String getTitle() {
        return title;
    }

    public int getImageId() {
        return imageId;
    }
}
