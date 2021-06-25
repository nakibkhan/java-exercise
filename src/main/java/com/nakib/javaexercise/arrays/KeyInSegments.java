package com.nakib.javaexercise.arrays;

class KeyInSegments {
    static boolean findxinkindowSize(int[] arr, int key, int size)
    {
        boolean result = false;

        int batchSize = arr.length/size;

        if(arr.length % size != 0)  {
            batchSize++;
        }

        for (int batch = 0; batch < batchSize; batch++) {
            int startIndex = batch * size;
            int endIndex = startIndex + size;

            if(batch == batchSize -1) endIndex = arr.length;

            for (int i = startIndex; i <endIndex; i++)   {
                System.out.println(arr[i]);
                if(arr[i] == key)   {
                    System.out.println("We have a match in a batch " + batch);
                    result = true;
                    break;
                }

                if(i == endIndex -1) return false;
            }
        }

        return result;
    }

    // Driver Code
    public static void main(String args[])
    {
        int arr[] = new int[] { 3, 5, 2, 4,  9,  3,
                1, 7, 3, 11, 12, 3 };
        int key = 3, size = 3;
        if (findxinkindowSize(arr, key, size))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
