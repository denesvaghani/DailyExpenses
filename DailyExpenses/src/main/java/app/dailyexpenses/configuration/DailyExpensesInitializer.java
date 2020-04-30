package app.dailyexpenses.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import app.dailyexpenses.dao.LoginDaoImpl;
import app.dailyexpenses.dao.RegisterUserDaoImpl;
import app.dailyexpenses.service.RegisterUserService;

public class DailyExpensesInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();

		annotationConfigWebApplicationContext.register(DailyExpensesConfiguration.class);
		annotationConfigWebApplicationContext.register(RegisterUserService.class);
		annotationConfigWebApplicationContext.register(LoginDaoImpl.class);
		annotationConfigWebApplicationContext.register(RegisterUserDaoImpl.class);
		annotationConfigWebApplicationContext.setServletContext(servletContext);

		ServletRegistration.Dynamic servletRegistration = servletContext.addServlet("Dispatcher",
				new DispatcherServlet(annotationConfigWebApplicationContext));
		servletRegistration.setLoadOnStartup(1);
		servletRegistration.addMapping("/");
	}

}
