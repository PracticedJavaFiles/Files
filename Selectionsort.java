import java.util.Arrays;

public class Selectionsort {
	public static void main(String[] args) {
		int[] a= {7,8,9,3,2,1};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int[] a) {
		for(int i=0;i<a.length;i++) {
			int index=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[index]) index=j;
			}
			if(i!=index) {
				int temp=a[index];
				a[index]=a[i];
				a[i]=temp;
			}
		}
	}
}
