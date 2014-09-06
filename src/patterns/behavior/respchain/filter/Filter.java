package patterns.behavior.respchain.filter;

/**
 * Filter interface
 * 
 * @author Charles Chen
 * @date 2014��8��30��
 */
public interface Filter {
	void doFilter(Request request, FilterChain chain);
}
