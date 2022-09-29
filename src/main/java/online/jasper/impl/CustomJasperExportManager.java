package online.jasper.impl;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;

import java.io.ByteArrayOutputStream;

public class CustomJasperExportManager {

    public static byte[] exportReportToXls(JasperPrint jasperPrint) throws JRException {
        SimpleExporterInput input = new SimpleExporterInput(jasperPrint);
        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        SimpleOutputStreamExporterOutput output = new SimpleOutputStreamExporterOutput(byteArray);

        JRXlsxExporter exporter = new JRXlsxExporter();
        exporter.setExporterInput(input);
        exporter.setExporterOutput(output);
        exporter.exportReport();

        output.close();

        return byteArray.toByteArray();
    }
}
