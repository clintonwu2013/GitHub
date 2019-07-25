package tw.tsunglin.test;

import java.io.File;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlWriter;

public class ConvertJasperJrxml {
    public static String sourcePath, destinationPath, xml;
    public static JasperDesign jd = new JasperDesign();
    public static void main(String[] args) {
        sourcePath = "C:\\i465_MARS_64\\workspace_i403\\PSGQ_N\\src\\main\\webapp\\pages\\gb\\report\\GB309_RPT.jasper"; // jsper檔案位置
        destinationPath = "D:/GB309_TXT.jrxml"; // 要產出jrxml檔案的位置
        try {
            @SuppressWarnings("deprecation")
            JasperReport report = (JasperReport) JRLoader.loadObject(new File(sourcePath));
            JRXmlWriter.writeReport(report, destinationPath, "UTF-8");
        } catch (JRException e) {
            e.printStackTrace();
        }
    }
}
