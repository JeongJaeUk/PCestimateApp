package fordevice;
public class MAINBOARD extends Device{
	public String name = null; // 부품명
	public String madeIn = null; // 제조사
	public String productCategory = null; // 제품 분류
	public String CPUSocket = null; // CPU 소켓
	public String detailSocket = null; // 세부 칩셋
	public String formFactor = null; // 폼팩터
	public String memoryType= null; // 메모리 종류
	public String numOfMemorySlot = null; // 메모리 슬롯 수
	public String memoryCapacity = null; // 메모리 용량
	public String multiVGADetail = null; // 멀티 VGA 상세
	public String VGAConnection1 = null; // VGA 열결
	public String VGAConnection2 = null; // VGA 열결
	public String MPoint2 = null; // M.2
	public String D_SUB = null; // 그래픽 출력 단자 - D-SUB
	public String DVI = null; // 그래픽 출력 단자 - DVI
	public String HDMI = null; // 그래픽 출력 단자 - HDMI
	public String DisplayPort = null; // 그래픽 출력 단자 - DisplayPort
	public String bT_thunderBolt = null; // 후면 단자_썬더볼트
	public String bT_e_SATA = null; // 후면 단자_e-SATA
	public String bT_IEEE1394 = null; // 후면 단자_IEEE1394
	public String bT_serialPort = null; // 후면 단자_시리얼포트
	public String bT_parallelPort = null; // 후면 단자_패러럴포트
	public String bT_USB3_0 = null; // 후면 단자_USB3.0
	public String bT_USB3_1 = null; // 후면 단자_USB3.1
	public String bT_PS_2 = null; // 후면 단자PS/2
	public String nS_gigaBitLan = null; // 네트워크 사양_기가비트 랜
	public String nS_10GigaBitLan = null; // 네트워크 사양_10 기가비트 랜
	public String nS_wirelessLan = null; // 네트워크 사양_무선 랜
	public String nS_bluetooth = null; // 네트워크 사양_블루투스

	public String sql = null; // sql  문
	public MAINBOARD() {

	}
	public String getSqlCT() {
		sql = "CREATE TABLE MAINBOARD(" +
				"name varchar(20) NOT NULL, " +
				"madeIn varchar(20) NOT NULL, " +
				"productCategory varchar(20) NOT NULL, " +
				"CPUSocket varchar(20) NOT NULL, " +
				"detailSocket varchar(20) NOT NULL, " +
				"formFactor varchar(20) NOT NULL, " +
				"memoryType varchar(20) NOT NULL, " +
				"numOfMemorySlot varchar(20) NOT NULL, " +
				"memoryCapacity varchar(20) NOT NULL, " +
				"multiVGADetail varchar(20) NOT NULL, " +
				"VGAConnection1  varchar(20) NOT NULL, " +
				"VGAConnection2  varchar(20) NOT NULL, " +
				"MPoint2  varchar(20) NOT NULL, " +
				"D_SUB  varchar(20) NOT NULL, " +
				"DVI  varchar(20) NOT NULL, " +
				"HDMI  varchar(20) NOT NULL, " +
				"DisplayPort  varchar(20) NOT NULL, " +
				"bT_thunderBolt  varchar(20) NOT NULL, " +
				"bT_e_SATA  varchar(20) NOT NULL, " +
				"bT_IEEE1394  varchar(20) NOT NULL, " +
				"bT_serialPort  varchar(20) NOT NULL, " +
				"bT_parallelPort  varchar(20) NOT NULL, " +
				"bT_USB3_0  varchar(20) NOT NULL, " +
				"bT_USB3_1  varchar(20) NOT NULL, " +
				"bT_PS_2  varchar(20) NOT NULL, " +
				"nS_gigaBitLan  varchar(20) NOT NULL, " +
				"nS_10GigaBitLan  varchar(20) NOT NULL, " +
				"nS_wirelessLan  varchar(20) NOT NULL, " +
				"nS_bluetooth  varchar(20) NOT NULL, " +
				"PRIMARY KEY(name));";

		return sql;
	}
	public String getSqlInsert() {
		sql = "INSERT INTO MAINBOARD (name, madeIn, productCategory, CPUSocket, detailSocket, formFactor, memoryType, numOfMemorySlot"
				+ ", memoryCapacity, multiVGADetail, VGAConnection1, VGAConnection2, MPoint2, D_SUB, DVI, HDMI"
				+ ", DisplayPort, bT_thunderBolt, bT_e_SATA, bT_IEEE1394, bT_serialPort, bT_parallelPort, bT_USB3_0"
				+ ", bT_USB3_1, bT_PS_2, nS_gigaBitLan, nS_10GigaBitLan, nS_wirelessLan, nS_bluetooth) "
				+ "VALUES (" + name + ", " + madeIn + ", " + productCategory + ", " + CPUSocket + ", " + detailSocket + ", " 
				+ formFactor + ", " + memoryType + ", " + numOfMemorySlot + ", " + memoryCapacity + ", " + multiVGADetail + ", "
				+ VGAConnection1 + ", " + VGAConnection2 + ", " + MPoint2 + ", " + D_SUB + ", " + DVI + ", " + HDMI + ", " 
				+ DisplayPort + ", " + bT_thunderBolt + ", " + bT_e_SATA + ", " + bT_IEEE1394 + ", " + bT_serialPort + ", " 
				+ bT_parallelPort + ", " + bT_USB3_0 + ", " + bT_USB3_1 + ", " + bT_PS_2 + ", " + nS_gigaBitLan + ", " 
				+ nS_10GigaBitLan + ", " + nS_wirelessLan + ", " + nS_bluetooth + ");";
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
		productCategory =csvData[2]; // 제품 분류
		CPUSocket = csvData[3]; // CPU 소켓
		detailSocket = csvData[4]; // 세부 칩셋
		formFactor = csvData[5]; // 폼팩터
		memoryType= csvData[6]; // 메모리 종류
		numOfMemorySlot = csvData[7]; // 메모리 슬롯 수
		memoryCapacity = csvData[8]; // 메모리 용량
		multiVGADetail = csvData[9]; // 멀티 VGA 상세
		VGAConnection1 = csvData[10]; // VGA 열결
		VGAConnection2 = csvData[11]; // VGA 열결
		MPoint2 = csvData[12]; // M.2
		D_SUB = csvData[13]; // 그래픽 출력 단자 - D-SUB
		DVI = csvData[14]; // 그래픽 출력 단자 - DVI
		HDMI = csvData[15]; // 그래픽 출력 단자 - HDMI
		DisplayPort = csvData[16]; // 그래픽 출력 단자 - DisplayPort
		bT_thunderBolt = csvData[17]; // 후면 단자_썬더볼트
		bT_e_SATA = csvData[18]; // 후면 단자_e-SATA
		bT_IEEE1394 = csvData[19]; // 후면 단자_IEEE1394
		bT_serialPort = csvData[20]; // 후면 단자_시리얼포트
		bT_parallelPort = csvData[21]; // 후면 단자_패러럴포트
		bT_USB3_0 = csvData[22]; // 후면 단자_USB3.0
		bT_USB3_1 = csvData[23]; // 후면 단자_USB3.1
		bT_PS_2 = csvData[24]; // 후면 단자PS/2
		nS_gigaBitLan = csvData[25]; // 네트워크 사양_기가비트 랜
		nS_10GigaBitLan = csvData[26]; // 네트워크 사양_10 기가비트 랜
		nS_wirelessLan = csvData[27]; // 네트워크 사양_무선 랜
		nS_bluetooth = csvData[28]; // 네트워크 사양_블루투스	
	}
	@Override
	public void printElement() {
		// TODO Auto-generated method stub
		
	}
}
