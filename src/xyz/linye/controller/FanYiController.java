package xyz.linye.controller;

import xyz.linye.utils.TransApi;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class FanYiController extends HttpServlet {

    //个人百度申请
    private static final String APP_ID = "20190515000297947";
    private static final String SECURITY_KEY = "dd2xiOxA0s7txdqUc6vL";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fromValue = request.getParameter("fromValue");

        //get请求转码
        String newData = new String(fromValue.getBytes("iso-8859-1"),"utf-8");

        //调用翻译api
        TransApi api = new TransApi(APP_ID, SECURITY_KEY);

        //任意语言翻译成英语
        String transResult = api.getTransResult(newData, "auto", "en");

        //返回前端
        response.getWriter().write(transResult);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
