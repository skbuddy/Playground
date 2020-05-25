#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
	int n,score,sum=0,count=0;
  cin>>n;
  while(sum<n)
  {
    cin>>score;
    sum +=score;
    count++;
  }
  cout<<"The number of turns is "<<count;
}