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

package com.mst.sbx.common.mapper;

import tk.mybatis.mapper.common.Mapper;

/**
 * 基础 mapper
 * @author xiaofeng.he
 */
public interface SbxBaseMapper<T> extends Mapper<T> {

    /**
     * 乐观锁删除
     * @param t
     * @return
     */
    default int deleteWithVersion(T t){
        int result = delete(t);
        if(result == 0){
            // TODO 后续改成多语言统一异常处理
            throw new RuntimeException("删除失败!");
        }
        return result;
    }

    /**
     * 乐观锁更新
     * @param t
     * @return
     */
    default int updateByPrimaryKeyWithVersion(T t){
        int result = updateByPrimaryKey(t);
        if(result == 0){
            // TODO 后续改成多语言统一异常处理
            throw new RuntimeException("更新失败!");
        }
        return result;
    }
}
