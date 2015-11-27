package cn.gduf.brainstorming.model.agree.dao.impl;
/**
 * @author ��˼
 * �޵ĸ����ӿ�ʵ����
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.gduf.brainstorming.model.agree.dao.AgreeCounterDAO;
import cn.gduf.brainstorming.model.vo.Answer;
import cn.gduf.brainstorming.model.vo.Article;

public class AgreeCounterDAOImpl implements AgreeCounterDAO {

	private Connection conn=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	
	/**
	 * ȡ�����ݿ������
	 * @param conn
	 */
	public AgreeCounterDAOImpl(Connection conn){
		this.conn=conn;
	}
	
	/**
	 * ���������޵ĸ���
	 * @param article
	 * @throws SQLException 
	 */
	@Override
	public Article findByArticleID(Article article) throws SQLException {
		Article article2=new Article();
		
		String sql="select agreeCounter from article where articleID=?";
		
		ps=conn.prepareStatement(sql);
		
		ps.setString(1, article.getArticleID());
		
		rs=ps.executeQuery();
		
		while(rs.next()){
			article2.setAgreeCounter(rs.getInt("agreeCounter"));
		}
		
		rs.close();
		ps.close();
		
		return article2;
	}

	/**
	 * �޸������޵ĸ���
	 * @param article
	 * @throws SQLException 
	 */
	@Override
	public boolean modifyByArticleID(Article article) throws SQLException {
		boolean flag=false;
		
		String sql="update article set agreeCounter=? where articleID=?";
		
		ps=conn.prepareStatement(sql);
		
		ps.setInt(1, article.getAgreeCounter());
		ps.setString(2, article.getArticleID());
		
		int count=ps.executeUpdate();
		
		if(count==1){
			flag=true;
		}
		
		ps.close();
		
		return flag;
	}

	/**
	 * ���һ����޵ĸ���
	 * @param answer
	 * @throws SQLException 
	 */
	@Override
	public Answer findByAnswerID(Answer answer) throws SQLException {
		Answer answer2=new Answer();
		
		String sql="select agreeCounter from answer where answerID=?";
		
		ps=conn.prepareStatement(sql);
		
		ps.setString(1, answer.getAnswerID());
		
		rs=ps.executeQuery();
		
		while(rs.next()){
			answer2.setAgreeCounter(rs.getInt("agreeCounter"));
		}
		rs.close();
		ps.close();
		
		return answer2;
	}

	/**
	 * �޸Ļ����޵ĸ���
	 * @param answer
	 * @throws SQLException 
	 */
	@Override
	public boolean modifyByAnswerID(Answer answer) throws SQLException {
		boolean flag=false;
		
		String sql="update answer set agreeCounter=? where answerID=?";
		
		ps=conn.prepareStatement(sql);
		
		ps.setInt(1, answer.getAgreeCounter());
		ps.setString(2, answer.getAnswerID());
		
		int count=ps.executeUpdate();
		
		if(count==1){
			flag=true;
		}
		
		ps.close();
		
		return flag;
	}

}
