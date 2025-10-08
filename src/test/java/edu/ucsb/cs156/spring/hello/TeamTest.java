package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void hashCode_returns_correct_hashCode() {
        int result = team.hashCode();
        int expectedResult = -1226298695;
        assertEquals(expectedResult, result);
    }

    // @Test
    // public void equals_same_object() {
    //     assertTrue(team.equals(team), "Equals fail: object shows not equal to itself");
    // }

    // @Test
    // public void equals_different_class() {
    //     Object object = new Object();
    //     assertFalse(team.equals(object), "Equals fail: object shows equal to a totally different class");
    // }

    // @Test
    // public void equals_equal_object() {
    //     Team team2 = new Team("test-team");   
    //     assertTrue(team.equals(team2), "Equals fail: object shows not equal to an equal object");
    //     assertTrue(team2.equals(team), "Equals fail: equality is not symmetric");
    // }

    // @Test
    // public void equals_different_object_different_name() {
    //     Team team2 = new Team("test-team2");   
    //     assertFalse(team.equals(team2), "Equals fail: objects have different names but are reported equal");
    // }

    // @Test
    // public void equals_different_object_different_members() {
    //     Team team2 = new Team("test-team");  
    //     team2.addMember("Sophie");
    //     assertFalse(team.equals(team2), "Equals fail: objects have different members but are reported equal");
    // }

    @Test
    public void equals_same_object() {
        assert(team.equals(team));
    }

    @Test
    public void equals_different_class() {
        Object object = new Object();
        assert(!(team.equals(object)));
    }

    @Test
    public void equals_equal_object() {
        Team team2 = new Team("test-team");   
        assert(team.equals(team2));
        assert(team2.equals(team));
    }

    @Test
    public void equals_different_object_different_name() {
        Team team2 = new Team("test-team2");   
        assert(!(team.equals(team2)));
    }

    @Test
    public void equals_different_object_different_members() {
        Team team2 = new Team("test-team");  
        team2.addMember("Sophie");
        assert(!(team.equals(team2)));
    }

    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
