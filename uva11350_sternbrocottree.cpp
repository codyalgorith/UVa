/*probblem is simmple ,just follow whats given in the description*/

#include<iostream>
using namespace std;
int main()
{ // freopen("input.txt","r",stdin);
	//freopen("output.txt","w",stdout);
	int t;
	scanf("%d",&t);
	for(int g=0;g<t;++g)
	{
		string x;
		cin>>x;
		
		
		int n= x.size();
	unsigned	long long int nmid=1;
	unsigned	long long int dmid=1;
		
	unsigned	long long int nleft=0;
		unsigned long long int dleft=1;
		
	unsigned	long long int nryt=1;
	unsigned	long long int dryt=0;
		int i=0;
		while(i<n)
		{
			if(x[i]=='R')
			{
				nleft=nmid;
				dleft=dmid;
				nmid+=nryt;
				dmid+=dryt;
			}
			else{
				nryt=nmid;
				dryt=dmid;
				nmid+=nleft;
				dmid+=dleft;
			}
			i++;
		}
		
		printf("%llu/%llu\n",nmid,dmid);
	}
}
