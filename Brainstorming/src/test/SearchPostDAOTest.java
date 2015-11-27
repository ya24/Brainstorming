package test;

import java.util.Iterator;
import java.util.List;

import cn.gduf.brainstorming.model.factory.DAOFactory;
import cn.gduf.brainstorming.model.vo.AtTpUs3;
import cn.gduf.brainstorming.model.vo.Major;
import cn.gduf.brainstorming.model.vo.UsShMj3;

public class SearchPostDAOTest {

	public static void main(String[] args) throws Exception {
		method1();
		method2();
		method3();
		method4();

	}

	private static void method1() throws Exception {
		// ���ݱ����������� String articleTitle List<AtTpUs3>
		// a.articleURL, a.typeID, a.articleTitle, u.userName, t.typeName,
		// a.browseCounter, a.answerCounter
		List<AtTpUs3> l1 = DAOFactory.getSearchPostDAOInstance()
				.articleSearchByTitle("java");
		System.out.println("���ݱ�����������");
		Iterator<AtTpUs3> it = l1.iterator();
		while (it.hasNext()) {
			AtTpUs3 atu3 = it.next();
			System.out.println(atu3.getArticle().getArticleURL());
			System.out.println(atu3.getArticle().getTypeID());
			System.out.println(atu3.getArticle().getArticleTitle());
			System.out.println(atu3.getUser().getUserName());
			System.out.println(atu3.getTopic().getTypeName());
			System.out.println(atu3.getArticle().getBrowseCounter());
			System.out.println(atu3.getArticle().getAnswerCounter());

		}
		System.out.println();

	}

	private static void method2() throws Exception {
		// ���ݰ����������int topicID List<AtTpUs3>
		List<AtTpUs3> l = DAOFactory.getSearchPostDAOInstance()
				.articleSearchByTopic(2);
		System.out.println("���ݰ����������");
		Iterator<AtTpUs3> it = l.iterator();
		while (it.hasNext()) {
			AtTpUs3 atu3 = it.next();
			System.out.println(atu3.getArticle().getArticleURL());
			System.out.println(atu3.getArticle().getTypeID());
			System.out.println(atu3.getArticle().getArticleTitle());
			System.out.println(atu3.getUser().getUserName());
			System.out.println(atu3.getTopic().getTypeName());
			System.out.println(atu3.getArticle().getBrowseCounter());
			System.out.println(atu3.getArticle().getAnswerCounter());
		}
		System.out.println();
	}

	private static void method3() throws Exception {
		// �����û��������û�String userName List<UsShMj3>
		//.userName, s.schoolName, m.majorName u.introducePath
		List<UsShMj3> l=DAOFactory.getSearchPostDAOInstance().userSearchByUserName("��");
		Iterator<UsShMj3> it=l.iterator();
		System.out.println("�����û��������û�");
		while(it.hasNext()){
			UsShMj3 usm=it.next();
			System.out.println(usm.getUser().getUserName());
			System.out.println(usm.getSchool().getSchoolName());
			System.out.println(usm.getMajor().getMajorName());
			System.out.println(usm.getUser().getIntroducePath());
			
		}
		System.out.println();
	}

	private static void method4() throws Exception {
		// ����רҵ������רҵString majorName List<Major>
		List<Major> l=DAOFactory.getSearchPostDAOInstance().majorSearchByMajorName("��������");
		Iterator<Major> it=l.iterator();
		System.out.println("����רҵ������רҵ");
		while(it.hasNext()){
			Major m=it.next();
			System.out.println(m.getMajorName());
		}
		
		System.out.println();
				
	}

	

	

}
