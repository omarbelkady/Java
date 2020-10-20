import java.util.*;
public class Tag extends Post{

	//We want to make an extension of the Post Class

	//Creating another instance of the post Model
	private PostModel postModel;

	//Creating the constructor
	public Tag(){
		postModel = new PostModel();
	}

	//Public Method that will override the post
	@Override
	public void createAPost(String someContent){
		super.createAPost(someContent);

		//call the post Model
		postModel.saveAsTag(someContent);
	}
}
