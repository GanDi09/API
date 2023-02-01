public class Main {


    public static void main(String[] args) {
        Post post = new Post();
        FormDate birthday = new FormDate();


        post.name = "John";
        post.passport = "3456 № 768493";
        post.patronymic = "Olegovich";
        post.phone = "+7(888)876-48-55";
        post.surname = "Iverson";
        post.subscription = true;


        birthday.day = 5;
        birthday.month = 11;
        birthday.year = 1999;

        System.out.println(post.name);
        System.out.println(birthday.day);
    }
}
