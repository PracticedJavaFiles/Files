public class Linearsearch {

	public static void main(String[] args) {
		int[] a= {2,4,5,6,7,8};
		System.out.println(search(a,4));

	}
	public static int search(int[] a,int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) return i;
		}
		return -1;
	}
	

}
