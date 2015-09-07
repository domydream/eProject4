/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Thaim
 */
@ManagedBean
@SessionScoped
public class IndexManagedBean {

    /**
     * Creates a new instance of IndexManagedBean
     */
    public IndexManagedBean() {
    }
    public String about(){
        return "AboutUs";
    }
    public String faq(){
        return "Faq";
    }
    public  String index(){
        return "index";
    }
    public String contact(){
        return "contact";
    }
}
