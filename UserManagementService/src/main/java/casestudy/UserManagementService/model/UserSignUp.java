package casestudy.UserManagementService.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

@Document(collection = "Userdb")
public class UserSignUp {
	@Id
	@NonNull
	private int user_Id;
	private String user_First_Name;
	private String user_Last_Name;
	private String user_Contact;
	private String password;
	public UserSignUp(int user_Id, String user_First_Name, String user_Last_Name, String user_Contact,
			String password) {
		super();
		this.user_Id = user_Id;
		this.user_First_Name = user_First_Name;
		this.user_Last_Name = user_Last_Name;
		this.user_Contact = user_Contact;
		this.password = password;
	}
	
	
	public UserSignUp() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getUser_Id() {
		return user_Id;
	}


	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}


	public String getUser_First_Name() {
		return user_First_Name;
	}


	public void setUser_First_Name(String user_First_Name) {
		this.user_First_Name = user_First_Name;
	}


	public String getUser_Last_Name() {
		return user_Last_Name;
	}


	public void setUser_Last_Name(String user_Last_Name) {
		this.user_Last_Name = user_Last_Name;
	}


	public String getUser_Contact() {
		return user_Contact;
	}


	public void setUser_Contact(String user_Contact) {
		this.user_Contact = user_Contact;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "UserSignUp [user_Id=" + user_Id + ", user_First_Name=" + user_First_Name + ", user_Last_Name="
				+ user_Last_Name + ", user_Contact=" + user_Contact + ", password=" + password + "]";
	}

	
	
	
}
