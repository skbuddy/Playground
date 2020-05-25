#include<iostream>
using namespace std;
int main()
{
  	int a,flag=0;
  	cin>>a;
  	if(a<2)
      	cout<<"Not eligible";
  	else if(a==2)
      	cout<<"Eligible";
  	else{
  	for(int i=2;i<a/2;i++)
    {
      	if(a%i==0)
        {	flag++;
      		break;}
    }
  	if(flag==0)
      	cout<<"Eligible";
  	else
      	cout<<"Not eligible";
    }
  
  	return 0;
}