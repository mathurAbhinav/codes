class GenMethDemo
{
	static<T> void printArray(T a[])
	{
		for(T ele: a)
		{
			System.out.print(ele+" ");
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		Integer nums[]={1,2,3,4,5,6,7};
		printArray(nums);
		String names[]={"Chantal","Harsha","Aritra"};
		printArray(names);
	}
}
