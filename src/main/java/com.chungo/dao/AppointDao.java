package com.chungo.dao;

import com.chungo.entity.Appointment;
import org.apache.ibatis.annotations.Param;

public interface AppointDao {

    int insertAppointment(@Param("BookId") int bookId, @Param("StudentId") int studentId);

    Appointment queryByKeyWithBook(@Param("BookId") long bookId, @Param("StudentId") long studentId);
}
