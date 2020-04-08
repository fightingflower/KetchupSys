package cn.ketchup.pojo;

/**
 * 回复表
 */
public class Reply {

  private long id;    //编号
  private long commentId;   //评论id
  private String respondent;    //回复人
  private java.sql.Timestamp replayDate;    //回复时间
  private String replayContent;     //回复内容


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getCommentId() {
    return commentId;
  }

  public void setCommentId(long commentId) {
    this.commentId = commentId;
  }


  public String getRespondent() {
    return respondent;
  }

  public void setRespondent(String respondent) {
    this.respondent = respondent;
  }


  public java.sql.Timestamp getReplayDate() {
    return replayDate;
  }

  public void setReplayDate(java.sql.Timestamp replayDate) {
    this.replayDate = replayDate;
  }


  public String getReplayContent() {
    return replayContent;
  }

  public void setReplayContent(String replayContent) {
    this.replayContent = replayContent;
  }

}
