package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Natalie Marie";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        // TODO: Change this to your github id
        return "fortenatalie";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f25-06");
        team.addMember("Natalie Marie");
        team.addMember("Julia");
        team.addMember("Andrew Zhuo");
        team.addMember("Austin");
        team.addMember("Longjiao");
        team.addMember("Abhiram");
        return team;
    }
}
