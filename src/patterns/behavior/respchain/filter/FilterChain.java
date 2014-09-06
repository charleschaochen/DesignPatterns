package patterns.behavior.respchain.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
	private List<Filter> filters = new ArrayList<Filter>();
	private int index = 0;

	/**
	 * Add a filter to filter list
	 * 
	 * @param filter
	 */
	public FilterChain addFilter(Filter filter) {
		this.filters.add(filter);
		return this;
	}

	/**
	 * Remove a filter from filter list
	 * 
	 * @param filter
	 */
	public FilterChain removeFilter(Filter filter) {
		this.filters.remove(filter);
		return this;
	}

	/**
	 * Call current filter to handle the request
	 * 
	 * The current filter will callback this doFilter method to call next filter
	 * 
	 * @param request
	 */
	public void doFilter(Request request) {
		if (index >= this.filters.size()) {
			System.out
					.println("All filters are done, will pass the request to Servlet.");
			System.out.println("Current request content: " + request);
			return;
		}
		Filter filter = this.filters.get(index++);
		filter.doFilter(request, this);
	}
}
