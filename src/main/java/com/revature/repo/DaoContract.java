package com.revature.repo;

import java.util.List;

/*
 * @auther clifton ferguson
 * 
 * @param <T> Type of model
 * @param <I> Primary key for model
 * 
 * This will create a contract for all doa classes to
 * follow.
 */

public interface DaoContract <T, I> {
	/*
	 * 
	 * @return A list of all instances in the db
	 *  
	 */
	
    
	List<T> findAll();
	/*
	 * 
	 * @param i primary key of the instance
	 * @return the instance wit hthe same primary key
	 */
	
	T findById(I i);
	/*
	 * 
	 */
	
	T update(T t);
	
	T create(T t);
	
	int delete(I i);
	
	
	
}
