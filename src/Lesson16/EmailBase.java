package Lesson16;

public class EmailBase {
    String emails;
    EmailBase(String emails) {
        this.emails = emails;
    }

    void allDevelopers(){
        while (emails != null) {
            if (emails.contains("; ")) {
                firstDeveloper();
                emails = emails.substring(emails.indexOf("; ") + 1);
            } else {
                firstDeveloper();
                break;
            }
        }
    }

    void firstDeveloper() {
        int i1;
        int i2;
        i1 = emails.indexOf('@') + 1;
        i2 = emails.indexOf('.');
        String developer = emails.substring(i1, i2);
        System.out.println(developer);
    }
}

class EmailBaseTest {
    public static void main(String[] args) {
        EmailBase eb = new EmailBase("nbaitru@gmail.com; chtototam@yandex.ru; nuiposledniy@pochta.com;");
        eb.allDevelopers();
    }
}

