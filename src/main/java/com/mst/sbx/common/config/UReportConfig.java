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
package com.mst.sbx.common.config;

import javax.servlet.Servlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.bstek.ureport.console.UReportServlet;

/**
 * UReport 配置类
 * @author xiaofeng.he
 */
@Configuration
@ImportResource("classpath:ureport-console-context.xml")
public class UReportConfig {
	
	/** servlet url mapping */
	private static final String UREPORT_SERVLET_URL_MAPPING = "/ureport/*";
	
	/**
	 * 类似在 web.xml 添加
	 * <p>
	 * <pre>
	 *     {@code <servlet> }
	 *         {@code <servlet-name>ureportServlet</servlet-name> }
	 *         {@code <servlet-class>com.bstek.ureport.console.UReportServlet</servlet-class> }
	 *     {@code </servlet> }
	 *     {@code <servlet-mapping> }
	 *         {@code <servlet-name>ureportServlet</servlet-name> }
	 *         {@code <url-pattern>/ureport/*</url-pattern>}
	 *     {@code </servlet-mapping> }
	 * </pre>
	 * @return
	 */
	@Bean
	public ServletRegistrationBean<Servlet> ureportServlet() {
		return new ServletRegistrationBean<Servlet>(new UReportServlet(), UREPORT_SERVLET_URL_MAPPING);
	}
}
