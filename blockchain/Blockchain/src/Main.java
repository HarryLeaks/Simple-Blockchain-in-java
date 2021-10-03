import java.util.ArrayList;

public class Main {
	/*
	 * Hash = digital signature
	 * 
	 * Each block will have:
	 * 		List of transactions
	 * 		Previous Hash
	 * 
	 * 		Hash
	 */
	
	ArrayList<Block> blockchain = new ArrayList<>();
	
	public static void main(String[] args) {
		//First block
		String[] genesisTransactions = {"satoshi sent ivan 10 bitcoin", "fiver sent 10 bitcoins to ivan"};
		Block genesisBlock = new Block(0, genesisTransactions);
		
		//Second Block
		String[] block2Transactions = {"satoshi sent ivan 10 bitcoin", "fiver sent 10 bitcoins to ivan"};
		Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);
		
		System.out.println("Hash of the genesis block: " + genesisBlock.getBlockHash());
		System.out.println("Hash of the Block 2: " + block2.getBlockHash());
	}
}
