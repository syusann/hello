package com.icsc.ms.bean;

public class msjcVendorBean {
	private int msm00Uid;	//uid
	private String compId;	//公司別
	private String vendorNo;	//供應商編號
	private String countryId;	//國別
	private String chnName;	//中文供應商名稱
	private String engName;	//英文供應商名稱
	private String abbrevName;	//公司簡稱
	private String invoiceType;	//開發票通知方式
	private String status;	//供應商狀態
	private String dataType;	//廠商屬性
	private String newVendorNo;	//新廠商編號
	private String respDept;	//資料所屬
	private String mailId;	//電子郵件帳號
	private boolean isReject;	//目前是否停權
	private String rejUpdDate;	//停權更新日
	private String rejCode;	//停權狀態
	private String rejStartDate;	//停權起始日
	private String rejEndDate;	//停權結束日
	private String rejReason;	//停權說明
	private String rejPoNo;	//違約案號
	private String postNo;	//郵遞區號
	private String addr;	//地址
	private String addrAll;	//地址
	private String tel;	//電話
	private String fax;	//傳真
	private String vendorEmail;	//email
	private String contact;	//聯絡人
	private String crcy;	//幣別
	private String paidType;	//付款方式
	private String bankCode;	//受款銀行代碼
	private String accountNo;	//受款銀行帳戶
	public msjcVendorBean(){
		
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
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getChnName() {
		return chnName;
	}
	public void setChnName(String chnName) {
		this.chnName = chnName;
	}
	public String getEngName() {
		return engName;
	}
	public void setEngName(String engName) {
		this.engName = engName;
	}
	public String getAbbrevName() {
		return abbrevName;
	}
	public void setAbbrevName(String abbrevName) {
		this.abbrevName = abbrevName;
	}
	public String getInvoiceType() {
		return invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public String getNewVendorNo() {
		return newVendorNo;
	}
	public void setNewVendorNo(String newVendorNo) {
		this.newVendorNo = newVendorNo;
	}
	public String getRespDept() {
		return respDept;
	}
	public void setRespDept(String respDept) {
		this.respDept = respDept;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public boolean isReject() {
		return isReject;
	}
	public void setReject(boolean isReject) {
		this.isReject = isReject;
	}
	public String getRejUpdDate() {
		return rejUpdDate;
	}
	public void setRejUpdDate(String rejUpdDate) {
		this.rejUpdDate = rejUpdDate;
	}
	public String getRejCode() {
		return rejCode;
	}
	public void setRejCode(String rejCode) {
		this.rejCode = rejCode;
	}
	public String getRejStartDate() {
		return rejStartDate;
	}
	public void setRejStartDate(String rejStartDate) {
		this.rejStartDate = rejStartDate;
	}
	public String getRejEndDate() {
		return rejEndDate;
	}
	public void setRejEndDate(String rejEndDate) {
		this.rejEndDate = rejEndDate;
	}
	public String getRejReason() {
		return rejReason;
	}
	public void setRejReason(String rejReason) {
		this.rejReason = rejReason;
	}
	public String getRejPoNo() {
		return rejPoNo;
	}
	public void setRejPoNo(String rejPoNo) {
		this.rejPoNo = rejPoNo;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
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
	public String toString() {
		return "uid"+msm00Uid 
		+"\n"+ "公司別"+compId 
		+"\n"+ "供應商編號"+vendorNo 
		+"\n"+ "國別"+countryId 
		+"\n"+ "中文供應商名稱"+chnName 
		+"\n"+ "英文供應商名稱"+engName 
		+"\n"+ "公司簡稱"+abbrevName 
		+"\n"+ "開發票通知方式"+invoiceType 
		+"\n"+ "供應商狀態"+status 
		+"\n"+ "廠商屬性"+dataType 
		+"\n"+ "新廠商編號"+newVendorNo 
		+"\n"+ "資料所屬"+respDept 
		+"\n"+ "電子郵件帳號"+mailId 
		+"\n"+ "目前是否停權"+isReject 
		+"\n"+ "停權更新日"+rejUpdDate 
		+"\n"+ "停權狀態"+rejCode 
		+"\n"+ "停權起始日"+rejStartDate 
		+"\n"+ "停權結束日"+rejEndDate 
		+"\n"+ "停權說明"+rejReason 
		+"\n"+ "違約案號"+rejPoNo 
		+"\n"+ "郵遞區號"+postNo 
		+"\n"+ "地址"+addr 
		+"\n"+ "地址"+addrAll 
		+"\n"+ "電話"+tel 
		+"\n"+ "傳真"+fax 
		+"\n"+ "email"+vendorEmail 
		+"\n"+ "聯絡人"+contact 
		+"\n"+ "幣別"+crcy 
		+"\n"+ "付款方式"+paidType 
		+"\n"+ "受款銀行代碼"+bankCode 
		+"\n"+ "受款銀行帳戶"+accountNo;
	}
}
