package pack1;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")

public class User
{
	@Id //primary key
	@Column(name="userid")
	int userid;
	
	@Column(name="username")
	String username;
	@Column(name="firstname")
	String firstname;
	@Column(name="lastname")
	String lastname;
	
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getFirstname()
	{
		return firstname;
	}
	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}
	public String getLastname() 
	{
		return lastname;
	}
	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}
	
	public User(String username, String firstname, String lastname)
	{
		//super();
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public User() 
	{
		
	}
	
	
	
	

}