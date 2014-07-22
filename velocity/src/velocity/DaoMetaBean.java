package velocity;

import java.util.ArrayList;

public class DaoMetaBean {
	/**
	 * @return the myProject
	 */
	public String getMyProject() {
		return myProject;
	}

	/**
	 * @param myProject the myProject to set
	 */
	public void setMyProject(String myProject) {
		this.myProject = myProject;
	}

	/**
	 * @return the myTable
	 */
	public String getMyTable() {
		return myTable;
	}

	/**
	 * @param myTable the myTable to set
	 */
	public void setMyTable(String myTable) {
		this.myTable = myTable;
	}

	/**
	 * @return the myPackage
	 */
	public String getMyPackage() {
		return myPackage;
	}

	/**
	 * @param myPackage the myPackage to set
	 */
	public void setMyPackage(String myPackage) {
		this.myPackage = myPackage;
	}

	/**
	 * @return the myImport
	 */
	public String getMyImport() {
		return myImport;
	}

	/**
	 * @param myImport the myImport to set
	 */
	public void setMyImport(String myImport) {
		this.myImport = myImport;
	}

	/**
	 * @return the myEntity
	 */
	public String getMyEntity() {
		return myEntity;
	}

	/**
	 * @param myEntity the myEntity to set
	 */
	public void setMyEntity(String myEntity) {
		this.myEntity = myEntity;
	}

	/**
	 * @return the myAuthor
	 */
	public String getMyAuthor() {
		return myAuthor;
	}

	/**
	 * @param myAuthor the myAuthor to set
	 */
	public void setMyAuthor(String myAuthor) {
		this.myAuthor = myAuthor;
	}

	/**
	 * @return the myDescript
	 */
	public String getMyDescript() {
		return myDescript;
	}

	/**
	 * @param myDescript the myDescript to set
	 */
	public void setMyDescript(String myDescript) {
		this.myDescript = myDescript;
	}

	/**
	 * @return the myVersion
	 */
	public String getMyVersion() {
		return myVersion;
	}

	/**
	 * @param myVersion the myVersion to set
	 */
	public void setMyVersion(String myVersion) {
		this.myVersion = myVersion;
	}

	/**
	 * @return the myOrderBy
	 */
	public String getMyOrderBy() {
		return myOrderBy;
	}

	/**
	 * @param myOrderBy the myOrderBy to set
	 */
	public void setMyOrderBy(String myOrderBy) {
		this.myOrderBy = myOrderBy;
	}

	/**
	 * @return the myDatabase
	 */
	public String getMyDatabase() {
		return myDatabase;
	}

	/**
	 * @param myDatabase the myDatabase to set
	 */
	public void setMyDatabase(String myDatabase) {
		this.myDatabase = myDatabase;
	}

	/**
	 * @return the daoFieldBeans
	 */
	public ArrayList<DaoFieldBean> getDaoFieldBeans() {
		return daoFieldBeans;
	}

	/**
	 * @param daoFieldBeans the daoFieldBeans to set
	 */
	public void setDaoFieldBeans(ArrayList<DaoFieldBean> daoFieldBeans) {
		this.daoFieldBeans = daoFieldBeans;
	}

	private String myProject; 
	private String myTable;
	private String myPackage;
	private String myImport;
	private String myEntity;
	private String myAuthor;
	private String myDescript;
	private String myVersion;
	private String myOrderBy;
	private String myDatabase;

	private ArrayList<DaoFieldBean> daoFieldBeans;
}
