package cn.ketchup.pojo;

/**
 * 文章表
 */
public class Article {

  private long id;    //文章编号
  private String title;   //文章标题
  private String articleContent;    //文章内容
  private String picture;   //文章首页图片
  private String introduction;    //文章简介
  private java.sql.Timestamp publishDate;   //发表时间
  private long publishauthor;     //发表人，作者
  private long categoryId;      //文章分类
  private String tags;    //文章标签


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getArticleContent() {
    return articleContent;
  }

  public void setArticleContent(String articleContent) {
    this.articleContent = articleContent;
  }


  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }


  public String getIntroduction() {
    return introduction;
  }

  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }


  public java.sql.Timestamp getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(java.sql.Timestamp publishDate) {
    this.publishDate = publishDate;
  }


  public long getPublishauthor() {
    return publishauthor;
  }

  public void setPublishauthor(long publishauthor) {
    this.publishauthor = publishauthor;
  }


  public long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(long categoryId) {
    this.categoryId = categoryId;
  }


  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

}
