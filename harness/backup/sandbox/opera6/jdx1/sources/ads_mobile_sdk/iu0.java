package ads_mobile_sdk;

import defpackage.bep;
import defpackage.flp;
import defpackage.nkp;
import defpackage.p3p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class iu0 implements Cloneable {
    public final ku0 a;
    public ku0 b;

    public iu0(ku0 ku0Var) {
        this.a = ku0Var;
        if (ku0Var.j()) {
            qp2.o("Default instance must be immutable.");
            throw null;
        }
        this.b = (ku0) ku0Var.a(4, (ku0) null);
    }

    public static void a(int i, flp flpVar) {
        String strI = p3p.i(flpVar.size() - i, "Element at index ", " is null.");
        for (int size = flpVar.size() - 1; size >= i; size--) {
            flpVar.remove(size);
        }
        throw new NullPointerException(strI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Iterable iterable, flp flpVar) {
        byte[] bArr = yb1.a;
        iterable.getClass();
        if (iterable instanceof bep) {
            flpVar.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (flpVar instanceof ArrayList) {
                ((ArrayList) flpVar).ensureCapacity(flpVar.size() + size);
            } else if (flpVar instanceof am2) {
                am2 am2Var = (am2) flpVar;
                int i = am2Var.c + size;
                Object[] objArr = am2Var.b;
                if (i > objArr.length) {
                    if (objArr.length == 0) {
                        am2Var.b = new Object[Math.max(i, 10)];
                    } else {
                        int length = objArr.length;
                        while (length < i) {
                            length = exg.a(length);
                        }
                        am2Var.b = Arrays.copyOf(am2Var.b, length);
                    }
                }
            }
        }
        int size2 = flpVar.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    a(size2, flpVar);
                    throw null;
                }
                flpVar.add(obj);
            }
            return;
        }
        List list = (List) iterable;
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj2 = list.get(i2);
            if (obj2 == null) {
                a(size2, flpVar);
                throw null;
            }
            flpVar.add(obj2);
        }
    }

    public final ku0 a() {
        boolean zJ = this.b.j();
        ku0 ku0Var = this.b;
        if (zJ) {
            ku0Var.k();
            ku0Var = this.b;
        }
        ku0Var.getClass();
        if (ku0.m5a(ku0Var)) {
            return ku0Var;
        }
        throw new nkp();
    }

    public final void a(ku0 ku0Var) {
        ku0 ku0Var2 = this.a;
        if (ku0Var != null && !ku0Var2.getClass().isInstance(ku0Var)) {
            qp2.o("mergeFrom(MessageLite) can only merge messages of the same type.");
            return;
        }
        if (ku0Var2.equals(ku0Var)) {
            return;
        }
        b$1();
        ku0 ku0Var3 = this.b;
        zl2 zl2Var = zl2.c;
        zl2Var.getClass();
        zl2Var.a(ku0Var3.getClass()).a(ku0Var3, ku0Var);
    }

    public final void b$1() {
        if (this.b.j()) {
            return;
        }
        ku0 ku0Var = (ku0) this.a.a(4, (ku0) null);
        ku0 ku0Var2 = this.b;
        zl2 zl2Var = zl2.c;
        zl2Var.getClass();
        zl2Var.a(ku0Var.getClass()).a(ku0Var, ku0Var2);
        this.b = ku0Var;
    }

    public final Object clone() {
        iu0 iu0Var = (iu0) this.a.a(5, (ku0) null);
        boolean zJ = this.b.j();
        ku0 ku0Var = this.b;
        if (zJ) {
            ku0Var.k();
            ku0Var = this.b;
        }
        iu0Var.b = ku0Var;
        return iu0Var;
    }
}
