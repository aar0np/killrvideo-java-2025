package com.killrvideo.dto;

import java.util.List;

public class SearchVideosResponse {
    private List<VideoResponse> data;
    private Pagination pagination;
    
    public SearchVideosResponse(List<VideoResponse> data) {
        this.data = data;
        this.pagination = new Pagination(1, data.size(), data.size());
    }

    public SearchVideosResponse(List<VideoResponse> data, Pagination pagination) {
        this.data = data;
        this.pagination = pagination;
    }

    public SearchVideosResponse(List<VideoResponse> data, int pages, int pageSize, int totalItems) {
        this.data = data;
        this.pagination = new Pagination(pages, pageSize, totalItems);
    }

    public List<VideoResponse> getData() {
        return data;
    }

    public Pagination getPagination() {
        return pagination;
    }
}
