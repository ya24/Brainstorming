package test;

import java.sql.SQLException;

import cn.gduf.brainstorming.model.factory.DAOFactory;
import cn.gduf.brainstorming.model.vo.Article;
import cn.gduf.brainstorming.model.vo.AtUsShMjAnTpFl7;

public class PostTextDAOTest {

	public static void main(String[] args) throws SQLException {
		/*
		 * ≤È’“Ã˚◊”œÍœ∏ƒ⁄»›
		 * select articleTitle,userName,textPath,schoolName,majorName,typeName "
				+ "from article a,t_user u,school s,major m,topicType t"
				+ "where a.userID=u.userID and u.schoolID=s.schoolID and u.majorID=m.majorID "
				+ "and a.typeID=t.typeID and a.articleURL=?"
			AtUsShMjAnTpFl7
			
		 */
		Article a=new Article();
		a.setArticleURL("http://localhost:8080/brainstorming/jisi/aaa/a1/");
		AtUsShMjAnTpFl7 v7=DAOFactory.getPostTextDAOInstance().findPostByURL(a);
		System.out.println(v7.getArticle().getArticleTitle());
		System.out.println(v7.getUser().getUserName());
		System.out.println(v7.getArticle().getTextPath());
		System.out.println(v7.getSchool().getSchoolName());
		System.out.println(v7.getMajor().getMajorName());
		System.out.println(v7.getTopic().getTypeName());
	}

}
