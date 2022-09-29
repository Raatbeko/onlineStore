package online.jasper.endpoint.impl;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import online.exceptions.NotFoundException;
import online.jasper.data.ReportRequestHolder;
import online.jasper.endpoint.JasperReportEndpoint;
import online.jasper.impl.JasperReportService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.Map;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class DefaultJasperReportEndpoint implements JasperReportEndpoint {

    JasperReportService service;

    @Override
    @Transactional(readOnly = true)
    public ResponseEntity<byte[]> report(Long outgoingId) throws NotFoundException {
        Map<String, Object> reportData = Collections.emptyMap();
        ReportRequestHolder requestHolder = null;

        return service.reportPdf(requestHolder);
    }


}
