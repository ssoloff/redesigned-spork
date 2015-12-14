package fancyfoods.web;

import fancyfoods.food.Food;
import fancyfoods.offers.CurrentOffers;
import fancyfoods.offers.SpecialOffer;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SayHelloJndi extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter html = response.getWriter();
        html.append("<html>");
        html.append("Hello valued customer!<br/>");
        try {
            InitialContext ctx = new InitialContext();
            String jndiName = "osgi:service/" + CurrentOffers.class.getName();
            CurrentOffers offers = (CurrentOffers)ctx.lookup(jndiName);
            html.append("<table>");
            List<SpecialOffer> currentOffers = offers.getCurrentOffers();
            for (SpecialOffer offer : currentOffers) {
                writeRowForOffer(html, offer);
            }
            html.append("</table>");
        } catch (NamingException e) {
            html.append("We have no special offers today. Try again tomorrow.");
            e.printStackTrace(html);
        }
        html.append("</html>");
    }

    private void writeRowForOffer(PrintWriter html, SpecialOffer offer) {
        html.append("<tr>");
        String description = offer.getDescription();
        Food offerFood = offer.getOfferFood();
        html.append("<td>" + offerFood.getName() + "</td>");
        html.append("<td>" + offerFood.getPrice() + "</td>");
        html.append("<td>" + description + "</td>");
        html.append("</tr>");
    }
}

