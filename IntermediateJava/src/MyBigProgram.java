//import java.util.Arrays;
//public class MyBigProgram {
//
//	public static void main(String[] args) {
//		int[] list = {2, 9, 14, 7, 1, 0, 56, 34};
//		//selectionSort(list, 0, list.length - 1);
//		insertionSort(list);
//		System.out.println(Arrays.toString(list));
//		int keyIndex = binarySearch(list, 34, list.length -1);
//
//	}
//	public static void mergeSort(int[] list) {
//		if(list.length > 1) {
//			int[] firstHalf = new int[list.length / 2];
//			System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
//			
//			int secondHalfLength = list.length - list.length / 2;
//			int secondHalf = new int[secondHalfLength];
//		}
//	}
//	public static void merge(int[] first, int[] second, int[] combined) {
//		int cIndex1 = 0;
//		int cIndex2 = 0;
//		int cIndexCombined = 0;
//		
//		
//		
//		while(cIndex1 < first.length && cIndex2 < second.length) {
//			if(first[cIndex1] < second[cIndex2]) {
//				combined[cIndexCombined++] = second[cIndex2++];
//				//cIndex2++; same way as top ++s
//				//cIndexCombined++;
//			}
//			else {
//				combined[cIndexCombined++] = second[cIndex2++];
//			}
//		}
//		//if there are stil unmoved elements in the first list and the second list
//		//you have to copy them to the combined
//		while(cIndex1 < first.length) {
//			combined[cIndexCombined++] = first[cIndex1++];
//		}
//		while(cIndex2 < second.length) {
//			combined[cIndexCombined++] = second[cIndex2++];
//		}
//	}
//	public static void insertionSort(int[] list) {
//		for(int i = 1; i < list.length; i++) {
//			int temp = list[i];
//			int j;
//			for(j = i - 1; j >= 0 && list[i] > temp; j--) {
//				list[j + 1] = list[j];
//			}
//			list[j + 1] = temp;
//		}
//	
//	}
//	//insertion sort with recursion
//	public static void insertionSortRecursion(int[] list) {
//		//base case
//		// inf the number of the element is 1, then, we do not need to sort
//		if (numberOfElements < 1)
//			return;
//		else if(numberOfElements == 1)
//			System.out.println(Arrays.toString(list));
//		else // recursive call
//		int lastElementValue = list[numberOfElements - 1];
//		//find out the next value of the elemts ( one lower index # of the list)
//		int prev = numberOfElements - 2;
//		while(prev >= 0 && list[prev] > lastElementValue) {
//			list[prev + 1] = list[prev];
//			prev--;
//		} list[prev + 1] = lastElementValue;
//		
//	}
//	public static int binarySearch(int[] list, int key, int firstIndex, int lastIndex) {
//		int keyIndex;
//		if(firstIndex > lastIndex) {
//			 ???????????????
//		}
//		else {
//			int mid = ((firstIndex + lastIndex) /2);
//			if(key == list[mid]) {
//				keyIndex = mid;
//			}
//			else if(key < list[mid]) {
//				keyIndex = binarySearch(list, key, firstIndex, mid - 1);
//			}
//			else
//				binarySearch(list, key, mid + 1, lastIndex);
//		}
//		return keyIndex;
//	}
//	public static int[] selectionSort(int[] list, int lowIndex, int highIndex) {
//		if(lowIndex < highIndex) {
//			int indexNumberOfMinimumNumber = lowIndex;
//			int minimumNumber = list[lowIndex];
//			for(int i = lowIndex + 1; i <= highIndex; i++) {
//				if(list[i] < minimumNumber) {
//					minimumNumber = list[i];
//					indexNumberOfMinimumNumber = i;
//				}
//			}
//		}
//		list[indexNumberOfMinimumNumber] = list[lowIndex];
//		list[lowIndex] = minimumNumber;
//		selectionSort(list, lowIndex + 1, highIndex);
//	}
//
//}
