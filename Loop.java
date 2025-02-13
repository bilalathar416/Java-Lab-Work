class Loop{
    public static void main(String[] args) {
        int i,j,k;
        for(i=1;i<=5;i=i+1)
        {
            for(j=0;j<=i;j=j+1)
            {
                System.out.print(" ");
            }
            for(k=10-(2*i-1);(k+i)>=j;k=k-2)
            {
                System.out.print(k);
            
            }     
            System.out.print("\n");         
        }
        
    }    
}
