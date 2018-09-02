package com.unnet.triangle.lvs.master.mapper;

import com.unnet.triangle.lvs.master.model.ConfigVrrpInstance;
import com.unnet.triangle.lvs.master.model.ConfigVrrpInstanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigVrrpInstanceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vrrp_instance
     *
     * @mbg.generated
     */
    long countByExample(ConfigVrrpInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vrrp_instance
     *
     * @mbg.generated
     */
    int deleteByExample(ConfigVrrpInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vrrp_instance
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vrrp_instance
     *
     * @mbg.generated
     */
    int insert(ConfigVrrpInstance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vrrp_instance
     *
     * @mbg.generated
     */
    int insertSelective(ConfigVrrpInstance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vrrp_instance
     *
     * @mbg.generated
     */
    List<ConfigVrrpInstance> selectByExample(ConfigVrrpInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vrrp_instance
     *
     * @mbg.generated
     */
    ConfigVrrpInstance selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vrrp_instance
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ConfigVrrpInstance record, @Param("example") ConfigVrrpInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vrrp_instance
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ConfigVrrpInstance record, @Param("example") ConfigVrrpInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vrrp_instance
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ConfigVrrpInstance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_vrrp_instance
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ConfigVrrpInstance record);
}