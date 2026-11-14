package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class hv9 extends x5 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, hv9> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected emm unknownFields;

    public hv9() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = emm.f;
    }

    public static hv9 d(Class cls) throws ClassNotFoundException {
        hv9 hv9Var = defaultInstanceMap.get(cls);
        if (hv9Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                hv9Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                h9o.m("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (hv9Var != null) {
            return hv9Var;
        }
        hv9 hv9Var2 = (hv9) ((hv9) hnm.a(cls)).c(6);
        if (hv9Var2 != null) {
            defaultInstanceMap.put(cls, hv9Var2);
            return hv9Var2;
        }
        h9o.e();
        return null;
    }

    public static Object e(Method method, hv9 hv9Var, Object... objArr) {
        try {
            return method.invoke(hv9Var, objArr);
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

    public static final boolean f(hv9 hv9Var, boolean z) {
        byte bByteValue = ((Byte) hv9Var.c(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        y6h y6hVar = y6h.c;
        y6hVar.getClass();
        boolean zIsInitialized = y6hVar.a(hv9Var.getClass()).isInitialized(hv9Var);
        if (z) {
            hv9Var.c(2);
        }
        return zIsInitialized;
    }

    public static void j(Class cls, hv9 hv9Var) {
        hv9Var.h();
        defaultInstanceMap.put(cls, hv9Var);
    }

    @Override // defpackage.x5
    public final int a(bni bniVar) {
        int iE;
        int iE2;
        if (g()) {
            if (bniVar == null) {
                y6h y6hVar = y6h.c;
                y6hVar.getClass();
                iE2 = y6hVar.a(getClass()).e(this);
            } else {
                iE2 = bniVar.e(this);
            }
            if (iE2 >= 0) {
                return iE2;
            }
            qp2.n(sko.i(iE2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (bniVar == null) {
            y6h y6hVar2 = y6h.c;
            y6hVar2.getClass();
            iE = y6hVar2.a(getClass()).e(this);
        } else {
            iE = bniVar.e(this);
        }
        k(iE);
        return iE;
    }

    @Override // defpackage.x5
    public final void b(x75 x75Var) {
        y6h y6hVar = y6h.c;
        y6hVar.getClass();
        bni bniVarA = y6hVar.a(getClass());
        eme emeVar = x75Var.a;
        if (emeVar == null) {
            emeVar = new eme(x75Var);
        }
        bniVarA.b(this, emeVar);
    }

    public abstract Object c(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y6h y6hVar = y6h.c;
        y6hVar.getClass();
        return y6hVar.a(getClass()).c(this, (hv9) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            y6h y6hVar = y6h.c;
            y6hVar.getClass();
            return y6hVar.a(getClass()).d(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        y6h y6hVar2 = y6h.c;
        y6hVar2.getClass();
        int iD = y6hVar2.a(getClass()).d(this);
        this.memoizedHashCode = iD;
        return iD;
    }

    public final hv9 i() {
        return (hv9) c(4);
    }

    public final void k(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (this.memoizedSerializedSize & Integer.MIN_VALUE) | (i & Integer.MAX_VALUE);
        } else {
            qp2.n(sko.i(i, "serialized size must be non-negative, was "));
        }
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = wvd.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        wvd.c(this, sb, 0);
        return sb.toString();
    }
}
