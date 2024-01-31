package main;
import java.util.Scanner;

/**
 * Ohjelman tarkoitus on syöttää opiskelijalle kurssisuorituksia (Kurssin nimi ja numero 
 * – HashMap on toimiva tietorakenne, mutta myös ArrayList + Grade-luokka on varsin toimiva ja huomattavasti helpommin laajennettavissa. 
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        Student newStudent = null;
        //ArrayList<Student> students = new ArrayList<>();
        University university = new University();

        while(!exit) {
            System.out.println("1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritukset, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma");
            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i=Integer.parseInt(stringInput);
                switch(i) {
                    case 1:
                    System.out.println("Anna opiskelijan nimi?");
                    String name = sc.nextLine();
                    System.out.println("Anna opiskelijan opiskelijanumero:");
                    String numberstring1 = sc.nextLine();
                    int snumber = Integer.parseInt(numberstring1);

                    newStudent = new Student(name, snumber);
                    university.addStudent(newStudent);
                    //lisää opiskelija
                    break;

                    case 2:
                    // listaa opiskelijat
                    System.out.println("Opiskelijat:");
                        university.listStudents();
                    break;

                    case 3:
                    //lisää opiskelijalle suorite
                    university.listStudents2();
                    //System.out.println("0: name")
                    System.out.println("Mille opiskelijalla suorite lisätään?");
                    String numberstring = sc.nextLine();
                    int number = Integer.parseInt(numberstring);
                    Student r = university.getStudent(number);
                    System.out.println("Mille kurssille suorite lisätään?");
                    String course = sc.nextLine();
                    System.out.println("Mikä arvosana kurssille lisätään?");
                    String number2string = sc.nextLine();
                    int number2 = Integer.parseInt(number2string);
                    r.addGrade(course, number2);


                    //tallenna tiedot

                    break;

                    case 4:
                    //listaa suoritukset
                    //System.out.println("0: name")
                    university.listStudents2();
                    System.out.println("Minkä opiskelijan suoritteet listataan?");
                    String number4string = sc.nextLine();
                    int number4 = Integer.parseInt(number4string);
                    Student x = university.getStudent(number4);
                    x.listGrades();
                    break;

                    case 5: 
                    //suoritusten keskiarvo
                    university.listStudents2();
                    System.out.println("Minkä opiskelijan suoritteiden keskiarvo lasketaan?");
                    String number5string = sc.nextLine();
                    int number5 = Integer.parseInt(number5string);
                    Student s = university.getStudent(number5);
                    Calculator calculator = new Calculator();
                    double getAverageGrade = calculator.getAverageGrade(s);
                    System.out.println("Keskiarvo on "+getAverageGrade);

                    break;

                    case 6:
                    //suoritusten mediaani
                    university.listStudents2();
                    System.out.println("Minkä opiskelijan suoritteiden mediaani lasketaan?");
                    String number6string = sc.nextLine();
                    int number6 = Integer.parseInt(number6string); 
                    Student y = university.getStudent(number6);
                    Calculator calculator2 = new Calculator();
                    double getMedianGrade = calculator2.getMedianGrade(y);
                    System.out.println("Mediaani on "+getMedianGrade);

                    break;

                    case 7:
                    university.saveStudents();
                    //tallenna opiskelijat tiedostoon
                    // ei ilmoita mitään
                    break;

                    case 8:
                    university.loadStudents();
                    //lataa tiedostosta
                    // overwritee vanhan listan
                    break;

                    case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    exit = true;
                    break;

                    default:
                    System.out.println("Syöte oli väärä");
                    break;

                }
            }

        }

        sc.close();
    }
}
