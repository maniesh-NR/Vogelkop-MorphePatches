package ads_mobile_sdk;

import java.io.Serializable;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class ml3 {
    public static final Unsafe a;
    public static final Class b;
    public static final ov c;
    public static final boolean d;
    public static final boolean e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1 A[PHI: r0
      0x00a1: PHI (r0v18 java.lang.reflect.Field) = (r0v13 java.lang.reflect.Field), (r0v21 java.lang.reflect.Field) binds: [B:29:0x009f, B:22:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        /*
            sun.misc.Unsafe r0 = a()
            ads_mobile_sdk.ml3.a = r0
            java.lang.Class r1 = ads_mobile_sdk.qe.a()
            ads_mobile_sdk.ml3.b = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r2 = d(r1)
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r3 = d(r3)
            r4 = 1
            r5 = 0
            r6 = 0
            if (r0 == 0) goto L33
            boolean r7 = ads_mobile_sdk.qe.b()
            if (r7 == 0) goto L35
            if (r2 == 0) goto L2b
            h6p r2 = new h6p
            r2.<init>(r0, r4)
            goto L3b
        L2b:
            if (r3 == 0) goto L33
            h6p r2 = new h6p
            r2.<init>(r0, r5)
            goto L3b
        L33:
            r2 = r6
            goto L3b
        L35:
            h6p r2 = new h6p
            r3 = 2
            r2.<init>(r0, r3)
        L3b:
            ads_mobile_sdk.ml3.c = r2
            if (r2 != 0) goto L41
            r0 = r5
            goto L48
        L41:
            r2.b()
            boolean r0 = r2.mo6a()
        L48:
            ads_mobile_sdk.ml3.d = r0
            java.lang.Class<byte[]> r0 = byte[].class
            b(r0)
            java.lang.Class<boolean[]> r0 = boolean[].class
            b(r0)
            c(r0)
            java.lang.Class<int[]> r0 = int[].class
            b(r0)
            c(r0)
            java.lang.Class<long[]> r0 = long[].class
            b(r0)
            c(r0)
            java.lang.Class<float[]> r0 = float[].class
            b(r0)
            c(r0)
            java.lang.Class<double[]> r0 = double[].class
            b(r0)
            c(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            b(r0)
            c(r0)
            boolean r0 = ads_mobile_sdk.qe.b()
            java.lang.Class<java.nio.Buffer> r3 = java.nio.Buffer.class
            if (r0 == 0) goto L91
            java.lang.String r0 = "effectiveDirectAddress"
            java.lang.reflect.Field r0 = r3.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L8e
            goto L8f
        L8e:
            r0 = r6
        L8f:
            if (r0 != 0) goto La1
        L91:
            java.lang.String r0 = "address"
            java.lang.reflect.Field r0 = r3.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L98
            goto L99
        L98:
            r0 = r6
        L99:
            if (r0 == 0) goto La2
            java.lang.Class r3 = r0.getType()
            if (r3 != r1) goto La2
        La1:
            r6 = r0
        La2:
            if (r6 == 0) goto Lad
            if (r2 == 0) goto Lad
            java.lang.Object r0 = r2.a
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0
            r0.objectFieldOffset(r6)
        Lad:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 == r1) goto Lb6
            r4 = r5
        Lb6:
            ads_mobile_sdk.ml3.e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ml3.<clinit>():void");
    }

    public static Object a(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            h9o.o(e2);
            return null;
        }
    }

    public static Unsafe a() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new bnm((byte) 2));
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(ml3.class.getName()).log(Level.WARNING, "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static void a(int i, long j, g gVar) {
        c.a(i, j, gVar);
    }

    public static void a(long j, g gVar, Serializable serializable) {
        c.a(j, gVar, serializable);
    }

    public static void a(Throwable th) {
        Logger.getLogger(ml3.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
    }

    public static void b(Class cls) {
        if (d) {
            ((Unsafe) c.a).arrayBaseOffset(cls);
        }
    }

    public static void c(Class cls) {
        if (d) {
            c.b(cls);
        }
    }

    public static boolean d(Class cls) {
        if (!qe.b()) {
            return false;
        }
        try {
            Class cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
