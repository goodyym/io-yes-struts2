package test;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

/**
 *@description
 *
 *@return yaming
 *@date 2016/3/8 10:17
 *@since V1.0
 *
 */
public class TestLogin extends ActionSupport{

    private String username;

    @Override
    public String execute() throws Exception {

        HttpServletRequest request = ServletActionContext.getRequest();

        System.out.println(username+"+++++++++++++++++++++");

        request.setAttribute("aa","bb");
        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
