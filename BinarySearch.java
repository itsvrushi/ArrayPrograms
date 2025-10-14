package Arrays;

public class BinarySearch {

	public static void main(String[] args) {
	int ar[]= {2,5,15,31,42,4,86,91,99,102,286};	
	
	BinarySearch(ar, 99);
	System.out.println(Arrays.toString(a));
	}
	
	public static void BinarySearch(int[]a,int search) {
		
		bubbleSort.BubbleSort(a);
		
		int start=0,end=a.length-1,mid=(start+end)/2;
		
		while(start<=end)
		{
			if (start==search) {
				System.out.println("the element found at "+a[mid]+"Index");
				break;
			}else if (a[mid]<search){
				start=mid+1;
			}else if (a[mid]>search) {
				end=mid-1;
			}
			
			
		}
		}
		
	}

