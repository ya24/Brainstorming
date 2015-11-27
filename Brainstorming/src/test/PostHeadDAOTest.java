package test;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import cn.gduf.brainstorming.model.factory.DAOFactory;
import cn.gduf.brainstorming.model.vo.AtTpUs3;

public class PostHeadDAOTest {

	public static void main(String[] args) throws SQLException, Exception {
		method1();
		method2();
		method3();
		method4();
	}

	private static void method1() throws SQLException, Exception {
		//显示热门帖子	List<AtTpUs3>
		//a.articleURL, a.typeID, a.articleTitle, u.userName, t.typeName, 
		//a.browseCounter, a.answerCounter
		List<AtTpUs3> l=DAOFactory.getPostHeadDAOInstance().findPopularPost();
		Iterator<AtTpUs3> it=l.iterator();
		System.out.println("显示热门帖子");
		while(it.hasNext()){
			AtTpUs3 atu=it.next();
			System.out.println(atu.getArticle().getArticleURL());
			System.out.println(atu.getArticle().getTypeID());
			System.out.println(atu.getArticle().getArticleTitle());
			System.out.println(atu.getUser().getUserName());
			System.out.println(atu.getTopic().getTypeName());
			System.out.println(atu.getArticle().getBrowseCounter());
			System.out.println(atu.getArticle().getAnswerCounter());
			System.out.println("=====================");
		}
		System.out.println("**************************");
	}

	private static void method2() throws SQLException, Exception {
		//根据用户ID查找帖子	 List<AtTpUs3>	String userID
		List<AtTpUs3> l=DAOFactory.getPostHeadDAOInstance().findPostByUserID("000000004");
		Iterator<AtTpUs3> it=l.iterator();
		System.out.println("根据用户ID查找帖子");
		while(it.hasNext()){
			AtTpUs3 atu=it.next();
			System.out.println(atu.getArticle().getArticleURL());
			System.out.println(atu.getArticle().getTypeID());
			System.out.println(atu.getArticle().getArticleTitle());
			System.out.println(atu.getUser().getUserName());
			System.out.println(atu.getTopic().getTypeName());
			System.out.println(atu.getArticle().getBrowseCounter());
			System.out.println(atu.getArticle().getAnswerCounter());
			System.out.println("=====================");
		}
		System.out.println("**************************");
	}

	private static void method3() throws SQLException, Exception {
		//根据类型ID查找帖子	List<AtTpUs3>	int typeID
		List<AtTpUs3> l=DAOFactory.getPostHeadDAOInstance().findPostByTypeID(4);
		Iterator<AtTpUs3> it=l.iterator();
		System.out.println("根据类型ID查找帖子");
		while(it.hasNext()){
			AtTpUs3 atu=it.next();
			System.out.println(atu.getArticle().getArticleURL());
			System.out.println(atu.getArticle().getTypeID());
			System.out.println(atu.getArticle().getArticleTitle());
			System.out.println(atu.getUser().getUserName());
			System.out.println(atu.getTopic().getTypeName());
			System.out.println(atu.getArticle().getBrowseCounter());
			System.out.println(atu.getArticle().getAnswerCounter());
			System.out.println("=====================");
		}
		System.out.println("**************************");
	}

	private static void method4() throws SQLException, Exception {
		//查找用户收藏的帖子	List<AtTpUs3>	String userID
		List<AtTpUs3> l=DAOFactory.getPostHeadDAOInstance().findPostByFavorUserID("000000004");
		Iterator<AtTpUs3> it=l.iterator();
		System.out.println("根据用户ID查找帖子");
		while(it.hasNext()){
			AtTpUs3 atu=it.next();
			System.out.println(atu.getArticle().getArticleURL());
			System.out.println(atu.getArticle().getTypeID());
			System.out.println(atu.getArticle().getArticleTitle());
			System.out.println(atu.getUser().getUserName());
			System.out.println(atu.getTopic().getTypeName());
			System.out.println(atu.getArticle().getBrowseCounter());
			System.out.println(atu.getArticle().getAnswerCounter());
			System.out.println("=====================");
		}
		System.out.println("**************************");
	}

}
