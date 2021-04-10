package main;
public class ThreadProcessor extends Thread {
	
	float A[];
	float B[];
	float C[];
	int start, end;
	
	public ThreadProcessor(float[] tA, float[] tB, float[] tC, int s, int e) {
		A = tA;
		B = tB;
		C = tC;
		start = s;
		end = e;
	}
	
	public void run() {
		for (int i = start; i < end; i++)
			C[i] = A[i] + B[i];		
	}
}
