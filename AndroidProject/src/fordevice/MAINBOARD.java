package fordevice;
public class MAINBOARD extends Device{
	public String name = null; // ��ǰ��
	public String madeIn = null; // ������
	public String productCategory = null; // ��ǰ �з�
	public String CPUSocket = null; // CPU ����
	public String detailSocket = null; // ���� Ĩ��
	public String formFactor = null; // ������
	public String memoryType= null; // �޸� ����
	public String numOfMemorySlot = null; // �޸� ���� ��
	public String memoryCapacity = null; // �޸� �뷮
	public String multiVGADetail = null; // ��Ƽ VGA ��
	public String VGAConnection1 = null; // VGA ����
	public String VGAConnection2 = null; // VGA ����
	public String MPoint2 = null; // M.2
	public String D_SUB = null; // �׷��� ��� ���� - D-SUB
	public String DVI = null; // �׷��� ��� ���� - DVI
	public String HDMI = null; // �׷��� ��� ���� - HDMI
	public String DisplayPort = null; // �׷��� ��� ���� - DisplayPort
	public String bT_thunderBolt = null; // �ĸ� ����_�����Ʈ
	public String bT_e_SATA = null; // �ĸ� ����_e-SATA
	public String bT_IEEE1394 = null; // �ĸ� ����_IEEE1394
	public String bT_serialPort = null; // �ĸ� ����_�ø�����Ʈ
	public String bT_parallelPort = null; // �ĸ� ����_�з�����Ʈ
	public String bT_USB3_0 = null; // �ĸ� ����_USB3.0
	public String bT_USB3_1 = null; // �ĸ� ����_USB3.1
	public String bT_PS_2 = null; // �ĸ� ����PS/2
	public String nS_gigaBitLan = null; // ��Ʈ��ũ ���_�Ⱑ��Ʈ ��
	public String nS_10GigaBitLan = null; // ��Ʈ��ũ ���_10 �Ⱑ��Ʈ ��
	public String nS_wirelessLan = null; // ��Ʈ��ũ ���_���� ��
	public String nS_bluetooth = null; // ��Ʈ��ũ ���_�������

	public String sql = null; // sql  ��
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

		name = csvData[0]; // ��ǰ��
		madeIn = csvData[1]; // ������
		productCategory =csvData[2]; // ��ǰ �з�
		CPUSocket = csvData[3]; // CPU ����
		detailSocket = csvData[4]; // ���� Ĩ��
		formFactor = csvData[5]; // ������
		memoryType= csvData[6]; // �޸� ����
		numOfMemorySlot = csvData[7]; // �޸� ���� ��
		memoryCapacity = csvData[8]; // �޸� �뷮
		multiVGADetail = csvData[9]; // ��Ƽ VGA ��
		VGAConnection1 = csvData[10]; // VGA ����
		VGAConnection2 = csvData[11]; // VGA ����
		MPoint2 = csvData[12]; // M.2
		D_SUB = csvData[13]; // �׷��� ��� ���� - D-SUB
		DVI = csvData[14]; // �׷��� ��� ���� - DVI
		HDMI = csvData[15]; // �׷��� ��� ���� - HDMI
		DisplayPort = csvData[16]; // �׷��� ��� ���� - DisplayPort
		bT_thunderBolt = csvData[17]; // �ĸ� ����_�����Ʈ
		bT_e_SATA = csvData[18]; // �ĸ� ����_e-SATA
		bT_IEEE1394 = csvData[19]; // �ĸ� ����_IEEE1394
		bT_serialPort = csvData[20]; // �ĸ� ����_�ø�����Ʈ
		bT_parallelPort = csvData[21]; // �ĸ� ����_�з�����Ʈ
		bT_USB3_0 = csvData[22]; // �ĸ� ����_USB3.0
		bT_USB3_1 = csvData[23]; // �ĸ� ����_USB3.1
		bT_PS_2 = csvData[24]; // �ĸ� ����PS/2
		nS_gigaBitLan = csvData[25]; // ��Ʈ��ũ ���_�Ⱑ��Ʈ ��
		nS_10GigaBitLan = csvData[26]; // ��Ʈ��ũ ���_10 �Ⱑ��Ʈ ��
		nS_wirelessLan = csvData[27]; // ��Ʈ��ũ ���_���� ��
		nS_bluetooth = csvData[28]; // ��Ʈ��ũ ���_�������	
	}
	@Override
	public void printElement() {
		// TODO Auto-generated method stub
		
	}
}
