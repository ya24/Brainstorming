package test;

import java.sql.SQLException;
import java.util.List;

import java.util.Iterator;

import cn.gduf.brainstorming.model.factory.DAOFactory;
import cn.gduf.brainstorming.model.vo.Major;
import cn.gduf.brainstorming.model.vo.Theme;

public class TopicDAOTest {

	public static void main(String[] args) throws SQLException {
		method1();
		System.out.println();
		method2();
		System.out.println();
		method3();
		System.out.println();
		method4();

}

	private static void method1() throws SQLException {
		/*
		 * ��ʾ�û�����Ȥ�Ļ���
		 * select majorName from theme,major 
		 * 	where theme.majorID=major.majorID and userID=?
		 * List<Major>
		 */
		Theme tm=new Theme();
		tm.setUserID("000000001");
		List<Major> l=DAOFactory.getTopicDAOInstance().showUserLoveTopic(tm);
		Iterator<Major> it=l.iterator();
		while(it.hasNext()){
			Major m=it.next();
			System.out.println(m.getMajorName());
			
		}
	}

	private static void method2() throws SQLException {
		/*
		 * ����û�����Ȥ�Ļ���
		 * insert into theme(userID,majorID) values(?,?)
		 */
		Theme tm=new Theme();
		tm.setUserID("000000002");
		tm.setMajorID("0002");
		boolean flag=DAOFactory.getTopicDAOInstance().insertUserLoveTopic(tm);
		System.out.println(flag);
	}

	private static void method3() throws SQLException {
		/*
		 * ��ʾ��������
		 * select majorName from major where majorID=?
		 * Major
		 */
		Major m=new Major();
		m.setMajorID("0001");
		Major m1=DAOFactory.getTopicDAOInstance().showSingleTopic(m);
		System.out.println(m1.getMajorName());
	}

	private static void method4() throws SQLException {
		/*
		 * ��ʾ����漰�Ļ���
		 * select majorName from major
		 * List<Major>
		 */
		List<Major> l=DAOFactory.getTopicDAOInstance().showAllTopic();
		Iterator<Major> it=l.iterator();
		while(it.hasNext()){
			Major m=it.next();
			System.out.println(m.getMajorName());
		}
	}
}