package seleniumbasiclearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFilesDemo {

	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		// 1. single file upload
		
		//driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\risha\\Desktop\\collection examples.txt");

//		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("collection examples.txt")) {
//			System.out.println("File is successfully uploaded");
//		} else {
//			System.out.println("upload failed");
//		}
		
		// 2. multiple files upload
		
		String file1 = "C:\\Users\\risha\\Desktop\\collection examples.txt";
		String file2 = "C:\\Users\\risha\\Desktop\\inroducion.txt";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int noOfUploadFiles = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		if(noOfUploadFiles == 2) {
			System.out.println("All Files are successfully uploaded");
		} else {
			System.out.println("upload failed");
		}
	}

}
