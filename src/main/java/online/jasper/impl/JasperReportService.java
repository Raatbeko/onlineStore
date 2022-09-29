package online.jasper.impl;

import lombok.RequiredArgsConstructor;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import online.jasper.data.ReportRequestHolder;
import online.jasper.factory.impl.ReportProviderFactory;
import online.jasper.provider.report.AbstractReportProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JasperReportService {

    private final ReportProviderFactory reportProviderFactory;

    public ResponseEntity<byte[]> reportPdf(
            ReportRequestHolder requestHolder
    ) {
        try {
            final JasperPrint jasperPrint = report(requestHolder);
            byte[] pdfReport = JasperExportManager.exportReportToPdf(jasperPrint);

            return ResponseEntity.ok()
                    .contentType(MediaType.APPLICATION_PDF)
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"gra-report.pdf\"")
                    .body(pdfReport);

        } catch (JRException e) {
            return new ResponseEntity<>(new byte[0], HttpStatus.CONFLICT);
        }
    }

    public ResponseEntity<byte[]> reportExcel(
            ReportRequestHolder requestHolder
    ) {
        try {
            final JasperPrint jasperPrint = report(requestHolder);
            byte[] excelReport = CustomJasperExportManager.exportReportToXls(jasperPrint);

            return ResponseEntity.ok()
                    .contentType(MediaType.APPLICATION_OCTET_STREAM)
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"gra-report.xlsx\"")
                    .body(excelReport);

        } catch (JRException e) {
            return new ResponseEntity<>(new byte[0], HttpStatus.CONFLICT);
        }
    }

    private JasperPrint report(
            ReportRequestHolder requestHolder
    ) {
        return reportProviderFactory
                .getInstance(AbstractReportProvider.JASPER_REPORT_PROVIDER)
                .getData(requestHolder);
    }
}
