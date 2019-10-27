public class InnerClass{
    public void panggilrealInner(){
        RealInnerClass realInnerClass = new RealInnerClass();
        realInnerClass.setrealInner();
    }

    public class RealInnerClass{
        public void setrealInner(){
            System.out.println("Welcome to jual beli baju online");
        }
    }
}