package patterns.behavior.respchain.filter;

/**
 * Filter the script in the requeset content
 * 
 * @author Charles Chen
 * @date 2014Äê8ÔÂ30ÈÕ
 */
public class ScriptFilter implements Filter {

	@Override
	public void doFilter(Request request, FilterChain chain) {
		// TODO Auto-generated method stub
		System.out.println("Script filter is working...");
		String content = request.getContent();
		content = content.replaceAll("<script[^>]*>.*</script>", "");
		request.setContent(content);
		System.out.println("Script filter is done, pass to next filter");
		chain.doFilter(request);
	}
}
