package com.example.product.web;

import com.example.product.service.ProductService; // <-- On importe la classe de l'autre module !
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. On crée une instance de notre service
        ProductService service = new ProductService();

        // 2. On appelle la méthode de la logique métier
        String productName = service.getProductName();

        // 3. On affiche le résultat dans le navigateur
        resp.setContentType("text/html; charset=UTF-8");
        resp.getWriter().println("<h1>Produit du jour :</h1>");
        resp.getWriter().println("<p>" + productName + "</p>");
    }
}