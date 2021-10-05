package by.tut.ssmt.app.servlets;

import Utils.Validation;
import by.tut.ssmt.app.entities.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DeleteProductServlet extends HttpServlet {

    private Map<Integer, Product> products;

    @Override
    public void init() throws ServletException {

        final Object products = getServletContext().getAttribute("products");

        if (products == null || !(products instanceof ConcurrentHashMap)) {

            throw new IllegalStateException("DeleteProductServlet can't start!");
        } else {

            this.products = (ConcurrentHashMap<Integer, Product>) products;
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        if (Validation.idIsNumber(req)) {
            products.remove(Integer.valueOf(req.getParameter("id")));
        }

        resp.sendRedirect(req.getContextPath() + "/");
    }
}
