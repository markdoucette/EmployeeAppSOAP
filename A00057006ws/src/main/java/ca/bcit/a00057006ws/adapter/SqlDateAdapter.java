package ca.bcit.a00057006ws.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * XmlAdapter for converting java.sql.Date to a usable format for the xml
 */
public class SqlDateAdapter extends XmlAdapter<String, Date> {
    private static final java.lang.String DATE_FORMAT = "yyyy-MM-dd";

    @Override
    public Date unmarshal(String v) {
        SimpleDateFormat df = new SimpleDateFormat(DATE_FORMAT);
        Date sqlDate = null;
        java.util.Date date = null;
        try {
            date = df.parse(v);
            sqlDate = new Date(date.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return sqlDate;
    }

    @Override
    public String marshal(Date date) throws Exception {
        return date.toString();
    }
}
