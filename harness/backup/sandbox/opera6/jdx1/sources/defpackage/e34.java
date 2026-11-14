package defpackage;

import android.content.Context;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e34 implements oyh {
    public static final pjn e = new pjn((byte) 20);
    public final Context a;
    public final ArrayList b;
    public final pjn c = e;
    public final i16 d;

    public e34(Context context, ArrayList arrayList, zg3 zg3Var, jl6 jl6Var) {
        this.a = context.getApplicationContext();
        this.b = arrayList;
        this.d = new i16(zg3Var, jl6Var, (byte) 19);
    }

    @Override // defpackage.oyh
    public final boolean a(Object obj, trf trfVar) {
        ImageHeaderParser$ImageType imageHeaderParser$ImageType;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (!((Boolean) trfVar.c(vx9.b)).booleanValue()) {
            if (byteBuffer == null) {
                imageHeaderParser$ImageType = ImageHeaderParser$ImageType.UNKNOWN;
            } else {
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        imageHeaderParser$ImageType = ImageHeaderParser$ImageType.UNKNOWN;
                        break;
                    }
                    ImageHeaderParser$ImageType imageHeaderParser$ImageTypeB = ((rxa) arrayList.get(i)).b(byteBuffer);
                    if (imageHeaderParser$ImageTypeB != ImageHeaderParser$ImageType.UNKNOWN) {
                        imageHeaderParser$ImageType = imageHeaderParser$ImageTypeB;
                        break;
                    }
                    i++;
                }
            }
            if (imageHeaderParser$ImageType == ImageHeaderParser$ImageType.GIF) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.oyh
    public final kyh b(Object obj, int i, int i2, trf trfVar) {
        ux9 ux9Var;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        pjn pjnVar = this.c;
        synchronized (pjnVar) {
            ux9 ux9Var2 = (ux9) ((ArrayDeque) pjnVar.b).poll();
            if (ux9Var2 == null) {
                ux9Var2 = new ux9();
            }
            ux9Var = ux9Var2;
            ux9Var.b = null;
            Arrays.fill(ux9Var.a, (byte) 0);
            ux9Var.c = new tx9();
            ux9Var.d = 0;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            ux9Var.b = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            ux9Var.b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            return c(byteBuffer, i, i2, ux9Var, trfVar);
        } finally {
            this.c.k(ux9Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.lx9 c(java.nio.ByteBuffer r17, int r18, int r19, defpackage.ux9 r20, defpackage.trf r21) {
        /*
            r16 = this;
            r0 = r16
            java.lang.String r1 = "BufferGifDecoder"
            android.os.SystemClock.elapsedRealtimeNanos()
            r2 = 2
            tx9 r3 = r20.b()     // Catch: java.lang.Throwable -> L95
            int r4 = r3.c     // Catch: java.lang.Throwable -> L95
            r5 = 0
            if (r4 <= 0) goto L8b
            boolean r4 = r3.b     // Catch: java.lang.Throwable -> L95
            if (r4 != 0) goto L8b
            mrf r4 = defpackage.vx9.a     // Catch: java.lang.Throwable -> L95
            r6 = r21
            java.lang.Object r4 = r6.c(r4)     // Catch: java.lang.Throwable -> L95
            aj6 r6 = defpackage.aj6.b     // Catch: java.lang.Throwable -> L95
            if (r4 != r6) goto L24
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.Throwable -> L95
            goto L26
        L24:
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L95
        L26:
            int r6 = r3.g     // Catch: java.lang.Throwable -> L95
            int r6 = r6 / r19
            int r7 = r3.f     // Catch: java.lang.Throwable -> L95
            int r7 = r7 / r18
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Throwable -> L95
            r7 = 0
            if (r6 != 0) goto L37
            r6 = r7
            goto L3b
        L37:
            int r6 = java.lang.Integer.highestOneBit(r6)     // Catch: java.lang.Throwable -> L95
        L3b:
            r8 = 1
            int r6 = java.lang.Math.max(r8, r6)     // Catch: java.lang.Throwable -> L95
            i16 r9 = r0.d     // Catch: java.lang.Throwable -> L95
            f3k r12 = new f3k     // Catch: java.lang.Throwable -> L95
            r10 = r17
            r12.<init>(r9, r3, r10, r6)     // Catch: java.lang.Throwable -> L95
            r12.c(r4)     // Catch: java.lang.Throwable -> L95
            int r3 = r12.k     // Catch: java.lang.Throwable -> L95
            int r3 = r3 + r8
            tx9 r4 = r12.l     // Catch: java.lang.Throwable -> L95
            int r4 = r4.c     // Catch: java.lang.Throwable -> L95
            int r3 = r3 % r4
            r12.k = r3     // Catch: java.lang.Throwable -> L95
            android.graphics.Bitmap r15 = r12.b()     // Catch: java.lang.Throwable -> L95
            if (r15 != 0) goto L63
            boolean r0 = android.util.Log.isLoggable(r1, r2)
            if (r0 == 0) goto L94
            goto L91
        L63:
            kx9 r3 = new kx9     // Catch: java.lang.Throwable -> L95
            android.content.Context r0 = r0.a     // Catch: java.lang.Throwable -> L95
            yn3 r4 = new yn3     // Catch: java.lang.Throwable -> L95
            rx9 r10 = new rx9     // Catch: java.lang.Throwable -> L95
            com.bumptech.glide.a r11 = com.bumptech.glide.a.b(r0)     // Catch: java.lang.Throwable -> L95
            r13 = r18
            r14 = r19
            r10.<init>(r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L95
            r4.<init>(r10)     // Catch: java.lang.Throwable -> L95
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L95
            lx9 r0 = new lx9     // Catch: java.lang.Throwable -> L95
            r0.<init>(r3, r7)     // Catch: java.lang.Throwable -> L95
            boolean r1 = android.util.Log.isLoggable(r1, r2)
            if (r1 == 0) goto L8a
            android.os.SystemClock.elapsedRealtimeNanos()
        L8a:
            return r0
        L8b:
            boolean r0 = android.util.Log.isLoggable(r1, r2)
            if (r0 == 0) goto L94
        L91:
            android.os.SystemClock.elapsedRealtimeNanos()
        L94:
            return r5
        L95:
            r0 = move-exception
            boolean r1 = android.util.Log.isLoggable(r1, r2)
            if (r1 == 0) goto L9f
            android.os.SystemClock.elapsedRealtimeNanos()
        L9f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e34.c(java.nio.ByteBuffer, int, int, ux9, trf):lx9");
    }
}
