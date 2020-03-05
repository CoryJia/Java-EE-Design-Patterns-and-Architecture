package interceptor;

import javax.interceptor.ExcludeClassInterceptors;
import javax.interceptor.Interceptors;

@Interceptors(LoggerInterceptor.class)
public class AccountService {
    public AccountService(){}

    public void upgradeAccount(String accountNumber){
        //upgrade account
    }

    @ExcludeClassInterceptors
    public void AuditAccount(String accountNumber){
        //perform audit logic
    }
}
