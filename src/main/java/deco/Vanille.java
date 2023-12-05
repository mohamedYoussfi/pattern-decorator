package deco;

import produits.Boisson;

/**
 * @author mohamedyoussfi
 **/
public class Vanille extends DecorateurBoisson {
    public Vanille(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au Vanille";
    }

    @Override
    public double cout() {
        return 2.6 + boisson.cout();
    }
}
