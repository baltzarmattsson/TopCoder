public class AccountBalance {
    public int processTransactions(int startingBalance, String[] transactions) {
        String[] transactionSplit;
        String type;
        int amount;
        for (String transaction : transactions) {
        	transactionSplit = transaction.split(" ");
            type = transactionSplit[0];
			amount = Integer.parseInt(sa[1]);
            startingBalance += type.equals("D") ? -amount : amount;
        }    
        return startingBalance;
    }
}