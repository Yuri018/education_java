package checkingAccount;

import java.util.Date;

public class depositAccount {

    //переменная для запоминания даты и времени пополнения депозитного счета
    private Date creationTime;

    //метод, который задаст время действия со счетом
    private void setCreationTime(){
        creationTime = new Date();
    }
    public Date getCreationTime(){
        return creationTime;
    }


}
