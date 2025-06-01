package anonymousInnerClassUsingInterface;

public class ParentChild implements Parent {

    @Override
    public void partnerSettling() {
        System.out.println("Test");
    }

    public static void main(String[] args) {
        Parent ps = new ParentChild(){
            @Override
            public void partnerSettling() {
                System.out.println("Testing");
            }
        };
        ps.partnerSettling();
    }


}
