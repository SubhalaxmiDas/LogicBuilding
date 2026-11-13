import java.util.Scanner;

class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j <= i; j++) 
            {
                System.out.print(i + 1);
            }
            System.out.println();
        }
        sc.close();
    }
}

OP:
Enter N: 4
1
22
333
4444
