package militaryElite_06.models;

import militaryElite_06.enumerations.MissionState;
import militaryElite_06.interfaces.Mission;

public class MissionImpl implements Mission {
    private String codeName;
    private MissionState state;

    public MissionImpl(String codeName, MissionState state) {
        this.codeName = codeName;
        this.state = state;
    }

    @Override
    public void completeMission() {
        this.state = MissionState.finished;
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s", this.codeName, this.state);
    }
}
