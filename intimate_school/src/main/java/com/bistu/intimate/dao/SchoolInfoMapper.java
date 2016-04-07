package com.bistu.intimate.dao;

import com.bistu.intimate.dto.SchoolInfo;
import com.bistu.intimate.dto.SchoolInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchoolInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table school_info
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
    int countByExample(SchoolInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table school_info
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
    int deleteByExample(SchoolInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table school_info
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
    int deleteByPrimaryKey(Integer schoolId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table school_info
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
    int insert(SchoolInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table school_info
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
    int insertSelective(SchoolInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table school_info
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
    List<SchoolInfo> selectByExample(SchoolInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table school_info
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
    SchoolInfo selectByPrimaryKey(Integer schoolId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table school_info
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
    int updateByExampleSelective(@Param("record") SchoolInfo record, @Param("example") SchoolInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table school_info
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
    int updateByExample(@Param("record") SchoolInfo record, @Param("example") SchoolInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table school_info
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
    int updateByPrimaryKeySelective(SchoolInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table school_info
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
    int updateByPrimaryKey(SchoolInfo record);
}