package org.kishore.messenger.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import io.swagger.jaxrs.config.BeanConfig;

public class SwaggerConfigurationServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
		BeanConfig beanConfig = new BeanConfig();
		beanConfig.setBasePath("/messenger/webapi");
		beanConfig.setHost("localhost:8080");
		beanConfig.setTitle("Messenger app Swagger Dcos");
		beanConfig.setResourcePackage("org.kishore.messenger.resources");
		beanConfig.setPrettyPrint(true);
		beanConfig.setScan(true);
		beanConfig.setSchemes(new String[] {"http"});
		beanConfig.setVersion("1.0");
	}

}
