package BST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class BOJ7662 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());

		int T = Integer.parseInt(st.nextToken());

		while(T-- > 0){
			int k = Integer.parseInt(br.readLine());
			List<String[]> ops = new ArrayList<>();
			TreeMap<Integer, Integer> map = new TreeMap();
			while(k-- > 0){
				st = new StringTokenizer(br.readLine());
				String op = st.nextToken();
				int num = Integer.parseInt(st.nextToken());
				if(op.equals("I")){
					map.put(num,map.getOrDefault(num,0)+1);
				}else{
					if(map.isEmpty()) continue;
					if (num == 1) {
						int max = map.lastKey();
						if(map.get(max) > 1) map.put(max ,map.getOrDefault(max, 0) - 1);
						else map.remove(max);
					}else{
						int min = map.firstKey();
						if(map.get(min) > 1) map.put(min ,map.getOrDefault(min, 0) - 1);
						else map.remove(min);
					}
				}
			}
			if (map.isEmpty()) {
				System.out.println("EMPTY");
			}else{
				System.out.println(map.lastKey()+ " " + map.firstKey());
			}
		}

	}
}
