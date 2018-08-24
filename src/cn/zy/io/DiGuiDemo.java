package cn.zy.io;

public class DiGuiDemo {
	public static void main(String[] args) {
		//计算 1~num 的和， 使用递归完成
		int n = 5;
		int sum = getSum(n);
		System.out.println(sum);
		}
	public static int getSum(int n) {
		if(n == 1){
		return 1;
		}return n + getSum(n-1);
		}

}
