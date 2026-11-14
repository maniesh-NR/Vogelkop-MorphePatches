package org.chromium.base;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;

/* loaded from: classes.dex */
public final class FileUtils {
    public static String a(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        int iLastIndexOf2 = str.lastIndexOf(46);
        return iLastIndexOf >= iLastIndexOf2 ? "" : str.substring(iLastIndexOf2 + 1).toLowerCase(Locale.US);
    }

    public static String copyFileToDownloadsCollection(String str, String str2) throws IOException {
        File file = new File(str);
        if (file.exists()) {
            String name = file.getName();
            ContentResolver contentResolver = t8.a.getContentResolver();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            ContentValues contentValues = new ContentValues();
            contentValues.put("title", name);
            contentValues.put("_display_name", name);
            contentValues.put("mime_type", str2);
            contentValues.put("date_added", Long.valueOf(jCurrentTimeMillis));
            contentValues.put("date_modified", Long.valueOf(jCurrentTimeMillis));
            contentValues.put("is_pending", (Integer) 1);
            contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
            Uri uriInsert = contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
            if (uriInsert != null) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                        if (outputStreamOpenOutputStream == null) {
                            if (outputStreamOpenOutputStream != null) {
                                outputStreamOpenOutputStream.close();
                            }
                            fileInputStream.close();
                            return null;
                        }
                        try {
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int i = fileInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                outputStreamOpenOutputStream.write(bArr, 0, i);
                            }
                            outputStreamOpenOutputStream.close();
                            fileInputStream.close();
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("is_pending", (Integer) 0);
                            try {
                                if (contentResolver.update(uriInsert, contentValues2, null, null) == 1) {
                                    return uriInsert.toString();
                                }
                            } catch (RuntimeException e) {
                                e.getMessage();
                            }
                            contentResolver.delete(uriInsert, null, null);
                            return null;
                        } finally {
                        }
                    } finally {
                    }
                } catch (IOException e2) {
                    e2.getMessage();
                    contentResolver.delete(uriInsert, null, null);
                    return null;
                }
            }
        }
        return null;
    }
}
