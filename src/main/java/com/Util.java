package com;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Util {
	public static boolean fileExist (String location) {
		Path path = Paths.get(location);
		
		return Files.exists(path);
		
	}

}
