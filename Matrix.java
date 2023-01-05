import java.util.Scanner;

public class Matrix {
    private int n, m;
    private int[][] numbers;
    public Scanner sc = new Scanner(System.in);
    public Matrix(int n, int m){
        this.n = n;
        this.m = m;
        numbers = new int[n][m];
        System.out.println("Add array:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                this.numbers[i][j] = sc.nextInt();
            }
        }
    }
    public Matrix(){
        this.n = 3;
        this.m = 4;
        numbers = new int[n][m];
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                sum++;
                this.numbers[i][j] = sum;
            }
        }
    }

    public int[][] getNumbers(){
        return this.numbers;
    }
    public int getN(){
        return this.n;
    }
    public int getM(){
        return this.m;
    }
    public void add(int[][] arr){
        int[][] ans = new int[this.numbers.length][this.numbers[0].length];
        if((this.numbers.length == arr.length) && (this.numbers[0].length == arr[0].length)){
            for(int i = 0; i < this.numbers.length; i++){
                for(int j = 0; j < this.numbers[0].length; j++){
                    ans[i][j] = this.numbers[i][j] + arr[i][j];
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println("");
            }
        }
        else{
            System.out.println("Number of columns and rows are different");
        }
    }
    public void multiply(int n){
        int[][] ans = new int[this.numbers.length][this.numbers[0].length];
        for(int i = 0; i < this.numbers.length; i++){
            for(int j = 0; j < this.numbers[0].length; j++){
                ans[i][j] = this.numbers[i][j] * n;
                System.out.print(ans[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public void printout(){
        for(int i = 0; i < this.numbers.length; i++){
            for(int j = 0; j < this.numbers[0].length; j++){
                System.out.print(this.numbers[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
