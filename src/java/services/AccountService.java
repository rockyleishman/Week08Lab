/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import models.User;

/**
 *
 * @author 814101
 */
public class AccountService
{
    public void login(HttpServletRequest request)
    {
        HttpSession session = request.getSession();
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        UserService userService = new UserService();
        
        try
        {
            User user = userService.get(username);
            
            if(user.getPassword().equals(password))//checks if password is valid
            {
                user.setPassword(null);
                session.setAttribute("validated", user);
            }
            
            
        }
        catch (NullPointerException ex)
        {
            //catch if non-existant user
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public void logout(HttpServletRequest request)
    {
        HttpSession session = request.getSession();
        //TODO
    }
}
