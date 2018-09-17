package fordevice;
public class SSDISK extends Device{
	public String name = null; // ��ǰ��
	public String madeIn = null; // ������
	public String productCategory = null; // ��ǰ �з�
	public String diskType = null; // ��ũ Ÿ��
	public String interfaceSSD = null; // �������̽�
	public String diskCapacity = null; // ��ũ �뷮
	public String memoryType= null; // �޸� Ÿ��
	public String nandStructure = null; // ���� ����
	public String nmProcess = null; // ����
	public String controller = null; // ��Ʈ�ѷ�
	public String writeSpeed = null; // ���� �ӵ�
	public String readSpeed = null; // �б� �ӵ�
	public String add_UASP = null; // �ΰ����_UASP ����
	public String add_AES = null; // �ΰ����_AES ��ȣȭ
	public String add_WiFi = null; // �ΰ����_Wi-Fi
	public String add_USB = null; // �ΰ����_USB ���� ����
	public String add_3_5Bracket = null; // �ΰ����_3.5�� �����
	public String add_forMacBookUpgrade = null; // �ΰ����_�ƺ� ���׷��̵��
	public String add_ONFI = null; // �ΰ����_ONFI ����

	public String sql = null; // sql ��
	public SSDISK() {
	}
	public String getSqlCT() {
		sql = "CREATE TABLE SSDISK(" +
				"name varchar(20) NOT NULL, " +
				"madeIn varchar(20) NOT NULL, " +
				"productCategory varchar(20) NOT NULL, " +
				"diskType varchar(20) NOT NULL, " +
				"interfaceSSD varchar(20) NOT NULL, " +
				"diskCapacity varchar(20) NOT NULL, " +
				"memoryType varchar(20) NOT NULL, " +
				"nandStructure varchar(20) NOT NULL, " +
				"nmProcess varchar(20) NOT NULL, " +
				"controller varchar(20) NOT NULL, " +
				"writeSpeed varchar(20) NOT NULL, " +
				"readSpeed varchar(20) NOT NULL, " +
				"add_UASP  varchar(20) NOT NULL, " +
				"add_AES  varchar(20) NOT NULL, " +
				"add_WiFi  varchar(20) NOT NULL, " +
				"add_USB  varchar(20) NOT NULL, " +
				"add_3_5Bracket  varchar(20) NOT NULL, " +
				"add_forMacBookUpgrade  varchar(20) NOT NULL, " +
				"add_ONFI  varchar(20) NOT NULL, " +
				"PRIMARY KEY(name));";

		return sql;
	}
	public String getSqlInsert() {
		sql = "INSERT INTO SSDISK (name, madeIn, productCategory, diskType, interfaceSSD, diskCapacity, memoryType, nandStructure"
				+ ", nmProcess, controller, writeSpeed, readSpeed, add_UASP, add_AES, add_WiFi, add_USB, add_3_5Bracket, add_forMacBookUpgrade"
				+ ", add_ONFI) "
				+ "VALUES (" + name + ", " + madeIn + ", " + productCategory + ", " + diskType + ", " + interfaceSSD + ", " 
				+ diskCapacity + ", " + memoryType + ", " + nandStructure + ", " + nmProcess + ", " + controller + ", "
				+ writeSpeed + ", " + readSpeed + ", " + add_UASP + ", " + add_AES + ", " + add_WiFi + ", " + add_USB + ", " 
				+ add_3_5Bracket + ", " + add_forMacBookUpgrade + ", " + add_ONFI + ");";
		return sql;
	}
	public void getElement() {
		
	}
	public void setElement(String csvStr) {
		// TODO Auto-generated method stub
		String[] csvData = csvStr.split(",\\s");

		  name = csvData[0]; // ��ǰ��
		  madeIn = csvData[1]; // ������
		  productCategory = csvData[2]; // ��ǰ �з�
		  diskType = csvData[3]; // ��ũ Ÿ��
		  interfaceSSD = csvData[4]; // �������̽�
		  diskCapacity = csvData[5]; // ��ũ �뷮
		  memoryType= csvData[6]; // �޸� Ÿ��
		  nandStructure = csvData[7]; // ���� ����
		  nmProcess = csvData[8]; // ����
		  controller = csvData[9]; // ��Ʈ�ѷ�
		  writeSpeed = csvData[10]; // �б� �ӵ�
		  readSpeed = csvData[11]; // ���� �ӵ�
		  add_UASP = csvData[12]; // �ΰ����_UASP ����
		  add_AES = csvData[13]; // �ΰ����_AES ��ȣȭ
		  add_WiFi = csvData[14]; // �ΰ����_Wi-Fi
		  add_USB = csvData[15]; // �ΰ����_USB ���� ����
		  add_3_5Bracket = csvData[16]; // �ΰ����_3.5�� �����
		  add_forMacBookUpgrade = csvData[17]; // �ΰ����_�ƺ� ���׷��̵��
		  add_ONFI = csvData[18]; // �ΰ����_ONFI ����
	}
	@Override
	public void printElement() {
		// TODO Auto-generated method stub
		
	}
}