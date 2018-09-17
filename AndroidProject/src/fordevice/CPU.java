package fordevice;

public class CPU extends Device{
	public String name = null; // 부품명
	public String madeIn = null; // 제조사
	public String brand = null; // 브랜드 분류
	public String socket = null; // 소켓 구분
	public String operatingBit = null; // 연산 체계
	public String coreType = null; // 코어 형태
	public String threadType = null; // 쓰레드 형태
	public String operatingSpeed = null; // 동작 속도
	public String manufactureProcess = null; // 제조 공정
	public String designPower = null; // 필요 전력
	public String packageType = null; // 패키지 형태
	public String boolGPU = null; // GPU 유무

	public String sql = null; // sql 문
	public CPU() {
	}
	public void getElement() {
	}
	public void setElement(String csvStr) {
		
		String[] csvData = csvStr.split(",\\s");
		
		  name = csvData[0]; // 부품명
		  madeIn = csvData[1]; // 제조사
		  brand = csvData[2]; // 브랜드 분류
		  socket = csvData[3]; // 소켓 구분
		  operatingBit = csvData[4]; // 연산 체계
		  coreType = csvData[5]; // 코어 형태
		  threadType = csvData[6]; // 쓰레드 형태
		  operatingSpeed = csvData[7]; // 동작 속도
		  manufactureProcess = csvData[8]; // 제조 공정
		  designPower = csvData[9]; // 필요 전력
		  packageType = csvData[10]; // 패키지 형태
		  boolGPU = csvData[11]; // GPU 유무
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
