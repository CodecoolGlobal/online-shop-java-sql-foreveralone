package Interfaces;

import category.Category;

import java.util.List;

public interface CategoryDao<T> {

    List<T> getAllCategory();
    void createTable();
    void deleteCategory(Category category);
    void addCategory(Category category);
    List<T> getData();

}
