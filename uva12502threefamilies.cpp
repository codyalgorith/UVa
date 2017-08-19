#include<iostream>
using namespace std;
int main()
{  //  freopen("input.txt","r",stdin);
//freopen("output.txt","w",stdout);
	int t;
	scanf("%d",&t);
	for(int g=0;g<t;++g)
	{
		int A,B,Rupee;
		cin>>A>>B>>Rupee;
		
		int a=A*60;
		int b=B*60;
		
		int share =(a+b)/3;
		
		int workA= a- share;
		if(workA<=0)
			printf("0\n");
		else{
			double ans=((Rupee*(workA))/share);
			printf("%.0lf\n",ans);
		}
		
		
			}
}
