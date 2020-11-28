package annotations;

import org.springframework.stereotype.Component;

@Component
public class Informe implements IInforme{
    @Override
    public String getInformeFinanciero() {
        return "Informe financiero";
    }
}
