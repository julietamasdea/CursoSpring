package annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeRRHH implements IInforme{
    @Override
    public String getInformeFinanciero() {
        return "informe RRHH";
    }
}
