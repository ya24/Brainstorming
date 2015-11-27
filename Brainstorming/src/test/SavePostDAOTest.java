package test;

import java.sql.SQLException;

import cn.gduf.brainstorming.model.factory.DAOFactory;
import cn.gduf.brainstorming.model.vo.Favorite;

public class SavePostDAOTest {

	public static void main(String[] args) throws SQLException {
		/*
		 * ÐÂÌíÊÕ²ØÌû×Ó
		 * insert into favorite(userID,articleID) values(?,?)
		 */
		Favorite f=new Favorite();
		f.setUserID("000000004");
		f.setArticleID("0000000001");
		boolean flag=DAOFactory.getSavePostDAOInstance().createSavePost(f);
		System.out.println(flag);
	}

}
