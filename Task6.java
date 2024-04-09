package task1;

public class Task6 {

	public static void duplicate(String s) {
		s=s.replaceAll("\\s+","");
		int[] freq=new int[256];
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			freq[c]++;
			
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>1) {
				System.out.println((char)i);
			}
		}

	}
	public static void main(String[] args) {
		String s="Epam Systems Pvt Ltd.";
		duplicate(s);
	}

}
