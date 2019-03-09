package hashTableChainning;

import java.util.LinkedList;

import hashtable.storedEmployee;

public class ChainHashTable {

	private LinkedList<StoredEmployee>[] hashtable;
	
	public ChainHashTable(){
		hashtable= new LinkedList[10];
		for(int i=0 ; i<hashtable.length ;i++){
			hashtable[i]= new LinkedList<StoredEmployee>();
		}
		
	}
	
	public void put(String key , Employee emp){
		int hashkey=hashKey(key);
		hashtable[hashkey].add(new StoredEmployee(key, emp));
	}
	
	public void get(String key ){
		
	}
	//hash function
		public int hashKey(String key){
			return key.length() % hashtable.length;
		}
}
