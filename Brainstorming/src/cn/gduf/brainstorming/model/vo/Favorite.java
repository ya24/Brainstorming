package cn.gduf.brainstorming.model.vo;
/**
 * �ղ����ӱ�ʵ����
 */
public class Favorite {
	private String userID;
	private String articleID;
	private String saveTime;
	
	public Favorite(){}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getArticleID() {
		return articleID;
	}

	public void setArticleID(String articleID) {
		this.articleID = articleID;
	}

	public String getSaveTime() {
		return saveTime;
	}

	public void setSaveTime(String saveTime) {
		this.saveTime = saveTime;
	}
	
	
}
