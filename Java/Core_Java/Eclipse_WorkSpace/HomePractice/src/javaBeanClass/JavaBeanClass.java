//**********************  Java Bean Class  **********************

package javaBeanClass;

public class JavaBeanClass {

private int i;
private double h;
private boolean b;

public JavaBeanClass(int i, double h, boolean b) {
	
	this.i = i;
	this.h = h;
	this.b = b;
}

public int getI() {
	return i;
}

public void setI(int i) {
	this.i = i;
}

public double getH() {
	return h;
}

public void setH(double h) {
	this.h = h;
}

public boolean isB() {
	return b;
}

public void setB(boolean b) {
	this.b = b;
}

}
