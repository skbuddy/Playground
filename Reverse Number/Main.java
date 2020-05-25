#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int i=0,n,arr[20];
  cin>>n;
  while(n)
  {
    arr[i] = n%10;
    n/=10;
    i++;
  }
  for(n=0;n<i;n++)
    cout<<arr[n];
	return 0;
}