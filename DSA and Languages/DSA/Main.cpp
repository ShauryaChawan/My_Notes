#include <iostream>
using namespace std;

int linearSearch(int arr[], int size, int targetVal);

int main()
{
	int arr[] = {3, 7, 2, 9, 5};
	int targetVal = 9;
	int size = sizeof(arr) / sizeof(arr[0]);

	int result = linearSearch(arr, size, targetVal);

	if (result != -1)
	{
		cout << "Value " << targetVal << " found at index " << result << endl;
	}
	else
	{
		cout << "Value " << targetVal << " not found" << endl;
	}

	return 0;
}

int linearSearch(int arr[], int size, int targetVal)
{
	for (int i = 0; i < size; i++)
	{
		if (arr[i] == targetVal)
		{
			return i;
		}
	}
	return -1;
}
