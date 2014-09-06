package patterns.behavior.respchain.filter;

/**
 * Sensitive words filter
 * 
 * @author Charles Chen
 * @date 2014Äê8ÔÂ30ÈÕ
 */
public class SensitiveWordsFilter implements Filter {
	private String[] words;

	public SensitiveWordsFilter() {
		// TODO Auto-generated constructor stub
		words = new String[] { "fuck", "shit", "hell" };
	}

	@Override
	public void doFilter(Request request, FilterChain chain) {
		// TODO Auto-generated method stub
		System.out.println("Sensitive words filter is working...");
		String content = request.getContent();
		for (String word : words) {
			content = content.replaceAll("(?i)" + word, "");
		}
		request.setContent(content);
		System.out.println("Sensitive filter is done, pass to next filter");
		chain.doFilter(request);
	}
}
