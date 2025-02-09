package militaryElite_06.models;

import militaryElite_06.enumerations.Corps;
import militaryElite_06.interfaces.Engineer;

import java.util.HashSet;
import java.util.Set;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
    private Set<RepairImpl> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new HashSet<>();
    }

    @Override
    public void addRepair(RepairImpl repair) {
        this.repairs.add(repair);
    }

    @Override
    public Set<RepairImpl> getRepairs() {
        return this.repairs;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString()).append(System.lineSeparator())
                .append(this.getCorps()).append(System.lineSeparator())
                .append("Repairs: ");

        for (RepairImpl repair : repairs) {
            builder.append(System.lineSeparator())
                    .append("  ").append(repair.toString());
        }
        return builder.toString();
    }
}
