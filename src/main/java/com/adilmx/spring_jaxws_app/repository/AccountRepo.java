package com.adilmx.spring_jaxws_app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.core.config.Projection;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.adilmx.spring_jaxws_app.entity.Account;

//generate a rest from this repository (example URL : http://localhost:8080/accounts/?page=1&size=2)
@RepositoryRestController
public interface AccountRepo extends JpaRepository<Account, Long>{

	//generate a filter with path http://localhost:8080/accounts/search/byLib?lib=ac-2
	@RestResource(path = "/byLib")
	public List<Account> findByLib(@Param("lib") String lib);
}
