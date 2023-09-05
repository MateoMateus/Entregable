package ps.ja15.Entregable.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ps.ja15.Entregable.model.Cuenta;
import ps.ja15.Entregable.repository.CuentaRepository;

@Service
public class CuentaService {

    @Autowired
    CuentaRepository cuentaRepository;

    public Cuenta save(Cuenta cuenta){
        return cuentaRepository.save(cuenta);

    public Cuenta save(Cuenta cuenta)
        return cuentaRepository.save(cuenta);

    public  Cuenta save(Cuenta cuenta){
        return cuentaRepository.save(cuenta);

    }

}
