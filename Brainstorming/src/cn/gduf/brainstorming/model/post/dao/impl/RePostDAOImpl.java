package cn.gduf.brainstorming.model.post.dao.impl;

/**
 * @author ��˼
 * �����ӿ�ʵ����
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.gduf.brainstorming.model.post.dao.RePostDAO;
import cn.gduf.brainstorming.model.vo.Answer;

public class RePostDAOImpl implements RePostDAO {

	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	public RePostDAOImpl(Connection conn) {
		this.conn = conn;
	}

	/**
	 * ��ӻ���
	 * 
	 * @param answer
	 * @throws SQLException
	 */
	@Override
	public boolean createRePost(Answer answer) throws SQLException {

		/*
		 * �������������ID����������ID������ID���������ݣ�
		 */

		boolean flag = false;

		String sql = "insert into answer(answerID,articleID,userID,answerPath)"
				+ "values(?,?,?,?)";

		ps = conn.prepareStatement(sql);

		ps.setString(1, answer.getAnswerID());
		ps.setString(2, answer.getArticleID());
		ps.setString(3, answer.getUserID());
		ps.setString(4, answer.getAnswerPath());

		int count = ps.executeUpdate();

		if (count == 1) {
			flag = true;
		}

		ps.close();

		return flag;
	}

	/**
	 * �鿴�������û�������
	 * 
	 * @param answer
	 * @throws SQLException
	 */
	@Override
	public List<Answer> showRePostByUserID(Answer answer) throws SQLException {

		/*
		 * ��ʾ���������ӣ��ش�����ߣ��ش�����ݺ�ʱ�䣬�Ѿ�������ش��޵ĸ������ݸ���Ϊ0
		 */
		List<Answer> list = new ArrayList<Answer>();

		Answer answer2 = null;

		String sql = "select articleID,userID,answerPath,createTime,agreeCounter from answer where draftFlag=0 and userID=?";

		ps = conn.prepareStatement(sql);

		ps.setString(1, answer.getUserID());

		rs = ps.executeQuery();

		while (rs.next()) {
			answer2 = new Answer();
			answer2.setArticleID(rs.getString("articleID"));
			answer2.setUserID(rs.getString("userID"));
			answer2.setAnswerPath(rs.getString("answerPath"));
			answer2.setCreateTime(rs.getString("createTime"));
			answer2.setAgreeCounter(rs.getInt("agreeCounter"));
			list.add(answer2);
		}

		rs.close();
		ps.close();

		return list;

	}

	/**
	 * �鿴���������ӻ�����
	 * 
	 * @param answer
	 * @throws SQLException
	 */
	@Override
	public List<Answer> showRePostByArticleID(Answer answer)
			throws SQLException {

		/*
		 * ��ʾ���������ӣ��ش�����ߣ��ش�����ݺ�ʱ�䣬�Ѿ�������ش��޵ĸ������ݸ���Ϊ0
		 */
		List<Answer> list = new ArrayList<Answer>();

		Answer answer2 = null;

		String sql = "select articleID,userID,answerPath,createTime,agreeCounter from answer where draftFlag=0 and ArticleID=?";

		ps = conn.prepareStatement(sql);

		ps.setString(1, answer.getArticleID());

		rs = ps.executeQuery();

		while (rs.next()) {
			answer2 = new Answer();
			answer2.setArticleID(rs.getString("articleID"));
			answer2.setUserID(rs.getString("userID"));
			answer2.setAnswerPath(rs.getString("answerPath"));
			answer2.setCreateTime(rs.getString("createTime"));
			answer2.setAgreeCounter(rs.getInt("agreeCounter"));
			list.add(answer2);
		}

		rs.close();
		ps.close();

		return list;
	}
}
