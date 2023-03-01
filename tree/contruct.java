package tree;

import java.util.*;

public class contruct {

	static Scanner scn = new Scanner(System.in);

	static int min = Integer.MIN_VALUE;

	static int max = Integer.MAX_VALUE;

	static int mod = 1000000007;

	static ArrayList<ArrayList<Integer>> tree = new ArrayList<>();

	public static void main(String[] args) {

		int t = 1;

		// t = scn.nextInt();

		while (t-- > 0) {

			tree = new ArrayList<>();

			int n = scn.nextInt();

			for (int i = 0; i < n; i++) {
				tree.add(new ArrayList<>());
			}

			for (int i = 0; i < n - 1; i++) {
				int s = scn.nextInt() - 1;
				int e = scn.nextInt() - 1;

				tree.get(s).add(e);
				tree.get(e).add(s);
			}

//			print(tree);
			
			printlevelwise(tree);
		}
	}

	public static void print(ArrayList<ArrayList<Integer>> tree) {
		dfs(tree, 0, -1);
	}

//	Tree-1
//	6
//	1 2
//	1 3
//	1 4
//	3 5
//	3 6

//	Tree -2
//	8
//	1 2
//	1 8
//	1 3
//	8 4
//	8 5
//	3 6
//	3 7

	public static void dfs(ArrayList<ArrayList<Integer>> tree, int node, int par) {

		pt(node + 1);
		ArrayList<Integer> childs = tree.get(node);

		for (int child : childs) {
			if (child != par) {
				dfs(tree, child, node);
			}
		}
	}

	public static void printlevelwise(ArrayList<ArrayList<Integer>> tree) {

		ArrayDeque<Integer> que=new ArrayDeque<>();
		
		que.add(0);
		
		boolean[] visited=new boolean[tree.size()];
		
		while(!que.isEmpty()) {
			
			int n=que.size();
		
			
			for(int i=0;i<n;i++)
			{
				int el=que.remove();
				visited[el]=true;
				
				p(el+1+" ");
				
				for(int x:tree.get(el)) {
					if(!visited[x])
					que.add(x);
				}	
			}
			pt("");
		}
	}

	public static void arrin(int[] arr, int n) {
		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();
	}

	public static <T> void pt(T x) {
		System.out.println(x);
		return;
	}

	public static <T> void pt(T str, T x) {
		System.out.println(str + "" + x);
		return;
	}

	public static int max(int[] arr) {
		int max = Integer.MIN_VALUE;

		for (int x : arr) {
			max = max(max, x);
		}
		return max;
	}

	public static int min(int[] arr) {
		int min = Integer.MAX_VALUE;

		for (int x : arr) {
			min = min(min, x);
		}
		return min;
	}

	public static <T> void p(T x, T y) {
		System.out.print(x + "" + y);
		return;
	}

	public static <T> void p(T x) {
		System.out.print(x);
		return;
	}

	public static int max(int x, int y) {
		return Math.max(x, y);
	}

	public static int min(int x, int y) {
		return Math.min(x, y);
	}

	public static int abs(int x, int y) {
		return Math.abs(x - y);
	}

	public static <T> void sort(T arr) {
		Arrays.sort((int[]) arr);
		return;
	}

	public static void sortr(int[] arr) {
		int n = arr.length;

		Integer[] ar = new Integer[n];

		for (int i = 0; i < n; i++)
			ar[i] = arr[i];

		Arrays.sort(ar, (a, b) -> {
			return b - a;
		});

		for (int i = 0; i < n; i++)
			arr[i] = ar[i];

	}

	public static long min(long x, long y) {
		return (x > y) ? x : y;
	}

	public static int gcd(int a, int b) {
		while (b > 0) {
			int c = a % b;
			a = b;
			b = c;
		}
		return a;
	}

	public static long gcd(long a, long b) {
		while (b > 0l) {
			long c = a % b;
			a = b;
			b = c;
		}
		return a;
	}

	public static void arrin(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();
	}
}
