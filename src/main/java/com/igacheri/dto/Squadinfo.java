package com.igacheri.dto;
import com.igacheri.models.hero;
import com.igacheri.models.squad;
import java.util.List;
public class Squadinfo {
    private squad squad;
    private List<hero> heroes;
    private int weaknessScore;
    private int strengthScore;

    public SquadInfo() {
    }

    public squad getSquad() {
        return squad;
    }

    public void setSquad(squad squad) {
        this.squad = squad;
    }

    public List<hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(List<hero> heroes) {
        this.heroes = heroes;
    }

    public int getWeaknessScore() {
        return weaknessScore;
    }

    public void setWeaknessScore(int weaknessScore) {
        this.weaknessScore = weaknessScore;
    }

    public int getStrengthScore() {
        return strengthScore;
    }

    public void setStrengthScore(int strengthScore) {
        this.strengthScore = strengthScore;
    }

    @Override
    public String toString() {
        return "SquadInfo{" +
                "squad=" + squad +
                ", heroes=" + heroes +
                ", weaknessScore=" + weaknessScore +
                ", strengthScore=" + strengthScore +
                '}';
    }
}
