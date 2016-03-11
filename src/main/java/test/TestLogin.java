package test;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.TestLoginServiceImpl;


@Controller
@Namespace("/testA")
@ParentPackage("json-default")
@Scope("prototype")
public class TestLogin extends ActionSupport{

    private String username;
    private int ssss;

    @Autowired
    private TestLoginServiceImpl testLoginService;

    @Action(value = "aa", results = {@Result(name = SUCCESS, location = "/pages/testlogin.jsp")})
    public String aa(){
        System.out.println(username+"=============username");

        testLoginService.bb();
        return SUCCESS;
    }

    @Action(value = "testAjax" , results = {@Result(name = SUCCESS,type = "json")})
    public String testAjax(){
        username ="json-name";
        ssss = 9;
        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getSsss() {
        return ssss;
    }

    public void setSsss(int ssss) {
        this.ssss = ssss;
    }
}
