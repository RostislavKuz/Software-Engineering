package militaryElite_06.interfaces;

import militaryElite_06.models.RepairImpl;

import java.util.Set;

public interface Engineer extends SpecialisedSoldier {
    void addRepair(RepairImpl repair);

    Set<RepairImpl> getRepairs();
    String toString();
}
