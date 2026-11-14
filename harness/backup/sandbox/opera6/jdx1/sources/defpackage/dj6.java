package defpackage;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class dj6 {
    public final Class a;
    public final List b;
    public final jzh c;
    public final ua7 d;
    public final String e;

    public dj6(Class cls, Class cls2, Class cls3, List list, jzh jzhVar, ua7 ua7Var) {
        this.a = cls;
        this.b = list;
        this.c = jzhVar;
        this.d = ua7Var;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final kyh a(int i, int i2, bp bpVar, qc6 qc6Var, trf trfVar) {
        kyh kyhVarA;
        f2m f2mVar;
        int iJ;
        qyh qyhVarL;
        kyh kyhVar;
        boolean z;
        boolean z2;
        Object lb6Var;
        ua7 ua7Var = this.d;
        List list = (List) ua7Var.h();
        try {
            kyh kyhVarB = b(qc6Var, i, i2, trfVar, list);
            ua7Var.K(list);
            cj6 cj6Var = (cj6) bpVar.b;
            int i3 = bpVar.a;
            bj6 bj6Var = cj6Var.a;
            Class<?> cls = kyhVarB.get().getClass();
            if (i3 != 4) {
                f2m f2mVarE = bj6Var.e(cls);
                f2mVar = f2mVarE;
                kyhVarA = f2mVarE.a(cj6Var.h, kyhVarB, cj6Var.l, cj6Var.m);
            } else {
                kyhVarA = kyhVarB;
                f2mVar = null;
            }
            if (!kyhVarB.equals(kyhVarA)) {
                kyhVarB.d();
            }
            if (((s64) bj6Var.c.b.e).l(kyhVarA.e()) != null) {
                qyhVarL = ((s64) bj6Var.c.b.e).l(kyhVarA.e());
                if (qyhVarL == null) {
                    throw new yrh(kyhVarA.e());
                }
                iJ = qyhVarL.j(cj6Var.o);
            } else {
                iJ = 3;
                qyhVarL = null;
            }
            hub hubVar = cj6Var.t;
            ArrayList arrayListB = bj6Var.b();
            int size = arrayListB.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    kyhVar = null;
                    z = false;
                    break;
                }
                kyhVar = null;
                if (((u7e) arrayListB.get(i4)).a.equals(hubVar)) {
                    z = true;
                    break;
                }
                i4++;
            }
            switch (cj6Var.n.a) {
                default:
                    if (((!z && i3 == 3) || i3 == 1) && iJ == 2) {
                        z2 = true;
                        break;
                    }
                case 0:
                case 1:
                    z2 = false;
                    break;
            }
            if (z2) {
                if (qyhVarL == null) {
                    throw new yrh(kyhVarA.get().getClass());
                }
                int iA = vep.A(iJ);
                if (iA == 0) {
                    lb6Var = new lb6(cj6Var.t, cj6Var.i);
                } else {
                    if (iA != 1) {
                        qp2.o("Unknown strategy: ".concat(iJ != 1 ? iJ != 2 ? iJ != 3 ? "null" : "NONE" : "TRANSFORMED" : "SOURCE"));
                        return kyhVar;
                    }
                    lb6Var = new myh(bj6Var.c.a, cj6Var.t, cj6Var.i, cj6Var.l, cj6Var.m, f2mVar, cls, cj6Var.o);
                }
                syc sycVar = (syc) syc.e.h();
                sycVar.d = false;
                sycVar.c = true;
                sycVar.b = kyhVarA;
                qb7 qb7Var = cj6Var.f;
                qb7Var.a = lb6Var;
                qb7Var.b = qyhVarL;
                qb7Var.c = sycVar;
                kyhVarA = sycVar;
            }
            return this.c.s(kyhVarA, trfVar);
        } catch (Throwable th) {
            ua7Var.K(list);
            throw th;
        }
    }

    public final kyh b(qc6 qc6Var, int i, int i2, trf trfVar, List list) throws ty9 {
        List list2 = this.b;
        int size = list2.size();
        kyh kyhVarB = null;
        for (int i3 = 0; i3 < size; i3++) {
            oyh oyhVar = (oyh) list2.get(i3);
            try {
                if (oyhVar.a(qc6Var.h(), trfVar)) {
                    kyhVarB = oyhVar.b(qc6Var.h(), i, i2, trfVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(oyhVar);
                }
                list.add(e);
            }
            if (kyhVarB != null) {
                break;
            }
        }
        if (kyhVarB != null) {
            return kyhVarB;
        }
        throw new ty9(this.e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}
