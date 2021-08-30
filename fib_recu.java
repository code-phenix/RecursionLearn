class fib_recu{
    public static void main(String args[]){
        //System.out.println(fib(10));
        // print_rec(100);
        // System.out.println(sumOfN(100));

        //printArrayRec(new int[]{1,2,3,4,5},4);
        // System.out.println(fib_recu.printCountOfGivenNumber(50000));
        int a=6+5/2;
        System.out.println(a);
        System.out.println(binarySearch(new int[]{3,24,50,79,88,150,345}, 0, 6 ,150));
    }
    public static int binarySearch(int arr[],int start,int end,int key){
        if(start<=end){
            int mid=start+(end-1)/2;
            System.out.println("Start="+start);
            System.out.println("mid="+mid);
            System.out.println("end="+end);
            if(arr[mid]==key){
                return mid;
            }
            else{
             if(arr[mid]>key){
                return binarySearch(arr, start, mid-1, key);
            }
            else{
                return binarySearch(arr, mid+1, end, key);
            }
        }
            
        }
        return -1;   
    }
    static int count=0;
    public static int printCountOfGivenNumber(int num){
        // int count=0;
        // System.out.println("count"+count);
        if(num!=0){
            count++;
        printCountOfGivenNumber(num/10);
        }
                return count;
    }
    public static void printArrayRec(int arr[],int index){
        if(index<0){
            return ;
        }
        System.out.println(index+" index of "+arr[index]);
        printArrayRec(arr, index-1);
        return;
    }
    public static int sumOfN(int num){
        if(num==1){
            return 1;
        }
        return num+sumOfN(num-1);
    }
    public static void print_rec(int num){
        if(num==0){
            return ;
        }
        print_rec(num-1);
        System.out.print(num+" ");
        return;
    }
    public static long fib(int num){
        if(num==1){
            return 1l;
        }
        else{
            return num*fib(num-1);
        }
    }
}