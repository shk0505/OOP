import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Homework8 {
    private Map<String, String> auth;
    private String id, pw;

    Homework8() {
        auth = new HashMap<>();
        auth.put("myId", "myPass");
        auth.put("myId2", "myPass2");
        auth.put("myId3", "myPass3");
    }

    void login() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("id와 password를 입력해주세요.\nid : ");
            id = sc.nextLine().trim();
            if (!auth.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }
            System.out.print("password : ");
            pw = sc.nextLine().trim();
            if (auth.get(id).equals(pw)) {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            } else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요\n");
            }
        }
    }

    public static void main(String[] args) {
        Homework8 h = new Homework8();
        h.login();
    }
}
