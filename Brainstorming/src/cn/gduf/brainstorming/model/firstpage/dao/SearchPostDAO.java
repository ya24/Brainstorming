package cn.gduf.brainstorming.model.firstpage.dao;
/**
 * �������������ӽӿ���
 */
import java.util.List;

import cn.gduf.brainstorming.model.vo.AtTpUs3;
import cn.gduf.brainstorming.model.vo.Major;
import cn.gduf.brainstorming.model.vo.UsShMj3;

public interface SearchPostDAO {
	/**
	 * ���ݱ�����������
	 * 
	 * @param articleTitle
	 *            - ����
	 * @return vo���������Article��TopicType��User
	 * @throws Exception 
	 */
	public List<AtTpUs3> articleSearchByTitle(String articleTitle) throws Exception;

	/**
	 * ���ݰ����������
	 * 
	 * @param topicID
	 *            - ���ID
	 * 
	 * @return vo���������Article��TopicType��User
	 * @throws Exception 
	 */
	public List<AtTpUs3> articleSearchByTopic(int topicID) throws Exception;

	/**
	 * �����û��������û�
	 * 
	 * @param userName
	 *            - �û���
	 * @return �û�ѧУרҵ3ʵ����
	 * @throws Exception 
	 */
	public List<UsShMj3> userSearchByUserName(String userName) throws Exception;

	/**
	 * ����רҵ������רҵ
	 * 
	 * @param majorName
	 *            - רҵ��
	 * @return רҵʵ��
	 * @throws Exception 
	 */
	public List<Major> majorSearchByMajorName(String majorName) throws Exception;

}
