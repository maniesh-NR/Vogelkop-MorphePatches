package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class va1 implements Closeable {
    public final qsk a;
    public final ThreadLocal b;
    public final zyk c;
    public final ua1 d;
    public final LinkedHashMap e;

    public va1(qsk qskVar, to9 to9Var, int i) {
        this.a = qskVar;
        if (!((qskVar != null) ^ (to9Var != null))) {
            qp2.o("Failed requirement.");
            throw null;
        }
        this.b = new ThreadLocal();
        this.c = z4c.b(new x2(this, to9Var, (byte) 11));
        this.d = new ua1((byte) 0, i);
        this.e = new LinkedHashMap();
    }

    public /* synthetic */ va1(to9 to9Var) {
        this(null, to9Var, 1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.evictAll();
        qsk qskVar = this.a;
        if (qskVar != null) {
            qskVar.close();
        } else {
            n().close();
        }
    }

    public final void h(String[] strArr, pd9 pd9Var) {
        synchronized (this.e) {
            for (String str : strArr) {
                LinkedHashMap linkedHashMap = this.e;
                Object linkedHashSet = linkedHashMap.get(str);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    linkedHashMap.put(str, linkedHashSet);
                }
                ((Set) linkedHashSet).add(pd9Var);
            }
        }
    }

    public final hgh k(Integer num, String str, Function1 function1) {
        return new hgh(l(num, new x2(this, str, (byte) 12), function1, new k51((byte) 5)));
    }

    public final Object l(Integer num, Function0 function0, Function1 function1, Function1 function12) {
        ua1 ua1Var = this.d;
        wa1 wa1Var = num != null ? (wa1) ua1Var.remove(num) : null;
        if (wa1Var == null) {
            wa1Var = (wa1) function0.invoke();
        }
        if (function1 != null) {
            try {
                function1.invoke(wa1Var);
            } catch (Throwable th) {
                if (num != null) {
                    wa1 wa1Var2 = (wa1) ua1Var.put(num, wa1Var);
                    if (wa1Var2 != null) {
                        wa1Var2.close();
                    }
                } else {
                    wa1Var.close();
                }
                throw th;
            }
        }
        Object objInvoke = function12.invoke(wa1Var);
        if (num == null) {
            wa1Var.close();
            return objInvoke;
        }
        wa1 wa1Var3 = (wa1) ua1Var.put(num, wa1Var);
        if (wa1Var3 != null) {
            wa1Var3.close();
        }
        return objInvoke;
    }

    public final hgh m(Integer num, String str, Function1 function1, int i, Function1 function12) {
        return new hgh(l(num, new sa1(str, this, i), function12, new ra(function1, (byte) 1)));
    }

    public final to9 n() {
        return (to9) this.c.getValue();
    }

    public final void o(String... strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.e) {
            for (String str : strArr) {
                Set set = (Set) this.e.get(str);
                if (set != null) {
                    linkedHashSet.addAll(set);
                }
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((pd9) it.next()).a.b(Unit.a);
        }
    }

    public final void p(String[] strArr, pd9 pd9Var) {
        synchronized (this.e) {
            for (String str : strArr) {
                Set set = (Set) this.e.get(str);
                if (set != null) {
                    set.remove(pd9Var);
                }
            }
        }
    }
}
