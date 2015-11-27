package cn.gduf.brainstorming.model.userpage.dao;
/**
 * �ݸ�ӿ���
 */
import java.util.List;

import cn.gduf.brainstorming.model.vo.Answer;
import cn.gduf.brainstorming.model.vo.Article;
import cn.gduf.brainstorming.model.vo.AtAsTp3;
import cn.gduf.brainstorming.model.vo.AtTp2;

public interface DraftDAO {

	/**
	 * ��������ʵ�崴���ݸ�
	 * 
	 * @param article
	 *            - Articleʵ��
	 * @return ����״̬
	 * @throws Exception
	 */
	public boolean createDraft(Article article) throws Exception;

	/**
	 * ���ݻش�ʵ�崴���ݸ�
	 * 
	 * @param answer
	 *            - Answerʵ��
	 * @return ����״̬
	 * @throws Exception
	 */
	public boolean createDraft(Answer answer) throws Exception;

	/**
	 * �����û�ID��ʾ�ݸ�����
	 * 
	 * @param userID
	 *            - �û�ID
	 * @return ���Ӱ��2��
	 * @throws Exception
	 */
	public List<AtTp2> showArticleDraft(String userID) throws Exception;

	/**
	 * �����û�ID��ʾ�ݸ�ش�
	 * 
	 * @param userID
	 *            - �û�ID
	 * @return ���ӻش���3��
	 * @throws Exception
	 */
	public List<AtAsTp3> showAnswerDraft(String userID) throws Exception;
}
