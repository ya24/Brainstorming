package test;

import java.util.Iterator;
import java.util.List;

import cn.gduf.brainstorming.model.factory.DAOFactory;
import cn.gduf.brainstorming.model.vo.Answer;
import cn.gduf.brainstorming.model.vo.Article;
import cn.gduf.brainstorming.model.vo.AtAsTp3;
import cn.gduf.brainstorming.model.vo.AtTp2;

public class DraftDAOTest {

	public static void main(String[] args) throws Exception {
		method1();
		method2();
		method3();
		method4();
	}

	private static void method1() throws Exception {
		//��������ʵ�崴���ݸ�	Article article	boolean
		System.out.println("��������ʵ�崴���ݸ�");
		Article a=new Article();
		a.setArticleID("0000000001");
		System.out.println(DAOFactory.getDraftDAOInstance().createDraft(a));
		
	}

	private static void method2() throws Exception {
		//���ݻش�ʵ�崴���ݸ�	Answer answer	boolean
		System.out.println("���ݻش�ʵ�崴���ݸ�");
		Answer a=new Answer();
		a.setAnswerID("0000000005");
		System.out.println(DAOFactory.getDraftDAOInstance().createDraft(a));
	}

	private static void method3() throws Exception {
		//�����û�ID��ʾ�ݸ�����	String userID	List<AtTp2>
		//a.articleTitle, a.articleURL, a.textPath, t.typeName, a.createTime
		System.out.println("�����û�ID��ʾ�ݸ�����");
		List<AtTp2> l=DAOFactory.getDraftDAOInstance().showArticleDraft("000000003");
		Iterator<AtTp2> it=l.iterator();
		while(it.hasNext()){
			AtTp2 at=it.next();
			System.out.println(at.getArticle().getArticleTitle());
			System.out.println(at.getArticle().getArticleURL());
			System.out.println(at.getArticle().getTextPath());
			System.out.println(at.getTopic().getTypeName());
			System.out.println(at.getArticle().getCreateTime());
			System.out.println("==================");
		}
		System.out.println("****************");
	}

	private static void method4() throws Exception {
		//�����û�ID��ʾ�ݸ�ش�	List<AtAsTp3>	String userID
		//at.articleTitle, at.articleURL, ans.answerPath, t.typeName, ans.createTime
		System.out.println("�����û�ID��ʾ�ݸ�ش�");
		List<AtAsTp3> l=DAOFactory.getDraftDAOInstance().showAnswerDraft("000000002");
		Iterator<AtAsTp3> it=l.iterator();
		while(it.hasNext()){
			AtAsTp3 aat=it.next();
			System.out.println(aat.getArticle().getArticleTitle());
			System.out.println(aat.getArticle().getArticleURL());
			System.out.println(aat.getAnswer().getAnswerPath());
			System.out.println(aat.getTopicType().getTypeName());
			System.out.println(aat.getAnswer().getCreateTime());
			System.out.println("==================");
		}
		System.out.println("****************");
	}
	

}
