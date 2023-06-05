public class Solution {


public static void main(String[] args) {
/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
Scanner scan = new Scanner(System.in);
int num = 0;
while (scan.hasNextLine()) {
String n = scan.nextLine();
num++;
System.out.println(num + " " + n);
}
}
}
