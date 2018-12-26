package com.flippedclassroom.dao;

import com.flippedclassroom.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author DELL
 */
@Repository
public interface StudentDao {
    /**
     * getAllStudent
     * @return
     */
    List<Student> getAllStudent();

    /**
     * getStudentByInfo
     * @param info
     * @return
     */
    List<Student> getStudentByInfo(String info);

    /**
     * deleteStudent
     * @param account
     */
    void deleteStudent(String account);

    /**
     * resetStudent
     * @param account
     */
    void resetStudent(String account);

    /**
     * modifyStudent
     * @param id
     * @param userAccount
     * @param userName
     * @param userEmail
     */
    void modifyStudent(@Param("0") int id, @Param("1")String userAccount,
                       @Param("2")String userName, @Param("3")String userEmail);
}
