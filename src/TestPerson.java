public class TestPerson {
    public static void main(String[] args) {
        Person per = new Person();
        per.setName("zs");
        per.setAge(223);

        System.out.println(per.getName());
        System.out.println(per.getAge());

//        per.name = "zs";
//        per.age = 11123; // 数据不安全
//        per.showInfo();
    }
}
