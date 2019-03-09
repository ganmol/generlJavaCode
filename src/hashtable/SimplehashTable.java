package hashtable;

public class SimplehashTable {

	private storedEmployee[] hashtable;
	
	public SimplehashTable(){
		hashtable = new storedEmployee[10];
	}
	
	//hash function
	public int hashKey(String key){
		return key.length() % hashtable.length;
	}
	
	public void put(String key , Employee  emp){
		int hashedKey = hashKey(key);
		//linear probing to avoid collision
		//first linear probing 
		if(isOccupied(hashedKey)){
			int stopIndex = hashedKey;
			if(stopIndex==hashtable.length-1){
				hashedKey=0;
			}
			else
				hashedKey++;
			//next probe
			while(isOccupied(hashedKey) && hashedKey!=stopIndex){
				hashedKey = (hashedKey +1) % hashtable.length;
			}
			
		}
		if(hashtable[hashedKey]!= null)
			System.out.println(" item already present ");
		else 
			hashtable[hashedKey]= new storedEmployee(key, emp);
	}
	
	public int findhashedkey(String key){
		int hashedKey = hashKey(key);
		if(hashtable[hashedKey]!=null && hashtable[hashedKey].getKey().equals(key)){
			return hashedKey;
		}
		
			int stopIndex = hashedKey;
			if(stopIndex==hashtable.length-1){
				hashedKey=0;
			}
			else
				hashedKey++;
			while(hashtable[hashedKey]!=null && hashedKey!=stopIndex && !hashtable[hashedKey].getKey().equals(key)){
				hashedKey = (hashedKey +1) % hashtable.length;
			}
		
			if(hashedKey==stopIndex)
				return -1;
			else
				return hashedKey;
		
	}
	
	public boolean isOccupied(int index){
		return hashtable[index]!=null;
	}
	
	public Employee get(String key){
		int hashedkey = findhashedkey(key);
		if(hashedkey==-1)
			return null;
		else
			return hashtable[hashedkey].getEmp();
	}
	
	public Employee remove(String key){
		int hashedKey=  findhashedkey(key);
		// no employee with this key present 
		if(hashedKey==-1)
			return null;
		Employee emp =  hashtable[hashedKey].getEmp();
		hashtable[hashedKey]=null;
		return emp;
	}
	
	public void printhashTable(){
		for (int i =0 ; i<hashtable.length ; i++){
			if(hashtable==null)
				System.out.println("empty");
			else
			System.out.println(hashtable[i]);
		}
	}
}


