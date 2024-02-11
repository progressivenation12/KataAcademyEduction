package org.javaCore.module3;

public class Task_3_2_04 {
    public static void main(String[] args) throws BadCreditHistoryException, ProblemWithLawException {
        BankClient client1 = new BankClient("Good");
        BankClient client2 = new BankClient("Проблемы с законом");
        BankClient client3 = new BankClient("Проблемы с банковской историей");
        BankWorker worker = new Worker();
        System.out.println(getCreditForClient(worker, client1) + "\n"); //true

        System.out.println(getCreditForClient(worker, client2) + "\n"); //false

        System.out.println(getCreditForClient(worker, client3) + "\n"); // "Проблемы с банковской историей" false
    }

public static boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) {
    try {
        if (bankWorker.checkClientForCredit(bankClient)) {
            return true;
        }
    } catch (BadCreditHistoryException badCreditHistoryException) {
        System.out.println("Проблемы с банковской историей");
    } catch (ProblemWithLawException e) {
        System.out.print("");
    }
    return false;
}
}

class BankClient {
    public String status;

    public BankClient(String status) {
        this.status = status;
    }

}

class Worker implements BankWorker {
    @Override
    public boolean checkClientForCredit(BankClient client) throws BadCreditHistoryException, ProblemWithLawException {
        if (client.status.equals("Проблемы с банковской историей")) {
            throw new BadCreditHistoryException("Проблемы с банковской историей");
        } else if (client.status.equals("Проблемы с законом")) {
            throw new ProblemWithLawException("");
        }
        return true;
    }
}

class BadCreditHistoryException extends Exception {
    public BadCreditHistoryException(String message) {
        super(message);
    }
}

class ProblemWithLawException extends Exception {
    public ProblemWithLawException(String message) {
        super(message);
    }
}

interface BankWorker {
    boolean checkClientForCredit(BankClient client) throws BadCreditHistoryException, ProblemWithLawException;
}