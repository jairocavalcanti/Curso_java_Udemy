package Seção17.Interfaces.Herança.Entities;

import Seção17.Interfaces.Herança.enums.Cor;

public abstract class formato{
    
    private Cor cor;

    public formato(Cor cor) {
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public abstract double area();

}
