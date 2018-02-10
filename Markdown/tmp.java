public class tmp{
	int max;
	String longest;
	public getLongestWord(HashSet<String> dict, String word){
		HashMap<Integer, String> map = new HashMap<>();
		for(String s : dict){
			map.put(s.length(), map.getOrDefault(s.length(),new ArrayList<String>());
		}
		max = word.length();
		longest = word;
		helper(map, word,0);
		return longest;
	}
	private void helper(HashMap<Integer, String> map, String s, int length){
		ArrayList<String> cur = map.get(s.length()+1);
		for(String tmp : cur){
			if(tmp.contains(s)){
				helper(map, tmp, length+1);
				map.get(s.length()+1).remove(tmp);
			}
		}
		if(length>max){
			max = length;
			longest = s;
		}
	}



	public TreeNode successor(TreeNode root, TreeNode p){
		if(root == null)return null;
		if(root.val<=p.val)return successor(root.right, p);
		TreeNode left = successor(root.left, p);
		return left==null?root:left;
	}

	public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
	    TreeNode res = null;
	    while(root!=null) {
	        if(root.val > p.val) {
	        	res = root;
	        	root = root.left;
	        }
	        else root = root.right;
	    }
	    return res;
	}

	public TreeNode inorderPredecessor (TreeNode root, TreeNode p) {
	    TreeNode res = null;
	    while(root!=null) {
	        if(root.val < p.val) {
	        	res = root;
	        	root = root.right;
	        }
	        else root = root.left;
	    }
	    return res;
	}
}