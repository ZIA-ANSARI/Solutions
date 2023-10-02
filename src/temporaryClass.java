import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.List;

public class temporaryClass {
    
    public static void main(String[] args) throws SQLException, IOException {
      
       List<List<Integer>> listofList = new ArrayList<>();
       List<Integer> originalList = new ArrayList<>();
       List<Integer> tempList = new ArrayList<>();
       tempList.add(2);
       listofList.add(tempList);
       tempList.clear();
       tempList.add(22);
       listofList.add(tempList);
       System.out.println(listofList);
       System.out.println(listofList);


       
    }


    public static boolean isValid(String inputDate)
    {
        

        DateTimeFormatter spaceBtwnDttmFormat = new DateTimeFormatterBuilder()
        .appendPattern("yyyy")
        .appendLiteral('-')
        .appendPattern("MM")
        .appendLiteral('-')
        .appendPattern("dd")
        .appendLiteral(' ')
        .appendPattern("HH:mm:ss")
        .appendOptional(new DateTimeFormatterBuilder().appendLiteral('.').toFormatter())
        .appendOptional(new DateTimeFormatterBuilder().appendValue(ChronoField.MICRO_OF_SECOND,6).toFormatter()).toFormatter();



            try {
                LocalDate.parse(inputDate, spaceBtwnDttmFormat);
                return true;
            } catch (DateTimeParseException e) {
                //System.out.println(" Invalid Date ... ");
            }
        

        return false;
    }

    public static DateTimeFormatterBuilder getDateFormat(){
        DateTimeFormatterBuilder baseFormat = new DateTimeFormatterBuilder()
                .appendPattern("yyyy")
                .appendLiteral('-')
                .appendPattern("MM")
                .appendLiteral('-')
                .appendPattern("dd");

        return baseFormat;
    }

    public static DateTimeFormatterBuilder getTimeFormat() {
        DateTimeFormatterBuilder timeFormat = new DateTimeFormatterBuilder()
                .appendPattern("HH:mm:ss")
                .appendOptional(new DateTimeFormatterBuilder().appendLiteral('.').toFormatter())
                .appendOptional(new DateTimeFormatterBuilder().appendValue(ChronoField.MICRO_OF_SECOND,4).toFormatter());

        return timeFormat;
    }
        


    
    public static boolean validateDateTime(String inputDate)  {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSS");
        sdf.setLenient(false);
        try
	    {
	        sdf.parse(inputDate); 
            return true;
	    }
	    catch (ParseException e)
	    {
            return false;
	    }
           
   }

}
 
  

    
