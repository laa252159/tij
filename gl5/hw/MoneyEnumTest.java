package gl5.hw;

enum Money{
  RUB, DOL, YEN, FR, BEL_RUB, MARK
}

public class MoneyEnumTest{
   public static void main(String[] args){
     for(Money m : Money.values()){
        describe(m);
     } 
   }

   private static void describe(Money money){
      switch(money){
        case RUB:
	case BEL_RUB: 
                     System.out.println(money + " weak money");
		     break;
        case FR:
	case MARK:
                     System.out.println(money + " strong money");
		     break;
	case DOL:
                     System.out.println(money + " universe money");
		     break;
	             
      }
   }
}
