package cn.gduf.brainstorming.model.userpage.dao;
/**
 * ������Ϣ�ӿ���
 */
import cn.gduf.brainstorming.model.vo.UsShMj3;
import cn.gduf.brainstorming.model.vo.User;

public interface UserBasicInfoDAO {

	/**
	 * �����û�ID��ʾ�����û�ѧУרҵʵ����
	 * 
	 * @param userID
	 *            - �û�ID
	 * @return �û�ѧУרҵʵ����
	 * @throws Exception 
	 */
	public UsShMj3 findInfoByUserID(String userID) throws Exception;

	/**
	 * ����Userʵ���޸�User�û�������Ϣ
	 * 
	 * @param User
	 *            - �û�ʵ����
	 * @return ����״̬
	 * @throws Exception
	 */
	public boolean modifyInfo(User user) throws Exception;
}
