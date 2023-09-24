public class Main {
	public static void main(String arg[]){
			//size of all arrays
int size = 4;

//type 1
int arr1[size] = {0,1,2,3};     //arr1 => |0|1|2|3|

//type 2
int arr2[size];
arr2 = {0,1,2,3};               //arr2 => |0|1|2|3|

//type 3
int arr3[size] = {0};           // arr3 => |0|0|0|0|

//type 4
int arr4[size] = {1};           // arr4 => |1|0|0|0|

//type 5
int arr5[size] = {};            // arr5 => |0|0|0|0|

//type 6
int arr6[] = {0,2};             // arr6 => |0|2|0|0|
		}
}
