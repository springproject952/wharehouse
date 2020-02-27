package in.nit.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@EnableTransactionManagement//eables HTX
@EnableWebMvc//Spring MVC activated 
//load Properties into Spring Container

@PropertySource("classpath:app.properties")

//all layered classes common Package name

@ComponentScan("in.nit")
public class AppConfig implements WebMvcConfigurer{
	@Autowired
	private Environment env;
	//1 Datasourse
	@Bean
	public DataSource ds() {
		System.out.println("AppConfig.ds()");
		BasicDataSource d=new BasicDataSource();
		d.setDriverClassName(env.getProperty("db.driver"));
		d.setUrl(env.getProperty("db.url"));
		d.setUsername(env.getProperty("db.user"));
		d.setPassword(env.getProperty("db.password"));
		return d;
	}
	//2 SessionFactory
	@Bean
	public LocalSessionFactoryBean sf(){
		System.out.println("AppConfig.sf()");
		LocalSessionFactoryBean  s=new LocalSessionFactoryBean ();
		s.setDataSource(ds());
		s.setHibernateProperties(props());
		s.setPackagesToScan("in.nit.model");
		return s;
	}
	@Bean
	public Properties props() {
		System.out.println("AppConfig.props()");
		Properties p=new Properties();
		p.put("hibernate.dialect",env.getProperty("org.dialect"));
		p.put("hibernate.show_sql", env.getProperty("org.showsql"));
		p.put("hibernate.format_sql", env.getProperty("org.fmtsql"));
		p.put("hibernate.hbm2ddl.auto", env.getProperty("org.ddlout"));
		return p;
	}

	// 3. Ht
	@Bean
	public HibernateTemplate ht() {
		System.out.println("AppConfig.ht()");
		HibernateTemplate ht=new HibernateTemplate();
		ht.setSessionFactory(sf().getObject());
		return ht;
	}

	// 4. Htxm
	@Bean
	public HibernateTransactionManager htx () {
		System.out.println("AppConfig.htx()");
		HibernateTransactionManager htm=new HibernateTransactionManager();
		htm.setSessionFactory(sf().getObject());
		return htm;
	}
	// 5 .ViewResovler
	@Bean
	public InternalResourceViewResolver ivr() {
		System.out.println("AppConfig.ivr()");
		InternalResourceViewResolver v=new InternalResourceViewResolver();
		v.setPrefix(env.getProperty("mvc.prefix"));
		v.setSuffix(env.getProperty("mvc.suffix"));
		return v;
	}
	
	// 6  
	@Bean
	public CommonsMultipartResolver multipartResolver() {
		System.out.println("AppConfig.multipartResolver()");
		return new CommonsMultipartResolver();
	}

 // 7. Loc
	public void addResourceHandlers( ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**")
		.addResourceLocations("/resources/");
	}
	
}
