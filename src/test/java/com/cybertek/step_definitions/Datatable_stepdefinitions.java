package com.cybertek.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;

public class Datatable_stepdefinitions {
    @Then("User should see below words displayed")
    public void user_should_see_below_words_displayed(List<String> listOfFruits) {

        System.out.println("listOfFruits.size() = " + listOfFruits.size());
        System.out.println("listOfFruits= "+listOfFruits);
    }

    }
