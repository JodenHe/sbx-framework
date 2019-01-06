/**
 *    Copyright 2018 https://github.com/JodenHe
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.mst.sbx.common.domain;

import lombok.Data;
import tk.mybatis.mapper.annotation.Version;

import java.util.Date;

/**
 * 数据库基础 DTO
 * @author xiaofeng.he
 */
@Data
public class BaseEntity {

    /** 乐观锁 */
    @Version
    private Integer version;

    /** 创建时间 */
    private Date createTime;

    /** 创建时间 */
    private Date updateTime;

    /** 由谁创建 */
    private Long createBy;

    /** 由谁更新 */
    private Long updateBy;

    /** 记录修改的登录信息，对应 sbx_sys_user_login 表 */
    private Long updateLogin;

    /** 预留扩展字段 */
    private String attr1;

    /** 预留扩展字段 */
    private String attr2;

    /** 预留扩展字段 */
    private String attr3;

    /** 预留扩展字段 */
    private String attr4;

    /** 预留扩展字段 */
    private String attr5;

    /** 预留扩展字段 */
    private String attr6;

    /** 预留扩展字段 */
    private String attr7;

    /** 预留扩展字段 */
    private String attr8;

    /** 预留扩展字段 */
    private String attr9;

    /** 预留扩展字段 */
    private String attr10;

    /** 预留扩展字段 */
    private String attr11;

    /** 预留扩展字段 */
    private String attr12;

    /** 预留扩展字段 */
    private String attr13;

    /** 预留扩展字段 */
    private String attr14;

    /** 预留扩展字段 */
    private String attr15;
}
