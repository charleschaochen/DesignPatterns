package patterns.behavior.respchain.filter;

/**
 * Client test for filters using responsibility design pattern
 * 
 * @author Charles Chen
 * @date 2014��8��30��
 */
public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilterChain chain = new FilterChain();
		chain.addFilter(new ScriptFilter()).addFilter(
				new SensitiveWordsFilter());
		String requestContent = "This is a request<script>alert('script')</script>. Fuck";
		Request request = new Request(requestContent);
		chain.doFilter(request);
	}

}
