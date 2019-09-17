class Single{
    //自己创建一个对象
      private static Single INSTANCE=new Single();
      private SIngle(){}                                            //私有化构造方法
      public static Single getInstance(){                 //提供返回该对象的静态方法
                return INSTANCE;
      }
}
public class Example{
    public static void main(String[] args){
    Single s1=Single.getInstance();
    Single s2=Single.getInstance();
   System.out.println(s1==s2);
  }
}
