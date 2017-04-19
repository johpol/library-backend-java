package com.librarybackend.rest.domain;

import java.util.List;

/**
 * Created by John on 3/11/2017.
 */
public class VolumeInfo {
    private String title;
    private List<String> authors;
    private String publisher;
    private List<String> categories;
    private List<IndustryIdentifiers> industryIdentifiers;


    public VolumeInfo() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public List<IndustryIdentifiers> getIndustryIdentifiers() {
        return industryIdentifiers;
    }

    public void setIndustryIdentifiers(List<IndustryIdentifiers> industryIdentifiers) {
        this.industryIdentifiers = industryIdentifiers;
    }

    @Override
    public String toString() {
        return "VolumeInfo{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                ", publisher='" + publisher + '\'' +
                ", categories=" + categories +
                ", industryIdentifiers=" + industryIdentifiers +
                '}';
    }
}
