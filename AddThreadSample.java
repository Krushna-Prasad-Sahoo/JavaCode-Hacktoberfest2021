public class AddThreadSample {

	public static void main(String[] args) throws InterruptedException {
		int[] arr = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		
		AddThread t1 = new AddThread(arr , 0 , 3);
		AddThread t2 = new AddThread(arr , 4 , 7);
		AddThread t3 = new AddThread(arr , 8 , 11);
		AddThread t4 = new AddThread(arr , 12 , 15);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		
		int total = t1.sum + t2.sum + t3.sum + t4.sum; 
		
		System.out.println(total);
		
	}

}

class AddThread extends Thread{
	int[] arr;
	int start;
	int end;
	int sum;
	
	public AddThread(int[] arr, int start, int end) {
		super();
		this.arr = arr;
		this.start = start;
		this.end = end;
	}

	
	
	public void run() {
		for(int i = start ; i <= end ; i++ ) {
			sum += arr[i];
		}
	}
}


