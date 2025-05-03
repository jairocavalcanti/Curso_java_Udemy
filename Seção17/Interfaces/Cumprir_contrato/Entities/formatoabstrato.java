package Seção17.Interfaces.Cumprir_contrato.Entities;

import Seção17.Interfaces.Cumprir_contrato.enums.cor;

public abstract class formatoabstrato implements formato {
    
    private cor cor;

    public formatoabstrato(cor cor) {
        this.cor = cor;
    }

    public cor getCor() {
        return cor;
    }

    public void setCor(cor cor) {
        this.cor = cor;
    }


}
