package fordevice;
public class COMPUTERCASE extends Device{
	public String name = null; // 부품명
	public String madeIn = null; // 제조사
	public String productCategory = null; // 제품 분류
	public String caseSize = null; // 케이스 크기
	public String supportPowerSpecification = null; // 지원 파워 규격
	public String sBS_Extended_ATX = null; // 지원 보드 규격_Extended-ATX
	public String sBS_Standard_ATX = null; // 지원 보드 규격_표준-ATX
	public String sBS_Micro_ATX = null; // 지원 보드 규격_Micro-ATX
	public String sBS_Flex_ATX = null; // 지원 보드 규격_Flex-ATX
	public String sBS_Standard_BTX = null; // 지원 보드 규격_표준-BTX
	public String sBS_Micro_BTX = null; // 지원 보드 규격_Micro-BTX
	public String sBS_Standard_ITX = null; // 지원 보드 규격_표준-ITX
	public String sBS_Mini_ITX = null; // 지원 보드 규격_Mini-ITX
	public String sddOnlyBay = null; // SDD 전용 베이
	public String VGASize = null; // 그래픽 카드 장착
	public String CPUCoolerSize = null; // CPU 쿨러 장착
	public String IntegralWaterCooler = null; // 일체형 수냉 쿨러
	
	public String sql = null; // sql 문
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

		  name = csvData[0]; // 부품명
		  madeIn = csvData[1]; // 제조사
		  productCategory = csvData[2]; // 제품 분류
		  caseSize = csvData[3]; // 케이스 크기
		  supportPowerSpecification = csvData[4]; // 지원 파워 규격
		  sBS_Extended_ATX = csvData[5]; // 지원 보드 규격_Extended-ATX
		  sBS_Standard_ATX = csvData[6]; // 지원 보드 규격_표준-ATX
		  sBS_Micro_ATX = csvData[7]; // 지원 보드 규격_Micro-ATX
		  sBS_Flex_ATX = csvData[8]; // 지원 보드 규격_Flex-ATX
		  sBS_Standard_BTX = csvData[9]; // 지원 보드 규격_표준-BTX
		  sBS_Micro_BTX = csvData[10]; // 지원 보드 규격_Micro-BTX
		  sBS_Standard_ITX = csvData[11]; // 지원 보드 규격_표준-ITX
		  sBS_Mini_ITX = csvData[12]; // 지원 보드 규격_Mini-ITX
		  sddOnlyBay = csvData[13]; // SDD 전용 베이
		  VGASize = csvData[14]; // 그래픽 카드 장착
		  CPUCoolerSize = csvData[15]; // CPU 쿨러 장착
		  IntegralWaterCooler = csvData[16]; // 일체형 수냉 쿨러

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