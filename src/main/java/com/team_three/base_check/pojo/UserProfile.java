package com.team_three.base_check.pojo;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * (UserProfile)实体类
 *
 * @author Charles_Yang
 * @since 2022-06-10 09:55:09
 */
@ApiModel(value = "UserProfile",description = "$tableInfo.comment")
public class UserProfile implements Serializable {
    private static final long serialVersionUID = 869296673997413440L;
    
	@ApiModelProperty(name = "id",notes = "${column.comment}",dataType = "Integer",required = true)
    private Integer id;
    
	@ApiModelProperty(name = "username",notes = "${column.comment}",dataType = "String",required = true)
    private String username;
    
	@ApiModelProperty(name = "machineguid",notes = "${column.comment}",dataType = "String",required = true)
    private String machineguid;
    
	@ApiModelProperty(name = "updateTime",notes = "${column.comment}",dataType = "String",required = true)
    private String updateTime;

        
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
        
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMachineguid() {
        return machineguid;
    }

    public void setMachineguid(String machineguid) {
        this.machineguid = machineguid;
    }
        
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

}