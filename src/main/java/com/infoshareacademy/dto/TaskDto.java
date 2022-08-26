package com.infoshareacademy.dto;

import com.infoshareacademy.enums.Category;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Future;
import javax.validation.constraints.Size;
import java.util.Date;

public class TaskDto {
    private Long id;
    @Size(min = 10)
    private String description;
    private Category category;
    @Range(min = 1, max = 5)
    private Integer priority;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Future
    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
