package patterns.behavior.respchain;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Responsibility chain design pattern with Enum
 * @author Charles Chen
 * @date 2014年9月4日
 */
public class EnumRespChain {
	/**
	 * Request handler, every enum value is a concrete handler
	 * @author Charles Chen
	 * @date 2014年9月4日
	 */
	static enum RequestHandler {
		HANDLE_GET {
			public boolean handle(Request request) {
				if (request.getMethod() == Request.Method.GET) {
					System.out.println("Request Method: " + Request.Method.GET
							+ ", Request Content: " + request.getContent());
					return true;
				}
				return false;
			}
		},
		HANDLE_POST {
			public boolean handle(Request request) {
				if (request.getMethod() == Request.Method.POST) {
					System.out.println("Request Method: " + Request.Method.POST
							+ ", Request Content: " + request.getContent());
					return true;
				}
				return false;
			}
		},
		HANDLE_PUT {
			public boolean handle(Request request) {
				if (request.getMethod() == Request.Method.PUT) {
					System.out.println("Request Method: " + Request.Method.PUT
							+ ", Request Content: " + request.getContent());
					return true;
				}
				return false;
			}
		},
		HANDLE_DELETE {
			public boolean handle(Request request) {
				if (request.getMethod() == Request.Method.DELETE) {
					System.out.println("Request Method: "
							+ Request.Method.DELETE + ", Request Content: "
							+ request.getContent());
					return true;
				}
				return false;
			}
		};

		public abstract boolean handle(Request request);
	}
	
	/**
	 * The request POJO
	 * @author Charles Chen
	 * @date 2014年9月4日
	 */
	static class Request {
		enum Method {
			GET, POST, PUT, DELETE
		}

		private String content;
		private Method method;

		public Request(Method method, String content) {
			// TODO Auto-generated constructor stub
			this.method = method;
			this.content = content;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public Method getMethod() {
			return method;
		}

		public void setMethod(Method method) {
			this.method = method;
		}

	}
	
	/**
	 * Client test
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Request request = new Request(Request.Method.POST, "This is a HTTP request in POST method");
//		for(RequestHandler handler: RequestHandler.values()){
//			if(handler.handle(request))break;
//		}
		Date date =new Date(1417334400000L);
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(date).toString());
	}

}
