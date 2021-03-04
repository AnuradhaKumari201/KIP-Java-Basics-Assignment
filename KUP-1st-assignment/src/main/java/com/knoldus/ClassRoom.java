package com.knoldus;

import java.util.List;
import java.util.Optional;

public class ClassRoom {

    private String roomId;
    private Optional<List<Student>> studentList;

    public ClassRoom(String roomId, Optional<List<Student>> studentList) {
        this.roomId = roomId;
        this.studentList = studentList;
    }

    public ClassRoom() {
    }

    public String getRoomId() {
        return roomId;
    }

    @Override
    public String toString() {
        return "ClassRoom [roomID=" + roomId + ", studentList=" + studentList + "]";
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public Optional<List<Student>> getStudentList() {
        return studentList;
    }

    public void setStudentList(Optional<List<Student>> studentList) {
        this.studentList = studentList;
    }


}