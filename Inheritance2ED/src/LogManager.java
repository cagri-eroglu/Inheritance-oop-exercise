
public class LogManager {
	
	public void log(int logType) {
		if (logType==1) {
			System.out.println("Veri Taban�na logland�");
		}else if (logType == 2) {
			System.out.println("Dosyaya logland�");
		}else {
			System.err.println("e- mail logland�");
		}
	}
	
}

// 1 -Database 
// 2- File
// 3 -E-mail
