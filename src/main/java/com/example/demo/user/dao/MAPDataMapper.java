package com.example.demo.user.dao;

import com.example.demo.user.model.MAPData;

public interface MAPDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_MAP
     *
     * @mbg.generated Tue Jun 05 11:10:00 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_MAP
     *
     * @mbg.generated Tue Jun 05 11:10:00 CST 2018
     */
    int insert(MAPData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_MAP
     *
     * @mbg.generated Tue Jun 05 11:10:00 CST 2018
     */
    int insertSelective(MAPData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_MAP
     *
     * @mbg.generated Tue Jun 05 11:10:00 CST 2018
     */
    MAPData selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_MAP
     *
     * @mbg.generated Tue Jun 05 11:10:00 CST 2018
     */
    int updateByPrimaryKeySelective(MAPData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_MAP
     *
     * @mbg.generated Tue Jun 05 11:10:00 CST 2018
     */
    int updateByPrimaryKey(MAPData record);
}