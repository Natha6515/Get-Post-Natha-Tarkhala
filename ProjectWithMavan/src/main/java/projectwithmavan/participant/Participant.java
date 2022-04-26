package projectwithmavan.participant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="participants_details")
public class Participant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="pname",nullable=false,length=50)
	private String uname;
	
	@Column(name="plname",nullable=false,length=50)
	private String lname;
	
	@Column(name="pmobno",nullable=false,length=50)
	private String mobno;
	
	@Column(name="pcity",length=50)
	private String city;
	
	@Column(name="ppass",nullable=false,length=50)
	private String password;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Participant(int id, String uname, String lname, String mobno, String city, String password) {
		super();
		this.id = id;
		this.uname = uname;
		this.lname = lname;
		this.mobno = mobno;
		this.city = city;
		this.password = password;
	}
	public Participant() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getUname() + " " + getLname();
	}

	

	
}
