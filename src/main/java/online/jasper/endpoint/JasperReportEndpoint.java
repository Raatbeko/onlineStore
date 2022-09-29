package online.jasper.endpoint;

import online.exceptions.NotFoundException;
import org.springframework.http.ResponseEntity;

public interface JasperReportEndpoint {

    ResponseEntity<byte[]> report(Long outgoingId) throws NotFoundException;


}
