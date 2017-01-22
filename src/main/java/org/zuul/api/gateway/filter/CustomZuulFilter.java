package org.zuul.api.gateway.filter;



import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;



@Component
public class CustomZuulFilter extends ZuulFilter{
    private static Logger log = LoggerFactory.getLogger(CustomZuulFilter.class);
    
	@Override
	public Object run() {
		final RequestContext ctx = RequestContext.getCurrentContext();
		 HttpServletRequest request = ctx.getRequest(); 
		ctx.addZuulRequestHeader("Test", "Hello Zuul Header!");
		log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
		return null;
	}
	@Override
	public int filterOrder() {
	
		return 0;
	}
	@Override
	public String filterType() {

		return null;
	}@Override
	public boolean shouldFilter() {

		return false;
	}
	

}
