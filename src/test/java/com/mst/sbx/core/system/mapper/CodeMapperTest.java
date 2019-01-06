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
package com.mst.sbx.core.system.mapper;

import com.mst.sbx.core.system.domain.entity.Code;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(properties="spring.autoconfigure.exclude=com.mst.sbx.common.config.UReportConfig")
public class CodeMapperTest {

    @Autowired
    private CodeMapper codeMapper;

    @Test
    public void testInsert() {
        Code code = new Code();
        code.setCode("test");
        code.setDescription("测试");
        code.setEnabledFlag("Y");
        code.setAttr1("aaa");
        int result = codeMapper.insertSelective(code);
        Assert.assertNotEquals(0, result);
    }

    @Test
    public void testUpdateWith() {
        Code code = codeMapper.selectByPrimaryKey(1L);
        code.setCode("test2");
        int result = codeMapper.updateByPrimaryKey(code);
        Assert.assertNotEquals(0, result);
    }
}