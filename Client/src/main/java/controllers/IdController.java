package controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import models.Id;

public class IdController {
    private List<Id> allIds;

    Id myId;

    public IdController() {
    }

    public IdController(List<Id> allIds) {
        this.allIds = allIds;
    }

    public List<Id> getAllIds() {
        return allIds;
    }

    public void setAllIds(List<Id> allIds) {
        this.allIds = allIds;
    }

    public void printList() {
        for(Id id : allIds) {
            System.out.println(id.toString());
        }
    }

    public Id postId(Id id) {
        // create json from id
        // call server, get json result Or error
        // result json to Id obj

        return null;
    }

    public Id putId(Id id) {

        return null;
    }


}