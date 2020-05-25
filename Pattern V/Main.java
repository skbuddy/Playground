#include<iostream>
using namespace std;
int main()
{
  int n,j,k=1,l=1;
  cin>>n;
  l = n*n+1;
  
  for(int i=0;i<n;i++)
  {
    for(j=0;j<i;j++)
      cout<<"--";
    
    for(j=1;j<n-i;j++)
      cout<<k++<<"*";
    cout<<k++;
    
    cout<<"*";
 
    for(j=0;j<n-i-1;j++)
      cout<<l+j<<"*";
    cout<<l+j;
    
    cout<<endl;
    l = l-(n-i-1);
  }
  return 0;
  
}