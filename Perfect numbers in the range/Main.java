#include<iostream>
using namespace std;
int main()
{
  	int a,b,sum=0,i,j=1;
  	cin>>a>>b;
  	for(i=a;i<=b;i++)
    {
      	sum=0;
      	j=1;
    	while(j<i)
        {
      		if(i%j==0)
      			sum +=j;
    		j++;
        }
      	if(i==sum)
      		cout<<i<<" ";
    }
 	return 0;
}