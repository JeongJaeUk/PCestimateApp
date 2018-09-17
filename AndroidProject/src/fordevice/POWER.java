package fordevice;
public class POWER extends Device{
	public String name = null; // ºÎÇ°¸í
	public String madeIn = null; // Á¦Á¶»ç
	public String productCategory = null; // Á¦Ç° ºÐ·ù
	public String ratedOutput = null; // Á¤°Ý Ãâ·Â
	public String NotationOutput = null; // Ç¥±â Ãâ·Â
	public String mainPowerConnector = null; // ¸ÞÀÎ Àü¿ø Ä¿³ØÅÍ 
	public String coolingFanSize = null; // Äð¸µÆÒ Å©±â
	public String aC_Auxiliary8Pins_4_Plus_4 = null; // º¸Á¶ Ä¿³ØÅÍ_º¸Á¶ 8ÇÉ(4+4) Ä¿³ØÅÍ
	public String aC_Auxiliary8Pins = null; // º¸Á¶ Ä¿³ØÅÍ_º¸Á¶ 8ÇÉ Ä¿³ØÅÍ
	public String aC_Auxiliary4Pins = null; // º¸Á¶ Ä¿³ØÅÍ_º¸Á¶ 4ÇÉ Ä¿³ØÅÍ
	public String aC_FDD = null; // º¸Á¶ Ä¿³ØÅÍ_FDD Ä¿³ØÅÍ
	public String AMDCertifications = null; // ÀÎÁõ»çÇ×
	public String PLUS80Certification = null; // 80PLUSÀÎÁõ
	
	public String sql = null; // sql ¹®
	public POWER() {
	}
	public String getSqlCT() {
		sql = "CREATE TABLE POWER(" +
				"name varchar(20) NOT NULL, " +
				"madeIn varchar(20) NOT NULL, " +
				"productCategory varchar(20) NOT NULL, " +
				"ratedOutput varchar(20) NOT NULL, " +
				"NotationOutput varchar(20) NOT NULL, " +
				"mainPowerConnector varchar(20) NOT NULL, " +
				"coolingFanSize varchar(20) NOT NULL, " +
				"aC_Auxiliary8Pins_4_Plus_4 varchar(20) NOT NULL, " +
				"aC_Auxiliary8Pins varchar(20) NOT NULL, " +
				"aC_Auxiliary4Pins varchar(20) NOT NULL, " +
				"aC_FDD varchar(20) NOT NULL, " +
				"AMDCertifications varchar(20) NOT NULL, " +
				"PLUS80Certification varchar(20) NOT NULL, " +
				"PRIMARY KEY(name));";

		return sql;
	}
	public String getSqlInsert() {
		sql = "INSERT INTO POWER (name, madeIn, productCategory, ratedOutput, NotationOutput, mainPowerConnector, coolingFanSize"
				+ ", aC_Auxiliary8Pins_4_Plus_4, aC_Auxiliary8Pins, aC_Auxiliary4Pins, aC_FDD, AMDCertifications, PLUS80Certification) "
				+ "VALUES (" + name + ", " + madeIn + ", " + productCategory + ", " + ratedOutput + ", " + NotationOutput + ", " 
				+ mainPowerConnector + ", " + coolingFanSize + ", " + aC_Auxiliary8Pins_4_Plus_4 + ", " + aC_Auxiliary8Pins + ", " 
				+ aC_Auxiliary4Pins + ", "	+ aC_FDD + ", " + AMDCertifications + ", " + PLUS80Certification+ ");";
		return sql;
	}
	public void getElement() {
		// TODO Auto-generated method stub
		
	}
	public void setElement(String csvStr) {
		// TODO Auto-generated method stub
		String[] csvData = csvStr.split(",\\s");

		  name = csvData[0]; // ºÎÇ°¸í
		  madeIn = csvData[1]; // Á¦Á¶»ç
		  productCategory = csvData[2]; // Á¦Ç° ºÐ·ù
		  ratedOutput = csvData[3]; // Á¤°Ý Ãâ·Â
		  NotationOutput = csvData[4]; // Ç¥±â Ãâ·Â
		  mainPowerConnector = csvData[5]; // ¸ÞÀÎ Àü¿ø Ä¿³ØÅÍ 
		  coolingFanSize = csvData[6]; // Äð¸µÆÒ Å©±â
		  aC_Auxiliary8Pins_4_Plus_4 = csvData[7]; // º¸Á¶ Ä¿³ØÅÍ_º¸Á¶ 8ÇÉ(4+4) Ä¿³ØÅÍ
		  aC_Auxiliary8Pins = csvData[8]; // º¸Á¶ Ä¿³ØÅÍ_º¸Á¶ 8ÇÉ Ä¿³ØÅÍ
		  aC_Auxiliary4Pins = csvData[9]; // º¸Á¶ Ä¿³ØÅÍ_º¸Á¶ 4ÇÉ Ä¿³ØÅÍ
		  aC_FDD = csvData[10]; // º¸Á¶ Ä¿³ØÅÍ_FDD Ä¿³ØÅÍ
		  AMDCertifications = csvData[11]; // ÀÎÁõ»çÇ×
		  PLUS80Certification = csvData[12]; // 80PLUSÀÎÁõ
	}
	@Override
	public void printElement() {
		// TODO Auto-generated method stub
		
	}
}