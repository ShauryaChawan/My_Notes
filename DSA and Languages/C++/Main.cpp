#include <iostream>
using namespace std;

int main()
{
  int numRows, numCols;

  // Get the number of rows and columns from the user
  cout << "Enter the number of rows: ";
  cin >> numRows;
  cout << "Enter the number of columns: ";
  cin >> numCols;

  // Allocate memory for the dynamic multidimensional array
  int **dynamicArray = new int *[numRows]; // Create an array of int* (pointers to int)

  for (int i = 0; i < numRows; ++i)
  {
    dynamicArray[i] = new int[numCols]; // Each int* points to an array of int (a row)
  }

  // Initialize the elements of the array
  int value = 1;
  for (int i = 0; i < numRows; ++i)
  {
    for (int j = 0; j < numCols; ++j)
    {
      dynamicArray[i][j] = value;
      value++;
    }
  }

  // Access and print the elements of the array
  cout << "Dynamic Array Contents:" << endl;
  for (int i = 0; i < numRows; ++i)
  {
    for (int j = 0; j < numCols; ++j)
    {
      cout << dynamicArray[i][j] << " ";
    }
    cout << endl;
  }

  // Deallocate memory to prevent memory leaks
  for (int i = 0; i < numRows; ++i)
  {
    delete[] dynamicArray[i]; // Delete each row
  }
  delete[] dynamicArray; // Delete the array of pointers

  return 0;
}
