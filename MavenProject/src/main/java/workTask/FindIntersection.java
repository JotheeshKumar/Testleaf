package workTask;

public class FindIntersection {
	
	void interSection(int[] arr1, int[] arr2) {
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0;j<=arr2.length-1;j++) {
				if(arr1[i]==arr2[j]) {
					Display(arr1[i]);
				}
			}	
		}
	}
	void Display(int d) {
		System.out.println(" array intersections are : "+d);
	}

	public static void main(String[] args) {
		int[] Arr1={3,2,11,4,6,7};
		int[] Arr2={1,2,8,4,9,7};
		FindIntersection FI= new FindIntersection();
		FI.interSection(Arr1,Arr2);

	}

}
