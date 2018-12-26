package com.flippedclassroom.dao;

import com.flippedclassroom.entity.Teacher;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author DELL
 */
@Repository
public interface TeacherDao {
    /**
     * getAllTeacher
     * @return
     */
    List<Teacher> getAllTeacher();

    /**
     * getTeacherByInfo
     * @param info
     * @return
     */
    List<Teacher> getTeacherByInfo(String info);

    /**
     * createTeacher
     * @param userAccount
     * @param userName
     * @param userPassword
     * @param userEmail
     */
    void createTeacher(@Param("userAccount") String userAccount,@Param("userName") String userName,
                       @Param("userPassword") String userPassword, @Param("userEmail")String userEmail);

    /**
     * modifyTeacher
     * @param id
     * @param userAccount
     * @param userName
     * @param userEmail
     */
    void modifyTeacher(@Param("id")int id, @Param("userAccount")String userAccount,
                       @Param("userName")String userName, @Param("userEmail") String userEmail);

    /**
     * deleteTeacherByAccount
     * @param account
     */
    void deleteTeacherByAccount(String account);

    /**
     * resetTeacher
     * @param account
     */
    void resetTeacher(String account);

}
