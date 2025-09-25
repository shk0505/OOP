import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setInfo();
        Student s2 = new Student();
        s2.setInfo();
        Student s3 = new Student();
        s3.setInfo();
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        System.out.printf("첫번째 학생: %d %s %s %s\n", s1.getIDNum(), s1.getName(), s1.getMajor(), s1.getPhoneNum());
        System.out.printf("두번째 학생: %d %s %s %s\n", s2.getIDNum(), s2.getName(), s2.getMajor(), s2.getPhoneNum());
        System.out.printf("세번째 학생: %d %s %s %s\n", s3.getIDNum(), s3.getName(), s3.getMajor(), s3.getPhoneNum());
    }
}

class Student {
    int IDNum, PhoneNum;
    String Name, Major, strPhoneNum;
    Student() {
        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
    }
    void setInfo() {
        Scanner sc = new Scanner(System.in);
        IDNum = sc.nextInt();
        Name = sc.next();
        Major = sc.next();
        PhoneNum = sc.nextInt();
    }
    int getIDNum() { return IDNum; }
    String getName() { return Name; }
    String getMajor() { return Major; }
    String getPhoneNum() {
        strPhoneNum = Integer.toString(PhoneNum);
        return "0" + strPhoneNum.substring(0,2) + "-" + strPhoneNum.substring(2,6) + "-" + strPhoneNum.substring(6,10);
    }
}