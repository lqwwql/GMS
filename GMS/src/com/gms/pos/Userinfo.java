package com.gms.pos;
// Generated 2017-5-21 12:46:56 by Hibernate Tools 5.2.0.Beta1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Userinfo generated by hbm2java
 */
public class Userinfo implements java.io.Serializable {

	private Integer iuserId;
	private Roleinfo roleinfo;
	private String vuserName;
	private String vpassward;
	private String vrealName;
	private Integer ivstate;
	private String vtelephone;
	private String vemail;
	private Integer iidentifierType;
	private String videntifierCode;
	private String videntifierAddress;
	private Date dbirthday;
	private String vcollege;
	private String vaddress;
	private Set filedrentinfos = new HashSet(0);
	private Set competitions = new HashSet(0);
	private Set equipmentrents = new HashSet(0);

	public Userinfo() {
	}

	public Userinfo(Roleinfo roleinfo, String vuserName, String vpassward) {
		this.roleinfo = roleinfo;
		this.vuserName = vuserName;
		this.vpassward = vpassward;
	}

	public Userinfo(Roleinfo roleinfo, String vuserName, String vpassward, String vrealName, Integer ivstate,
			String vtelephone, String vemail, Integer iidentifierType, String videntifierCode,
			String videntifierAddress, Date dbirthday, String vcollege, String vaddress, Set filedrentinfos,
			Set competitions, Set equipmentrents) {
		this.roleinfo = roleinfo;
		this.vuserName = vuserName;
		this.vpassward = vpassward;
		this.vrealName = vrealName;
		this.ivstate = ivstate;
		this.vtelephone = vtelephone;
		this.vemail = vemail;
		this.iidentifierType = iidentifierType;
		this.videntifierCode = videntifierCode;
		this.videntifierAddress = videntifierAddress;
		this.dbirthday = dbirthday;
		this.vcollege = vcollege;
		this.vaddress = vaddress;
		this.filedrentinfos = filedrentinfos;
		this.competitions = competitions;
		this.equipmentrents = equipmentrents;
	}

	public Integer getIuserId() {
		return this.iuserId;
	}

	public void setIuserId(Integer iuserId) {
		this.iuserId = iuserId;
	}

	public Roleinfo getRoleinfo() {
		return this.roleinfo;
	}

	public void setRoleinfo(Roleinfo roleinfo) {
		this.roleinfo = roleinfo;
	}

	public String getVuserName() {
		return this.vuserName;
	}

	public void setVuserName(String vuserName) {
		this.vuserName = vuserName;
	}

	public String getVpassward() {
		return this.vpassward;
	}

	public void setVpassward(String vpassward) {
		this.vpassward = vpassward;
	}

	public String getVrealName() {
		return this.vrealName;
	}

	public void setVrealName(String vrealName) {
		this.vrealName = vrealName;
	}

	public Integer getIvstate() {
		return this.ivstate;
	}

	public void setIvstate(Integer ivstate) {
		this.ivstate = ivstate;
	}

	public String getVtelephone() {
		return this.vtelephone;
	}

	public void setVtelephone(String vtelephone) {
		this.vtelephone = vtelephone;
	}

	public String getVemail() {
		return this.vemail;
	}

	public void setVemail(String vemail) {
		this.vemail = vemail;
	}

	public Integer getIidentifierType() {
		return this.iidentifierType;
	}

	public void setIidentifierType(Integer iidentifierType) {
		this.iidentifierType = iidentifierType;
	}

	public String getVidentifierCode() {
		return this.videntifierCode;
	}

	public void setVidentifierCode(String videntifierCode) {
		this.videntifierCode = videntifierCode;
	}

	public String getVidentifierAddress() {
		return this.videntifierAddress;
	}

	public void setVidentifierAddress(String videntifierAddress) {
		this.videntifierAddress = videntifierAddress;
	}

	public Date getDbirthday() {
		return this.dbirthday;
	}

	public void setDbirthday(Date dbirthday) {
		this.dbirthday = dbirthday;
	}

	public String getVcollege() {
		return this.vcollege;
	}

	public void setVcollege(String vcollege) {
		this.vcollege = vcollege;
	}

	public String getVaddress() {
		return this.vaddress;
	}

	public void setVaddress(String vaddress) {
		this.vaddress = vaddress;
	}

	public Set getFiledrentinfos() {
		return this.filedrentinfos;
	}

	public void setFiledrentinfos(Set filedrentinfos) {
		this.filedrentinfos = filedrentinfos;
	}

	public Set getCompetitions() {
		return this.competitions;
	}

	public void setCompetitions(Set competitions) {
		this.competitions = competitions;
	}

	public Set getEquipmentrents() {
		return this.equipmentrents;
	}

	public void setEquipmentrents(Set equipmentrents) {
		this.equipmentrents = equipmentrents;
	}

}
