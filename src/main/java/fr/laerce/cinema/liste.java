package fr.laerce.cinema;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.IOException;

public class liste extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }




    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



FilmsDonnees cam = new FilmsDonnees();

        request.setAttribute("listfilms",cam.lesFilms);



        String jspview = "liste.jsp";

        getServletConfig().getServletContext().getRequestDispatcher("/jsp/"+jspview).forward(request, response);


    }






}
