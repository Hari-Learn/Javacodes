import java.util.Arrays;
import java.util.List;

public class StreamsOpsEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,3,4,4,4,5,5,6,7,5,4,7,8,9,11,23,44,11,12);
        System.out.println("Using noneMatch");
        boolean hasNoNegative = list.stream().noneMatch(n->n<0);
        System.out.println(hasNoNegative);

    }
}
