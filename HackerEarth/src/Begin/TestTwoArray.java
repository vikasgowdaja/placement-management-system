package Begin;

class GFG
{
     
    // Function for finding elements
    // which are there in a[] but not
	// in b[].
    static void findMissing(int a[], int b[],
                            int n, int m)
    {
        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < m; j++)
                if (a[i] == b[j])
                    break;
            if (j == m)
                System.out.print(a[i] + " ");
        }
    }
    // Driver Code
    public static void main(String[] args)
    {
        int a[] = { 1, 2, 6, 3, 4, 5 };
        int b[] = { 2, 4, 3, 1, 0 };
         int n = a.length;
        int m = b.length;
        findMissing(a, b, n, m);
    }
}
