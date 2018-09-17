package fordevice;
public class COMPUTERCASE extends Device{
	public String name = null; // ��ǰ��
	public String madeIn = null; // ������
	public String productCategory = null; // ��ǰ �з�
	public String caseSize = null; // ���̽� ũ��
	public String supportPowerSpecification = null; // ���� �Ŀ� �԰�
	public String sBS_Extended_ATX = null; // ���� ���� �԰�_Extended-ATX
	public String sBS_Standard_ATX = null; // ���� ���� �԰�_ǥ��-ATX
	public String sBS_Micro_ATX = null; // ���� ���� �԰�_Micro-ATX
	public String sBS_Flex_ATX = null; // ���� ���� �԰�_Flex-ATX
	public String sBS_Standard_BTX = null; // ���� ���� �԰�_ǥ��-BTX
	public String sBS_Micro_BTX = null; // ���� ���� �԰�_Micro-BTX
	public String sBS_Standard_ITX = null; // ���� ���� �԰�_ǥ��-ITX
	public String sBS_Mini_ITX = null; // ���� ���� �԰�_Mini-ITX
	public String sddOnlyBay = null; // SDD ���� ����
	public String VGASize = null; // �׷��� ī�� ����
	public String CPUCoolerSize = null; // CPU �� ����
	public String IntegralWaterCooler = null; // ��ü�� ���� ��
	
	public String sql = null; // sql ��
	public COMPUTERCASE() {
		
	}
	public String getSqlCT() {
		sql = "CREATE TABLE COMPUTERCASE(" +
				"name varchar(20) NOT NULL, " +
				"madeIn varchar(20) NOT NULL, " +
				"productCategory varchar(20) NOT NULL, " +
				"caseSize varchar(20) NOT NULL, " +
				"supportPowerSpecification varchar(20) NOT NULL, " +
				"sBS_Extended_ATX varchar(20) NOT NULL, " +
				"sBS_Standard_ATX varchar(20) NOT NULL, " +
				"sBS_Micro_ATX varchar(20) NOT NULL, " +
				"sBS_Flex_ATX varchar(20) NOT NULL, " +
				"sBS_Standard_BTX varchar(20) NOT NULL, " +
				"sBS_Micro_BTX varchar(20) NOT NULL, " +
				"sBS_Standard_ITX varchar(20) NOT NULL, " +
				"sBS_Mini_ITX varchar(20) NOT NULL, " +
				"sddOnlyBay varchar(20) NOT NULL, " +
				"VGASize varchar(20) NOT NULL, " +
				"CPUCoolerSize varchar(20) NOT NULL, " +
				"IntegralWaterCooler varchar(20) NOT NULL, " +
				"PRIMARY KEY(name));";
		return sql;
	}
	public String getSqlInsert() {
		sql = "INSERT INTO COMPUTERCASE (name, madeIn, productCategory, caseSize, supportPowerSpecification, sBS_Extended_ATX, sBS_Standard_ATX, "
				+ "sBS_Micro_ATX, sBS_Flex_ATX, sBS_Standard_BTX, sBS_Micro_BTX, sBS_Standard_ITX, sBS_Mini_ITX, sddOnlyBay, VGASize,"
				+ "CPUCoolerSize, IntegralWaterCooler) "
				+ "VALUES (" + name + ", " + madeIn + ", " + productCategory + ", " + caseSize + ", " + supportPowerSpecification + ", "
				+ sBS_Extended_ATX + ", " + sBS_Standard_ATX + ", " + sBS_Micro_ATX + ", " + sBS_Flex_ATX + ", " + sBS_Standard_BTX + ", "
				+ sBS_Micro_BTX + ", " + sBS_Standard_ITX + "," + sBS_Mini_ITX + "," + sddOnlyBay + "," + VGASize + "," + CPUCoolerSize + ","
				+ IntegralWaterCooler + ");";
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
		  caseSize = csvData[3]; // ���̽� ũ��
		  supportPowerSpecification = csvData[4]; // ���� �Ŀ� �԰�
		  sBS_Extended_ATX = csvData[5]; // ���� ���� �԰�_Extended-ATX
		  sBS_Standard_ATX = csvData[6]; // ���� ���� �԰�_ǥ��-ATX
		  sBS_Micro_ATX = csvData[7]; // ���� ���� �԰�_Micro-ATX
		  sBS_Flex_ATX = csvData[8]; // ���� ���� �԰�_Flex-ATX
		  sBS_Standard_BTX = csvData[9]; // ���� ���� �԰�_ǥ��-BTX
		  sBS_Micro_BTX = csvData[10]; // ���� ���� �԰�_Micro-BTX
		  sBS_Standard_ITX = csvData[11]; // ���� ���� �԰�_ǥ��-ITX
		  sBS_Mini_ITX = csvData[12]; // ���� ���� �԰�_Mini-ITX
		  sddOnlyBay = csvData[13]; // SDD ���� ����
		  VGASize = csvData[14]; // �׷��� ī�� ����
		  CPUCoolerSize = csvData[15]; // CPU �� ����
		  IntegralWaterCooler = csvData[16]; // ��ü�� ���� ��

	}
	@Override
	public void printElement() {
		// TODO Auto-generated method stub
		System.out.println(name + ", " + madeIn + ", " + productCategory + ", " + caseSize + ", " + supportPowerSpecification 
				+ ", " + sBS_Extended_ATX + ", " + sBS_Standard_ATX + ", " + sBS_Micro_ATX + ", " + sBS_Flex_ATX
				+ ", " + sBS_Standard_BTX + ", " + sBS_Micro_BTX + ", " + sBS_Standard_ITX + ", " + sBS_Mini_ITX
				+ ", " + sddOnlyBay + ", " + VGASize + ", " + CPUCoolerSize + ", " + IntegralWaterCooler);
	}
	
}