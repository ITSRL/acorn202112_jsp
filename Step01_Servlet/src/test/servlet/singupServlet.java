package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/users/signup")
public class singupServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String email=req.getParameter("email");
		String gender=req.getParameter("gender");
		String[] hobby=req.getParameterValues("hobby");
		String job=req.getParameter("job");
		String lunch=req.getParameter("lunch");
		String comment=req.getParameter("comment");
		System.out.println("이메일 : "+email);
		System.out.println("성별 : "+gender);
		for(String tmp:hobby) {
			System.out.println("취미 : "+tmp);
		}
		System.out.println("직업 : "+job);
		System.out.println("점심식사 : "+lunch);
		System.out.println("할말 : "+comment);
		
		//응답 인코딩 설정
		resp.setCharacterEncoding("utf-8");
		//응답 컨텐트 type 설정(웹브라우저에게 html 형식의 문자열을 응답할 예정이라고 알리고)
		resp.setContentType("text/html; charset=utf-8");
		//html 형식의 문자열 응답하기
		PrintWriter pw = resp.getWriter();
		pw.println("<!doctype html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='utf-8'>");
		pw.println("<title></title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<p>가입되었습니다!</p>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}
}
