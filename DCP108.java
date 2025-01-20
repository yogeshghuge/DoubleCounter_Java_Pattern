/*
Ae
Cd      Bi
Fc      Eh      Dl
Jb      Ig      Hk      Gn
Oa      Nf      Mj      Lm      Ko
*/

class DCP108
{
	public static void main(String args[])
	{
		int n=5;
		int count1=1;
		int count2=n;
		for(int i=1;i<=n ;i++)
		{
			int c1=count1;
			int c2=count2;
			for(int j=i, j2=n; j>=1 ; j--,j2--)
			{
				System.out.print((char)(c1+64));
				System.out.print((char)(c2+96));
				System.out.print("\t");
				c1--;
				c2+=j2;
			}
			System.out.println();
			count1+=i+1;
			count2--;
		}
	}
}
