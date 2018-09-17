package fordevice;

public class VGA extends Device{
	public String name = null; // ��ǰ��
	public String madeIn = null; // ������
	public String chipsetManufacturer = null; // Ĩ�� ������
	public String chipset = null; // Ĩ��
	public String interfaceVGA = null; // �������̽�
	public String memoryType = null; // �޸� ����
	public String memoryCapacity= null; // �޸� �뷮
	public String memoryBus = null; // �޸� ����
	public String HDMI = null; //HDMI
	public String DisplayPort = null; // Display Port
	public String add_multiVGA = null; // �ΰ����_��Ƽ VGA
	public String add_DualLink = null; // �ΰ����_Dual-Link
	public String add_4kResolution = null; // �ΰ����_4K �ػ� ����
	public String add_VRReady = null; // �ΰ����_VR Ready
	public String add_HDMOI2_0 = null; // �ΰ����_HDMI 2.0 ����
	public String add_Dp1_4 = null; // �ΰ����_Dp 1.4 ����
	public String add_HDCP = null; // �ΰ����_HDCP ����
	public String add_DualBIOS = null; // �ΰ����_Dual BIOS
	public String coreCoolingSystem = null; // �ھ� �ð����
	public String VGASize_horizontal = null; // �׷��� ī�� ũ��_����
	public String VGASize_vertical = null; // �׷��� ī�� ũ��_����
	public String designPower = null; // �ʿ� ����
	
	public String sql = null; // sql ��
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

		  name = csvData[0]; // ��ǰ��
		  madeIn = csvData[1]; // ������
		  chipsetManufacturer = csvData[2]; // Ĩ�� ������
		  chipset = csvData[3]; // Ĩ��
		  interfaceVGA = csvData[4]; // �������̽�
		  memoryType = csvData[5]; // �޸� ����
		  memoryCapacity= csvData[6]; // �޸� �뷮
		  memoryBus = csvData[7]; // �޸� ����
		  HDMI = csvData[8]; //HDMI
		  DisplayPort = csvData[9]; // Display Port
		  add_multiVGA = csvData[10]; // �ΰ����_��Ƽ VGA
		  add_DualLink = csvData[11]; // �ΰ����_Dual-Link
		  add_4kResolution = csvData[12]; // �ΰ����_4K �ػ� ����
		  add_VRReady = csvData[13]; // �ΰ����_VR Ready
		  add_HDMOI2_0 = csvData[14]; // �ΰ����_HDMI 2.0 ����
		  add_Dp1_4 = csvData[15]; // �ΰ����_Dp 1.4 ����
		  add_HDCP = csvData[16]; // �ΰ����_HDCP ����
		  add_DualBIOS = csvData[17]; // �ΰ����_Dual BIOS
		  coreCoolingSystem = csvData[18]; // �ھ� �ð����
		  VGASize_horizontal = csvData[19]; // �׷��� ī�� ũ��_����
		  VGASize_vertical = csvData[20]; // �׷��� ī�� ũ��_����
		  designPower = csvData[21]; // �ʿ� ����

	}
	@Override
	public void printElement() {
		// TODO Auto-generated method stub
		
	}
}