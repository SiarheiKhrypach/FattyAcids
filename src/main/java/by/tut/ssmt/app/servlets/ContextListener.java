package by.tut.ssmt.app.servlets;

import by.tut.ssmt.app.entities.Product;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@WebListener
public class ContextListener implements ServletContextListener {

    private Map<Integer, Product> products;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        final ServletContext servletContext =
                servletContextEvent.getServletContext();

        products = new ConcurrentHashMap<>();

        servletContext.setAttribute("products", products);

        final Product firstProduct = new Product(1, "Первый", 1, 1, 1);
        this.products.put(firstProduct.getId(), firstProduct);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        products = null;
    }
}