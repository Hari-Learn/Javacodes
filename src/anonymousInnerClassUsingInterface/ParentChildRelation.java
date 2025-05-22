package anonymousInnerClassUsingInterface;

public class ParentChildRelation {
    public static void main(String[] args) {
        Parent child = new Child();
        child.partnerSettling();
        Parent parent = new Parent() {
            @Override
            public void partnerSettling() {
                System.out.println("Using inner class by initiating obj from Parent interface");
            }

        };
        parent.partnerSettling();
    }
}
