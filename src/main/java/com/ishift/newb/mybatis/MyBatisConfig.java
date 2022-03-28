package com.ishift.newb.mybatis;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
@MapperScan(basePackages = {"com.ishift.newb.dao"}) // MyBatis의 또 다른 기능
public class MyBatisConfig {
	@Bean //Configuration -> Bean 관리 ->-+ Spring 모든 의존 관계는 Spring Container에서 관리 한다. 이걸 다 빈으로 관리 한다.
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean ssF = new SqlSessionFactoryBean();
		ssF.setDataSource(dataSource);
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		//Alias 패키지를 지정
		ssF.setTypeAliasesPackage("com.ishift.newb.dao.vo");
		//Mapper의 위치
		ssF.setMapperLocations(resolver.getResources("classpath:mybatis/mapper/*.xml"));
		return ssF.getObject();
	}
	@Bean
	public SqlSessionTemplate sqlSessionTemplate(
			SqlSessionFactory sqlSessionFactory) {
		SqlSessionTemplate ss = new SqlSessionTemplate(sqlSessionFactory);
		return ss;
	}
}