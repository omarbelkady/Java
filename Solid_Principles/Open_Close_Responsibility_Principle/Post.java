import java.util.*;
public class Post{

	//Instantiating a Private PostModel Object
	private PostModel postModel;

	//Post Class Constructor
	public Post(){
		postModel = new PostModel();
	}

	//Public Method that takes a string
	public void createAPost(String someContent){
		//If Post starts with HashTag save it as Post
		//Else save it normally
	//	if(someContent.startsWith("#")){
	//		postModel.saveAsTag(someContent);
	//	}
		postModel.save(someContent);
	}
}
