package ds.binarysearchtree;

public class BinarySearchTree {
	
	//Inorder LRootR
	//preorder Root L R
	//postorder L R root
	//complexity insert delete search operations for bst
	//search 

	private TreeNode root;
	public void insert(Integer data){
		if(root==null)
			this.root=new TreeNode(data);
		else root.insert(data);
		
	}
	
	public Integer smallest(){
		if(this.root!=null)
			return root.smallest();
		return null;
	}
	
	public Integer largest(){
		if(this.root!=null)
			return root.largest();
		return null;
	}
	
	public TreeNode find(Integer data){
		if(root!=null)
			return root.find(data);
		return null;
	}
	
	public void delete(Integer data){
		TreeNode toDel=find(data);
		toDel.delete();
	}
	/*
	public void delete(Integer data){
		TreeNode current=this.root;
		TreeNode parent=this.root;
		boolean isLeftChild=false;
		
		if (current==null)
			return;
		while(current!=null && current.getData()!=data){
			parent=current;
			
			if(data<current.getData()){
				current=current.getLeftChild();
				isLeftChild=true;
			}else{
				current = current.getRightChild();
				isLeftChild=false;
			}
		}
		if(current.getLeftChild()==null && current.getRightChild()==null){
			if(current==root){
				root=null;
			}else
			{
				if(isLeftChild)
					parent.setLeftChild(null);
				else
					parent.setRightChild(null);
			}
		}
		//case 2
		else if(current.getRightChild()==null){
			if(current==root){
				root=current.getLeftChild();
			}
			else if(isLeftChild){
				parent.setLeftChild(current.getLeftChild());
			}
			else{
				parent.setRightChild(current.getLeftChild());
			}
		}
		else if(current.getLeftChild()==null){
			if(current==root){
				root=current.getRightChild();
			}
			else if(isLeftChild){
				parent.setLeftChild(current.getRightChild());
			}
			else{
				parent.setRightChild(current.getRightChild());
			}
		}*/
		
		//case 3 node to be deleted has 2 child
		//first find a replacement
		//allnodes on right subtree u will find greater and if we go again the left that will be successor of the root
		 //what if the successor has right child?
		
		//softdelete - mark the nodes delete and then dont consider them
			
		}
	
	

