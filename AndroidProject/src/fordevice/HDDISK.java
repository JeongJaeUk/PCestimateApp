package fordevice;

public class HDDISK extends Device{
	public String name = null; // 부품명
	public String madeIn = null; // 제조사
	public String productCategory = null; // 제품 분류
	public String diskCapacity = null; // 디스크 용량
	public String interfaceHDD = null; // 인터페이스
	public String RPM = null; // 회전수
	public String bufferCapacity = null; // 버퍼 용량
	public String diskSize = null; // 디스크 크기

	public String sql = null; // sql문
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


		  name = csvData[0]; // 부품명
		  madeIn = csvData[1]; // 제조사
		  productCategory = csvData[2]; // 제품 분류
		  diskCapacity = csvData[3]; // 디스크 용량
		  interfaceHDD = csvData[4]; // 인터페이스
		  RPM = csvData[5]; // 회전수
		  bufferCapacity = csvData[6]; // 버퍼 용량
		  diskSize = csvData[7]; // 디스크 크기

	}
	@Override
	public void printElement() {
		// TODO Auto-generated method stub
		
	}
}