package casestudy.UserManagementService.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

@Document(collection = "Userdb")
public class UserSignUp {
	@Id
	@NonNull
	private String user_Id;
	private String user_First_Name;
	private String user_Last_Name;
	private String user_Contact;
	private String password;
	private String confirm_password;
	private String dob;
	private String gender;
	
	public UserSignUp() {
		super();
	}

	public UserSignUp(String user_Id, String user_First_Name, String user_Last_Name, String user_Contact,
			String password, String confirm_password, String dob, String gender) {
		super();
		this.user_Id = user_Id;
		this.user_First_Name = user_First_Name;
		this.user_Last_Name = user_Last_Name;
		this.user_Contact = user_Contact;
		this.password = password;
		this.confirm_password = confirm_password;
		this.dob = dob;
		this.gender = gender;
	}

	public String getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(String user_Id) {
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

	public String getConfirm_password() {
		return confirm_password;
	}

	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "UserSignUp [user_Id=" + user_Id + ", user_First_Name=" + user_First_Name + ", user_Last_Name="
				+ user_Last_Name + ", user_Contact=" + user_Contact + ", password=" + password + ", confirm_password="
				+ confirm_password + ", dob=" + dob + ", gender=" + gender + "]";
	}
	
	
}
