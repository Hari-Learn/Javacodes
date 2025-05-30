package anonymousInnerClassUsingAbstractClass;

public class ParentChildRelationship {
    public static void main(String[] args) {
        Parent obj = new Parent() {
            @Override
            public void partnerSetting() {
                System.out.println("No need to create child class with extented the abstract class only need is inner class");
            }
        };

        Parent obj1 = new Parent() {
            @Override
            public void partnerSetting() {
                System.out.println("New obj overriding");
            }
        };
        obj.partnerSetting();
        obj1.partnerSetting();
    }
}

