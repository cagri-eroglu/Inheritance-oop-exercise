
public class LogManager {
	
	public void log(int logType) {
		if (logType==1) {
			System.out.println("Veri Tabanýna loglandý");
		}else if (logType == 2) {
			System.out.println("Dosyaya loglandý");
		}else {
			System.err.println("e- mail loglandý");
		}
	}
	
}

// 1 -Database 
// 2- File
// 3 -E-mail
