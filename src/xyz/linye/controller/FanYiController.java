package xyz.linye.controller;

import org.junit.Test;
import xyz.linye.utils.TransApi;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class FanYiController extends HttpServlet {

    //个人百度申请
    private static final String APP_ID = "20190515000297947";
    private static final String SECURITY_KEY = "dd2xiOxA0s7txdqUc6vL";

    @Test
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fromValue = request.getParameter("fromValue");

        String newData = new String(fromValue.getBytes("iso-8859-1"),"utf-8");

        TransApi api = new TransApi(APP_ID, SECURITY_KEY);

        String transResult = api.getTransResult(newData, "auto", "en");

        response.getWriter().write(transResult);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
