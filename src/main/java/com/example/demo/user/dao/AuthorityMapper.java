package com.example.demo.user.dao;

import com.example.demo.user.model.Authority;

public interface AuthorityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_Service
     *
     * @mbg.generated Tue Jun 05 11:10:00 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_Service
     *
     * @mbg.generated Tue Jun 05 11:10:00 CST 2018
     */
    int insert(Authority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_Service
     *
     * @mbg.generated Tue Jun 05 11:10:00 CST 2018
     */
    int insertSelective(Authority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_Service
     *
     * @mbg.generated Tue Jun 05 11:10:00 CST 2018
     */
    Authority selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_Service
     *
     * @mbg.generated Tue Jun 05 11:10:00 CST 2018
     */
    int updateByPrimaryKeySelective(Authority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_Service
     *
     * @mbg.generated Tue Jun 05 11:10:00 CST 2018
     */
    int updateByPrimaryKey(Authority record);
}