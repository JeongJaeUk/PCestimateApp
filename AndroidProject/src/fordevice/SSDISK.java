package fordevice;
public class SSDISK extends Device{
	public String name = null; // 부품명
	public String madeIn = null; // 제조사
	public String productCategory = null; // 제품 분류
	public String diskType = null; // 디스크 타입
	public String interfaceSSD = null; // 인터페이스
	public String diskCapacity = null; // 디스크 용량
	public String memoryType= null; // 메모리 타입
	public String nandStructure = null; // 낸드 구조
	public String nmProcess = null; // 공정
	public String controller = null; // 컨트롤러
	public String writeSpeed = null; // 쓰기 속도
	public String readSpeed = null; // 읽기 속도
	public String add_UASP = null; // 부가기능_UASP 지원
	public String add_AES = null; // 부가기능_AES 암호화
	public String add_WiFi = null; // 부가기능_Wi-Fi
	public String add_USB = null; // 부가기능_USB 연결 지원
	public String add_3_5Bracket = null; // 부가기능_3.5형 브라켓
	public String add_forMacBookUpgrade = null; // 부가기능_맥북 업그레이드용
	public String add_ONFI = null; // 부가기능_ONFI 적용

	public String sql = null; // sql 문
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

		  name = csvData[0]; // 부품명
		  madeIn = csvData[1]; // 제조사
		  productCategory = csvData[2]; // 제품 분류
		  diskType = csvData[3]; // 디스크 타입
		  interfaceSSD = csvData[4]; // 인터페이스
		  diskCapacity = csvData[5]; // 디스크 용량
		  memoryType= csvData[6]; // 메모리 타입
		  nandStructure = csvData[7]; // 낸드 구조
		  nmProcess = csvData[8]; // 공정
		  controller = csvData[9]; // 컨트롤러
		  writeSpeed = csvData[10]; // 읽기 속도
		  readSpeed = csvData[11]; // 쓰기 속도
		  add_UASP = csvData[12]; // 부가기능_UASP 지원
		  add_AES = csvData[13]; // 부가기능_AES 암호화
		  add_WiFi = csvData[14]; // 부가기능_Wi-Fi
		  add_USB = csvData[15]; // 부가기능_USB 연결 지원
		  add_3_5Bracket = csvData[16]; // 부가기능_3.5형 브라켓
		  add_forMacBookUpgrade = csvData[17]; // 부가기능_맥북 업그레이드용
		  add_ONFI = csvData[18]; // 부가기능_ONFI 적용
	}
	@Override
	public void printElement() {
		// TODO Auto-generated method stub
		
	}
}