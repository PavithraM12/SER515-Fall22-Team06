public class Main {
    public static void main(String[] args){
        Syllabus syllabus = new Syllabus();
        SyllabusBuilder builder = new SyllabusBuilder();
        Alerts alert = new Alerts();
        SyllabusDecorator decorator = new SyllabusDecorator();
        Windows windows = new Windows();
        builder.setCourseDetails();
        System.out.println(syllabus.lms.getDescription("Foundations of Software Engineering"));
        alert.sendAlerts();
        windows.getPreviousSyllabus();
        decorator.createSyllabus();
    }
}
