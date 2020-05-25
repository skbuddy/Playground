#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x1,x2,x3,y1,y2,y3;
  cin>>x1>>y1>>x2>>y2>>x3>>y3;
  float xm,ym;
  xm = ((float)(x1+x2+x3)/3);
  ym = ((float)(y1+y2+y3)/3);
  cout<<xm<<"\n"<<ym;
  return 0;
}