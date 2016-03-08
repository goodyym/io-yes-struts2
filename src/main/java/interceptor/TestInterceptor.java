package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Date;

/**
 *@description
 *
 *@return yaming
 *@date 2016/3/8 11:03
 *@since V1.0
 *
 */
public class TestInterceptor extends AbstractInterceptor{

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {

        System.out.println(new Date()+"================");
        return actionInvocation.invoke();
    }
}
