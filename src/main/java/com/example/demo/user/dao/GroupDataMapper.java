package com.example.demo.user.dao;

import com.example.demo.user.model.GroupData;

public interface GroupDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table G_Group
     *
     * @mbg.generated Tue Jun 05 11:10:00 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table G_Group
     *
     * @mbg.generated Tue Jun 05 11:10:00 CST 2018
     */
    int insert(GroupData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table G_Group
     *
     * @mbg.generated Tue Jun 05 11:10:00 CST 2018
     */
    int insertSelective(GroupData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table G_Group
     *
     * @mbg.generated Tue Jun 05 11:10:00 CST 2018
     */
    GroupData selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table G_Group
     *
     * @mbg.generated Tue Jun 05 11:10:00 CST 2018
     */
    int updateByPrimaryKeySelective(GroupData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table G_Group
     *
     * @mbg.generated Tue Jun 05 11:10:00 CST 2018
     */
    int updateByPrimaryKey(GroupData record);
}