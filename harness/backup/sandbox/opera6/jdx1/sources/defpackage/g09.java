package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class g09 {
    public static final /* synthetic */ int c = 0;
    public final uqj a = uqj.f();
    public boolean b;

    static {
        new g09(0);
    }

    public g09() {
    }

    public g09(int i) {
        a();
        a();
    }

    public static void b(x75 x75Var, k4o k4oVar, int i, Object obj) {
        if (k4oVar == k4o.d) {
            x75Var.A(i, 3);
            ((x5) obj).b(x75Var);
            x75Var.A(i, 4);
        }
        x75Var.A(i, k4oVar.b);
        switch (k4oVar.ordinal()) {
            case 0:
                x75Var.t(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                x75Var.r(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                x75Var.E(((Long) obj).longValue());
                break;
            case 3:
                x75Var.E(((Long) obj).longValue());
                break;
            case 4:
                x75Var.v(((Integer) obj).intValue());
                break;
            case 5:
                x75Var.t(((Long) obj).longValue());
                break;
            case 6:
                x75Var.r(((Integer) obj).intValue());
                break;
            case 7:
                x75Var.l(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof d54)) {
                    x75Var.z((String) obj);
                    break;
                } else {
                    x75Var.p((d54) obj);
                    break;
                }
            case 9:
                ((x5) obj).b(x75Var);
                break;
            case 10:
                x5 x5Var = (x5) obj;
                x75Var.C(((hv9) x5Var).a(null));
                x5Var.b(x75Var);
                break;
            case 11:
                if (!(obj instanceof d54)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    x75Var.C(length);
                    x75Var.m(bArr, 0, length);
                    break;
                } else {
                    x75Var.p((d54) obj);
                    break;
                }
            case 12:
                x75Var.C(((Integer) obj).intValue());
                break;
            case 13:
                x75Var.v(((Integer) obj).intValue());
                break;
            case 14:
                x75Var.r(((Integer) obj).intValue());
                break;
            case 15:
                x75Var.t(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                x75Var.C((iIntValue << 1) ^ (iIntValue >> 31));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                x75Var.E((jLongValue << 1) ^ (jLongValue >> 63));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        uqj uqjVar = this.a;
        int size = uqjVar.a.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entryC = uqjVar.c(i);
            if (entryC.getValue() instanceof hv9) {
                hv9 hv9Var = (hv9) entryC.getValue();
                hv9Var.getClass();
                y6h y6hVar = y6h.c;
                y6hVar.getClass();
                y6hVar.a(hv9Var.getClass()).makeImmutable(hv9Var);
                hv9Var.h();
            }
        }
        if (!uqjVar.c) {
            if (uqjVar.a.size() > 0) {
                uqjVar.c(0).getKey().getClass();
                h9o.t();
                return;
            } else {
                Iterator it = uqjVar.d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    h9o.t();
                    return;
                }
            }
        }
        if (!uqjVar.c) {
            uqjVar.b = uqjVar.b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(uqjVar.b);
            uqjVar.e = uqjVar.e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(uqjVar.e);
            uqjVar.c = true;
        }
        this.b = true;
    }

    public final Object clone() {
        g09 g09Var = new g09();
        uqj uqjVar = this.a;
        if (uqjVar.a.size() > 0) {
            Map.Entry entryC = uqjVar.c(0);
            if (entryC.getKey() != null) {
                h9o.t();
                return null;
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = uqjVar.d().iterator();
        if (!it.hasNext()) {
            return g09Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            h9o.t();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g09) {
            return this.a.equals(((g09) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
