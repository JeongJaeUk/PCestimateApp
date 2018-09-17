package fordevice;

public class CPU extends Device{
	public String name = null; // ��ǰ��
	public String madeIn = null; // ������
	public String brand = null; // �귣�� �з�
	public String socket = null; // ���� ����
	public String operatingBit = null; // ���� ü��
	public String coreType = null; // �ھ� ����
	public String threadType = null; // ������ ����
	public String operatingSpeed = null; // ���� �ӵ�
	public String manufactureProcess = null; // ���� ����
	public String designPower = null; // �ʿ� ����
	public String packageType = null; // ��Ű�� ����
	public String boolGPU = null; // GPU ����

	public String sql = null; // sql ��
	public CPU() {
	}
	public void getElement() {
	}
	public void setElement(String csvStr) {
		
		String[] csvData = csvStr.split(",\\s");
		
		  name = csvData[0]; // ��ǰ��
		  madeIn = csvData[1]; // ������
		  brand = csvData[2]; // �귣�� �з�
		  socket = csvData[3]; // ���� ����
		  operatingBit = csvData[4]; // ���� ü��
		  coreType = csvData[5]; // �ھ� ����
		  threadType = csvData[6]; // ������ ����
		  operatingSpeed = csvData[7]; // ���� �ӵ�
		  manufactureProcess = csvData[8]; // ���� ����
		  designPower = csvData[9]; // �ʿ� ����
		  packageType = csvData[10]; // ��Ű�� ����
		  boolGPU = csvData[11]; // GPU ����
	}
	public String getSqlCT() {
		sql = "CREATE TABLE CPU(" +
				"name varchar(20) NOT NULL, " +
				"madeIn varchar(20) NOT NULL, " +
				"brand varchar(20) NOT NULL, " +
				"socket varchar(20) NOT NULL, " +
				"operatingBit varchar(20) NOT NULL, " +
				"coreType varchar(20) NOT NULL, " +
				"threadType varchar(20) NOT NULL, " +
				"operatingSpeed varchar(20) NOT NULL, " +
				"manufactureProcess varchar(20) NOT NULL, " +
				"designPower varchar(20) NOT NULL, " +
				"packageType varchar(20) NOT NULL, " +
				"boolGPU varchar(20) NOT NULL, " +
				"PRIMARY KEY(name));";

		return sql;
	}
	public String getSqlInsert() {
		sql = "INSERT INTO CPU (name, madeIn, brand, socket, operatingBit, coreType, threadType, operatingSpeed, manufactureProcess, "
				+ "designPower, packageType, boolGPU) "
				+ "VALUES (" + name + ", " + madeIn + ", " + brand + ", " + socket + ", " + operatingBit + ", " + coreType + ", " + threadType
				+ ", " + operatingSpeed + ", " + manufactureProcess + ", " + designPower + ", " + packageType + ", " + boolGPU + ");";
		return sql;
	}
	@Override
	public void printElement() {
		// TODO Auto-generated method stub
		
	}
}
