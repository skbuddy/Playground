#include<iostream>
using namespace std;
int main()
{
  int n,i=0;
  cin>>n;
  for(i=0;i<4;i++)
  {
    	for(int j=0;j<=i;j++)
        {
          cout<<n+i;
        }
    cout<<endl;
  }
  for(i=3;i>=0;i--)
  {
    	for(int j=0;j<=i;j++)
        {
          cout<<n+i;
        }
    cout<<endl;
  }
  return 0;
  
}