package com.icsc.ms.bean;

public class msjcVendorPayBean {
	private int msm01Uid;	//uid
	private int msm00Uid;	//uid
	private String compId;	//公司別
	private String vendorNo;	//供應商編號
	private String adty;	//編碼
	private String areaId;	//部門名稱
	private String postNo;	//郵遞區號
	private String addr;	//地址
	private String addrAll;	//地址
	private String tel;	//電話
	private String fax;	//傳真
	private String vendorEmail;	//email
	private String mobile;	//手機號碼
	private String contact;	//聯絡人
	private String publictType;	//公開招標類別
	private String vendorType;	//供應商屬性
	private String crcy;	//幣別
	private String paidType;	//付款方式
	private String bankCode;	//受款銀行代碼
	private String accountNo;	//受款銀行帳戶
	private String bankName;	//受款銀行名稱
	private String bankAddr;	//受款銀行地址
	public msjcVendorPayBean(){
		 
	}
	public int getMsm01Uid() {
		return msm01Uid;
	}
	public void setMsm01Uid(int msm01Uid) {
		this.msm01Uid = msm01Uid;
	}
	public int getMsm00Uid() {
		return msm00Uid;
	}
	public void setMsm00Uid(int msm00Uid) {
		this.msm00Uid = msm00Uid;
	}
	public String getCompId() {
		return compId;
	}
	public void setCompId(String compId) {
		this.compId = compId;
	}
	public String getVendorNo() {
		return vendorNo;
	}
	public void setVendorNo(String vendorNo) {
		this.vendorNo = vendorNo;
	}
	public String getAdty() {
		return adty;
	}
	public void setAdty(String adty) {
		this.adty = adty;
	}
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getPostNo() {
		return postNo;
	}
	public void setPostNo(String postNo) {
		this.postNo = postNo;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddrAll() {
		return addrAll;
	}
	public void setAddrAll(String addrAll) {
		this.addrAll = addrAll;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getVendorEmail() {
		return vendorEmail;
	}
	public void setVendorEmail(String vendorEmail) {
		this.vendorEmail = vendorEmail;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPublictType() {
		return publictType;
	}
	public void setPublictType(String publictType) {
		this.publictType = publictType;
	}
	public String getVendorType() {
		return vendorType;
	}
	public void setVendorType(String vendorType) {
		this.vendorType = vendorType;
	}
	public String getCrcy() {
		return crcy;
	}
	public void setCrcy(String crcy) {
		this.crcy = crcy;
	}
	public String getPaidType() {
		return paidType;
	}
	public void setPaidType(String paidType) {
		this.paidType = paidType;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankAddr() {
		return bankAddr;
	}
	public void setBankAddr(String bankAddr) {
		this.bankAddr = bankAddr;
	}
	public String toString() {
		return "uid"+msm01Uid 
		+"\n"+ "uid"+msm00Uid 
		+"\n"+ "公司別"+compId 
		+"\n"+ "供應商編號"+vendorNo 
		+"\n"+ "編碼"+adty 
		+"\n"+ "部門名稱"+areaId 
		+"\n"+ "郵遞區號"+postNo 
		+"\n"+ "地址"+addr 
		+"\n"+ "地址"+addrAll 
		+"\n"+ "電話"+tel 
		+"\n"+ "傳真"+fax 
		+"\n"+ "email"+vendorEmail 
		+"\n"+ "手機號碼"+mobile 
		+"\n"+ "聯絡人"+contact 
		+"\n"+ "公開招標類別"+publictType 
		+"\n"+ "供應商屬性"+vendorType 
		+"\n"+ "幣別"+crcy 
		+"\n"+ "付款方式"+paidType 
		+"\n"+ "受款銀行代碼"+bankCode 
		+"\n"+ "受款銀行帳戶"+accountNo 
		+"\n"+ "受款銀行名稱"+bankName 
		+"\n"+ "受款銀行地址"+bankAddr;
	}
}
