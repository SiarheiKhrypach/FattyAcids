package by.tut.ssmt.app.servlets;

import by.tut.ssmt.app.dao.UserData;
import by.tut.ssmt.app.entities.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/register.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String registerName = req.getParameter("name");
        String registerPass = req.getParameter("pass");
        User user = new User(registerName, registerPass);
        UserData data = UserData.getInstance();
        data.add(user);

        req.setAttribute("userName", registerName);
        doGet(req, resp);

    }

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String name = req.getParameter("name");
//        String password = req.getParameter("pass");
//        User user = new User(name, password);
//        Model model = Model.getInstance();
//        model.add(user);
//
//        req.setAttribute("userName", name);
//        doGet(req, resp);
//
//    }

}
