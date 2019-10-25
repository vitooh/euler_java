package euler;

import java.io.File;

public class EulerFile {
	
	static String findFilePath(final String path, final String fileName) {
		
		final File[] files = new File(path).listFiles();
		for (final File file : files) {
			if (fileName.equals(file.getName())) {
				return file.toString();
			}
			//System.out.println(file + " " + file.getName());
			
			if (file.isDirectory()) {
				final String result = findFilePath(file.getPath(), fileName);
				if (result != null) {
					return result;
				}
			}
			
		}
		return null;
	}
	
	public static void main(final String[] agrs) {
		System.out.println(findFilePath("./", "1000digints_p08.txt"));
	}
}
