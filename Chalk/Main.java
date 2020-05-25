#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int n,sq1=0;
  float sq=0;
  cin>>n;
  sq1 = sqrt(n);
  sq = sqrt(n);
 
  if(int(n/sq)%sq1==0)
    cout<<int(n+1+n/sq);
  else
    cout<<int(n+n/sq);
}