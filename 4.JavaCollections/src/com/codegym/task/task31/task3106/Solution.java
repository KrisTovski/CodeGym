package com.codegym.task.task31.task3106;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.zip.ZipInputStream;

/*
Unzipping a file

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String resultFileName = args[0];
        String[] files = new String[args.length - 1];
        //arraycopy(Object source_arr, int sourcePos, Object dest_arr, int destPos, int len)
        System.arraycopy(args,1,files,0,args.length-1);
        Arrays.sort(files);

        ByteArrayOutputStream splitZip = new ByteArrayOutputStream();
        for (String str : files) {
            Files.copy(Paths.get(str), splitZip);
        }
        splitZip.flush();
        byte[] bytes = splitZip.toByteArray();
        splitZip.close();
        try(FileOutputStream fos = new FileOutputStream(resultFileName)) {
            try(ZipInputStream zis = new ZipInputStream(new ByteArrayInputStream(bytes))) {
                zis.getNextEntry();
                ByteArrayOutputStream buffer = new ByteArrayOutputStream();
                byte[] buffer1 = new byte[8 * 1024];
                int len;
                while ((len = zis.read(buffer1)) > 0) {
                    buffer.write(buffer1, 0, len);
                }
                buffer.flush();
                buffer.writeTo(fos);
                buffer.close();
                fos.flush();
            }
        }

    }
}
