//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a=1000;
        byte b=55;
        short c=20000;
        long d=1000000;
        float e=3.1f;
        double f=3.3333;
        System.out.println("значение переменной a с типом int равно "+a);
        System.out.println("значение переменной b с типом byte равно "+b);
        System.out.println("значение переменной c с типом short равно "+c);
        System.out.println("значение переменной d с типом long равно "+d);
        System.out.println("значение переменной e с типом float равно "+e);
        System.out.println("значение переменной f с типом double равно "+f);
        float z1=27.12f;
        long z2=987678965549L;
        float z3=2.786f;
        short z4=569;
        short z5=-159;
        short z6=27897;
        byte z7=67;

byte LP=23;
byte AS=27;
byte EA=30;
short allPaper=480;
int paperOneStudent=allPaper/(LP+AS+EA);
System.out.println("На каждого ученика рассчитано "+paperOneStudent+" листов бумаги");

      byte bottle2Min=16;
      int bottle1Min=bottle2Min/2;
      int bottle20Min=bottle1Min*20;
      int bottleDay=bottle1Min*1440;
      int bottle3Day=bottleDay*3;
      int bottleMonth=bottleDay*30;

      System.out.println("За 20 минут машина произвела "+bottle20Min+" штук бутылок");
        System.out.println("За сутки машина произвела "+bottleDay+" штук бутылок");
        System.out.println("За три дня машина произвела "+bottle3Day+" штук бутылок");
        System.out.println("За месяц машина произвела "+bottleMonth+" штук бутылок");

        byte totalPot=120;
        byte oneKlassWhite=2;
        byte oneKlassBrown=4;
        int oneKlassColor=oneKlassWhite+oneKlassBrown;
        int totalKlass=totalPot/oneKlassColor;
        int whiteColorAll=totalKlass*oneKlassWhite;
        int brownColorAll=totalPot-whiteColorAll;

        System.out.println("В школе,где "+totalKlass+" классов, нужно "+whiteColorAll+ " ,банок белой краски и "+brownColorAll+" банок коричневой краски");

        byte bananasCount=5;
        byte bananasWeight=80;
        int totalBananas=bananasCount*bananasWeight;
        short milkVolume=200;
        short milkWeight=105;
        int totalMilk=milkWeight*2;
        short iceCream=2;
        short iceCream1Count=100;
        int totalIceCream=iceCream*iceCream1Count;
        byte eggsCount=4;
        byte eggs1Weight=70;
        int totalEggs= eggs1Weight*eggsCount;
        double weightBreakfast=totalBananas+totalMilk+totalIceCream+totalEggs;
        double weightBreakfastKg=weightBreakfast/1000;

System.out.println("Вес такого спортзавтрака = "+weightBreakfastKg+ " кг");

int ambitionKg=7;
int ambitionGram=ambitionKg*1000;
int minDay250=ambitionGram/250;
int minDay500=ambitionGram/500;
int average=(minDay250+minDay500)/2;

System.out.println("Если спортсмен будет худеть в день по 250 граммов ему потребуется "+minDay250+ " дней.");
System.out.println("Если спортсмен будет худеть в день по 500 граммов ему потребуется "+minDay500+ " дней.");
System.out.println("В среднем спортсмену потребуется "+average+ " день.");

int moneyM=67760;
int moneyD=83690;
int moneyK=76230;

        int cashM=(moneyM/100)*10+moneyM;
        int cashD=(moneyD/100)*10+moneyD;
        int cashK=(moneyK/100)*10+moneyK;
        System.out.println("Зарплата Маши после повышения = "+cashM+" рублей в месяц");
        System.out.println("Зарплата Дениса после повышения = "+cashD+" рублей в месяц");
        System.out.println("Зарплата Кристины после повышения = "+cashK+" рублей в месяц");
        int yearCashMBefore=moneyM*12;
        int yearCashDBefore=moneyD*12;
        int yearCashKBefore=moneyK*12;
        System.out.println("Годовая зарплата Маши до повышения= "+yearCashMBefore+" рублей");
        System.out.println("Годовая зарплата Дениса до повышения= "+yearCashDBefore+" рублей");
        System.out.println("Годовая зарплата Кристины до повышения= "+yearCashKBefore+" рублей");
        int yearCashMAfter=cashM*12;
        int yearCashDAfter=cashD*12;
        int yearCashKAfter=cashK*12;
        System.out.println("Годовая зарплата Маши после повышения= "+yearCashMAfter+" рублей");
        System.out.println("Годовая зарплата Дениса после повышения= "+yearCashDAfter+" рублей");
        System.out.println("Годовая зарплата Кристины после повышения= "+yearCashKAfter+" рублей");
        int differenceCashM=yearCashMAfter-yearCashMBefore;
        int differenceCashD=yearCashDAfter-yearCashDBefore;
        int differenceCashK=yearCashKAfter-yearCashKBefore;
        System.out.println("Разница годового дохода Маши до и после повышения= "+differenceCashM+" рублей");
        System.out.println("Разница годового дохода Дениса до и после повышения= "+differenceCashD+" рублей");
        System.out.println("Разница годового дохода Кристины до и после повышения= "+differenceCashK+" рублей");

        System.out.println("Маша теперь получает "+cashM+" рублей. Годовой доход вырос на "+differenceCashM+" рублей");
        System.out.println("Денис теперь получает "+cashD+" рублей. Годовой доход вырос на"+differenceCashD+" рублей");
        System.out.println("Кристина теперь получает "+cashK+" рублей. Годовой доход вырос на "+differenceCashK+" рублей");

    }
}