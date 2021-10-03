import java.util.Arrays;

public class Block {
	private int previousHash;
	String[] transactions;
	
	private int blockHash;
	
	public Block(int previousHash, String[] transactions) {
		this.previousHash = previousHash;
		this.transactions = transactions;
		
		Object[] contents = {Arrays.hashCode(transactions), previousHash}; //we gone calculate the current hash based on the hash transactions and the previous hash
		this.blockHash = Arrays.hashCode(contents);
	}
	
	public int getPreviousHash() {
		return previousHash;
	}
	
	public String[] getTransaction() {
		return transactions;
	}
	
	public int getBlockHash() {
		return blockHash;
	}
}
