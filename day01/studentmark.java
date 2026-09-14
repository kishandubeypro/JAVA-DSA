package day01;

public class studentmark {
    public static void main(String[]args){
        int math =75;
        int physics =80;
        int java =85;
        int automata =95;
        int computer =99;
        int graphics =99;
        int total= math+physics+java+automata+computer+graphics;
        System.out.println(total);
        double average= total/6.0;
        System.out.println(average);
        double percentage= total/6.0;
        System.out.println(percentage);

    }
}
