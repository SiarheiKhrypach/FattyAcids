package by.tut.ssmt.app.servlets;

import by.tut.ssmt.app.entities.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class DaoServlet extends HttpServlet {

    private List<Product> products;

    @Override
    public void init() throws ServletException {
        products = new CopyOnWriteArrayList<>();
        products.add(new Product("Olive oil", 213, 2734, 0));
        products.add(new Product("Flax oil", 14925, 3556, 0));
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("products", products);
        req.getRequestDispatcher("views/welcome.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (!requestIsValid(req)) {
            doGet(req, resp);
        }

        final String name = req.getParameter("name");
        final String omegaThree = req.getParameter("Omega3");
        final String omegaSix = req.getParameter("Omega6");
        final String portionNumber = req.getParameter("portionNumber");

        final Product product = new Product(name, Integer.valueOf(omegaThree), Integer.valueOf(omegaSix), Integer.valueOf(portionNumber));

        products.add(product);

        doGet(req, resp);
    }

    private boolean requestIsValid(final HttpServletRequest req) {

        final String name = req.getParameter("name");
        final String omegaThree = req.getParameter("Omega3");
        final String omegaSix = req.getParameter("Omega6");
        final String portionNumber = req.getParameter("portionNumber");

        return name != null && name.length() > 0 &&
                omegaThree != null && omegaThree.length() > 0 &&
                omegaSix!= null && omegaSix.length() > 0 &&
                portionNumber!= null && portionNumber.length() > 0;
    }


}
