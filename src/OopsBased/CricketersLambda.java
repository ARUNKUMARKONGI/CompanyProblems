package OopsBased;
import java.util.*;
import java.util.stream.Collectors;

class Cricketers {
    private String name;
    private int age;
    private String role;
    private int runs;

    public Cricketers(String name, int age, String role, int runs) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.runs = runs;
    }

    public Cricketers() {
       // this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    @Override
    public String toString() {
        return "Cricketers{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                ", runs=" + runs +
                '}';
    }
}
public class CricketersLambda{
    public static void main(String[] args) {
        Cricketers c1=new Cricketers("Kohli",33,"batsman",12000);
        Cricketers c2=new Cricketers("Rohit",34,"Opener",9000);
        Cricketers c3=new Cricketers("Rinku",28,"finisher",1000);
        Cricketers c4=new Cricketers("Jadeja",30,"allrounder",4000);
        Cricketers c5=new Cricketers("Rahul",30,"batsman",6000);

        List<Cricketers> lst=Arrays.asList(c1,c2,c3,c4,c5);

        lst.stream().filter(i->i.getRole().equals("batsman")).forEach(System.out::println);

        //lst.stream().filter(i->i.getRole().equals("batsman")&&i.getAge()<=30).forEach(System.out::println);

        Double avg=lst.stream().filter(i->i.getRole().equals("batsman")).collect(Collectors.averagingInt(Cricketers::getRuns));
        System.out.println("average runs of batsman: "+avg);

       Double avgRuns=lst.stream().collect(Collectors.averagingInt(Cricketers::getRuns));
//       Double avgAge=lst.stream().collect(Collectors.averagingInt(Cricketers::getAge));
        System.out.println("Average runs of all players: "+avgRuns);

        Optional<Cricketers> maxRuns = lst.stream().max(Comparator.comparingInt(Cricketers::getRuns));
        System.out.println(maxRuns);

        maxRuns.ifPresent(i -> System.out.println("Cricketer with maximum runs: " + i.getName()));




    }
}
