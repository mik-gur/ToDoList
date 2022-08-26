package com.infoshareacademy.mappers;

import com.infoshareacademy.entity.Task;
import com.infoshareacademy.dto.TaskDto;
import org.springframework.stereotype.Component;

@Component
public class TaskMapper {

    public TaskDto toDto(Task task) {
        TaskDto dto = new TaskDto();
        dto.setId(task.getId());
        dto.setDescription(task.getDescription());
        dto.setCategory(task.getCategory());
        dto.setPriority(task.getPriority());
        dto.setDate(task.getDate());
        return dto;
    }

    public Task toEntity(TaskDto task) {
        Task entity = new Task();
        entity.setId(task.getId());
        entity.setDescription(task.getDescription());
        entity.setCategory(task.getCategory());
        entity.setPriority(task.getPriority());
        entity.setDate(task.getDate());
        return entity;
    }
}
