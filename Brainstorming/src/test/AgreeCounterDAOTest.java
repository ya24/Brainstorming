package test;

import java.sql.SQLException;

import cn.gduf.brainstorming.model.factory.DAOFactory;
import cn.gduf.brainstorming.model.vo.Answer;
import cn.gduf.brainstorming.model.vo.Article;

public class AgreeCounterDAOTest {

	public static void main(String[] args) throws SQLException {
		
		method1();
		
	//	method2();
		
		method3();
		
	//	method4();
	}

	private static void method1() throws SQLException {
		/*
		 * 查找帖子赞的个数
		 * select agreeCounter from article where articleID=?
		 * Article
		 */
		Article a=new Article();
		a.setArticleID("0000000001");
		Article a2=DAOFactory.getAgreeCounterDAOInstance().findByArticleID(a);
		System.out.println(a2.getAgreeCounter());
		
	}

	private static void method2() throws SQLException {
		/*
		 * 修改帖子赞的个数
		 * update article set agreeCounter=? where articleID=?
		 * 
		 */
		Article a=new Article();
		a.setAgreeCounter(1);
		a.setArticleID("0000000001");
		boolean flag=DAOFactory.getAgreeCounterDAOInstance().modifyByArticleID(a);
		System.out.println(flag);
	}

	private static void method3() throws SQLException {
		/*
		 * 查找回帖赞的个数
		 * select agreeCounter from answer where answerID=?
		 */
		Answer a=new Answer();
		a.setAnswerID("0000000001");
		Answer a2=DAOFactory.getAgreeCounterDAOInstance().findByAnswerID(a);
		System.out.println(a2.getAgreeCounter());
				
	}

	private static void method4() throws SQLException {
		/*
		 * 修改回帖赞的个数
		 * update answer set agreeCounter=? where answerID=?
		 */
		Answer a=new Answer();
		a.setAgreeCounter(2);
		a.setAnswerID("0000000001");
		boolean flag=DAOFactory.getAgreeCounterDAOInstance().modifyByAnswerID(a);
		System.out.println(flag);
	}

}
