package net.sha.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.sha.shoppingbackend.dao.CategoryDAO;
import net.sha.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {

		Category category = new Category();

		// adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("this is some descrition for television!");
		category.setImageURL("CAT_1.png");

		categories.add(category);

		// second category
		category = new Category();

		// adding first category
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("this is some descrition for Mobile!");
		category.setImageURL("CAT_2.png");

		categories.add(category);

		// third category
		category = new Category();

		// adding first category
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("this is some descrition for laptop!");
		category.setImageURL("CAT_3.png");

		categories.add(category);

	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {

		// enchanced for loop
		for (Category category : categories) {

			if (category.getId() == id)
				return category;

		}

		return null;
	}

}
