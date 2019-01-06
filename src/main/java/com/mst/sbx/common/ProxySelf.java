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
package com.mst.sbx.common;

import org.springframework.aop.framework.AopContext;

/**
 * 获取代理对象
 * @param <T> 代理对象类型
 * @author xiaofeng.he
 */
public interface ProxySelf<T>  {

    /**
     * 取得当前对象的代理.
     * @return 代理对象, 如果未被代理,则抛出 IllegalStateException
     */
    @SuppressWarnings("unchecked")
	default T self() {
        return (T) AopContext.currentProxy();
    }

}
