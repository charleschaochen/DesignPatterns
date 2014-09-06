package patterns.behavior.respchain.filter;

/**
 * Filter interface
 * 
 * @author Charles Chen
 * @date 2014Äê8ÔÂ30ÈÕ
 */
public interface Filter {
	void doFilter(Request request, FilterChain chain);
}
