package test;

import cn.gduf.brainstorming.model.factory.DAOFactory;
import cn.gduf.brainstorming.model.vo.UsShMj3;
import cn.gduf.brainstorming.model.vo.User;

public class UserBasicInfoDAOTest {

	public static void main(String[] args) throws Exception{
		method1();
		method2();
	}

	private static void method1() throws Exception{
		//根据用户ID显示返回用户学校专业实体类	UsShMj3	String userID
		//u.userName, u.picturePath, u.userEmail, u.introducePath, s.schoolName, m.majorName
		System.out.println("根据用户ID显示返回用户学校专业实体类");
		UsShMj3 usm=DAOFactory.getUserBasicInfoDAOInstance().findInfoByUserID("000000004");
		System.out.println(usm.getUser().getUserName());
		System.out.println(usm.getUser().getPicturePath());
		System.out.println(usm.getUser().getUserEmail());
		System.out.println(usm.getUser().getIntroducePath());
		System.out.println(usm.getSchool().getSchoolName());
		System.out.println(usm.getMajor().getMajorName());
		System.out.println();
	}

	private static void method2() throws Exception{
		//根据User实体修改User用户基本信息	boolean	User user
		//userName = ? AND userEmail = ? AND schoolID = ? AND majorID = ?"
		//+ " WHERE userID = ?";
		User u=new User();
		u.setUserName("改改改");
		u.setUserEmail("@");
		u.setShoolID("00001");
		u.setMajorID("0003");
		u.setUserID("000000013");
		System.out.println(DAOFactory.getUserBasicInfoDAOInstance().modifyInfo(u));
	}

}
