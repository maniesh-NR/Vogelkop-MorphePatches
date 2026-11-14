package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class o4b extends k6k {
    public final /* synthetic */ byte d;
    public final /* synthetic */ u5k e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4b(e6k e6kVar, v5k v5kVar, byte b) {
        super(e6kVar, v5kVar);
        this.d = b;
        this.e = v5kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4b(u5k u5kVar, e6k e6kVar, byte b) {
        super(e6kVar, u5kVar);
        this.d = b;
        this.e = u5kVar;
    }

    @Override // defpackage.k6k
    public final kv8 a() {
        switch (this.d) {
            case 0:
                jv8 jv8Var = jv8.a;
                return jv8.b;
            case 1:
            case 2:
            case 3:
            case 7:
            case 8:
            default:
                return super.a();
            case 4:
                jv8 jv8Var2 = jv8.a;
                return jv8.b;
            case 5:
                jv8 jv8Var3 = jv8.a;
                return jv8.b;
            case 6:
                jv8 jv8Var4 = jv8.a;
                return jv8.b;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                jv8 jv8Var5 = jv8.a;
                return jv8.b;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                jv8 jv8Var6 = jv8.a;
                return jv8.b;
            case 11:
                jv8 jv8Var7 = jv8.a;
                return jv8.b;
            case 12:
                jv8 jv8Var8 = jv8.a;
                return jv8.b;
        }
    }

    @Override // defpackage.k6k
    public final mv8 b(e6k e6kVar) {
        switch (this.d) {
            case 0:
                return jv8.a;
            case 1:
            case 2:
            case 3:
            case 7:
            case 8:
            default:
                return super.b(e6kVar);
            case 4:
                return jv8.a;
            case 5:
                return jv8.a;
            case 6:
                return jv8.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return jv8.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return jv8.a;
            case 11:
                return jv8.a;
            case 12:
                return jv8.a;
        }
    }

    @Override // defpackage.k6k
    public final int c(bz3 bz3Var) {
        byte b = this.d;
        u5k u5kVar = this.e;
        switch (b) {
            case 0:
                int iC0 = ((a7n) ((p4b) u5kVar).h.q()).c0(bz3Var);
                int i = bz3Var.c;
                return iC0 < i ? i : iC0;
            case 1:
                return ((a7n) ((s4b) u5kVar).f.q()).c0(bz3Var);
            case 2:
                ncd ncdVar = (ncd) u5kVar;
                if (ncdVar.g == 0) {
                    ncdVar.q(ncdVar.f.q, 0, new ca2(true, 1));
                }
                return jym.j(((i) ncdVar.h.q()).itemView, bz3Var);
            case 3:
                return jym.j(((i) ((beh) ((vdh) u5kVar).t.q())).itemView, bz3Var);
            case 4:
                return jym.j(((i) ((o5k) ((p5k) u5kVar).f.q())).itemView, bz3Var);
            case 5:
                int i2 = bz3Var.c;
                int iK = s5k.h.k(((i) ((r5k) ((s5k) u5kVar).g.q())).itemView.getContext());
                return i2 < iK ? iK : i2;
            case 6:
                return jym.j(((i) ((x5k) ((y5k) u5kVar).f.q())).itemView, bz3Var);
            case 7:
                return jym.j(((i) ((cu5) ((z5k) u5kVar).C().q())).itemView, bz3Var);
            case 8:
                return jym.j(((i) ((m6k) ((z5k) u5kVar).C().q())).itemView, bz3Var);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return jym.j(((i) ((r6k) ((s6k) u5kVar).f.q())).itemView, bz3Var);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                List list = a7k.m;
                a7k a7kVar = (a7k) u5kVar;
                mgh mghVar = a7kVar.i;
                int iR = ddh.r(a7kVar.d, (kl5) a7kVar.h.g());
                boolean z = bz3Var.c >= iR;
                nv6 nv6VarB = ((ru9) mghVar.c).b();
                ((SharedPreferences.Editor) nv6VarB.a).putBoolean("startpage.logo_fits", z);
                nv6VarB.w();
                if (mghVar.k(z, a7kVar.f.b().b)) {
                    return iR;
                }
                return 0;
            case 11:
                return jym.j(((i) ((j8k) ((k8k) u5kVar).k.q())).itemView, bz3Var);
            case 12:
                return jym.j(((i) ((m8k) ((s4b) u5kVar).f.q())).itemView, bz3Var);
            default:
                return jym.j(((i) ((bok) ((cok) u5kVar).s.q())).itemView, bz3Var);
        }
    }

    @Override // defpackage.k6k
    public final boolean d(bz3 bz3Var) {
        byte b = this.d;
        u5k u5kVar = this.e;
        switch (b) {
            case 0:
                List list = p4b.i;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (bz3Var.b((e6k) it.next())) {
                            return false;
                        }
                    }
                }
                return true;
            case 1:
                return !bz3Var.b(e6k.k);
            case 2:
                return ((ncd) u5kVar).z();
            case 3:
                return ((vdh) u5kVar).z();
            case 4:
                List list2 = p5k.g;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    return false;
                }
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (bz3Var.b((e6k) it2.next())) {
                        return true;
                    }
                }
                return false;
            case 5:
                return ((s5k) u5kVar).z() && !bz3Var.b(e6k.k);
            case 6:
                return ((bz3Var.b(e6k.p) || bz3Var.b(e6k.k)) && ((ArrayList) bz3Var.f).isEmpty()) ? false : true;
            case 7:
                return ((z5k) u5kVar).w();
            case 8:
                return ((z5k) u5kVar).z();
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return ((s6k) u5kVar).z();
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                a7k a7kVar = (a7k) u5kVar;
                mgh mghVar = a7kVar.i;
                tsd tsdVar = a7kVar.h;
                Context context = a7kVar.d;
                if (a7kVar.j == p6l.b) {
                    List list3 = a7k.m;
                    if ((list3 instanceof Collection) && list3.isEmpty()) {
                        return false;
                    }
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        if (bz3Var.b((e6k) it3.next())) {
                        }
                    }
                    return false;
                }
                t8k t8kVarB = a7kVar.f.b();
                gpj gpjVarS = ddh.s(((kl5) tsdVar.g()).b.height(), context);
                gpj gpjVar = gpj.a;
                if (!gpjVarS.d()) {
                    return mghVar.k(true, t8kVarB.b);
                }
                List list4 = a7k.m;
                boolean z = bz3Var.c >= ddh.r(context, (kl5) tsdVar.g());
                nv6 nv6VarB = ((ru9) mghVar.c).b();
                ((SharedPreferences.Editor) nv6VarB.a).putBoolean("startpage.logo_fits", z);
                nv6VarB.w();
                return false;
            case 11:
                return ((k8k) u5kVar).z();
            case 12:
                return true;
            default:
                return ((cok) u5kVar).z();
        }
    }
}
