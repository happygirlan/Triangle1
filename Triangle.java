
public class Triangle {
	public static String T(double a,double b,double c){
		double tem = Math.max(a, b);
		if(tem>c){
		if(tem==a){
		a = c;
		}else {
		b = c;
		}
		c = tem;
		}
		if(!(a+b>c&&Math.abs(a-b)<c)){
		return "无法构成三角形";
		}else if(a==b&&b==c){
		return "等边三角形";
		}else if(((a == b) && (b != c)) || ((b == c) && (a != b)) || ((a == c) && (c != a))){
		return "等腰三角形";
		}
		else return "一般三角形";
		}

		


}
