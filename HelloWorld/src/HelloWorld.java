import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
	public static List<String> createTree(Character[] a){
		int len = a.length;
		int deep = 0;
		int b = len;
		while(b>0) {
			b = b / 2;
			deep = deep + 1;
		}
		List<String> tree = new ArrayList<String>();
		int get = 0;
		int contain = 1;
		for(int i = 1;i <= deep;i++) {
			StringBuffer c = new StringBuffer();
			for(int j = 0;j < contain;j++) {
				if(get<len) {
					c.append(a[get]);
					get++;
					}
				else break;
			}
			tree.add(c.toString());
			contain = contain * 2;
		}
		return tree;
	}
	
	public static void main(String args[]) {
		Character hello[] = {'H','e','l','l','o','W','o','r','l','d'};
		List<String> tree = createTree(hello);
		for(String getTree:tree) {
			System.out.println(getTree);
		}
	}
}
