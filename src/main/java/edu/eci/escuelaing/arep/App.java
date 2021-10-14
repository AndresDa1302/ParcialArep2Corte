package edu.eci.escuelaing.arep;
import spark.Request;
import spark.Response;
import static spark.Spark.port;
import static spark.Spark.*;
/**
 * Hello world!
 *
 */
public class App 
{public static void main(String[] args) {
    port(getPort());
    get("/ln", (req, res) -> inputFirsOperation(req, res));
    get("/acos", (req, res) -> inputSecondOperation(req, res));


}
    private static String inputFirsOperation(Request req, Response res) {

        Double num = Double.parseDouble(req.queryParams("value"));
        Calculator calculadora = new Calculator();

        res.type("application/json");

        String pageContent=

                "{"+
                        " \"operation\": \"ln\","+"\n"+
                        "\"input\":"+ num +"\n"+
                        " \"output\":" +calculadora.calculateLn(num) +
                        "}";
        return pageContent;


    }

    private static String inputSecondOperation(Request req, Response res) {
        Double num = Double.parseDouble(req.queryParams("value"));
        Calculator calculadora = new Calculator();
        res.type("application/json");

        String pageContent=
                "{"+
                        " \"operation\": \"acos\","+"\n"+
                        "\"input\":"+ num +"\n"+
                        " \"output\":" +calculadora.calculateAcos(num) +
                        "}";

        return pageContent;


    }



    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set(i.e. on localhost)
    }
}
