package com.mst.sbx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import tk.mybatis.spring.annotation.MapperScan;

// 声明自动为spring容器中那些配置@aspectJ切面的bean创建代理，织入切面
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy=true)
@MapperScan("com.mst.sbx.**.mapper")
@SpringBootApplication
public class SbxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbxApplication.class, args);
	}
}
