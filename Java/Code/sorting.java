import java.util.Arrays;
import java.util.ArrayList;
public class sorting{
	public static void main(String[] args){
		int[] list = {9,2,12,5,3,46,3,2,6,79,21, 2,5,3,25,6,74,4};
		System.out.println("bubble sort: " + Arrays.toString(bubbleSort(list.clone())));
		System.out.println("insertion sort: " + Arrays.toString(insertionSort(list.clone())));
		System.out.println("selection sort: " + Arrays.toString(selectionSort(list.clone())));
		System.out.println("shell sort: " + Arrays.toString(shellSort(list.clone())));
		System.out.println("merge sort: " + Arrays.toString(mergeSort(list.clone())));
		int[] l2 = list.clone();
		quicksort(l2, 0 , l2.length-1);
		System.out.println("quick sort: " + Arrays.toString(l2));
		// int[] res = list.clone();
		// int[] t2 = new int[list.length];
		// mergeSort(res, t2, 0, list.length-1);
		// System.out.println("merge sort: " + Arrays.toString(res));
		
	}
	private static int[] bubbleSort(int[] list){
		for(int i = 0; i < list.length-1; i++){
			for(int j = 0; j < list.length-1-i; j++){
				if(list[j] > list[j+1]){
					int tmp = list[j];
					list[j] = list[j+1];
					list[j+1] = tmp;
				}
			}
		}
		return list;
	}

	private static int[] insertionSort(int[] nums){
		for(int i = 0; i < nums.length-1; i++){
			for(int j = i+1; j > 0; j--){
				if(nums[j]>nums[j-1])break;
				int tmp = nums[j];
				nums[j] = nums[j-1];
				nums[j-1] = tmp;
			}
		}
		return nums;
	}


	private static int[] selectionSort(int[] nums){
		for(int i = 0; i < nums.length-1; i++){
			int min = nums[i];
			for(int j = i+1; j < nums.length; j++){
				if(nums[j] < min){
					nums[i] = nums[j];
					nums[j] = min;
					min = nums[i];
				}
			}
		}
		return nums;
	}

	private static int[] shellSort(int[] nums){
		int gap = 1, i,j,len = nums.length;
		int tmp;
		while(gap < len/3) // 初始步长 这个可能比较优秀
			gap = gap*3+1;
		for(; gap >0; gap/=3){
			for(i = gap; i < len; i++){
				tmp = nums[i];
				for(j = i - gap; j >= 0 && nums[j]>tmp; j-=gap)
					nums[j+gap] = nums[j];
				nums[j+gap] = tmp;
			}
		}
		return nums;	
	}

	private static int[] merge(int[] a, int[] b){
		int[] c = new int[a.length+b.length];
		int i = 0, j = 0, k = 0;
		while(i < a.length && j < b.length)
			c[k++] = (a[i]<b[j])?a[i++]:b[j++];
		while(i<a.length)c[k++]=a[i++];
		while(j<b.length)c[k++]=b[j++];
		return c;
	}

	private static int[] mergeSort(int[] nums){
		int l = nums.length;
		if(l < 2) return nums;
		int[] a = new int[l/2];
		int[] b = new int[l - l/2];
		a = Arrays.copyOfRange(nums, 0, l/2);
		b = Arrays.copyOfRange(nums, l/2, l);
		return merge(mergeSort(a),mergeSort(b));
	}

	private static void quicksort(int[] nums, int low, int high){
		if(nums == null || nums.length == 0)return;
		if(low>=high)return;
		int pivot = nums[(high+low)/2];
		int i = low, j = high;
		while(i <= j){
			while(nums[i]<pivot)i++;
			while(nums[j]>pivot)j--;
			if(i<=j){
				int tmp = nums[i];
				nums[i++] = nums[j];
				nums[j--] = tmp;
			}
		}
		if(low<j)quicksort(nums,low,j);
		if(high>i)quicksort(nums,i,high);
	}

	private static int[] bucketSort(int[] nums){
		return null;
		//create arrays of buckets
		//for i = 0 to nums.length do
		//insert nums[i] into correct bucket
		//for i = 0 to numberOfBuckets do
		//sort them in order
		//return 一个接一个的buckets content

		//Note that for bucket sort to be {\displaystyle O(n)} O(n) on average, 
		//the number of buckets n must be equal to the length of the array being sorted, 
		//and the input array must be uniformly distributed across the range of possible 
		//bucket values.[1] If these requirements are not met, the performance of bucket 
		//sort will be dominated by the running time of nextSort, which is typically 
		//{\displaystyle O(n^{2})} O(n^{2}) insertion sort, making bucket sort less optimal 
		//than {\displaystyle O(n\log(n))} O(n\log(n)) comparison sort algorithms like 
		//Quicksort.

		//对该算法简单分析，如果数据是期望平均分布的，则每个桶中的元素平均个数为N/M。
		//如果对每个桶中的元素排序使用的算法是快速排序，每次排序的时间复杂度为O(N/Mlog(N/M))。
		//则总的时间复杂度为O(N)+O(M)O(N/Mlog(N/M)) = O(N+ Nlog(N/M)) = O(N + NlogN - NlogM)。
		//当M接近于N是，桶排序的时间复杂度就可以近似认为是O(N)的。就是桶越多，时间效率就越高，
		//而桶越多，空间却就越大，由此可见时间和空间是一个矛盾的两个方面。

		//从整体上来说，计数排序，桶排序都是非基于比较的排序算法，而其时间复杂度依赖于数据的范围，
		//桶排序还依赖于空间的开销和数据的分布。
		//而基数排序是一种对多元组排序的有效方法，具体实现要用到计数排序或桶排序。
	}
}