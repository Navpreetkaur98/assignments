import java.util.Arrays;

public class SortExample
{
    public static void main(String[] args)
    {
        // Our arr contains 8 elements
        int[] arr = {1,1};

        Arrays.sort(arr);

        System.out.printf("Modified arr[] : %s",
                          Arrays.toString(arr));
    }
}