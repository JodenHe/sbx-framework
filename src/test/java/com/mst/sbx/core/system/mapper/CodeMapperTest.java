package com.mst.sbx.core.system.mapper;

import com.mst.sbx.core.system.domain.entity.Code;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
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