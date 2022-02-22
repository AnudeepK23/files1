package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Alien;


// 1 ==>

//public interface AlienRepo extends CrudRepository<Alien,Integer > {
//	
//	List<Alien> findByName(String name);
//	
//	List<Alien> findByIdGreaterThan(int id);
//	
//	@Query("from Alien where name=?1 order by name")
//	List<Alien> findByNameSorted(String name);
//	
//	List<Alien> findByIdLesserThan(int id);
//
//}



// 2 ==>

//public interface AlienRepo extends CrudRepository<Alien,Integer > {
//	
//	
//
//}

// 3 ==>

//public interface AlienRepo extends CrudRepository<Alien,Integer > {
//	
//	
//
//}


// 4 ==>

public interface AlienRepo extends JpaRepository<Alien,Integer > {
	
	

}