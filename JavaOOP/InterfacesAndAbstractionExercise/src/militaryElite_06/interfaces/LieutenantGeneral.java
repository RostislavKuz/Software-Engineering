package militaryElite_06.interfaces;

import militaryElite_06.models.PrivateImpl;

public interface LieutenantGeneral extends Private {
    public void addPrivate(PrivateImpl priv);
    String toString();
}
