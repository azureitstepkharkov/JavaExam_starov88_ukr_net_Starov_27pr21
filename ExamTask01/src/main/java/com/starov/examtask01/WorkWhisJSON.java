/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.starov.examtask01;

import io.restassured.RestAssured;
import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.CoreMatchers.equalTo;
import org.hamcrest.Matchers;



public class WorkWhisJSON {
    public static void main(String[] args) 
    {  
        Response response = io.restassured.RestAssured.get("http://headers.jsontest.com");
        JsonPath jsonPath = response.body().jsonPath();
        
        System.out.println("User-Agent: " + jsonPath.get("User-Agent").toString());
        System.out.println("Host: " + jsonPath.get("Host").toString());
        System.out.println("Accept-Language: " + jsonPath.get("Accept").toString());
    }
}
