package DataBase;

import model.User;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Stateless //��� ������ ������ ��� �����������
public class Auth {
    @EJB
    private UserDB userDB;

    public String register(String login, String password) { //�����������
       /* User user = userDB.findUser(login);
        if (user != null) { //�������� �� ������������� ������������
            return "false";
        }
        user = userDB.createUser(login, password);
        if (user == null) {
            return "false";
        }
        return "true";*/
        return "";
    }

    public String login(String login, String password) { //���� - �������� ������ � ������
        return userDB.findUser(login);
        //User user = userDB.findUser(login);
        /*if (user == null) {
            return "false;-2";
        }
        if (userDB.checkPassword(user, password)) {
            user.generateAccessToken();
            userDB.saveUser(user);
            //����������� ������ � ������
            return "true;" + Base64.getEncoder().encodeToString((login + (char) (31) + user.getAccessToken()).getBytes(StandardCharsets.UTF_8));
        }
        return "false;-1";*/
    }

    public User getUserByToken(String data){ //����� ������������ �� ���������� ������ ����������� ������ �����
        /*String token = new String(Base64.getDecoder().decode(data), StandardCharsets.UTF_8);
        String[] split = token.split(String.valueOf((char) (31)));
        String username = split[0];
        return userDB.findUser(username);*/
        return null;
    }
}
