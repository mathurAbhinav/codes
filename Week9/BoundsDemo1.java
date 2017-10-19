class NumericFns<T extends Number>
{
	T num;
	NumericFns(T n)
	{
		num=n;
	}
	boolean absEqual(NumericFns<?> ob)
	{
		return Math.abs(num.doubleValue())==Math.abs(ob.num.doubleValue());
	}
	double reciprocal()
	{
		return 1/num.doubleValue();
	}
	double fraction()
	{
		return num.doubleValue()-num.intValue();
	}
}
class BoundsDemo1
{
	public static void main(String args[])
	{
		NumericFns<Integer> iOb1=new NumericFns<Integer>(5);
		System.out.println("Reciprocal="+iOb1.reciprocal());
		System.out.println("Fractional part="+iOb1.fraction());
		NumericFns<Double> dOb=new NumericFns<Double>(-5.0);
		if(iOb1.absEqual(dOb))
		{
			System.out.println("Equal Absolute Value");
		}
		else
			System.out.println("Unequal");
	}
}
