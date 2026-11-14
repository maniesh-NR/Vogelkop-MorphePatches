package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class pjo extends ljo {
    public final Semaphore c = new Semaphore(1);
    public final ArrayList b = new ArrayList();

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public final void b(URLConnection uRLConnection, jro jroVar, File file) throws Throwable {
        pjo pjoVar;
        File file2;
        IOException iOException;
        Throwable th;
        InputStream errorStream;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        FileOutputStream fileOutputStream2;
        InputStream inputStream2;
        String strC;
        wci wciVar = jroVar.e;
        FileOutputStream fileOutputStream3 = null;
        try {
            try {
                ljo.a(uRLConnection, jroVar);
                int responseCode = ((HttpURLConnection) uRLConnection).getResponseCode();
                if (responseCode != 200) {
                    errorStream = ((HttpURLConnection) uRLConnection).getErrorStream();
                    if (errorStream == null) {
                        strC = "";
                    } else {
                        try {
                            try {
                                strC = dyg.c(errorStream);
                            } catch (IOException e) {
                                e = e;
                                pjoVar = this;
                                file2 = file;
                                iOException = e;
                                fileOutputStream = null;
                                inputStream = errorStream;
                                String message = iOException.getMessage();
                                gxo.c(new bu3(pjoVar, file2, "exception：" + message, wciVar, message, true));
                                hn9.f(uRLConnection);
                                r9h.l(fileOutputStream);
                                r9h.l(inputStream);
                                return;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream2 = fileOutputStream3;
                            inputStream2 = errorStream;
                            hn9.f(uRLConnection);
                            r9h.l(fileOutputStream2);
                            r9h.l(inputStream2);
                            throw th;
                        }
                    }
                    String str = strC;
                    pjoVar = this;
                    file2 = file;
                    try {
                        gxo.c(new bu3(pjoVar, file2, responseCode + "-" + str, wciVar, str, false));
                        inputStream2 = errorStream;
                        hn9.f(uRLConnection);
                        r9h.l(fileOutputStream3);
                        r9h.l(inputStream2);
                        return;
                    } catch (IOException e2) {
                        e = e2;
                        iOException = e;
                        fileOutputStream = null;
                        inputStream = errorStream;
                        String message2 = iOException.getMessage();
                        gxo.c(new bu3(pjoVar, file2, "exception：" + message2, wciVar, message2, true));
                        hn9.f(uRLConnection);
                        r9h.l(fileOutputStream);
                        r9h.l(inputStream);
                        return;
                    }
                }
                try {
                    inputStream2 = uRLConnection.getInputStream();
                } catch (IOException e3) {
                    iOException = e3;
                    pjoVar = this;
                    file2 = file;
                    errorStream = null;
                    fileOutputStream = null;
                    inputStream = errorStream;
                    try {
                        String message22 = iOException.getMessage();
                        gxo.c(new bu3(pjoVar, file2, "exception：" + message22, wciVar, message22, true));
                        hn9.f(uRLConnection);
                        r9h.l(fileOutputStream);
                        r9h.l(inputStream);
                        return;
                    } catch (Throwable th3) {
                        errorStream = inputStream;
                        fileOutputStream3 = fileOutputStream;
                        th = th3;
                        fileOutputStream2 = fileOutputStream3;
                        inputStream2 = errorStream;
                        hn9.f(uRLConnection);
                        r9h.l(fileOutputStream2);
                        r9h.l(inputStream2);
                        throw th;
                    }
                }
                try {
                    int contentLength = uRLConnection.getContentLength();
                    fileOutputStream2 = new FileOutputStream(file);
                    try {
                        Objects.requireNonNull(wciVar);
                        gxo.c(new ttn(wciVar, (byte) 8));
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i = inputStream2.read(bArr);
                            if (i == -1) {
                                break;
                            } else {
                                fileOutputStream2.write(bArr, 0, i);
                            }
                        }
                        if (file.length() == contentLength || contentLength == 0) {
                            gxo.c(new fmn(wciVar, file, responseCode));
                        }
                        fileOutputStream3 = fileOutputStream2;
                        hn9.f(uRLConnection);
                        r9h.l(fileOutputStream3);
                        r9h.l(inputStream2);
                        return;
                    } catch (IOException e4) {
                        iOException = e4;
                        inputStream = inputStream2;
                        pjoVar = this;
                        fileOutputStream = fileOutputStream2;
                        file2 = file;
                        String message222 = iOException.getMessage();
                        gxo.c(new bu3(pjoVar, file2, "exception：" + message222, wciVar, message222, true));
                        hn9.f(uRLConnection);
                        r9h.l(fileOutputStream);
                        r9h.l(inputStream);
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (IOException e5) {
                    iOException = e5;
                    file2 = file;
                    errorStream = inputStream2;
                    pjoVar = this;
                    fileOutputStream = null;
                    inputStream = errorStream;
                    String message2222 = iOException.getMessage();
                    gxo.c(new bu3(pjoVar, file2, "exception：" + message2222, wciVar, message2222, true));
                    hn9.f(uRLConnection);
                    r9h.l(fileOutputStream);
                    r9h.l(inputStream);
                    return;
                } catch (Throwable th5) {
                    th = th5;
                    errorStream = inputStream2;
                    fileOutputStream2 = fileOutputStream3;
                    inputStream2 = errorStream;
                    hn9.f(uRLConnection);
                    r9h.l(fileOutputStream2);
                    r9h.l(inputStream2);
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                errorStream = null;
            }
            hn9.f(uRLConnection);
            r9h.l(fileOutputStream2);
            r9h.l(inputStream2);
            throw th;
        } catch (IOException e6) {
            pjoVar = this;
            file2 = file;
            iOException = e6;
        }
    }
}
