package fr.laerce.cinema;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class DetailsFilm extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }




    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        Integer id = Integer.parseInt( request.getParameter("id"));
        FilmsDonnees cam = new FilmsDonnees();
        Film chaquefilm = cam.getById(id);



        request.setAttribute("listfilms",cam.lesFilms);



        String jspview = " DetailsFilm.jsp";

        getServletConfig().getServletContext().getRequestDispatcher("/jsp/"+jspview).forward(request, response);


    }




}
