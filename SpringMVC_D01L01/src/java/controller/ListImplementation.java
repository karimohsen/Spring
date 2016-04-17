/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Karim
 */
public class ListImplementation implements ListInterface{

    @Override
    public List<String> populateList() {
        List<String> list = new ArrayList<>();
        list.add("Karim");
        list.add("Hossam");
        list.add("Sharnooby");
        return list;
    }
    
}
