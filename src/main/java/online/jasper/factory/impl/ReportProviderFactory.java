package online.jasper.factory.impl;

import net.sf.jasperreports.engine.JasperPrint;
import online.jasper.data.ReportRequestHolder;
import online.jasper.factory.AbstractFactory;
import online.jasper.provider.Provider;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.stereotype.Service;

@Service
public class ReportProviderFactory extends AbstractFactory<Provider<JasperPrint, ReportRequestHolder>> {

    public ReportProviderFactory(BeanFactory beanFactory) {
        super(beanFactory);
    }

    @Override
    public Provider<JasperPrint, ReportRequestHolder> getInstance(String key) {
        return super.getInstance(key);
    }

}

