package com.unnet.triangle.lvs.master.mapper;

import com.unnet.triangle.lvs.master.model.ConfigVirtualServerExt;
import com.unnet.triangle.lvs.master.model.ConfigVirtualServerExtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigVirtualServerExtMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_virtual_server_ext
     *
     * @mbg.generated
     */
    long countByExample(ConfigVirtualServerExtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_virtual_server_ext
     *
     * @mbg.generated
     */
    int deleteByExample(ConfigVirtualServerExtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_virtual_server_ext
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_virtual_server_ext
     *
     * @mbg.generated
     */
    int insert(ConfigVirtualServerExt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_virtual_server_ext
     *
     * @mbg.generated
     */
    int insertSelective(ConfigVirtualServerExt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_virtual_server_ext
     *
     * @mbg.generated
     */
    List<ConfigVirtualServerExt> selectByExample(ConfigVirtualServerExtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_virtual_server_ext
     *
     * @mbg.generated
     */
    ConfigVirtualServerExt selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_virtual_server_ext
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ConfigVirtualServerExt record, @Param("example") ConfigVirtualServerExtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_virtual_server_ext
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ConfigVirtualServerExt record, @Param("example") ConfigVirtualServerExtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_virtual_server_ext
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ConfigVirtualServerExt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table config_virtual_server_ext
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ConfigVirtualServerExt record);
}