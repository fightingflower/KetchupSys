package cn.ketchup.pojo;

/**
 * 文章分类表
 */
public class Category {

  private long id;    //分类编号
  private String categoryName;    //分类名称


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

}
