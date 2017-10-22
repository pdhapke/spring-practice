package beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public AccountDao accountDao(){
		AccountDaoInMemoryImpl bean = new AccountDaoInMemoryImpl(); 
		return bean; 
	}
	
	@Bean
	public AccountService accountService(){
		AccountServiceImpl bean = new AccountServiceImpl(); 
		bean.setAccountDao(accountDao());
		return bean; 
	}
	
	
}
