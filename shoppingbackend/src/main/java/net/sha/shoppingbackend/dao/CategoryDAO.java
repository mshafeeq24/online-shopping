package net.sha.shoppingbackend.dao;

import java.util.List;

import net.sha.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
	
}
