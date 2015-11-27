package cn.gduf.brainstorming.model.factory;
/**
 * @author ��˼
 * �����࣬ȷ�������ݲ����ӿڵ�ʵ��
 */
import cn.gduf.brainstorming.model.addfile.dao.AddFileDAO;
import cn.gduf.brainstorming.model.addfile.proxy.AddFileProxy;
import cn.gduf.brainstorming.model.agree.dao.AgreeCounterDAO;
import cn.gduf.brainstorming.model.agree.proxy.AgreeCounterProxy;
import cn.gduf.brainstorming.model.browse.dao.BrowseCounterDAO;
import cn.gduf.brainstorming.model.browse.proxy.BrowseCounterProxy;
import cn.gduf.brainstorming.model.firstpage.dao.SearchPostDAO;
import cn.gduf.brainstorming.model.firstpage.proxy.SearchPostProxy;
import cn.gduf.brainstorming.model.loginregister.dao.LoginDAO;
import cn.gduf.brainstorming.model.loginregister.dao.RegisterDAO;
import cn.gduf.brainstorming.model.loginregister.proxy.LoginProxy;
import cn.gduf.brainstorming.model.loginregister.proxy.RegisterProxy;
import cn.gduf.brainstorming.model.post.dao.CreatePostDAO;
import cn.gduf.brainstorming.model.post.dao.PostTextDAO;
import cn.gduf.brainstorming.model.post.dao.RePostDAO;
import cn.gduf.brainstorming.model.post.dao.SavePostDAO;
import cn.gduf.brainstorming.model.post.proxy.CreatePostProxy;
import cn.gduf.brainstorming.model.post.proxy.PostTextProxy;
import cn.gduf.brainstorming.model.post.proxy.RePostProxy;
import cn.gduf.brainstorming.model.post.proxy.SavePostProxy;
import cn.gduf.brainstorming.model.posttitle.dao.PostHeadDAO;
import cn.gduf.brainstorming.model.posttitle.proxy.PostHeadProxy;
import cn.gduf.brainstorming.model.topic.dao.TopicDAO;
import cn.gduf.brainstorming.model.topic.proxy.TopicProxy;
import cn.gduf.brainstorming.model.userpage.dao.ChatDAO;
import cn.gduf.brainstorming.model.userpage.dao.DraftDAO;
import cn.gduf.brainstorming.model.userpage.dao.UserBasicInfoDAO;
import cn.gduf.brainstorming.model.userpage.proxy.ChatProxy;
import cn.gduf.brainstorming.model.userpage.proxy.DraftProxy;
import cn.gduf.brainstorming.model.userpage.proxy.UserBasicInfoProxy;

public class DAOFactory {
	
	/**
	 * ȡ�÷����ӿ���ʵ��
	 * @return
	 */
	public static CreatePostDAO getCreatePostDAOInstance(){
		return new CreatePostProxy();
	}
	
	/**
	 * ȡ��������ϸ���ݽӿ���ʵ��
	 * @return
	 */
	public static PostTextDAO getPostTextDAOInstance(){
		return new PostTextProxy();
	}
	
	/**
	 * ȡ�û����ӿ���ʵ��
	 * @return
	 */
	public static RePostDAO getRePostDAOInstance(){
		return new RePostProxy();
	}
	
	/**
	 * ȡ���ղ����ӽӿ���ʵ��
	 * @return
	 */
	public static SavePostDAO getSavePostDAOInstance(){
		return new SavePostProxy();
	}
	
	/**
	 * ȡ�ø����ӿ���ʵ��
	 * @return
	 */
	public static AddFileDAO getAddFileDAOInstance(){
		return new AddFileProxy();
	}
	
	/**
	 * ȡ���޵ĸ����ӿ���ʵ��
	 * @return
	 */
	public static AgreeCounterDAO getAgreeCounterDAOInstance(){
		return new AgreeCounterProxy();
	}
	
	/**
	 * ȡ��������������ӿ���ʵ��
	 * @return
	 */
	public static BrowseCounterDAO getBrowseCounterDAOInstance(){
		return new BrowseCounterProxy();
	}
	
	/**
	 * ȡ�û���ӿ���ʵ��
	 * @return
	 */
	public static TopicDAO getTopicDAOInstance(){
		return new TopicProxy();
	}
	
	/**
	 * ȡ�õ�½�ӿ���ʵ��
	 * @return
	 */
	public static LoginDAO getLoginDAOInstance(){
		return new LoginProxy();
	}
	
	/**
	 * ȡ��ע��ӿ���ʵ��
	 * @return
	 */
	public static RegisterDAO getRegisterDAOInstance(){
		return new RegisterProxy();
	}
	
	public static SearchPostDAO getSearchPostDAOInstance(){
		return new SearchPostProxy();
	}
	
	public static PostHeadDAO getPostHeadDAOInstance(){
		return new PostHeadProxy();
	}
	
	public static ChatDAO getChatDAOInstance(){
		return new ChatProxy();
	}
	
	
	public static DraftDAO getDraftDAOInstance(){
		return new DraftProxy();
	}
	
	public static UserBasicInfoDAO getUserBasicInfoDAOInstance(){
		return new UserBasicInfoProxy();
	}
}
