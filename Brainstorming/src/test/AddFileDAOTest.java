package test;

import java.sql.SQLException;
import java.util.List;

import java.util.Iterator;

import cn.gduf.brainstorming.model.factory.DAOFactory;
import cn.gduf.brainstorming.model.vo.Addfile;

public class AddFileDAOTest {

	public static void main(String[] args) throws SQLException {
		/*
		 * 添加附件:insert into addfile(fileID,filePath,articleID) values(?,?,?)
		 */
		Addfile addfile=new Addfile();
		addfile.setFileID("0000000006");
		addfile.setFilePath("jisi/aaa/a1/fujian3");
		addfile.setArticleID("0000000001");
		boolean flag=DAOFactory.getAddFileDAOInstance().createAddfile(addfile);
		System.out.println(flag);
		
		/*
		 * 显示附件(查出来自同一帖子的附件，条件articleID，显示出附件名称，附件上传时间)
		 * select fileID,filePath,saveTime from addfile where articleID=?
		 */
		Addfile addfile2=new Addfile();
		addfile2.setArticleID("0000000003");
		List<Addfile> list=DAOFactory.getAddFileDAOInstance().showAddfile(addfile2);
		Iterator<Addfile> it=list.iterator();
		while(it.hasNext()){
			Addfile addfile3=it.next();
			System.out.println(addfile3.getFileID());
			System.out.println(addfile3.getFilePath());
			System.out.println(addfile3.getSaveTime());
			
		}
	}

}
