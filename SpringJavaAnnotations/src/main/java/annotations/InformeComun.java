package annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeComun implements IInforme{
    @Override
    public String getInformeFinanciero() {
        return "Informe comun";
    }
}
