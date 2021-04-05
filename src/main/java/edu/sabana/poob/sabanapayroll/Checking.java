package edu.sabana.poob.sabanapayroll;

import java.time.LocalDate;

public class Checking extends BankAccount {

    public final double DEPOSIT_DISCOUNT=5000;


    @Override
    public double getDepositDiscount()
    {
        return this.DEPOSIT_DISCOUNT;
    }

    public boolean processCheck(Check check) {
        boolean result = false;

        if (check.getExpirationDate().isAfter(LocalDate.now()) && check.getAmount() > DEPOSIT_DISCOUNT) {
            result = true;
            try {
                setBalance(check.getAmount()-DEPOSIT_DISCOUNT+getBalance());
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
            /*
            else
            {
                try {
                    setBalance(0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
             */


        return result;
    }


}