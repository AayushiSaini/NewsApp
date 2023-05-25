package com.example.newsapplication;

import com.example.newsapplication.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsapiResponse> {
    void onFetchData(List<NewsHeadlines> list,String message);
    void onError(String message);
}
