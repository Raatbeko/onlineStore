package online.jasper.provider.report;

import net.sf.jasperreports.engine.*;
import online.jasper.data.ReportRequestHolder;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.Map;

@Component
public class JasperReportProvider extends AbstractReportProvider<JasperPrint, ReportRequestHolder> {

    private JasperPrint generatePdf(String report, Map<String, Object> params) {
        JasperPrint jasperPrint = null;
        try {
            final InputStream jasperStream = this.getClass().getResourceAsStream(report);
            final JasperReport jasperReport = JasperCompileManager.compileReport(jasperStream);
            jasperPrint = JasperFillManager.fillReport(jasperReport, params, new JREmptyDataSource());
        } catch (JRException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return jasperPrint;
    }

    @Override
    public JasperPrint getData(ReportRequestHolder data) {
        return generatePdf(data.getPath(), data.getData());
    }

}
