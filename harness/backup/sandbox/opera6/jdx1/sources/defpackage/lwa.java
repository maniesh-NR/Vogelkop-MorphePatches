package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class lwa implements Closeable {
    public final URL a;
    public volatile Future b;
    public Task c;

    public lwa(URL url) {
        this.a = url;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.cancel(true);
    }

    public final Bitmap h() throws IOException {
        byte[] bArrN;
        boolean zIsLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.a;
        if (zIsLoggable) {
            Objects.toString(url);
        }
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            s49.m("Content-Length exceeds max size of 1048576");
            return null;
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            s44 s44Var = new s44(inputStream);
            ArrayDeque arrayDeque = new ArrayDeque(20);
            int i = NotificationCompat.FLAG_HIGH_PRIORITY;
            int i2 = 0;
            loop0: while (true) {
                if (i2 < 2147483639) {
                    int iMin = Math.min(i, 2147483639 - i2);
                    byte[] bArr = new byte[iMin];
                    arrayDeque.add(bArr);
                    int i3 = 0;
                    while (i3 < iMin) {
                        int i4 = s44Var.read(bArr, i3, iMin - i3);
                        if (i4 == -1) {
                            bArrN = sgb.n(arrayDeque, i2);
                            break loop0;
                        }
                        i3 += i4;
                        i2 += i4;
                    }
                    long j = i * (i < 4096 ? 4 : 2);
                    i = j > 2147483647L ? Integer.MAX_VALUE : j < -2147483648L ? LinearLayoutManager.INVALID_OFFSET : (int) j;
                } else {
                    if (s44Var.read() != -1) {
                        throw new OutOfMemoryError("input is too large to fit in a byte array");
                    }
                    bArrN = sgb.n(arrayDeque, 2147483639);
                }
            }
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Objects.toString(url);
            }
            if (bArrN.length > 1048576) {
                s49.m("Image exceeds max size of 1048576");
                return null;
            }
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrN, 0, bArrN.length);
            if (bitmapDecodeByteArray == null) {
                n57.d(url, "Failed to decode image: ");
                return null;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(url);
            }
            return bitmapDecodeByteArray;
        } finally {
        }
    }
}
