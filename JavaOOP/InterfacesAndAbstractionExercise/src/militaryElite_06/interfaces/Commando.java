package militaryElite_06.interfaces;

import militaryElite_06.models.MissionImpl;

import java.util.Set;

public interface Commando extends SpecialisedSoldier {
    void addMission(MissionImpl mission);

    Set<MissionImpl> getMissions();

    String toString();
}
