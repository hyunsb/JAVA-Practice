package InflearnJavaAlgorithm.Section8_DFS_BFS;

import java.util.*;

public class _4_Permutation_DFS{
	static int[] pm;
	static int n, m;
	public void DFS(int L){
		if(L==m){
			for(int x : pm) System.out.print(x+" ");
			System.out.println();
		}
		else{
			for(int i=1; i<=n; i++){
				pm[L]=i;
				DFS(L+1);
			}
		}
	}
	public static void main(String[] args){
		_4_Permutation_DFS T = new _4_Permutation_DFS();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		pm=new int[m];
		T.DFS(0);
	}
}
