package utils.login;

import io.cucumber.datatable.DataTable;
import models.login.LoginModel;

import java.util.List;
import java.util.Map;

public class GetDataLoginTableUtils {
    public static LoginModel getLoginCredentials(DataTable dataTable) {
        String name = "";
        String password = "";
        List<Map<String, String>> accountDataList = dataTable.asMaps();
        for (Map<String, String> accountData : accountDataList) {
            name = accountData.get("User name");
            password = accountData.get("Password");
        }
        LoginModel loginModel = new LoginModel();
        loginModel.setName(name);
        loginModel.setPassword(password);
        return loginModel;
    }
}
