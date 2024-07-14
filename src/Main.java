public class Main {
    public static void main(String[] args) {
//Task1
        System.out.println("Task-1");
        byte aplle = 10;
        System.out.println("Значение переменной aplle с типом byte равно " + aplle);

        short weight = 25162;
        System.out.println("Значение переменной weight с типом short равно " + weight);

        int cargo = 2312452;
        System.out.println("Значение переменной cargo с типом int равно " + cargo);

        long area = 5000000L;
        System.out.println("Значение переменной area с типом long равно " + area);

        float amount = 11.50f;
        System.out.println("Значение переменной amount с типом float равно " + amount);

        double size = 10.12;
        System.out.println("Значение переменной size с типом double равно " + size);
//Task2
System.out.println("Task-2");
        float a = 27.12f;

        long b = 987678965549L;

        double c = 2.786;

        short d = 569;

        int e = -159;

        short f = 27897;

        byte g = 67;
        System.out.println("Готово.");
//Task3
System.out.println("Task-3");

byte class1 = 23;
byte class2 = 27;
byte class3 = 30;

byte allСlasses = (byte) (class1 + class2 + class3);
        System.out.println("Всего учеников " +allСlasses +".");

        short paper = 480;

        short paperClass = (short) (paper/allСlasses);
        System.out.println("На каждого ученика рассчитано " +paperClass +" листов бумаги" +".");
//Task4
System.out.println("Task-4");
//за 1 минуту
int efficiency1 = 8;
//За 2 минуты
int efficiency = 16;
int time = 2;
int time1 = 1;
//За 1 минуту
int timeEfficiency = (int) (efficiency / time);
        System.out.println("За " +time1 +" минуту машина произвела " +timeEfficiency +" штук бутылок" +".");
//За 20 минут
int time2 = 20;
        int timeEfficiency1 = (int) (efficiency1 * time2);
        System.out.println("За " +time2 +" минут машина произвела " +timeEfficiency1 +" штук бутылок" +".");
//За 1 сутки
int time3 = 1440;
        int timeEfficiency2 = (int) (efficiency1 * time3);
        System.out.println("За " +time3 +" минут машина произвела " +timeEfficiency2 +" штук бутылок" +".");
//За 3 дня
int time4 = 4320;
        int timeEfficiency3 = (int) (efficiency1 * time4);
        System.out.println("За " +time4 +" минут машина произвела " +timeEfficiency3 +" штук бутылок" +".");
//За месяц
int time5 = 43200;
        int timeEfficiency4 = (int) (efficiency1 * time5);
        System.out.println("За " +time5 +" минут машина произвела " +timeEfficiency4 +" штук бутылок" +".");
//Task5
System.out.println("Task-5");
int paint = 120;
//на 1 класс
int paintWhite = 2;
int paintBrown = 4;
int totalClasses = (int) (paint / (paintBrown + paintWhite));
        System.out.println("Всего классов " + totalClasses);
        int totalWhite = (int) (paintWhite * totalClasses);
        int totalBrown = (int) (paintBrown * totalClasses);
        System.out.println("В школе, где " +totalClasses +" классов, нужно " +totalWhite +" банок белой краски и " +totalBrown +" банок коричневой краски" +".");
//Task6
System.out.println("Task-6");
int banana = 80;
int totalBananas = 5;
//сколько грамм в 5 бананов:
        int gramBananas = (int) (banana * totalBananas);
int milk = 105;
int totalMilk = 200;
//сколько грамм в 200мл молока:
        int gramMilk = (int) (milk * totalMilk);
int ice = 100;
int totalIce = 2;
//сколько грамм в 2 брикетах мороженого:
        int gramIce = (int) (ice * totalIce);
int egg = 70;
int totalEgg = 4;
//сколько грамм в 4 Яицах:
        int gramEgg = (int) (egg * totalEgg);

int totalGram = (int) (gramBananas + gramMilk + gramIce + gramEgg);
float kg = 1000f;
        float totalKg = (float) (totalGram / kg);

        System.out.println("Вес спортзавтрака в граммах: " +totalGram +" и в килограммах: " +totalKg +".");
//Task7
System.out.println("Task-7");
int dropKg = 7;
int dropGramm = (int) (dropKg * 1000);
int dropDay1 = 250;
int dropDay2 = 500;
int drop1 = (int) (dropGramm / dropDay1);
int drop2 = (int) (dropGramm / dropDay2);
        System.out.println("Кол-во дней для похудения если терять по " +dropDay1 +" грамм: " +drop1 +".");
        System.out.println("Кол-во дней для похудения если терять по " +dropDay2 +" грамм: " +drop2 +".");
int drop3 = (int) ((drop1 + drop2) / 2);
 System.out.println("Кол-во дней для похудения в среднем " +drop3 +"." );
//Task8
System.out.println("Task-8");
int salaryMasha = 67_760;
int salaryDenis = 83_690;
int salaryKristina = 76_230;

int increasedSalaryMasha = (int) (salaryMasha * 1.1f);
int increasedSalaryDenis = (int) (salaryDenis * 1.1f);
int increasedSalaryKristina = (int) (salaryKristina * 1.1f);

int yearSalaryMasha1 = (int) (salaryMasha * 12);
int yearSalaryDenis1 = (int) (salaryDenis * 12);
int yearSalaryKristina1 = (int) (salaryKristina * 12);
int yearSalaryMasha2 = (int) (increasedSalaryMasha * 12);
int yearSalaryDenis2 = (int) (increasedSalaryDenis * 12);
int yearSalaryKristina2 = (int) (increasedSalaryKristina * 12);

int differenceSalaryMasha = (int) (yearSalaryMasha2 - yearSalaryMasha1);
int differenceSalaryDenis = (int) (yearSalaryDenis2 - yearSalaryDenis1);
int differenceSalaryKristina = (int) (yearSalaryKristina2 - yearSalaryKristina1);

        System.out.println("Маша теперь получает " +increasedSalaryMasha +" рублей. " +"Годовой доход вырос на " +differenceSalaryMasha +" рублей.");
        System.out.println("Денис теперь получает " +increasedSalaryDenis +" рублей. " +"Годовой доход вырос на " +differenceSalaryDenis +" рублей.");
        System.out.println("Кристина теперь получает " +increasedSalaryKristina +" рублей. " +"Годовой доход вырос на " +differenceSalaryKristina +" рублей.");
    }
}