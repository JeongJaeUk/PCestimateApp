package fordevice;

public class VGA extends Device{
	public String name = null; // 부품명
	public String madeIn = null; // 제조사
	public String chipsetManufacturer = null; // 칩셋 제조사
	public String chipset = null; // 칩셋
	public String interfaceVGA = null; // 인터페이스
	public String memoryType = null; // 메모리 종류
	public String memoryCapacity= null; // 메모리 용량
	public String memoryBus = null; // 메모리 버스
	public String HDMI = null; //HDMI
	public String DisplayPort = null; // Display Port
	public String add_multiVGA = null; // 부가기능_멀티 VGA
	public String add_DualLink = null; // 부가기능_Dual-Link
	public String add_4kResolution = null; // 부가기능_4K 해상도 지원
	public String add_VRReady = null; // 부가기능_VR Ready
	public String add_HDMOI2_0 = null; // 부가기능_HDMI 2.0 지원
	public String add_Dp1_4 = null; // 부가기능_Dp 1.4 지원
	public String add_HDCP = null; // 부가기능_HDCP 지원
	public String add_DualBIOS = null; // 부가기능_Dual BIOS
	public String coreCoolingSystem = null; // 코어 냉각방식
	public String VGASize_horizontal = null; // 그래픽 카드 크기_가로
	public String VGASize_vertical = null; // 그래픽 카드 크기_세로
	public String designPower = null; // 필요 전력
	
	public String sql = null; // sql 문
	public VGA() {
	}
	public String getSqlCT() {
		sql = "CREATE TABLE VGA(" +
				"name varchar(20) NOT NULL, " +
				"madeIn varchar(20) NOT NULL, " +
				"chipsetManufacturer varchar(20) NOT NULL, " +
				"chipset varchar(20) NOT NULL, " +
				"interfaceVGA varchar(20) NOT NULL, " +
				"memoryType varchar(20) NOT NULL, " +
				"memoryCapacity varchar(20) NOT NULL, " +
				"memoryBus varchar(20) NOT NULL, " +
				"HDMI varchar(20) NOT NULL, " +
				"DisplayPort varchar(20) NOT NULL, " +
				"add_multiVGA  varchar(20) NOT NULL, " +
				"add_DualLink  varchar(20) NOT NULL, " +
				"add_4kResolution  varchar(20) NOT NULL, " +
				"add_VRReady  varchar(20) NOT NULL, " +
				"add_HDMOI2_0  varchar(20) NOT NULL, " +
				"add_Dp1_4  varchar(20) NOT NULL, " +
				"add_HDCP  varchar(20) NOT NULL, " +
				"add_DualBIOS  varchar(20) NOT NULL, " +
				"coreCoolingSystem  varchar(20) NOT NULL, " +
				"VGASize_horizontal  varchar(20) NOT NULL, " +
				"VGASize_vertical  varchar(20) NOT NULL, " +
				"designPower varchar(20) NOT NULL, " +
				"PRIMARY KEY(name));";

		return sql;
	}
	public String getSqlInsert() {
		sql = "INSERT INTO VGA (name, madeIn, chipsetManufacturer, chipset, interfaceVGA, memoryType, memoryCapacity, memoryBus"
				+ ", HDMI, DisplayPort, add_multiVGA, add_DualLink, add_4kResolution, add_VRReady, add_HDMOI2_0, add_Dp1_4"
				+ ", add_HDCP, add_DualBIOS, coreCoolingSystem, VGASize_horizontal, VGASize_vertical, designPower) "
				+ "VALUES (" + name + ", " + madeIn + ", " + chipsetManufacturer + ", " + chipset + ", " + interfaceVGA + ", " 
				+ memoryType + ", " + memoryCapacity + ", " + memoryBus + ", " + HDMI + ", " + DisplayPort + ", "
				+ add_multiVGA + ", " + add_DualLink + ", " + add_4kResolution + ", " + add_VRReady + ", " + add_HDMOI2_0 + ", " 
				+ add_Dp1_4 + ", " + add_HDCP + ", " + add_DualBIOS + ", " + coreCoolingSystem + ", " + VGASize_horizontal + ", " 
				+ VGASize_vertical + ", " + designPower + ");";
		return sql;
	}
	public void getElement() {
		
	}
	public void setElement(String csvStr) {
		// TODO Auto-generated method stub
		String[] csvData = csvStr.split(",\\s");

		  name = csvData[0]; // 부품명
		  madeIn = csvData[1]; // 제조사
		  chipsetManufacturer = csvData[2]; // 칩셋 제조사
		  chipset = csvData[3]; // 칩셋
		  interfaceVGA = csvData[4]; // 인터페이스
		  memoryType = csvData[5]; // 메모리 종류
		  memoryCapacity= csvData[6]; // 메모리 용량
		  memoryBus = csvData[7]; // 메모리 버스
		  HDMI = csvData[8]; //HDMI
		  DisplayPort = csvData[9]; // Display Port
		  add_multiVGA = csvData[10]; // 부가기능_멀티 VGA
		  add_DualLink = csvData[11]; // 부가기능_Dual-Link
		  add_4kResolution = csvData[12]; // 부가기능_4K 해상도 지원
		  add_VRReady = csvData[13]; // 부가기능_VR Ready
		  add_HDMOI2_0 = csvData[14]; // 부가기능_HDMI 2.0 지원
		  add_Dp1_4 = csvData[15]; // 부가기능_Dp 1.4 지원
		  add_HDCP = csvData[16]; // 부가기능_HDCP 지원
		  add_DualBIOS = csvData[17]; // 부가기능_Dual BIOS
		  coreCoolingSystem = csvData[18]; // 코어 냉각방식
		  VGASize_horizontal = csvData[19]; // 그래픽 카드 크기_가로
		  VGASize_vertical = csvData[20]; // 그래픽 카드 크기_세로
		  designPower = csvData[21]; // 필요 전력

	}
	@Override
	public void printElement() {
		// TODO Auto-generated method stub
		
	}
}