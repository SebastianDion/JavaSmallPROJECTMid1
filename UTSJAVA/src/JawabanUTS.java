import java.util.Scanner;
import java.util.ArrayList;


public class JawabanUTS {
	
	static ArrayList<StudentClass> nameListStudent = new ArrayList<>();
	static ArrayList<LecturerClass> nameListLecturer = new ArrayList<>();
	static ArrayList<SubjectClass> nameListSubject = new ArrayList<>();
	static ArrayList<KelasClass> nameListClass = new ArrayList<>();
	static ArrayList<ClassroomClass> nameListClassroom = new ArrayList<>();
	static ArrayList<ExamClass> nameListExam = new ArrayList<>();
	static ArrayList<StudentNIMClass> nameListStudentNIM = new ArrayList<>();
	static ArrayList<String> nameListLecturerCode = new ArrayList<>();
	static int showdataChoice;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Pop University");
		System.out.println("\n\n\n\n\nPress Enter key to continue...");
        sc.nextLine();
       
		int choice;
		
		while(true) {
			for(int i=0;i<=30;i++) {
		    	   System.out.println(" ");
		       }
		System.out.println("Menu");
		System.out.println("========================");
		System.out.println("1. Data Students");
		System.out.println("2. Data Lecturer");
		System.out.println("3. Data Subject");
		System.out.println("4. Data Class");
		System.out.println("5. Data Classroom");
		System.out.println("6. Data Exams");
		System.out.println("7. Show Data");
		System.out.println("8. Exit");
		System.out.println("=========================");
		System.out.print("Choose your option to add or show data:");
		choice=sc.nextInt();
		
		if(choice==8) {
			System.out.print("\n\nThanks For Using Our Program");
			
			break;
		}
		if(choice==1) {
			StudentsMethod();
			System.out.print("Press enter key to confirm");
			sc.nextLine();sc.nextLine();
		}
		else if(choice==2) {
			Lecturer();
			LecturerCode();
			System.out.print("Press enter key to confirm");
			sc.nextLine();sc.nextLine();
		}
		else if(choice==3) {
			Subject();
			System.out.print("Press enter key to confirm");
			sc.nextLine();sc.nextLine();
		}
		else if(choice==4) {
			Class();
			System.out.print("Press enter key to confirm");
			sc.nextLine();sc.nextLine();
		}
		else if(choice==5) {
			Classroom();
			System.out.print("Press enter key to confirm");
			sc.nextLine();sc.nextLine();
		}
		else if(choice==6) {
			Exams();
			System.out.print("Press enter key to confirm");
			sc.nextLine();sc.nextLine();
		}
		else if(choice==7) {
			showData();
		}
		else {
			System.out.print("Invalid input, try again");
		}
		
		}
	
	
	}
	
	public static void StudentsMethod() {
				String namaStudent;		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input student's name(with uppercase for the first Leter): ");
		namaStudent=sc.nextLine();
		if(Character.isLowerCase(namaStudent.codePointAt(0))){
			System.out.println("Invalid input(1st letter is not an uppercase)\n");
			StudentsMethod();
			return;
		}
		StudentClass student = new StudentClass(namaStudent);
		nameListStudent.add(student);
		
		String StudentNIM;
		System.out.print("Input student's NIM: ");
		StudentNIM=sc.nextLine();
		StudentNIMClass NIM =new StudentNIMClass(StudentNIM);
		nameListStudentNIM.add(NIM);
		
	}
	

	
	public static void Lecturer(){
		String namaLecturer;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input lecturer's name(with uppercase for the first Leter): ");
		 namaLecturer=sc.nextLine();
		 if(Character.isLowerCase(namaLecturer.codePointAt(0))){
			 System.out.println("Invalid input(1st letter is not an uppercase)\n");
				Lecturer();
				return;
			}
		 LecturerClass Lecturer = new LecturerClass(namaLecturer);
		nameListLecturer.add(Lecturer);
	}
	
		public static void LecturerCode() {
			Scanner sc = new Scanner(System.in);
		String LecturerCode;
		System.out.print("Input Lecturer's Code(starts with\"D\"): ");
		LecturerCode=sc.nextLine();
		if(!LecturerCode.startsWith("D")){
			 System.out.println("Invalid input(1st letter does not starts with\"D\" ");
				LecturerCode();
				return;
			}
		nameListLecturerCode.add(LecturerCode);
	}
	public static void Subject(){
		String namaSubject;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input subject name: ");
		 namaSubject=sc.next();
		 SubjectClass Subject = new SubjectClass(namaSubject);
		nameListSubject.add(Subject);
		
		
		
	}
	public static void Class(){
		String namaClass;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Class name(Starts with \"L\"): ");
		namaClass=sc.next();
		if(!namaClass.startsWith("L")){
			 System.out.println("Invalid input(Does not start with \"L\")\n");
				Class();
				return;
			}
		KelasClass namaKelas = new KelasClass(namaClass);
		nameListClass.add(namaKelas);
		
	}
	public static void Classroom(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Classroom number: ");
		
		while(!sc.hasNextInt()){
			System.out.println("That is not an integer,classroom must be integer");
			Classroom();
			return;
		}
		int namaClass=sc.nextInt();
		ClassroomClass namaClassroom= new ClassroomClass(namaClass);
		nameListClassroom.add(namaClassroom);
		
	}
	public static void Exams(){
		int namaExam;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Exam score: ");
		namaExam=sc.nextInt();
		if(namaExam<0){
			 System.out.println("Exam score cannot be lower than 0");
				Exams();
				return;
			}
		ExamClass poinExam = new ExamClass(namaExam);
		nameListExam.add(poinExam);
		
	}
	public static void showData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\nShow Data");
		System.out.println("========================");
		System.out.println("1. Show Student Data");
		System.out.println("2. Show Leturer Data");
		System.out.println("3. Show Subject Data");
		System.out.println("4. Show Class Data");
		System.out.println("5. Show Classroom Data");
		System.out.println("6. Show Exam Data");
		System.out.println("=========================");
		System.out.print("Choose your option to show data:");
		
		showdataChoice=sc.nextInt();
	
		
		if(showdataChoice==1) {
		System.out.println("\n\n\nStudent Data");
		System.out.println("================");
		for (int i = 0; i <nameListStudent.size(); i++) {
            System.out.println(i+1 +"."+ nameListStudent.get(i).nama + "-"+ nameListStudentNIM.get(i).NIM);
        }
		System.out.println("================");
		sc.nextLine();sc.nextLine();
		}
		
		else if(showdataChoice==2) {
		sc.nextLine();sc.nextLine();
		System.out.println("\nLecturer Data");
		System.out.println("================");
		for (int i = 0; i <nameListLecturer.size(); i++) {
            System.out.println(i+1 +"."+ nameListLecturer.get(i).nama+ "-"+ nameListLecturerCode.get(i));
        }
		System.out.println("================");
		sc.nextLine();
		}
		
		else if(showdataChoice==3) {
		System.out.println("\nSubject Data");
		System.out.println("================");
		for (int i = 0; i <nameListSubject.size(); i++) {
            System.out.println(i+1 +"."+ nameListSubject.get(i).SubjectName);
        }
		System.out.println("================");
		sc.nextLine();sc.nextLine();
		}
		
		else if(showdataChoice==4) {
		System.out.println("\nClass Data");
		System.out.println("================");
		for (int i = 0; i <nameListClass.size(); i++) {
            System.out.println(i+1 +"."+ nameListClass.get(i).NamaKelas);
        }
		System.out.println("================");
		sc.nextLine();sc.nextLine();
		}
		
		else if(showdataChoice==5) {
		System.out.println("\nClassroom Data");
		System.out.println("================");
		for (int i = 0; i <nameListClassroom.size(); i++) {
            System.out.println(i+1 +"."+ nameListClassroom.get(i).NamaClassroom);
        }
		System.out.println("================");
		sc.nextLine();sc.nextLine();
		}
		
		else if(showdataChoice==6) {
		System.out.println("\nExam Data");
		System.out.println("================");
		for (int i = 0; i <nameListExam.size(); i++) {
            System.out.println(i+1 +"."+ nameListExam.get(i).ExamPoint);
        }
		System.out.println("================");
		sc.nextLine();sc.nextLine();
		}
		
		else {
			System.out.println("Invalid Data");
			sc.nextLine();
		}
	}
	
	

}
class StudentClass{
	String nama;
	public StudentClass(String nama) {
		this.nama = nama;
		}
}
class StudentNIMClass{
	String NIM;
	public StudentNIMClass(String NIM) {
		this.NIM = NIM;
		}
}

class LecturerClass{
	String nama;
	public LecturerClass(String nama) {
		this.nama = nama;
	}
}
class SubjectClass{
	String SubjectName;
	public SubjectClass(String SubjectName) {
		this.SubjectName = SubjectName;
		}
}

class KelasClass{
	String NamaKelas;
	public KelasClass(String NamaKelas) {
		this.NamaKelas = NamaKelas;
		}
}
class ClassroomClass{
	Integer NamaClassroom;
	public ClassroomClass(Integer NamaClassroom) {
		this.NamaClassroom = NamaClassroom;
		}
}
class ExamClass{
	Integer ExamPoint;
	public ExamClass(Integer ExamPoint) {
		this.ExamPoint = ExamPoint;
	}
}

	