
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
		return "�޷�����������";
		}else if(a==b&&b==c){
		return "�ȱ�������";
		}else if(((a == b) && (b != c)) || ((b == c) && (a != b)) || ((a == c) && (c != a))){
		return "����������";
		}
		else return "һ��������";
		}

		


}
