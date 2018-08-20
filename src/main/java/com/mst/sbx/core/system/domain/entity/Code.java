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

package com.mst.sbx.core.system.domain.entity;

import com.mst.sbx.common.domain.BaseEntity;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 快速编码头
 * @author xiaofeng.he
 */
@Table(name = "sbx_sys_code_b")
@Data
public class Code extends BaseEntity {

    /** ID标记，自增 */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long codeId;

    /** 代码 */
    private String code;

    /** 描述 */
    private String description;

    /** 是否启用，Y/N */
    private String enabledFlag;

    /** 父级快码 */
    private String parentCode;

}
