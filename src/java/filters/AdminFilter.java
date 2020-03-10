package filters;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import models.User;

public class AdminFilter implements Filter
{
    private final String ADMIN = "admin";
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
    {
        HttpSession session = ((HttpServletRequest)request).getSession();
        User validated = (User)session.getAttribute("validated");
        if(!validated.getRole().getRolename().equals(ADMIN))
        {
            //shows no page
            return;//skips everthing if not an admin
        }
        
        chain.doFilter(request, response);//goes to the next filter/servlet
    }
    
    @Override
    public void init(FilterConfig filterConfig)
    {        
        
    }
    
    @Override
    public void destroy()
    {
        
    }
}
