package com.github.barteksc.sample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Setter
public class ReadModel {
    @SerializedName("read_book_id")
    @Expose
    public String readBookId;
    @SerializedName("read_started_time")
    @Expose
    public String readStartedTime;
    @SerializedName("read_ended_time")
    @Expose
    public String readEndedTime;
    @SerializedName("read_is_deleted")
    @Expose
    public String readIsDeleted;
    @SerializedName("book_id")
    @Expose
    private String bookId;
    @SerializedName("book_author")
    @Expose
    private String bookAuthor;
    @SerializedName("book_category")
    @Expose
    private String bookCategory;
    @SerializedName("book_description")
    @Expose
    private String bookDescription;
    @SerializedName("book_download")
    @Expose
    private String bookDownload;
    @SerializedName("book_file")
    @Expose
    private String bookFile;
    @SerializedName("book_image")
    @Expose
    private String bookImage;
    @SerializedName("book_page")
    @Expose
    private String bookPage;
    @SerializedName("book_public_date")
    @Expose
    private String bookPublicDate;
    @SerializedName("book_rated_time")
    @Expose
    private String bookRatedTime;
    @SerializedName("book_read_time")
    @Expose
    private String bookReadTime;
    @SerializedName("book_rating")
    @Expose
    private String bookRating;
    @SerializedName("book_title")
    @Expose
    private String bookTitle;
    @SerializedName("book_type")
    @Expose
    private String bookType;
    @SerializedName("book_is_deleted")
    @Expose
    private String bookIsDeleted;
    @SerializedName("book_created_time")
    @Expose
    private String bookCreatedTime;
}

