package test;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import cn.gduf.brainstorming.model.factory.DAOFactory;
import cn.gduf.brainstorming.model.vo.Answer;

public class RePostDAOTest {

	public static void main(String[] args) throws SQLException {
		method1();
//		method2();

}

	private static void method1() throws SQLException {
		/*
		 * 查看回帖（用户回帖，帖子回帖）
		 * select articleID,userID,answerPath,createTime,agreeCounter"
				+ "from answer where " + field + "=?"
			List<Answer>
		 */
		
		Answer a=new Answer();
		a.setUserID("000000002");
		List<Answer> list=DAOFactory.getRePostDAOInstance().showRePostByUserID(a);
		Iterator<Answer> it=list.iterator();
		while(it.hasNext()){
			Answer a2=it.next();
			System.out.println(a2.getArticleID());
			System.out.println(a2.getUserID());
			System.out.println(a2.getAnswerPath());
			System.out.println(a2.getCreateTime());
			System.out.println(a2.getAgreeCounter());
		}
		
		
	}

	private static void method2() throws SQLException {
		/*
		 * 添加回帖
		 * insert into answer(answerID,articleID,userID,answerPath)"
				+ "values(?,?,?,?)"
		 */
		Answer a=new Answer();
		a.setAnswerID("0000000013");
		a.setArticleID("0000000003");
		a.setUserID("000000001");
		a.setAnswerPath("jisi/aaa/a2/rea2/");
		boolean flag=DAOFactory.getRePostDAOInstance().createRePost(a);
		System.out.println(flag);
	}
}