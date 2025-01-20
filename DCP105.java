/*
Ao      Fn      Jl      Mi      Oe
Bm      Gk      Kh      Nd
Cj      Hg      Lc
Df      Ib
Ea
*/

class DCP105
{
	public static void main(String args[])
	{
		int n=5;
		int count1=1;
		int count2=(n*(n+1))/2;
		for(int i1=1; i1<=n; i1++)
		{
			int c=count1;
			int c2=count2;
			for(int j=n,k=i1; j>=i1 || k<=n; j--,k++)
			{
				System.out.print((char)(c+64));
				System.out.print((char)(c2+96));
				System.out.print("\t");
				c+=j;
				c2-=k;
			}
			System.out.println();
			count1++;
			count2-=i1+1;
		}
	}
}
		
	