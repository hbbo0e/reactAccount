package kr.co.seoulit.account.operate.funds.to;


import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class NoteStatusBean {

    private String customerName;
    private String previousBalance;
    private String dayIncrease;
    private String dayDecrease;
    private String dayBalance;
}
