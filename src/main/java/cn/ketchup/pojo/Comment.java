package cn.ketchup.pojo;

/**
 * 评论表
 */
public class Comment {

  private long id;  //评论id
  private String commentator;   //评论人
  private java.sql.Timestamp commentDate;   //评论时间
  private String content;   //评论内容
  private long articleId;     //文章编号


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getCommentator() {
    return commentator;
  }

  public void setCommentator(String commentator) {
    this.commentator = commentator;
  }


  public java.sql.Timestamp getCommentDate() {
    return commentDate;
  }

  public void setCommentDate(java.sql.Timestamp commentDate) {
    this.commentDate = commentDate;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public long getArticleId() {
    return articleId;
  }

  public void setArticleId(long articleId) {
    this.articleId = articleId;
  }

}
