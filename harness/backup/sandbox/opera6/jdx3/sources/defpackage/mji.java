package defpackage;

import android.os.ParcelFileDescriptor;
import android.print.b;
import java.util.Objects;

/* loaded from: classes.dex */
public final class mji extends b {
    public final /* synthetic */ ParcelFileDescriptor a;
    public final /* synthetic */ qji b;

    public mji(qji qjiVar, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
        Objects.requireNonNull(qjiVar);
        this.b = qjiVar;
    }

    public final void onWriteCancelled() {
        qji qjiVar = this.b;
        if (this == qjiVar.i) {
            qjiVar.d(null);
        }
    }

    public final void onWriteFailed(CharSequence charSequence) {
        qji qjiVar = this.b;
        if (this == qjiVar.i) {
            qjiVar.d(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onWriteFinished(android.print.PageRange[] r6) throws java.lang.Throwable {
        /*
            r5 = this;
            qji r0 = r5.b
            mji r1 = r0.i
            if (r5 != r1) goto L4c
            android.os.ParcelFileDescriptor r5 = r5.a
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L26
            java.io.FileDescriptor r5 = r5.getFileDescriptor()     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L26
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L26
            java.nio.channels.FileChannel r5 = r2.getChannel()     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L27
            long r3 = r5.size()     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L27
            xvg.l(r2)
            goto L2c
        L1e:
            r5 = move-exception
            r1 = r2
            goto L22
        L21:
            r5 = move-exception
        L22:
            xvg.l(r1)
            throw r5
        L26:
            r2 = r1
        L27:
            xvg.l(r2)
            r3 = 0
        L2c:
            r0.o = r3
            r0.p = r6
            r0.i = r1
            boolean r5 = r0.n
            if (r5 == 0) goto L3f
            r5 = 0
            r0.n = r5
            android.print.PrintAttributes r5 = r0.e
            r0.g(r5)
            goto L4c
        L3f:
            pji r5 = r0.k
            r0.k = r1
            r1 = 2
            r0.f(r1)
            if (r5 == 0) goto L4c
            r5.f(r6)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mji.onWriteFinished(android.print.PageRange[]):void");
    }
}
