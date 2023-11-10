package BusReservation;
public class Bus {
private int busNo;
private boolean ac;
private int capacity;
public Bus(int n,boolean a,int c) {
	this.busNo = n;
	this.ac = a;
	this.capacity = c;
}
public boolean isAc() {
	return ac;
}
//mutator
public void setAc(boolean ac) {
	this.ac = ac;
}
//access modifier
public int getCapacity() {
	return capacity;
}
public int getBusNo() {
	return busNo;
}
public void setBusNo(int busNo) {
	this.busNo = busNo;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}

}
