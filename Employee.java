package org.oar.emp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="employee2")
public class Employee {
	
	@Id
	@Column(name="ename")
	private String ename;
	@Column(name="ecode")
	private String ecode;
	@Column(name="email")
	private String email;
	@Column(name="cno")
	private Long cno;
	@Column(name="rm")
	private String rm ;
	@Column(name="status")
	private String status;
	@Column(name="doj")
	private String doj;
	@Column(name="dor")
	private String dor;
	
	public Employee()
	{
		
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEcode() {
		return ecode;
	}

	public void setEcode(String ecode) {
		this.ecode = ecode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getCno() {
		return cno;
	}

	public void setCno(Long cno) {
		this.cno = cno;
	}

	public String getRm() {
		return rm;
	}

	public void setRm(String rm) {
		this.rm = rm;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getDor() {
		return dor;
	}

	public void setDor(String dor) {
		this.dor = dor;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", ecode=" + ecode + ", email=" + email + ", cno=" + cno + ", rm=" + rm
				+ ", status=" + status + ", doj=" + doj + ", dor=" + dor + "]";
	}

	
}
