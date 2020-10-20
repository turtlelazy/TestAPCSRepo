public class Demo{
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