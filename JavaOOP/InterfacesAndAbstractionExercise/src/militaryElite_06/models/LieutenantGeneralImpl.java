package militaryElite_06.models;

import militaryElite_06.interfaces.LieutenantGeneral;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {
    private Set<PrivateImpl> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new TreeSet<>(new Comparator<PrivateImpl>() {
            @Override
            public int compare(PrivateImpl first, PrivateImpl second) {
                return Integer.compare(first.getId(), second.getId());
            }
        });
    }

    @Override
    public void addPrivate(PrivateImpl priv) {
        this.privates.add(priv);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString()).append(System.lineSeparator())
                .append("Privates:");
        for (PrivateImpl priv : privates) {
            builder.append(System.lineSeparator())
                    .append("  ").append(priv.toString());
        }
        return builder.toString();
    }
}
