#include <iostream>
using namespace std;

// creating union
union Sample {
  char a; 
  float b;
  int c;
};

int main() {
  // initialising a union
  union Sample u_name;

  // assigning value to a
  u_name.a = 'c'; 

  // printing all values
  cout << "a " << u_name.a << endl;
  cout << "b " << u_name.b << endl;
  cout << "c " << u_name.c << endl;
  cout << endl << endl;

  // assigning value to b
  u_name.b = 87.99;

  // printing all values
  cout << "a " << u_name.a << endl;
  cout << "b " << u_name.b << endl;
  cout << "c " << u_name.c << endl;
  cout << endl << endl;

  // assigning value to c
  u_name.c = 103;

  // printing all values
  cout << "a " << u_name.a << endl;
  cout << "b " << u_name.b << endl;
  cout << "c " << u_name.c << endl;
  cout << endl << endl;

  return 0;
}