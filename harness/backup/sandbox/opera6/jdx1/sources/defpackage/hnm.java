package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class hnm {
    public static final Unsafe a;
    public static final Class b;
    public static final fnm c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    static {
        Unsafe unsafe;
        enm enmVar = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new bnm((byte) 1));
        } catch (Throwable unused) {
            unsafe = null;
        }
        a = unsafe;
        b = n21.a;
        boolean zE = e(Long.TYPE);
        boolean zE2 = e(Integer.TYPE);
        if (unsafe != null) {
            if (!n21.a()) {
                enmVar = new enm(unsafe, (byte) 2);
            } else if (zE) {
                enmVar = new enm(unsafe, (byte) 1);
            } else if (zE2) {
                enmVar = new enm(unsafe, (byte) 0);
            }
        }
        c = enmVar;
        d = enmVar == null ? false : enmVar.m();
        e = enmVar == null ? false : enmVar.l();
        f = b(byte[].class);
        b(boolean[].class);
        c(boolean[].class);
        b(int[].class);
        c(int[].class);
        b(long[].class);
        c(long[].class);
        b(float[].class);
        c(float[].class);
        b(double[].class);
        c(double[].class);
        b(Object[].class);
        c(Object[].class);
        Field fieldD = d();
        if (fieldD != null && enmVar != null) {
            ((fnm) enmVar).b.objectFieldOffset(fieldD);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Object a(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            h9o.o(e2);
            return null;
        }
    }

    public static int b(Class cls) {
        if (e) {
            return c.b.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (e) {
            c.a(cls);
        }
    }

    public static Field d() {
        Field declaredField;
        Field declaredField2;
        if (n21.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean e(Class cls) {
        if (!n21.a()) {
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

    public static boolean f(Object obj, long j) {
        return ((byte) ((g(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static int g(Object obj, long j) {
        return c.b.getInt(obj, j);
    }

    public static long h(Object obj, long j) {
        return c.b.getLong(obj, j);
    }

    public static Object i(Object obj, long j) {
        return c.b.getObject(obj, j);
    }

    public static void j(Throwable th) {
        Logger.getLogger(hnm.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void k(byte[] bArr, long j, byte b2) {
        c.i(bArr, f + j, b2);
    }

    public static void l(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int iG = g(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        n(obj, j2, (iG & (~(255 << i))) | ((b2 & 255) << i));
    }

    public static void m(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        n(obj, j2, (g(obj, j2) & (~(255 << i))) | ((b2 & 255) << i));
    }

    public static void n(Object obj, long j, int i) {
        c.b.putInt(obj, j, i);
    }

    public static void o(Object obj, long j, long j2) {
        c.b.putLong(obj, j, j2);
    }

    public static void p(Object obj, long j, Object obj2) {
        c.b.putObject(obj, j, obj2);
    }
}
