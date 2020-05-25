#include<iostream>
using namespace std;
int fibonacci(int n)
{
  int i=0,j=1,temp=0;
  if(n==1)
  	return i;
  else if (n==2)
    return j;
  else
  {
      n -=1;
  	  while(n)
  	  {
        	i = j;
			j=temp;
        	temp = i+j;
        	n--;
  	  }
  }
  return temp;
}

int main()
{
  //Type your code here.
  int n;
  cin>>n;
  cout<<fibonacci(n);
  
}