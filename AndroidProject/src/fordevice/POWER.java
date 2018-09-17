package fordevice;
public class POWER extends Device{
	public String name = null; // ��ǰ��
	public String madeIn = null; // ������
	public String productCategory = null; // ��ǰ �з�
	public String ratedOutput = null; // ���� ���
	public String NotationOutput = null; // ǥ�� ���
	public String mainPowerConnector = null; // ���� ���� Ŀ���� 
	public String coolingFanSize = null; // ���� ũ��
	public String aC_Auxiliary8Pins_4_Plus_4 = null; // ���� Ŀ����_���� 8��(4+4) Ŀ����
	public String aC_Auxiliary8Pins = null; // ���� Ŀ����_���� 8�� Ŀ����
	public String aC_Auxiliary4Pins = null; // ���� Ŀ����_���� 4�� Ŀ����
	public String aC_FDD = null; // ���� Ŀ����_FDD Ŀ����
	public String AMDCertifications = null; // ��������
	public String PLUS80Certification = null; // 80PLUS����
	
	public String sql = null; // sql ��
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

		  name = csvData[0]; // ��ǰ��
		  madeIn = csvData[1]; // ������
		  productCategory = csvData[2]; // ��ǰ �з�
		  ratedOutput = csvData[3]; // ���� ���
		  NotationOutput = csvData[4]; // ǥ�� ���
		  mainPowerConnector = csvData[5]; // ���� ���� Ŀ���� 
		  coolingFanSize = csvData[6]; // ���� ũ��
		  aC_Auxiliary8Pins_4_Plus_4 = csvData[7]; // ���� Ŀ����_���� 8��(4+4) Ŀ����
		  aC_Auxiliary8Pins = csvData[8]; // ���� Ŀ����_���� 8�� Ŀ����
		  aC_Auxiliary4Pins = csvData[9]; // ���� Ŀ����_���� 4�� Ŀ����
		  aC_FDD = csvData[10]; // ���� Ŀ����_FDD Ŀ����
		  AMDCertifications = csvData[11]; // ��������
		  PLUS80Certification = csvData[12]; // 80PLUS����
	}
	@Override
	public void printElement() {
		// TODO Auto-generated method stub
		
	}
}