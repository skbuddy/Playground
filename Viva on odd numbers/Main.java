#include<iostream>
using namespace std;
int main()
{
	//Type your code here.
    int n;
  	float score=0,count=0;
  	while(count!=3)
  	{
    	cin>>n;
    	if(n<0)
    	{ 
          	score -= 1;
        	break;
        }
    	else if(n%2==0)
      		score -=0.5;
    	else
    	{	
          	score += 1;
          	count++;
        }
  }
  cout<<score;
}