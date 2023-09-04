package org.example.entities;

import java.util.Objects;

public class Class {
    private int id;
    private int day;
    private int month;
    private int year;

    private int time;

    private int subjectId;
    private int teacherId;

    public Class(int id, int day, int month, int year, int time, int subjectId, int teacherId) {
        this.id = id;
        this.day = day;
        this.month = month;
        this.year = year;
        this.time = time;
        this.subjectId = subjectId;
        this.teacherId = teacherId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Class)) return false;
        Class aClass = (Class) o;
        return id == aClass.id && day == aClass.day && month == aClass.month && year == aClass.year && time == aClass.time && subjectId == aClass.subjectId && teacherId == aClass.teacherId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, day, month, year, time, subjectId, teacherId);
    }
}
