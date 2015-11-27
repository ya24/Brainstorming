package test;

import java.sql.SQLException;

import cn.gduf.brainstorming.model.factory.DAOFactory;
import cn.gduf.brainstorming.model.vo.Article;

public class BrowseCounterDAOTest {

	public static void main(String[] args) throws SQLException {
		method1();
	//	method2();
	}

	/*
	 * 查找帖子浏览次数
	 * select browseCounter from article where articleID=?
	 */
	private static void method1() throws SQLException {
		Article a=new Article();
		a.setArticleID("0000000001");
		Article a2=DAOFactory.getBrowseCounterDAOInstance().findByArticleID(a);
		System.out.println(a2.getBrowseCounter());
	}


	
	/*
	 * 修改帖子浏览次数
	 * update article set browseCounter=? where articleID=?
	 */
	private static void method2() throws SQLException {
		Article a=new Article();
		a.setBrowseCounter(3);
		a.setArticleID("0000000001");
		boolean flag=DAOFactory.getBrowseCounterDAOInstance().modifyByArticleID(a);
		System.out.println(flag);
	}
	
}
