package annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinanciero implements IInforme{
    @Override
    public String getInformeFinanciero() {
        return "informe financiero";
    }
}
