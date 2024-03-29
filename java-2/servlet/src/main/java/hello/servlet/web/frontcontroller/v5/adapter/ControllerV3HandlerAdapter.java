package hello.servlet.web.frontcontroller.v5.adapter;

import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.v3.ControllerV3;
import hello.servlet.web.frontcontroller.v5.MyHandlerAdapter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerV3HandlerAdapter implements MyHandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof ControllerV3);
    }

    @Override
    public ModelView handle(HttpServletRequest request, HttpServletResponse response , Object handler) throws ServletException, IOException {
        ControllerV3 controller = (ControllerV3) handler;

        Map<String, String> paramMap = createParamMap(request);
        ModelView mv = controller.process(paramMap);
        return mv;
    }


    private static Map<String, String> createParamMap(HttpServletRequest request) { // ctrl+alt+M - 람다식 메서드 반환
        Map<String, String> paraMap = new HashMap<>();
        request.getParameterNames().asIterator()
            .forEachRemaining(paramName -> paraMap.put(paramName, request.getParameter(paramName)));
        // paramMap 에 request 에 있는 모든 파라미터를 넣어준다.
        return paraMap;
    }


}
