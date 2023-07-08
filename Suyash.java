class Suyash{
    public static int find_gcd(int a,int b){
        if (a==0){
            return b;
        }
        return find_gcd(b%a,a);
    }
    public static void main(String[] args) {
        int z=find_gcd(10, 5);
        System.out.println(z);
    }
}