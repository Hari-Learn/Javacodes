package anonymousInnerClassUsingConcreteClass;

public class ParentChildRelation {
    public static void main(String[] args) {
        System.out.println();
        Parent child = new Parent();
        child.partnerSetting();
        Parent child1 = new Children();
        child1.partnerSetting();
        System.out.println("inner class");
        Parent child2 = new Parent(){
            @Override
            public void partnerSetting() {
                System.out.println("Inner class example - like inner mind telling that marriage is child decision");
            }
        };
        child2.partnerSetting();
    }
}
