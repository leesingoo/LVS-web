package com.unnet.triangle.lvs.master.mapper;

import com.unnet.triangle.lvs.master.model.Workgroup;
import com.unnet.triangle.lvs.master.model.WorkgroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkgroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workgroup
     *
     * @mbg.generated
     */
    long countByExample(WorkgroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workgroup
     *
     * @mbg.generated
     */
    int deleteByExample(WorkgroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workgroup
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long group_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workgroup
     *
     * @mbg.generated
     */
    int insert(Workgroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workgroup
     *
     * @mbg.generated
     */
    int insertSelective(Workgroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workgroup
     *
     * @mbg.generated
     */
    List<Workgroup> selectByExample(WorkgroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workgroup
     *
     * @mbg.generated
     */
    Workgroup selectByPrimaryKey(Long group_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workgroup
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Workgroup record, @Param("example") WorkgroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workgroup
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Workgroup record, @Param("example") WorkgroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workgroup
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Workgroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workgroup
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Workgroup record);
}