package fordevice;
public class MEMORY extends Device{
	public String name = null; // ��ǰ��
	public String madeIn = null; // ������
	public String productCategory = null; // ��ǰ �з�
	public String usedDevice = null; // ��� ��ġ
	public String quantity = null; // ��Ű��
	public String heatSink = null; // �濭��
	public String memoryCapacity= null; // �޸� �뷮
	public String operatingClock = null; // ���� Ŭ��
	public String designPower = null;	 // �ʿ� ����

	public String sql = null; // sql  ��
	public MEMORY() {
	}
	public String getSqlCT() {
		sql = "CREATE TABLE MEMORY(" +
				"name varchar(20) NOT NULL, " +
				"madeIn varchar(20) NOT NULL, " +
				"productCategory varchar(20) NOT NULL, " +
				"usedDevice varchar(20) NOT NULL, " +
				"quantity varchar(20) NOT NULL, " +
				"heatSink varchar(20) NOT NULL, " +
				"memoryCapacity varchar(20) NOT NULL, " +
				"operatingClock varchar(20) NOT NULL, " +
				"designPower varchar(20) NOT NULL, " +
				"PRIMARY KEY(name));";

		return sql;
	}
	public String getSqlInsert() {
		sql = "INSERT INTO MEMORY (name, madeIn, productCategory, usedDevice, quantity, heatSink, memoryCapacity, operatingClock, designPower) "
				+ "VALUES (" + name + ", " + madeIn + ", " + productCategory + ", " + usedDevice + ", " + quantity + ", " 
				+ heatSink + ", " + memoryCapacity + ", " + operatingClock + ", " + designPower + ");";
		return sql;
	}
	public void getElement() {
		// TODO Auto-generated method stub
		
	}
	public void setElement(String csvStr) {
		// TODO Auto-generated method stub
		String[] csvData = csvStr.split(",\\s");

		name = csvData[0]; // ��ǰ��
		madeIn = csvData[1]; //������
		productCategory = csvData[2]; // ��ǰ �з�
		usedDevice = csvData[3]; // ��� ��ġ
		quantity = csvData[4]; // ��Ű��
		heatSink = csvData[5]; // �濭��
		memoryCapacity= csvData[6]; // �޸� �뷮
		operatingClock = csvData[7]; // ���� Ŭ��
		designPower = csvData[8];	 // �ʿ� ����

	}
	@Override
	public void printElement() {
		// TODO Auto-generated method stub
		
	}
}