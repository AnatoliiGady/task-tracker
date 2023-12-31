package org.example.dto;

import org.example.status.Status;

public class TaskDto {
    private Integer id;
    private String title;
    private String description;
    private Status status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TaskDto{"
                + "id=" + id
                + ", title='" + title + '\''
                + ", description='" + description + '\''
                + ", status=" + status
                + '}';
    }
}
