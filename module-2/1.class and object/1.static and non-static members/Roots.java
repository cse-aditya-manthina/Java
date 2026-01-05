import java.util.*;
class Roots{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("square root : "+a*a);
		System.out.println("cube root : "+a*a*a);
		int root=0; 
		for(int i=1;i*i<=a;i++)
		{
			if(i*i==a)
			{
				root=i;
				break;
			}
		}
		System.out.println(root);
		//binary search
		low=0;
		high=a;
		ans=0;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if((long)(mid*mid*mid)<=a)
			{
				ans=mid;
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		System.out.println("cube root of the number is: "+ans);
	}
}