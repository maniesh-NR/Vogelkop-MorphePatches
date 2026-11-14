package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class s29 {
    public static final HashSet a;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add("tar.bz2");
        hashSet.add("tar.gz");
        hashSet.add("tar.xz");
        hashSet.add("tar.Z");
    }

    public static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public static boolean b(File file, File file2) throws IOException {
        if (file.equals(file2)) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    a(fileInputStream, fileOutputStream);
                    fileOutputStream.close();
                    fileInputStream.close();
                    return true;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public static File c() {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            File[] fileArrListFiles = new File("/mnt").listFiles(new ltp((byte) 1));
            File file = (fileArrListFiles == null || fileArrListFiles.length <= 0) ? null : new File(fileArrListFiles[0], "Download");
            if (file != null) {
                externalStoragePublicDirectory = file;
            }
        }
        File fileF = f(externalStoragePublicDirectory, false);
        if (!fileF.exists()) {
            fileF.mkdirs();
        }
        return fileF;
    }

    public static String d(String str) {
        int iLastIndexOf;
        if (str == null || (iLastIndexOf = str.lastIndexOf(46)) == -1) {
            return "";
        }
        int iLastIndexOf2 = str.lastIndexOf(46, iLastIndexOf - 1);
        if (iLastIndexOf2 != -1) {
            String strSubstring = str.substring(iLastIndexOf2 + 1);
            if (a.contains(strSubstring)) {
                return strSubstring;
            }
        }
        return str.substring(iLastIndexOf + 1);
    }

    public static File e(Context context) {
        return f(new File(context.getCacheDir(), "transient_download"), true);
    }

    public static File f(File file, boolean z) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return file;
            }
            String absolutePath = file.getAbsolutePath();
            int i = 1;
            while (true) {
                File file2 = new File(absolutePath + i);
                if (!file2.exists()) {
                    file = file2;
                    break;
                }
                if (file2.isDirectory()) {
                    return file2;
                }
                i++;
            }
        }
        if (z) {
            file.mkdirs();
        }
        return file;
    }

    public static boolean g(Uri uri) {
        return "file".equals(uri.getScheme());
    }

    public static byte[] h(File file) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            byte[] bArr = new byte[(int) file.length()];
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileInputStream2.read(bArr);
                xvg.l(fileInputStream2);
                return bArr;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                xvg.l(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String i(File file) throws Throwable {
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        Charset charsetDefaultCharset = Charset.defaultCharset();
        InputStreamReader inputStreamReader2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                inputStreamReader = new InputStreamReader(fileInputStream, charsetDefaultCharset);
            } catch (IOException unused) {
                inputStreamReader = null;
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException unused2) {
            inputStreamReader = null;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
        try {
            char[] cArr = new char[4096];
            StringBuilder sb = new StringBuilder();
            while (true) {
                int i = inputStreamReader.read(cArr);
                if (i == -1) {
                    String string = sb.toString();
                    xvg.l(inputStreamReader);
                    xvg.l(fileInputStream);
                    return string;
                }
                sb.append(cArr, 0, i);
            }
        } catch (IOException unused3) {
            xvg.l(inputStreamReader);
            xvg.l(fileInputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            inputStreamReader2 = inputStreamReader;
            xvg.l(inputStreamReader2);
            xvg.l(fileInputStream);
            throw th;
        }
    }

    public static void j(File file, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void k(InputStream inputStream, File file) throws Throwable {
        File file2 = new File(file.getParentFile(), file.getName() + ".tmp");
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
            try {
                xvg.n(inputStream, fileOutputStream2);
                fileOutputStream2.close();
                if (file2.renameTo(file)) {
                } else {
                    throw new IOException("Rename failed");
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                xvg.l(fileOutputStream);
                file2.delete();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
