package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class wki implements Function2 {
    public final /* synthetic */ byte a;

    public /* synthetic */ wki(byte b) {
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2) {
        wf1 wf1Var;
        Object objA;
        switch (this.a) {
            case 0:
                vil vilVar = (vil) obj2;
                return j95.d(new Float[]{Float.valueOf(vilVar.a), Float.valueOf(vilVar.b)});
            case 1:
                rji rjiVar = (rji) obj;
                wil wilVar = (wil) obj2;
                rkl rklVar = new rkl(wilVar.a);
                yki ykiVar = zki.v;
                return j95.d(new Object[]{zki.a(rklVar, ykiVar, rjiVar), zki.a(new rkl(wilVar.b), ykiVar, rjiVar)});
            case 2:
                return Integer.valueOf(((ki9) obj2).a);
            case 3:
                ofc ofcVar = (ofc) obj2;
                return j95.d(new Object[]{ofcVar.a, zki.a(ofcVar.b, zki.i, (rji) obj)});
            case 4:
                return Float.valueOf(((ua3) obj2).a);
            case 5:
                rji rjiVar2 = (rji) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(zki.a((rf1) list.get(i), zki.b, rjiVar2));
                }
                return arrayList;
            case 6:
                xjl xjlVar = (xjl) obj2;
                return j95.d(new Integer[]{Integer.valueOf((int) (xjlVar.a >> 32)), Integer.valueOf((int) (xjlVar.a & 4294967295L))});
            case 7:
                rji rjiVar3 = (rji) obj;
                jaj jajVar = (jaj) obj2;
                return j95.d(new Object[]{zki.a(new u95(jajVar.a), zki.p, rjiVar3), zki.a(new y8f(jajVar.b), zki.x, rjiVar3), Float.valueOf(jajVar.c)});
            case 8:
                return Integer.valueOf(((pel) obj2).a);
            case 9:
                return Integer.valueOf(((jgl) obj2).a);
            case 10:
                return Integer.valueOf(((pra) obj2).a);
            case 11:
                return Integer.valueOf(((gi9) obj2).a);
            case 12:
                return Integer.valueOf(((hi9) obj2).a);
            case 13:
                rkl rklVar2 = (rkl) obj2;
                return rklVar2 != null ? rkl.a(rklVar2.a, rkl.c) : false ? Boolean.FALSE : j95.d(new Object[]{Float.valueOf(rkl.c(rklVar2.a)), zki.a(new skl(rkl.b(rklVar2.a)), zki.w, (rji) obj)});
            case 14:
                nfc nfcVar = (nfc) obj2;
                return j95.d(new Object[]{nfcVar.a, zki.a(nfcVar.b, zki.i, (rji) obj)});
            case 15:
                long j = ((skl) obj2).a;
                if (skl.a(j, 8589934592L)) {
                    return 0;
                }
                if (skl.a(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 16:
                y8f y8fVar = (y8f) obj2;
                return y8fVar != null ? y8f.b(y8fVar.a, 9205357640488583168L) : false ? Boolean.FALSE : j95.d(new Float[]{Float.valueOf(Float.intBitsToFloat((int) (y8fVar.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (y8fVar.a & 4294967295L)))});
            case 17:
                rji rjiVar4 = (rji) obj;
                rf1 rf1Var = (rf1) obj2;
                Object obj3 = rf1Var.a;
                if (obj3 instanceof yzf) {
                    wf1Var = wf1.a;
                } else if (obj3 instanceof rwj) {
                    wf1Var = wf1.b;
                } else if (obj3 instanceof r1n) {
                    wf1Var = wf1.c;
                } else if (obj3 instanceof hpm) {
                    wf1Var = wf1.d;
                } else if (obj3 instanceof ofc) {
                    wf1Var = wf1.e;
                } else if (obj3 instanceof nfc) {
                    wf1Var = wf1.f;
                } else {
                    if (!(obj3 instanceof ehk)) {
                        t3p.o();
                        return null;
                    }
                    wf1Var = wf1.g;
                }
                switch (wf1Var.ordinal()) {
                    case 0:
                        objA = zki.a((yzf) obj3, zki.g, rjiVar4);
                        break;
                    case 1:
                        objA = zki.a((rwj) obj3, zki.h, rjiVar4);
                        break;
                    case 2:
                        objA = zki.a((r1n) obj3, zki.c, rjiVar4);
                        break;
                    case 3:
                        objA = zki.a((hpm) obj3, zki.d, rjiVar4);
                        break;
                    case 4:
                        objA = zki.a((ofc) obj3, zki.e, rjiVar4);
                        break;
                    case 5:
                        objA = zki.a((nfc) obj3, zki.f, rjiVar4);
                        break;
                    case 6:
                        objA = ((ehk) obj3).a;
                        break;
                    default:
                        h9o.p();
                        return null;
                }
                return j95.d(new Object[]{wf1Var, objA, Integer.valueOf(rf1Var.b), Integer.valueOf(rf1Var.c), rf1Var.d});
            case 18:
                rji rjiVar5 = (rji) obj;
                List list2 = ((awc) obj2).a;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList2.add(zki.a((yvc) list2.get(i2), zki.z, rjiVar5));
                }
                return arrayList2;
            case 19:
                return ((yvc) obj2).a.toLanguageTag();
            case 20:
                rji rjiVar6 = (rji) obj;
                rec recVar = (rec) obj2;
                return j95.d(new Object[]{zki.a(new oec(recVar.a), zki.B, rjiVar6), zki.a(new qec(recVar.b), zki.C, rjiVar6), zki.a(new pec(recVar.c), zki.D, rjiVar6)});
            case 21:
                return Float.valueOf(((oec) obj2).a);
            case 22:
                return Integer.valueOf(((qec) obj2).a);
            case 23:
                return Integer.valueOf(((pec) obj2).a);
            case 24:
                return ((r1n) obj2).a;
            case 25:
                rji rjiVar7 = (rji) obj;
                yzf yzfVar = (yzf) obj2;
                Object objA2 = zki.a(new pel(yzfVar.a), zki.q, rjiVar7);
                Object objA3 = zki.a(new jgl(yzfVar.b), zki.r, rjiVar7);
                Object objA4 = zki.a(new rkl(yzfVar.c), zki.v, rjiVar7);
                wil wilVar2 = yzfVar.d;
                wil wilVar3 = wil.c;
                Object objA5 = zki.a(wilVar2, zki.l, rjiVar7);
                Object objA6 = zki.a(yzfVar.e, cli.a, rjiVar7);
                rec recVar2 = yzfVar.f;
                rec recVar3 = rec.d;
                return j95.d(new Object[]{objA2, objA3, objA4, objA5, objA6, zki.a(recVar2, zki.A, rjiVar7), zki.a(new kec(yzfVar.g), cli.c, rjiVar7), zki.a(new pra(yzfVar.h), zki.s, rjiVar7), zki.a(yzfVar.i, cli.d, rjiVar7)});
            case 26:
                return ((hpm) obj2).a;
            case 27:
                rji rjiVar8 = (rji) obj;
                rwj rwjVar = (rwj) obj2;
                u95 u95Var = new u95(rwjVar.a.a());
                yki ykiVar2 = zki.p;
                Object objA7 = zki.a(u95Var, ykiVar2, rjiVar8);
                rkl rklVar3 = new rkl(rwjVar.b);
                yki ykiVar3 = zki.v;
                Object objA8 = zki.a(rklVar3, ykiVar3, rjiVar8);
                ki9 ki9Var = rwjVar.c;
                ki9 ki9Var2 = ki9.b;
                Object objA9 = zki.a(ki9Var, zki.m, rjiVar8);
                Object objA10 = zki.a(rwjVar.d, zki.t, rjiVar8);
                Object objA11 = zki.a(rwjVar.e, zki.u, rjiVar8);
                String str = rwjVar.g;
                Object objA12 = zki.a(new rkl(rwjVar.h), ykiVar3, rjiVar8);
                Object objA13 = zki.a(rwjVar.i, zki.n, rjiVar8);
                Object objA14 = zki.a(rwjVar.j, zki.k, rjiVar8);
                awc awcVar = rwjVar.k;
                awc awcVar2 = awc.c;
                Object objA15 = zki.a(awcVar, zki.y, rjiVar8);
                Object objA16 = zki.a(new u95(rwjVar.l), ykiVar2, rjiVar8);
                Object objA17 = zki.a(rwjVar.m, zki.j, rjiVar8);
                jaj jajVar2 = rwjVar.n;
                jaj jajVar3 = jaj.d;
                return j95.d(new Object[]{objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, zki.a(jajVar2, zki.o, rjiVar8)});
            case 28:
                rji rjiVar9 = (rji) obj;
                tjl tjlVar = (tjl) obj2;
                rwj rwjVar2 = tjlVar.a;
                c67 c67Var = zki.h;
                return j95.d(new Object[]{zki.a(rwjVar2, c67Var, rjiVar9), zki.a(tjlVar.b, c67Var, rjiVar9), zki.a(tjlVar.c, c67Var, rjiVar9), zki.a(tjlVar.d, c67Var, rjiVar9)});
            default:
                pgg pggVar = (pgg) obj2;
                Boolean boolValueOf = Boolean.valueOf(pggVar.a);
                c67 c67Var2 = zki.a;
                return j95.d(new Object[]{boolValueOf, zki.a(new ez7(pggVar.b), cli.b, (rji) obj)});
        }
    }
}
