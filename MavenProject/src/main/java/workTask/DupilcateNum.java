package workTask;

public class DupilcateNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,2,4,6,7,8,2,9,4};
		
		DupilcateNum find = new DupilcateNum();
		 find.findDupicateInArray(a);


	}

	public void findDupicateInArray(int[] a) {
        int count=0;
        for(int j=0;j<a.length;j++) {
            for(int k =j+1;k<a.length;k++) {
                if(a[j]==a[k]) {
                    count++;
                }
            }
            if(count==1)
               System.out.println("Duplicate num is ="+a[j]);
            count = 0;
        }
    }
}
