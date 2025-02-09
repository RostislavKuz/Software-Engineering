package militaryElite_06.models;

import militaryElite_06.enumerations.Corps;
import militaryElite_06.interfaces.Commando;

import java.util.HashSet;
import java.util.Set;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private Set<MissionImpl> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        this.missions = new HashSet<>();
    }


    @Override
    public void addMission(MissionImpl mission) {
        this.missions.add(mission);
    }

    @Override
    public Set<MissionImpl> getMissions() {
        return this.missions;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString()).append(System.lineSeparator())
                .append(this.getCorps()).append(System.lineSeparator())
                .append("Missions:");
        for (MissionImpl mission : missions) {
            builder.append(System.lineSeparator())
                    .append("  ").append(mission.toString());
        }
        return builder.toString();
    }
}
