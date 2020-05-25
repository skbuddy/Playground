#include<iostream>
using namespace std;
int main()
{
int a,b,c;
  cin>>a>>b>>c;
  cout<<"Enter first number : Enter second number : Menu\n"
<<"1.Addition\n"
<<"2.Subtraction\n"
<<"3.Multiplication\n"
<<"4.Division\n"
<<"5.Remainder\n";
  switch(c)
  {
    case 1: cout<<a+b;
  			break;
    case 2: cout<<a-b;
      		break;
    case 3: cout<<a*b;
      		break;
    case 4: cout<<a/b;
      		break;
    case 5: cout<<a%b;
      		break;
    default: cout<<"Invalid operation";
  }
  
return 0;
}
