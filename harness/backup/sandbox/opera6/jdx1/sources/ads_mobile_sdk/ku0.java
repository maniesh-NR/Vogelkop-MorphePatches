package ads_mobile_sdk;

import defpackage.nkp;
import defpackage.pio;
import defpackage.r05;
import defpackage.t3p;
import defpackage.v9g;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public abstract class ku0 extends g {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    private static final ConcurrentMap<Class<?>, Object> parserOrInstanceMap = new ConcurrentHashMap();
    public yk3 b;
    private int memoizedSerializedSize;

    public ku0() {
        this.a = 0;
        this.memoizedSerializedSize = -1;
        this.b = yk3.f;
    }

    public static ku0 a(ku0 ku0Var, v9g v9gVar, ul0 ul0Var) {
        ku0 ku0Var2 = (ku0) ku0Var.a(4, (ku0) null);
        try {
            zl2 zl2Var = zl2.c;
            zl2Var.getClass();
            pio pioVarA = zl2Var.a(ku0Var2.getClass());
            r05 r05Var = (r05) v9gVar.c;
            if (r05Var == null) {
                r05Var = new r05(v9gVar);
            }
            pioVarA.a(ku0Var2, r05Var, ul0Var);
            pioVarA.c(ku0Var2);
            return ku0Var2;
        } catch (bj1 e) {
            if (e.a) {
                throw new bj1(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof bj1) {
                throw ((bj1) e2.getCause());
            }
            throw new bj1(e2.getMessage(), e2);
        } catch (nkp e3) {
            t3p.j(e3.getMessage());
            return null;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof bj1) {
                throw ((bj1) e4.getCause());
            }
            throw e4;
        }
    }

    public static ku0 a(ku0 ku0Var, byte[] bArr, int i, ul0 ul0Var) throws bj1 {
        if (i == 0) {
            return ku0Var;
        }
        ku0 ku0Var2 = (ku0) ku0Var.a(4, (ku0) null);
        try {
            zl2 zl2Var = zl2.c;
            zl2Var.getClass();
            pio pioVarA = zl2Var.a(ku0Var2.getClass());
            pioVarA.a(ku0Var2, bArr, 0, i, new defpackage.f72());
            pioVarA.c(ku0Var2);
            return ku0Var2;
        } catch (bj1 e) {
            if (e.a) {
                throw new bj1(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof bj1) {
                throw ((bj1) e2.getCause());
            }
            throw new bj1(e2.getMessage(), e2);
        } catch (IndexOutOfBoundsException unused) {
            t3p.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        } catch (nkp e3) {
            t3p.j(e3.getMessage());
            return null;
        }
    }

    public static ku0 a(Class cls) throws ClassNotFoundException {
        ConcurrentMap<Class<?>, Object> concurrentMap = parserOrInstanceMap;
        Object obj = concurrentMap.get(cls);
        if (obj == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                obj = concurrentMap.get(cls);
            } catch (ClassNotFoundException e) {
                h9o.m("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (obj == null) {
            obj = (ku0) ((ku0) ml3.a(cls)).a(6, (ku0) null);
            if (obj == null) {
                h9o.e();
                return null;
            }
            concurrentMap.put(cls, obj);
        }
        return obj instanceof ku0 ? (ku0) obj : ((ju0) obj).a;
    }

    public static Object a(Method method, ku0 ku0Var, Object... objArr) {
        try {
            return method.invoke(ku0Var, objArr);
        } catch (IllegalAccessException e) {
            h9o.s("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            h9o.s("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static void a(ku0 ku0Var) {
        if (ku0Var == null || m5a(ku0Var)) {
            return;
        }
        t3p.j(new nkp().getMessage());
    }

    public static void a(Class cls, ku0 ku0Var) {
        ku0Var.memoizedSerializedSize &= MEMOIZED_SERIALIZED_SIZE_MASK;
        parserOrInstanceMap.put(cls, ku0Var);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static final boolean m5a(ku0 ku0Var) {
        byte bByteValue = ((Byte) ku0Var.a(1, (ku0) null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        zl2 zl2Var = zl2.c;
        zl2Var.getClass();
        boolean zA = zl2Var.a(ku0Var.getClass()).a(ku0Var);
        ku0Var.a(2, zA ? ku0Var : null);
        return zA;
    }

    public static ju0 b(Class cls) throws ClassNotFoundException {
        ConcurrentMap<Class<?>, Object> concurrentMap = parserOrInstanceMap;
        Object obj = concurrentMap.get(cls);
        if (obj == null) {
            a(cls);
            obj = concurrentMap.get(cls);
        }
        if (obj == null) {
            qp2.n("Default instance cannot be null.");
            return null;
        }
        if (obj instanceof ju0) {
            return (ju0) obj;
        }
        ju0 ju0Var = new ju0((ku0) obj);
        return concurrentMap.replace(cls, obj, ju0Var) ? ju0Var : (ju0) concurrentMap.get(cls);
    }

    @Override // ads_mobile_sdk.g
    public final int a(pio pioVar) {
        int iB;
        int iB2;
        if (j()) {
            if (pioVar == null) {
                zl2 zl2Var = zl2.c;
                zl2Var.getClass();
                iB2 = zl2Var.a(getClass()).b(this);
            } else {
                iB2 = pioVar.b(this);
            }
            if (iB2 >= 0) {
                return iB2;
            }
            qp2.n(sko.i(iB2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize & MEMOIZED_SERIALIZED_SIZE_MASK;
        if (i != MEMOIZED_SERIALIZED_SIZE_MASK) {
            return i;
        }
        if (pioVar == null) {
            zl2 zl2Var2 = zl2.c;
            zl2Var2.getClass();
            iB = zl2Var2.a(getClass()).b(this);
        } else {
            iB = pioVar.b(this);
        }
        a(iB);
        return iB;
    }

    public abstract Object a(int i, ku0 ku0Var);

    public final void a(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (this.memoizedSerializedSize & Integer.MIN_VALUE) | (i & MEMOIZED_SERIALIZED_SIZE_MASK);
        } else {
            qp2.n(sko.i(i, "serialized size must be non-negative, was "));
        }
    }

    public final void a(ov ovVar) {
        zl2 zl2Var = zl2.c;
        zl2Var.getClass();
        pio pioVarA = zl2Var.a(getClass());
        e7 e7Var = (e7) ovVar.a;
        if (e7Var == null) {
            e7Var = new e7(ovVar);
        }
        pioVarA.a((Object) this, e7Var);
    }

    public final iu0 e() {
        return (iu0) a(5, (ku0) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zl2 zl2Var = zl2.c;
        zl2Var.getClass();
        return zl2Var.a(getClass()).b(this, (ku0) obj);
    }

    public final int hashCode() {
        if (j()) {
            zl2 zl2Var = zl2.c;
            zl2Var.getClass();
            return zl2Var.a(getClass()).d(this);
        }
        int i = this.a;
        if (i != 0) {
            return i;
        }
        zl2 zl2Var2 = zl2.c;
        zl2Var2.getClass();
        int iD = zl2Var2.a(getClass()).d(this);
        this.a = iD;
        return iD;
    }

    public final boolean j() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void k() {
        zl2 zl2Var = zl2.c;
        zl2Var.getClass();
        zl2Var.a(getClass()).c(this);
        this.memoizedSerializedSize &= MEMOIZED_SERIALIZED_SIZE_MASK;
    }

    public final void l() {
        this.memoizedSerializedSize &= MEMOIZED_SERIALIZED_SIZE_MASK;
    }

    public final iu0 n() {
        iu0 iu0Var = (iu0) a(5, (ku0) null);
        iu0Var.a(this);
        return iu0Var;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = np1.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        np1.a(this, sb, 0);
        return sb.toString();
    }
}
