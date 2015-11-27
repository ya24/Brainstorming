package test;

import java.sql.SQLException;

import cn.gduf.brainstorming.model.factory.DAOFactory;
import cn.gduf.brainstorming.model.vo.Article;

public class CreatePostDAOTest {

	public static void main(String[] args) throws SQLException {
		/*
		 * Ìí¼ÓÐÂÌû×Ó
		 * insert into article(articleID,articleURL,articleTitle,
		 * 	userID,typeID,textPath) values(?,?,?,?,?,?)
		 */
		Article a=new Article();
		a.setArticleID("0000000006");
		a.setArticleURL("http://localhost:8080/brainstorming/jisi/aaa/a1/");
		a.setArticleTitle("lllll");
		a.setUserID("000000003");
		a.setTypeID(1);
		a.setTextPath("jisi/aaa/a4/");
		
		boolean flag=DAOFactory.getCreatePostDAOInstance().createPost(a);
		System.out.println(flag);
	}

}
