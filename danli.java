class Single{
    //�Լ�����һ������
      private static Single INSTANCE=new Single();
      private SIngle(){}                                            //˽�л����췽��
      public static Single getInstance(){                 //�ṩ���ظö���ľ�̬����
                return INSTANCE;
      }
}
