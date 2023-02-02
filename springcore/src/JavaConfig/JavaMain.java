package JavaConfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages="JavaConfig")
public class JavaMain {
	
	@Bean
	public Samosa getsamosa()
	{
		return new Samosa(); 
		
	}
	
	@Bean 
	public Emp getDetails()
	{
	Emp e = new Emp(getsamosa(),"shashank","bangalore");
	return e;
    }
	
	
}