package pattern;

public class pattenstar {
public static void main(String[]args) {
	int n=5;
	for(int i=1;i<=n-1;i++) {
		for(int j=1;j<=i;j++) {
					System.out.print("*");
			}
		for(int k=1;k<=i-1;k--)
		{
			System.out.println(" ");
			}
		}
	}
}