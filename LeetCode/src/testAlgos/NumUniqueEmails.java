package testAlgos;

import java.util.ArrayList;
import java.util.HashMap;

public class NumUniqueEmails {

	public static void main(String[] args) {
		
		String[] emails= {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		System.out.println(numUniqueEmails(emails));
		
	}
	
	
	public static int numUniqueEmails(String[] emails) {
		
		HashMap<String,ArrayList<String>> domainMap = new HashMap<String, ArrayList<String>>();
		
        for(int i=0; i<emails.length;i++){
        	
        	ArrayList<String> localList = new ArrayList<String>(); 
        	
        	String domainName = emails[i].substring(emails[i].indexOf("@")+1);
        	String localName = emails[i].substring(0,emails[i].indexOf("@"));
        	localName = localName.replace(".", "");
        	
        	if (localName.contains("+")) localName=localName.substring(0,localName.indexOf("+")) ;
        	
        	if(domainMap.containsKey(domainName)) {
        		/*if(domainMap.get(domainName).contains(localName)) {}
        		else {
        			localList = domainMap.get(domainName);
        			localList.add(localName);
        		}*/
        	}
        	else localList.add(localName);
        	
        	domainMap.put(domainName,localList);
        }
        
        
        for (String key : domainMap.keySet())  
        {
           System.out.println(key + ":"+ domainMap.get(key));
        }
        
		return 0;
        
    }

}
