package fordevice;

public class HDDISK extends Device{
	public String name = null; // ��ǰ��
	public String madeIn = null; // ������
	public String productCategory = null; // ��ǰ �з�
	public String diskCapacity = null; // ��ũ �뷮
	public String interfaceHDD = null; // �������̽�
	public String RPM = null; // ȸ����
	public String bufferCapacity = null; // ���� �뷮
	public String diskSize = null; // ��ũ ũ��

	public String sql = null; // sql��
	public HDDISK() {
		
	}
	public String getSqlCT() {
		sql = "CREATE TABLE HDDISK(" +
				"name varchar(20) NOT NULL, " +
				"madeIn varchar(20) NOT NULL, " +
				"productCategory varchar(20) NOT NULL, " +
				"diskCapacity varchar(20) NOT NULL, " +
				"interfaceHDD varchar(20) NOT NULL, " +
				"RPM varchar(20) NOT NULL, " +
				"bufferCapacity varchar(20) NOT NULL, " +
				"diskSize varchar(20) NOT NULL, " +
				"PRIMARY KEY(name));";
		return sql;
	}
	public String getSqlInsert() {
		sql = "INSERT INTO HDDISK (name, madeIn, productCategory, diskCapacity, interfaceHDD, RPM, bufferCapacity, diskSize) "
				+ "VALUES (" + name + ", " + madeIn + ", " + productCategory + ", " + diskCapacity + ", " + interfaceHDD + ", "
				+ RPM + ", " + bufferCapacity + ", " + diskSize + ");";
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
		  diskCapacity = csvData[3]; // ��ũ �뷮
		  interfaceHDD = csvData[4]; // �������̽�
		  RPM = csvData[5]; // ȸ����
		  bufferCapacity = csvData[6]; // ���� �뷮
		  diskSize = csvData[7]; // ��ũ ũ��

	}
	@Override
	public void printElement() {
		// TODO Auto-generated method stub
		
	}
}