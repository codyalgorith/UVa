/*submitted sep 3 2017
this one deals with range updates and queries 
so i have used segment tree for that purpose





*/

#include<iostream>
#include<sstream>
#include<string>
using namespace std;
long long int arr[200010];
long long int tree[800040];

void  buildtree(int node,int a,int b)
{
	// cout<<"here\n";
	if(b<a)return;
	
	if(a==b)
	{  //setting the leaf node
		tree[node]= arr[a];
		
		return ;
			}
			
			
	buildtree(node*2, a, (a+b) /2 );
	
	buildtree(node*2 +1 , (a+b)/2 +1 ,b);
	
	tree[node]= tree[node*2] + tree[node*2 +1];
	
	
	
	
}
//update range i to j by x
void update(int node,int a,int b,int i,int j,int x)
{
	
	//if range is out of the current segment
		if(b<a||a>j||b<i)return ;
		
		if(a==b)  //leaf node 
		{
			tree[node]=x;
			return ;
		}
		
		
		update(node*2 , a , (a+b)/2 , i, j , x);
		
		update(node*2 +1 , (a+b)/2 +1 , b, i , j, x);
		
		tree[node]= tree[node*2] + tree[node*2 +1];
	
	
}
//return the sum from  i to j 
long long query(int node,int a,int b,int i,int j)
{
	if(b<a||a>j||b<i)return 0;
	
	if(a>=i&&b<=j)
	{
		return tree[node];
	}
	
	
	return query(node*2,a,(a+b)/2 ,i ,j )
	+ query(node*2 +1 , (a+b)/2 +1,b,i,j);
	
	
}


int main()
{
	
	//now taking input is bit  difficult in this problem 
	// so i leave it to gods
	
	//help me lord of light R'hollor
	bool flag=false;
	int counter=1;
	while(1)
	{
		int t;
		scanf("%d",&t);
		
		if(t==0)break;
		
		for(int i=1;i<=t;++i)
		{
			scanf("%d",&arr[i]);
		}
		buildtree(1,1,t);
		cin.ignore();
		
		if(flag)printf("\n");
		flag=true;
		
		printf("Case %d:\n",counter);
		
		while(1)
		{
			string z;
			
			getline(cin,z);
			
			stringstream ss(z);
			string x;
			int i,j;
			
			ss>>x>>i>>j;
			
			if(x=="S")
			{  //update value at i-1 to i-1 by j
				update(1,1,t,i,i,j);
			}
			else if(x=="M")
			{
				//print querysum from i-1 to j-1
				
				long long result = query(1,1,t,i,j);
				printf("%lld\n",result);
			}
			else break;
			
			
		}
		
		
		counter++;
		
	}
	}
