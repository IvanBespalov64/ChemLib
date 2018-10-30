package chem.util;

public class Temp {
	char type;
	double val;
	
	public Temp(char t) {
		type = t;
			
	}
	public Temp(char t, double val) {
		type = t;
		this.val = val;
	}
	public void toF() {
		if(type == 'F')
			return;
		if(type == 'C') 
			val = 9 * val / 5 + 32;
		if(type == 'K') 
			val = 9 * (val - 273) / 5 + 32;
	}
	public void toC() {
		if(type == 'C')
			return;
		if(type == 'F')
			val = (val - 32) * 5 / 9;
		if(type == 'K')
			val = val - 273;
	}
	public void toK() {
		if(type == 'K')
			return;
		if(type == 'F')
			val = (val - 32) * 5 / 9 + 273;
		if(type == 'C')
			val = val + 273;
	}
	
	public void setVal(double d) {
		val = d;
	}
	public void upd(double d) {
		val += d;
	}
	public void inc() {
		val++;
	}
	public void dec() {
		val--;
	}
	public double getVal() {
		return val;
	}
	
}
