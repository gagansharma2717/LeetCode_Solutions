import java.util.*;
// Iternary --> a planned route or journey
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int noofpairs_src_des = scn.nextInt();
		HashMap<String, String> map = new HashMap<>();
		for (int i = 0; i < noofpairs_src_des; i++) {
			String s1 = scn.next();
			String s2 = scn.next();
			map.put(s1, s2);	
		}

        // Ek nya hashmap bnaya jisme cities ke name and boolean value that represents ki ye 
        // Potential Source Hai ya nhi
		HashMap<String,Boolean> potentialSource = new HashMap<>();

        // Input Hashmap pr loop chalaya
		for(String src : map.keySet())
		{
            // One thing is confirmed ki koi bhi destination toh hamara source nhi ho skti
			String dest = map.get(src);
            //  toh destination ke samne false daal diya
			potentialSource.put(dest,false);

            // Abhi keys ko check kiya Agar key present nhi hai potential source vale hashmap m
            // toh usko hashmap m add kiya and uske samne true rakhne bcoz vo hmara souyrce ho skta /// hai
			if(potentialSource.containsKey(src) == false)
			{
				potentialSource.put(src,true);
			}
		}

        // Abhi hme potential source vale hashmap se apna source find krna h 
        // Toh map pr loop lgaya jha bhi value m true mila vhi source hai
        // Usko apna source bnaya and break kr diya
		String src ="";
		for(String potential : potentialSource.keySet())
		{
			boolean val = potentialSource.get(potential);

			if(val == true)
			{
				src = potential;
				break;
			}
		}

        // Abhi toh just print krna hai source se print krna start krna hai and uski value ko 
        // new source bnate jaana hai and end mai last city ko print krke break krna h 
		while(true)
		{
			if(map.containsKey(src) == true)
			{
				System.out.print(src + " -> ");
				src = map.get(src);
			}else
			{
				System.out.println(src + ".");
				break;
			}

		}
	}
}
