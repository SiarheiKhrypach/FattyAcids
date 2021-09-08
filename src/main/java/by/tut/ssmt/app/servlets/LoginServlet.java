package by.tut.ssmt.app.servlets;

import by.tut.ssmt.app.dao.UserData;
import by.tut.ssmt.app.entities.User;
import by.tut.ssmt.app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class LoginServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Model model = Model.getInstance();
//        List<String> names = model.list();
//        req.setAttribute("userNames", names);
//
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/login.jsp");
//        requestDispatcher.forward(req, resp);
//
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/login.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String loginName = req.getParameter("name");
        String loginPass = req.getParameter("pass");
        User user = new User(loginName, loginPass);

        UserData data = UserData.getInstance();
        List<String> names = data.listNames();
        List<String> passwords = data.listPasswords();

        req.setAttribute("userName", "wrong");

        for (int i = 0; i < names.size(); i++) {
            if (loginName.equals(names.get(i)) && loginPass.equals(passwords.get(i))) {
                req.setAttribute("userName", "correct");
            }
        }

        doGet(req, resp);
    }

}
