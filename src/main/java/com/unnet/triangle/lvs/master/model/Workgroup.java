package com.unnet.triangle.lvs.master.model;

import java.util.Date;

public class Workgroup {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column workgroup.group_id
     *
     * @mbg.generated
     */
    private Long group_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column workgroup.create_time
     *
     * @mbg.generated
     */
    private Date create_time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column workgroup.update_time
     *
     * @mbg.generated
     */
    private Date update_time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column workgroup.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column workgroup.uuid
     *
     * @mbg.generated
     */
    private String uuid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column workgroup.group_id
     *
     * @return the value of workgroup.group_id
     *
     * @mbg.generated
     */
    public Long getGroup_id() {
        return group_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column workgroup.group_id
     *
     * @param group_id the value for workgroup.group_id
     *
     * @mbg.generated
     */
    public void setGroup_id(Long group_id) {
        this.group_id = group_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column workgroup.create_time
     *
     * @return the value of workgroup.create_time
     *
     * @mbg.generated
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column workgroup.create_time
     *
     * @param create_time the value for workgroup.create_time
     *
     * @mbg.generated
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column workgroup.update_time
     *
     * @return the value of workgroup.update_time
     *
     * @mbg.generated
     */
    public Date getUpdate_time() {
        return update_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column workgroup.update_time
     *
     * @param update_time the value for workgroup.update_time
     *
     * @mbg.generated
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column workgroup.name
     *
     * @return the value of workgroup.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column workgroup.name
     *
     * @param name the value for workgroup.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column workgroup.uuid
     *
     * @return the value of workgroup.uuid
     *
     * @mbg.generated
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column workgroup.uuid
     *
     * @param uuid the value for workgroup.uuid
     *
     * @mbg.generated
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}