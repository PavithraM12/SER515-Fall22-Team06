import java.util.List;

public interface SyllabusManagerFacade {

	public abstract  String[][] searchSyllabus(String searchString);

	public String[][] searchWeb(String searchString);

	public void loadData();

	public void getPreviousSyllabus();

	public void updateModule();

	public void addModule(Module module);

	public void deleteModule(Module module);

	public List<Module> getModules();

	public void updateMetrics(String[][] grading);

	public void updatePolicies();

	public void modifyCourseMaterial();

	public void loadComments();

}
