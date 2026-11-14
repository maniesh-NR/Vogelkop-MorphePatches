package defpackage;

import java.io.Closeable;
import java.io.FileInputStream;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class rgk implements Closeable {
    public final FileInputStream a;
    public final Charset b;
    public byte[] c;
    public int d;
    public int e;

    public rgk(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(qym.a)) {
            qp2.o("Unsupported encoding");
            throw null;
        }
        this.a = fileInputStream;
        this.b = charset;
        this.c = new byte[8192];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c = null;
                this.a.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String h() {
        /*
            r8 = this;
            java.io.FileInputStream r0 = r8.a
            monitor-enter(r0)
            byte[] r1 = r8.c     // Catch: java.lang.Throwable -> Laa
            if (r1 == 0) goto La0
            int r2 = r8.d     // Catch: java.lang.Throwable -> Laa
            int r3 = r8.e     // Catch: java.lang.Throwable -> Laa
            r4 = 0
            r5 = -1
            if (r2 < r3) goto L24
            java.io.FileInputStream r2 = r8.a     // Catch: java.lang.Throwable -> Laa
            int r3 = r1.length     // Catch: java.lang.Throwable -> Laa
            int r1 = r2.read(r1, r4, r3)     // Catch: java.lang.Throwable -> Laa
            if (r1 == r5) goto L1e
            r8.d = r4     // Catch: java.lang.Throwable -> Laa
            r8.e = r1     // Catch: java.lang.Throwable -> Laa
            r2 = r4
            goto L24
        L1e:
            java.io.EOFException r8 = new java.io.EOFException     // Catch: java.lang.Throwable -> Laa
            r8.<init>()     // Catch: java.lang.Throwable -> Laa
            throw r8     // Catch: java.lang.Throwable -> Laa
        L24:
            int r1 = r8.e     // Catch: java.lang.Throwable -> Laa
            r3 = 10
            if (r2 == r1) goto L52
            byte[] r1 = r8.c     // Catch: java.lang.Throwable -> Laa
            r6 = r1[r2]     // Catch: java.lang.Throwable -> Laa
            if (r6 != r3) goto L4f
            int r3 = r8.d     // Catch: java.lang.Throwable -> Laa
            if (r2 == r3) goto L3c
            int r4 = r2 + (-1)
            r5 = r1[r4]     // Catch: java.lang.Throwable -> Laa
            r6 = 13
            if (r5 == r6) goto L3d
        L3c:
            r4 = r2
        L3d:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> Laa
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r8.b     // Catch: java.lang.Throwable -> Laa
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> Laa
            r5.<init>(r1, r3, r4, r6)     // Catch: java.lang.Throwable -> Laa
            int r2 = r2 + 1
            r8.d = r2     // Catch: java.lang.Throwable -> Laa
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laa
            return r5
        L4f:
            int r2 = r2 + 1
            goto L24
        L52:
            qgk r1 = new qgk     // Catch: java.lang.Throwable -> Laa
            int r2 = r8.e     // Catch: java.lang.Throwable -> Laa
            int r6 = r8.d     // Catch: java.lang.Throwable -> Laa
            int r2 = r2 - r6
            int r2 = r2 + 80
            r1.<init>(r8, r2)     // Catch: java.lang.Throwable -> Laa
        L5e:
            byte[] r2 = r8.c     // Catch: java.lang.Throwable -> Laa
            int r6 = r8.d     // Catch: java.lang.Throwable -> Laa
            int r7 = r8.e     // Catch: java.lang.Throwable -> Laa
            int r7 = r7 - r6
            r1.write(r2, r6, r7)     // Catch: java.lang.Throwable -> Laa
            r8.e = r5     // Catch: java.lang.Throwable -> Laa
            java.io.FileInputStream r2 = r8.a     // Catch: java.lang.Throwable -> Laa
            byte[] r6 = r8.c     // Catch: java.lang.Throwable -> Laa
            int r7 = r6.length     // Catch: java.lang.Throwable -> Laa
            int r2 = r2.read(r6, r4, r7)     // Catch: java.lang.Throwable -> Laa
            if (r2 == r5) goto L9a
            r8.d = r4     // Catch: java.lang.Throwable -> Laa
            r8.e = r2     // Catch: java.lang.Throwable -> Laa
            r2 = r4
        L7a:
            int r6 = r8.e     // Catch: java.lang.Throwable -> Laa
            if (r2 == r6) goto L5e
            byte[] r6 = r8.c     // Catch: java.lang.Throwable -> Laa
            r7 = r6[r2]     // Catch: java.lang.Throwable -> Laa
            if (r7 != r3) goto L97
            int r3 = r8.d     // Catch: java.lang.Throwable -> Laa
            if (r2 == r3) goto L8d
            int r4 = r2 - r3
            r1.write(r6, r3, r4)     // Catch: java.lang.Throwable -> Laa
        L8d:
            int r2 = r2 + 1
            r8.d = r2     // Catch: java.lang.Throwable -> Laa
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> Laa
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laa
            return r8
        L97:
            int r2 = r2 + 1
            goto L7a
        L9a:
            java.io.EOFException r8 = new java.io.EOFException     // Catch: java.lang.Throwable -> Laa
            r8.<init>()     // Catch: java.lang.Throwable -> Laa
            throw r8     // Catch: java.lang.Throwable -> Laa
        La0:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> Laa
            java.lang.String r1 = "LineReader is closed"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> Laa
            throw r8     // Catch: java.lang.Throwable -> Laa
        La8:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laa
            throw r8
        Laa:
            r8 = move-exception
            goto La8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgk.h():java.lang.String");
    }
}
