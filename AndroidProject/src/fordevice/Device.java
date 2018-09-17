package fordevice;

abstract public class Device {
	abstract public String getSqlCT();
	abstract public String getSqlInsert();
	abstract public void getElement();
	abstract public void setElement(String csvStr);
	abstract public void printElement();	
}
