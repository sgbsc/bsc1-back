package com.sgbsc.user;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/*
 * When the application starts up, Spring Data JPA recognises this repository and 
 * automatically generates an implementation for the DAO contract that's specified. 
 * 
 * We're using spring data rest, so this provides a RESTful way to access the data
 * automatically via the /user endpoint.
 * 
 * 	The PagingAndSortingRepository extends the CrudRepository which has the following methods:
 
  		<S extends T> S save(S entity);
	    T findOne(ID primaryKey);
	    Iterable<T> findAll();
	    Long count();
	    void delete(T entity);
	    boolean exists(ID primaryKey);
    
   The PagingAndSortingRepository interface provides a method findAll(Pageable pageable), 
   which is the key to implementing Pagination. When using Pageable, we create a Pageable 
   object with certain properties and we’ve to specify at least:
  		page zero-based page index, 
  		size the size of the page to be returned, 
  		sort (must not be null)
  	
  	It has the following methods:
  		
  		Iterable<T> findAll(Sort sort);
 		Page<T> findAll(Pageable pageable);
 */

@RepositoryRestResource(collectionResourceRel = "user", path="user")
public interface UserRepository extends PagingAndSortingRepository<User, Long>{

}
