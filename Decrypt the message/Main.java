#include<iostream>
using namespace std;
int main()
{
  	int a,b,sum=0,i=1;
  	cin>>a>>b;
  	while(i<a+b)
    {
      	if((a+b)%i==0)
      		sum +=i;
    	i++;
    }
  	if(a+b==sum)
      cout<<"They can read the message";
  	else
      cout<<"They can't read the message";
 	return 0;
}