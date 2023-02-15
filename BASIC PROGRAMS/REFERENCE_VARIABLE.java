class ReVar
{
	int x =10;
	public static void main(String[] args)
	{
		ReVar R;// reference variable creation
		ReVar obj = new ReVar();
		R=obj; //R made reference of obj
		System.out.println(R.x);
		// R=null; it will throw exception
	}
}
