package com.dey.entity;

public class Category {
  public String categoryname;

  public String getCategoryname() {
    return categoryname;
  }

  public void setCategoryname(String categoryname) {
    this.categoryname = categoryname;
  }

  @Override
  public String toString(){
    return getCategoryname();
  }
}
