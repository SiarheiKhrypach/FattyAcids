package by.tut.ssmt.app.servlets;

import by.tut.ssmt.app.dao.UserData;
import by.tut.ssmt.app.entities.Product;
import by.tut.ssmt.app.entities.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("views/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String loginName = req.getParameter("name");
        String loginPass = req.getParameter("pass");
        User user = new User(loginName, loginPass);

        UserData data = UserData.getInstance();
        List<String> names = data.listNames();
        List<String> passwords = data.listPasswords();

        for (int i = 0; i < names.size(); i++) {
            if (loginName.equals(names.get(i)) && loginPass.equals(passwords.get(i))) {
                req.setAttribute("userName", loginName);
                req.getRequestDispatcher("/welcome").forward(req, resp);
            }
        }

        req.getRequestDispatcher("views/decline.jsp").forward(req, resp);
        doGet(req, resp);
    }

}
