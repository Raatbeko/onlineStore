package online.jasper.provider.report;

import online.jasper.provider.Provider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractReportProvider<R, D> implements Provider<R, D> {
    public static final String JASPER_REPORT_PROVIDER = "JASPER_REPORT_PROVIDER";
    protected final static Logger LOGGER = LoggerFactory.getLogger(AbstractReportProvider.class);

}