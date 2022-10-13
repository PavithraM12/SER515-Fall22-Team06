import java.util.List;

public class Windows implements SyllabusManagerFacade{

	private List<Module> modules;

	private Course course;

	private Editor editor;

	private Search search;

	public void loadOS(){

	};

	public void loadSubSystems(){

	};

	@Override
	public String[][] searchSyllabus(String searchString) {
		return new String[0][];
	}

	@Override
	public String[][] searchWeb(String searchString) {
		return new String[0][];
	}

	@Override
	public void loadData() {

	}

	@Override
	public void getPreviousSyllabus() {
		System.out.println("Previous Year Syllabus scraped and fetched successfully");
	}

	@Override
	public void updateModule() {

	}

	@Override
	public void addModule(Module module) {

	}

	@Override
	public void deleteModule(Module module) {

	}

	@Override
	public List<Module> getModules() {
		return null;
	}

	@Override
	public void updateMetrics(String[][] grading) {

	}

	@Override
	public void updatePolicies() {

	}

	@Override
	public void modifyCourseMaterial() {

	}

	@Override
	public void loadComments() {

	}

}
