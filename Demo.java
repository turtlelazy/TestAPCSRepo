public class Demo{
	public static String arrToString(int[] arr){
		String array = "{" ;
	  for(int i =0;i<arr.length;i++){
		array+=arr[i];
		if(i!=arr.length-1){
		  array+=", ";
		}
	  }
	  array+="}";
	  return array;
	}
	
	public static String arrayDeepToString(int[][]arr){
		String twoD = "";
		for(int i = 0; i<arr.length;i++){
			twoD+=arrToString(arr[i]);
		}
		return twoD;
	}
	
	public static int[][]create2DArray(int rows, int cols, int maxValue){
		int[][] returnArray = new int[rows][cols];
		for(int i = 0;i<rows;i++){
			for(int j = 0;j<cols;j++){
				returnArray[i][j] = (int)(Math.random() * (maxValue+1));
			}
		}
		return returnArray;
	}
	
	public static int[][]create2DArrayRandomized(int rows, int cols, int maxValue){
		int[][] returnArray = new int[rows][];
		for(int i = 0;i<rows;i++){
			returnArray[i] = new int[(int)(Math.random() * (cols+1))];
			for(int j = 0;j<returnArray[i].length;j++){
				returnArray[i][j] = (int)(Math.random() * (maxValue+1));
			}
		}
		return returnArray;
	}
	
	public static void main(String[] args){
		int n;
		if (args.length>0){
			n = Integer.parseInt(args[0]);
		}
		else{
			n = 5;
		}
		
		
		for(int i = 1; i<=n;i++){
			String current = "";
			for(int j = n;j>=i;j--){
				current += i + " ";
			}
			System.out.println(current);
		}
	}

}