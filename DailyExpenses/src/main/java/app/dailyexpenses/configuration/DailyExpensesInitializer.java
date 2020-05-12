package app.dailyexpenses.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import app.dailyexpenses.dao.AddEarnDaoImpl;
import app.dailyexpenses.dao.AddSpentDaoImpl;
import app.dailyexpenses.dao.FetchTransactionDaoImpl;
import app.dailyexpenses.dao.LoginDaoImpl;
import app.dailyexpenses.dao.RegisterUserDaoImpl;
import app.dailyexpenses.service.EarnService;
import app.dailyexpenses.service.FetchTransactionService;
import app.dailyexpenses.service.RegisterUserService;
import app.dailyexpenses.service.SpentService;

public class DailyExpensesInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();

		annotationConfigWebApplicationContext.register(DailyExpensesConfiguration.class);
		annotationConfigWebApplicationContext.register(RegisterUserService.class);
		annotationConfigWebApplicationContext.register(LoginDaoImpl.class);
		annotationConfigWebApplicationContext.register(RegisterUserDaoImpl.class);
		annotationConfigWebApplicationContext.register(SpentService.class);
		annotationConfigWebApplicationContext.register(AddSpentDaoImpl.class);
		annotationConfigWebApplicationContext.register(FetchTransactionService.class);
		annotationConfigWebApplicationContext.register(FetchTransactionDaoImpl.class);
		annotationConfigWebApplicationContext.register(EarnService.class);
		annotationConfigWebApplicationContext.register(AddEarnDaoImpl.class);
		annotationConfigWebApplicationContext.setServletContext(servletContext);
		

		ServletRegistration.Dynamic servletRegistration = servletContext.addServlet("Dispatcher",
				new DispatcherServlet(annotationConfigWebApplicationContext));
		servletRegistration.setLoadOnStartup(1);
		servletRegistration.addMapping("/");
	}

}
