package com.nikdemo.formaterlibrary;

import android.annotation.SuppressLint;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class DateTimeFormat {

    /**
     *
     * @param date (date in string format like 22-04-2019)
     * @param inputDatePattern (input patter like white pattern of date you insert in method like dd-MM-yyyy)
     * @param outputDatePattern (which pattern you want to return like dd MMM yyyy)
     * @return String pattern date
     */
    @SuppressLint("SimpleDateFormat")
    public static String changeDatePattern(String date, String inputDatePattern,String outputDatePattern){
        String returnDate = "";
        if (inputDatePattern.equals("")){
            throw new IllegalArgumentException("Input Pattern is empty");
        }

        if (outputDatePattern.equals("")){
            throw new IllegalArgumentException("Output Pattern is empty");
        }

        SimpleDateFormat inputFormat = new SimpleDateFormat(inputDatePattern);
        SimpleDateFormat outputFormat = new SimpleDateFormat(outputDatePattern);
        Date date1 = null;
        try {
            date1 = inputFormat.parse(date);
            returnDate = outputFormat.format(date1);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e);
        }
        return returnDate;
    }

    /**
     * conver in any pattern from date
     * @param date in Date dataType
     * @param outputDatePattern in String datatType for output
     * @return string date
     */
    @SuppressLint("SimpleDateFormat")
    public static String changeDatePattern(Date date,String outputDatePattern){
        if (outputDatePattern.equals("")){
            throw new IllegalArgumentException("Output Pattern is empty");
        }

        if (date == null){
            throw new IllegalArgumentException("Date is null");
        }
        return new SimpleDateFormat(outputDatePattern).format(date);
    }

    @SuppressLint("SimpleDateFormat")
    public static String getCurrentDate(String outputDatePattern){
        if (outputDatePattern.equals("")){
            throw new IllegalArgumentException("Output Pattern is empty");
        }
        Date date = Calendar.getInstance().getTime();
        return new SimpleDateFormat(outputDatePattern).format(date);
    }


    @SuppressLint("SimpleDateFormat")
    public static String getCurrentDatedInddMMyyyy(){
        Date date = Calendar.getInstance().getTime();
        return new SimpleDateFormat("dd/MM/yyyy").format(date);
    }

    @SuppressLint("SimpleDateFormat")
    public static String getCurrentDateInddMMMyyyy(){
        Date date = Calendar.getInstance().getTime();
        return new SimpleDateFormat("dd MMM yyyy").format(date);
    }

    @SuppressLint("SimpleDateFormat")
    public static Date getCurrentDate(){
        return Calendar.getInstance().getTime();
    }

    @SuppressLint("SimpleDateFormat")
    public static long DateToMillisecond(){
        //creating Calendar instance
        Calendar calendar = Calendar.getInstance();
        //Returns current time in millis
        return calendar.getTimeInMillis();
    }

    @SuppressLint("SimpleDateFormat")
    public static long DateToMillisecond(Date date){
        return date.getTime();
    }

    @SuppressLint("SimpleDateFormat")
    public static long DateToMillisecond(String date,String inputDatePattern){
        if (inputDatePattern.equals("")){
            throw new IllegalArgumentException("Input Pattern is empty");
        }
        SimpleDateFormat inputFormat = new SimpleDateFormat(inputDatePattern);
        Date date1 = null;
        try {
            date1 = inputFormat.parse(date);
            return date1.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e);
        }
    }



    @SuppressLint("SimpleDateFormat")
    public static String getTimeAgo(String date,String inputDatePattern){
        if (inputDatePattern.equals("")){
            throw new IllegalArgumentException("Input Pattern is empty");
        }
        SimpleDateFormat inputFormat = new SimpleDateFormat(inputDatePattern);
        Date date1 = null;
        try {
            date1 = inputFormat.parse(date);
            Date dt2 = new Date();

            long diff = dt2.getTime() - date1.getTime();
            long diffSeconds = diff / 1000 % 60;
            long diffMinutes = diff / (60 * 1000) % 60;
            long diffHours = diff / (60 * 60 * 1000) % 60;
            int diffInDays = (int) (diff / (1000 * 60 * 60 * 24));

            if (diffInDays > 1){
                return diffInDays +" day ago";
            } else if (diffHours > 1){
                return diffHours +" hours ago";
            } else if (diffMinutes > 1){
                return diffMinutes +" min ago";
            } else if (diffSeconds > 1){
                return diffSeconds +" second ago";
            }
        } catch (ParseException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e);
        }
        return "";
    }

    public static List<Date> getDaysBetweenDates(Date startdate, Date enddate)
    {
        List<Date> dates = new ArrayList<Date>();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(startdate);

        while (calendar.getTime().before(enddate))
        {
            Date result = calendar.getTime();
            dates.add(result);
            calendar.add(Calendar.DATE, 1);
        }
        return dates;
    }



    @SuppressLint("SimpleDateFormat")
    public static boolean isTodayDate(String date1,String inputDatePattern){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date11 = null;
        Date date22 = getCurrentDate();
        try {
            date11 = sdf.parse(date1);
            date22 = sdf.parse(getCurrentDate(inputDatePattern));
            if (date11.compareTo(date22) == 0) {
                return true;
            } else {
                return false;
            }
        } catch (ParseException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e);
        }

    }

    @SuppressLint("SimpleDateFormat")
    public static boolean isAterDate(String date1,String inputDatePattern){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date11 = null;
        Date date22 = getCurrentDate();
        try {
            date11 = sdf.parse(date1);
            date22 = sdf.parse(getCurrentDate(inputDatePattern));
            if (date11.compareTo(date22) > 0) {
                return true;
            } else {
                return false;
            }
        } catch (ParseException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e);
        }


    }

    @SuppressLint("SimpleDateFormat")
    public static boolean isBeforeDate(String date1,String inputDatePattern){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date11 = null;
        Date date22 = getCurrentDate();
        try {
            date11 = sdf.parse(date1);
            date22 = sdf.parse(getCurrentDate(inputDatePattern));
            if (date11.compareTo(date22) < 0) {
                return true;
            } else {
                return false;
            }
        } catch (ParseException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e);
        }
    }

    /**
     *******************************************************************************************************
     *******************************************************************************************************
     **********                   ****                 ****     ***************      ***             *******
     ******************   *******************   ***********   **  ************  **   ***   *****************
     ******************   *******************   ***********   ***  **********  ***   ***   *****************
     ******************   *******************   ***********   ****  ********  ****   ***   *****************
     ******************   *******************   ***********   *****  ******  *****   ***              ******
     ******************   *******************   ***********   ******  ****  ******   ***   *****************
     ******************   *******************   ***********   *******  **  *******   ***   *****************
     ******************   *******************   ***********   ********    ********   ***   *****************
     ******************   ************                  ***   ********************   ***              ******
     *******************************************************************************************************
     *******************************************************************************************************
     */
    /**
     *
     * @param time (time in string format like 22-04-2019)
     * @param inputDatePattern (input patter like white pattern of date you insert in method like dd-MM-yyyy)
     * @param outputDatePattern (which pattern you want to return like dd MMM yyyy)
     * @return
     */
    @SuppressLint("SimpleDateFormat")
    public static String changeTimePattern(String time, String inputDatePattern,String outputDatePattern){
        String returnDate = "";
        if (inputDatePattern.equals("")){
            throw new IllegalArgumentException("Input Pattern is empty");
        }

        if (outputDatePattern.equals("")){
            throw new IllegalArgumentException("Output Pattern is empty");
        }

        SimpleDateFormat inputFormat = new SimpleDateFormat(inputDatePattern);
        SimpleDateFormat outputFormat = new SimpleDateFormat(outputDatePattern);
        Date date1 = null;
        try {
            date1 = inputFormat.parse(time);
            returnDate = outputFormat.format(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return returnDate;
    }


    @SuppressLint("SimpleDateFormat")
    public static String getCurrentTimeInHHMM(){
        Date date = Calendar.getInstance().getTime();
        return new SimpleDateFormat("HH:mm").format(date);
    }

    @SuppressLint("SimpleDateFormat")
    public static String getCurrentTimeInHHMMss(){
        Date date = Calendar.getInstance().getTime();
        return new SimpleDateFormat("HH:mm:ss").format(date);
    }

    @SuppressLint("SimpleDateFormat")
    public static String getCurrentTimeInhhMMA(){
        Date date = Calendar.getInstance().getTime();
        return new SimpleDateFormat("hh:mm a").format(date);
    }

    @SuppressLint("SimpleDateFormat")
    public static String getCurrentTimeInhhMMssA(){
        Date date = Calendar.getInstance().getTime();
        return new SimpleDateFormat("hh:mm:ss a").format(date);
    }

}
