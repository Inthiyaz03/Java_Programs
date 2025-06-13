package com.tap.entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class StudentEntity {
	@Id
	@Column(name = "sid")
	private int sid;
	@Column(name = "sname")
	private String sname;
	@Column(name = "saddress")
	private String saddress;
	@Column(name = "sage")
	private int sage;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sdid")
	private StudentDetails sd;
	
	public StudentDetails getSd() {
		return sd;
	}
	public void setSd(StudentDetails sd) {
		this.sd = sd;
	}
	public StudentEntity() {
    }
	public StudentEntity(int sid, String sname, String saddress, int sage) {
			this.sid = sid;
        this.sname = sname;
        this.saddress = saddress;
        this.sage = sage;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	
	@Override
	public String toString() {
		return "StudentEntity [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", sage=" + sage + ", sd="
				+ sd + "]";
	}

	
	
}
