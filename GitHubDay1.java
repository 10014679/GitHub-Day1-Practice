import java.util.ArrayList;
public class GitHubDay1{
	public static void main(String[]args){

	ArrayList<Integer> list1 = new ArrayList<>();
	ArrayList<Integer> list2 = new ArrayList<>();

	for(int i = 0; i < 10; i++){
		list1.add(i);
		list2.add(i);
	}

	System.out.println(joinLists(list1, list2));
	}

	public static ArrayList<Integer> joinLists(ArrayList<Integer> a, ArrayList<Integer> b){
		ArrayList<Integer> totallist = new ArrayList<>();
		for(int i = 0; i < a.size(); i++){
			totallist.add(a.get(i));
			totallist.add(b.get(i));
		}
		return totallist;
	}
}