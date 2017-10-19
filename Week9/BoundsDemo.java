class NumericFns<T extends Number>
{
	T num;
	NumericFns(T n)
	{
		num=n;
	}
	double reciprocal()
	{
		System.out.println("1/"+num.doubleValue()+"=");
		return 1/num.doubleValue();
	}
	double fraction()
	{
		return num.doubleValue()-num.intValue();
	}
}
class BoundsDemo
{
	public static void main(String args[])
	{
		NumericFns<Integer> iOb=new NumericFns<Integer>(5);
		System.out.println("Reciprocal="+iOb.reciprocal());
		System.out.println("Fractional part="+iOb.fraction());
	}
}
