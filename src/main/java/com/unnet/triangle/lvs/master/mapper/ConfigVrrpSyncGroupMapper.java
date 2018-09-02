package com.unnet.triangle.lvs.master.mapper;

import com.unnet.triangle.lvs.master.model.ConfigVrrpSyncGroup;
import com.unnet.triangle.lvs.master.model.ConfigVrrpSyncGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigVrrpSyncGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vrrp_sync_group
     *
     * @mbg.generated
     */
    long countByExample(ConfigVrrpSyncGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vrrp_sync_group
     *
     * @mbg.generated
     */
    int deleteByExample(ConfigVrrpSyncGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vrrp_sync_group
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vrrp_sync_group
     *
     * @mbg.generated
     */
    int insert(ConfigVrrpSyncGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vrrp_sync_group
     *
     * @mbg.generated
     */
    int insertSelective(ConfigVrrpSyncGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vrrp_sync_group
     *
     * @mbg.generated
     */
    List<ConfigVrrpSyncGroup> selectByExample(ConfigVrrpSyncGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vrrp_sync_group
     *
     * @mbg.generated
     */
    ConfigVrrpSyncGroup selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vrrp_sync_group
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ConfigVrrpSyncGroup record, @Param("example") ConfigVrrpSyncGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vrrp_sync_group
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ConfigVrrpSyncGroup record, @Param("example") ConfigVrrpSyncGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vrrp_sync_group
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ConfigVrrpSyncGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vrrp_sync_group
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ConfigVrrpSyncGroup record);
}