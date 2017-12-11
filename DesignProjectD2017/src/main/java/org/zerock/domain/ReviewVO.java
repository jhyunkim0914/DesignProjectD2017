package org.zerock.domain;

import java.sql.Date;

public class ReviewVO {

    private Integer reviewidx;

    private Integer orderidx;

    private Date time;

    private String content;

    private Integer rating;

    public Integer getReviewidx() {
        return reviewidx;
    }

    public void setReviewidx(Integer reviewidx) {
        this.reviewidx = reviewidx;
    }

    public Integer getOrderidx() {
        return orderidx;
    }

    public void setOrderidx(Integer orderidx) {
        this.orderidx = orderidx;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

}
