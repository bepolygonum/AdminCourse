package com.flippedclassroom.dao;

import com.flippedclassroom.entity.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author DELL
 */
@Repository
public interface AdminDao {

    /**
     * getAdminByAccount
     * @param account
     * @param password
     * @return
     */
    Admin getAdminByAccount(@Param("0") String account,@Param("1") String password);
}
