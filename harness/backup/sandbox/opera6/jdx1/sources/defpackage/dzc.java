package defpackage;

import androidx.core.app.NotificationCompat;
import java.io.Writer;

/* loaded from: classes.dex */
public final class dzc extends Writer {
    public final StringBuilder a = new StringBuilder(NotificationCompat.FLAG_HIGH_PRIORITY);

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        h();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        h();
    }

    public final void h() {
        StringBuilder sb = this.a;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                h();
            } else {
                this.a.append(c);
            }
        }
    }
}
