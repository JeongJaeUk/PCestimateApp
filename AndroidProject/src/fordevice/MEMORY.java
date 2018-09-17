package fordevice;
public class MEMORY extends Device{
	public String name = null; // 부품명
	public String madeIn = null; // 제조사
	public String productCategory = null; // 제품 분류
	public String usedDevice = null; // 사용 장치
	public String quantity = null; // 패키지
	public String heatSink = null; // 방열판
	public String memoryCapacity= null; // 메모리 용량
	public String operatingClock = null; // 동작 클럭
	public String designPower = null;	 // 필요 전력

	public String sql = null; // sql  문
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

		name = csvData[0]; // 부품명
		madeIn = csvData[1]; //제조사
		productCategory = csvData[2]; // 제품 분류
		usedDevice = csvData[3]; // 사용 장치
		quantity = csvData[4]; // 패키지
		heatSink = csvData[5]; // 방열판
		memoryCapacity= csvData[6]; // 메모리 용량
		operatingClock = csvData[7]; // 동작 클럭
		designPower = csvData[8];	 // 필요 전력

	}
	@Override
	public void printElement() {
		// TODO Auto-generated method stub
		
	}
}