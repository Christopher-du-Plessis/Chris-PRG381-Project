/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogicLayer;

/**
 *
 * @author Christopher
 */
public class Payment 
{
    int invoice_num;
    double pay_date;
    double amount;
    int event_id;
    
    public Payment(int invoice_num, double pay_date, double amount, int event_id)
    {
        this.invoice_num = invoice_num;
        this.pay_date = pay_date;
        this.amount = amount;
        this.event_id = event_id;
        
    }
}