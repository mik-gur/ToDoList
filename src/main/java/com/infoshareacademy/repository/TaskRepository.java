package com.infoshareacademy.repository;

import com.infoshareacademy.entity.Task;
import org.springframework.stereotype.Repository;

import java.util.concurrent.atomic.AtomicLong;

@Repository
public class TaskRepository extends FakeRepository<Long, Task>{
    private final AtomicLong nextId = new AtomicLong(1L);

    @Override
    Long nextId() {
        return nextId.getAndIncrement();
    }
}
