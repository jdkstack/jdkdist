package org.jdkstack.jdkdist.examples;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This is a class description.
 *
 * <p>Another description after blank line.
 *
 * <p>xx
 *
 * @author admin
 */
public class ExampleServlet extends HttpServlet {

  private static final long serialVersionUID = -1L;

  /**
   * This is a method description.
   *
   * <p>This is a method description.
   *
   * <p>Another description after blank line.
   *
   * @author admin
   */
  @Override
  protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) {
    // 使servlet页面中文不会乱码，一定要放在getWriter()方法前面
    resp.setContentType("text/html; charset=utf-8");
    // 添加上面这行才会解析html代码，显示Get()请求成功！的加粗模式，否则不会解析html代码，直接显示html标签
    try {
      final PrintWriter out = resp.getWriter();
      out.println("<strong>Get()请求成功!</strong><br/>");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
