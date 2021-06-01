package com.andreicoctails.app.repository;
import  org.springframework.data.jpa.repository.JpaRepository;
import com.andreicoctails.app.model.TCoctail;

public interface ICoctailRepository extends JpaRepository<TCoctail,Long>{
	
	

}
