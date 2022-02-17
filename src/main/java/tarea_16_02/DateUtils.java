package tarea_16_02;

public class DateUtils {

    public String getDate(int day, String month, int year) {

        String message = "";
        boolean wrongDay = false;
        boolean wrongMonth = false;
        boolean wrongYear = false;

        if (day < 1 || day > 31) {
            message = "dia incorrecto";
            wrongDay = true;
        }
        if (!month.contentEquals("enero") && !month.contentEquals("febrero") && !month.contentEquals("marzo") &&
                !month.contentEquals("abril") && !month.contentEquals("mayo") && !month.contentEquals("junio") &&
                !month.contentEquals("julio") && !month.contentEquals("agosto") && !month.contentEquals("septiembre") &&
                !month.contentEquals("octubre") && !month.contentEquals("noviembre") && !month.contentEquals("diciembre")) {
            message = "mes incorrecto";
            wrongMonth = true;
        }

        if (year < 0 || year > 4000) {
            message = "gestion incorrecta";
            wrongYear = true;
        }


        if(!wrongDay && !wrongMonth && !wrongYear){
            message = nextDate(day,month,year);
        }


        if((wrongDay && wrongMonth)||(wrongDay && wrongYear) || (wrongMonth && wrongYear)){
            return "ingresar nuevos datos";
        }else {
            return message;
        }

    }

    public String nextDate (int day , String month , int year){

        String message = "";

        if (day >= 1 && day <= 30) {
            day++;
            message = day + " " + month + " " + year;
        } else if (day == 31) {
            int dayA = 1;
            String monthA = "";
            if (month.contentEquals("enero")) {
                monthA = "febrero";
            } else if (month.contentEquals("febrero")) {
                monthA = "marzo";
            } else if (month.contentEquals("marzo")) {
                monthA = "abril";
            } else if (month.contentEquals("abril")) {
                monthA = "mayo";
            } else if (month.contentEquals("mayo")) {
                monthA = "junio";
            } else if (month.contentEquals("junio")) {
                monthA = "julio";
            } else if (month.contentEquals("julio")) {
                monthA = "agosto";
            } else if (month.contentEquals("agosto")) {
                monthA = "septiembre";
            } else if (month.contentEquals("septiembre")) {
                monthA = "octubre";
            } else if (month.contentEquals("octubre")) {
                monthA = "noviembre";
            } else if (month.contentEquals("noviembre")) {
                monthA = "diciembre";
            } else if (month.contentEquals("diciembre")) {
                monthA = "enero";
                year++;
            }
            message = dayA + " " + monthA + " " + year;
        }


        return message;
    }
}