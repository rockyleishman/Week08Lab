package filters;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import models.User;

public class LoginFilter implements Filter
{
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
    {
        
        // this code will execute before a servlet
        // ...
        HttpSession session = ((HttpServletRequest)request).getSession();
        User validated = (User)session.getAttribute("validated");
        if(validated == null)
        {
            //shows no page
            return;//skips everthing 
        }
        
        chain.doFilter(request, response);//goes to the next filter/servlet
            
        // this code will execute after the servlet
        // ...
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException
    {
        
    }

    @Override
    public void destroy()
    {
        
    }
}
