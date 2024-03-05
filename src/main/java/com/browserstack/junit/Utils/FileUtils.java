package com.browserstack.junit.Utils;

import org.apache.commons.io.FilenameUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *  Extract all xml files from the input directory
 * @author venkatesh
 * @since 2024-03-04
 */
public class FileUtils {

    /**
     *
     * @param dir-Directory name
     * @param depth- max sub directories to search
     * @return Returns a set of Paths
     * @throws IOException
     */
    public Set<Path> listFilesUsingFileWalk(String dir, int depth) throws IOException {
        try (Stream<Path> stream = Files.walk(Paths.get(dir), depth)) {
            return stream
                    .filter(file -> !Files.isDirectory(file))
                    .filter(file -> FilenameUtils.isExtension(String.valueOf(file.getFileName()),"xml"))
                    .collect(Collectors.toSet());
        }
    }

}
