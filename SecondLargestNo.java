package ifelse;

public class SecondLargestNo {
public static void main(String[] args) {
	int a , b , c;
	a = 50;
	b = 40;
	c = 90;
	if ( (( a>b)&&(b>c))|| ((a <b) && (b<c)) )
	{System.out.println("b is second largest no");}
	else if (((b>a)&&(a>c)) || ((b<a)&&(a<c)))
	{System.out.println("a is second largest no");}
	else if (((a>c)&&(c>b)) || ((a<c)&&(c<b)))
	{System.out.println("c is second largest no");}
	else {System.out.println("not define");}
}
}

