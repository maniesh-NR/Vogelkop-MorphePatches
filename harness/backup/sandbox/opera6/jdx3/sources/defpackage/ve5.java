package defpackage;

import com.leanplum.core.BuildConfig;
import com.leanplum.utils.SizeUtil;
import com.opera.android.settings.SettingsManager;
import java.util.Arrays;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class ve5 implements Function2 {
    public final /* synthetic */ byte a;

    public /* synthetic */ ve5(byte b) {
        this.a = b;
    }

    public /* synthetic */ ve5(byte b, int i) {
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 0;
        z = false;
        boolean z = false;
        switch (this.a) {
            case 0:
                vt9 vt9Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var2 = vt9Var;
                if (vt9Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i39 i39Var = mpj.a;
                    pof.b.getClass();
                    ijl.b(mzg.q(vt9Var2, 2132017438), a26.b0(i39Var, 24.0f, 0.0f, 24.0f, 0.0f, 10), 0L, 0L, (ki9) null, 0L, (bgl) null, new pel(3), 0L, 0, false, 0, 0, ((wam) vt9Var2.j(abm.a)).f, vt9Var2, 0, 0, 130044);
                } else {
                    vt9Var2.Q();
                }
                return Unit.a;
            case 1:
                vt9 vt9Var3 = (ih5) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                vt9 vt9Var4 = vt9Var3;
                if (vt9Var4.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ijl.b(mzg.q(vt9Var4, 2132017438), mpj.a, 0L, 0L, (ki9) null, 0L, (bgl) null, new pel(3), 0L, 0, false, 0, 0, ((wam) vt9Var4.j(abm.a)).f, vt9Var4, 48, 0, 130044);
                } else {
                    vt9Var4.Q();
                }
                return Unit.a;
            case 2:
                vt9 vt9Var5 = (ih5) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                vt9 vt9Var6 = vt9Var5;
                if (vt9Var6.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x62 x62Var = new x62(16.0f, true, new t40((byte) 19));
                    zvf zvfVarC = a26.c(1, 0.0f, 16.0f);
                    i39 i39Var2 = mpj.c;
                    Object objK = vt9Var6.K();
                    Object obj3 = objK;
                    if (objK == hh5.a) {
                        mr3 mr3Var = new mr3((byte) 29);
                        vt9Var6.g0(mr3Var);
                        obj3 = mr3Var;
                    }
                    sgb.c(i39Var2, (u6c) null, zvfVarC, x62Var, (rd3) null, (h89) null, false, (v51) null, (Function1) obj3, vt9Var6, 805331334, 490);
                } else {
                    vt9Var6.Q();
                }
                return Unit.a;
            case 3:
                int[] iArr = (int[]) obj2;
                int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
                g8j g8jVar = (g8j) ((d8j) obj);
                g8jVar.getClass();
                g8jVar.b.e(new o2(new oba(2, 0, iArrCopyOf)), false);
                return Unit.a;
            case 4:
                int[] iArr2 = (int[]) obj2;
                ((g8j) ((d8j) obj)).a(Arrays.copyOf(iArr2, iArr2.length));
                return Unit.a;
            case 5:
                return Unit.a;
            case 6:
                pg pgVar = (pg) obj2;
                ng ngVar = ng.a;
                return (Intrinsics.a((pg) obj, ngVar) && Intrinsics.a(pgVar, ngVar)) ? ngVar : og.a;
            case 7:
                ((Boolean) obj).getClass();
                ((Boolean) obj2).getClass();
                return Unit.a;
            case 8:
                ((rj) obj).b.e(ij.a, false);
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((rj) obj).b.e(vj.a, false);
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                Set set = (Set) obj2;
                return new ok((a7j) obj, aib.O(set, ti3.b, true), aib.O(set, ti3.c, true), aib.O(set, ti3.d, false));
            case 11:
                int[] iArr3 = (int[]) obj2;
                ((rj) obj).a(Arrays.copyOf(iArr3, iArr3.length));
                return Unit.a;
            case 12:
                int[] iArr4 = (int[]) obj2;
                ((ot2) ((jt2) obj)).a(Arrays.copyOf(iArr4, iArr4.length));
                return Unit.a;
            case 13:
                ((Integer) obj2).getClass();
                yi4.d((ih5) obj, aoh.m(1));
                return Unit.a;
            case 14:
                ((Integer) obj2).getClass();
                r41.a((ih5) obj, aoh.m(1));
                return Unit.a;
            case 15:
                String str = (String) obj;
                String str2 = (String) obj2;
                if ((Intrinsics.a(str, "ro.debuggable") && Intrinsics.a(str2, "1")) || (Intrinsics.a(str, "ro.secure") && Intrinsics.a(str2, BuildConfig.BUILD_NUMBER))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 16:
                ndc ndcVar = (ndc) obj2;
                c6n c6nVarQ = nb6.Q((m3c) obj);
                if (ndcVar != c6nVarQ.l) {
                    c6nVarQ.l = ndcVar;
                    c6nVarQ.setTag(2131365017, ndcVar);
                }
                return Unit.a;
            case 17:
                rki rkiVar = (rki) obj2;
                c6n c6nVarQ2 = nb6.Q((m3c) obj);
                if (rkiVar != c6nVarQ2.m) {
                    c6nVarQ2.m = rkiVar;
                    c6nVarQ2.setTag(2131365020, rkiVar);
                }
                return Unit.a;
            case SizeUtil.textSize0_1 /* 18 */:
                c6n c6nVarQ3 = nb6.Q((m3c) obj);
                int iOrdinal = ((d2c) obj2).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        h9o.p();
                        return null;
                    }
                    i = 1;
                }
                c6nVarQ3.setLayoutDirection(i);
                return Unit.a;
            case 19:
                c6n c6nVarQ4 = nb6.Q((m3c) obj);
                c6nVarQ4.D = (Function1) obj2;
                c6nVarQ4.f = new ec1(c6nVarQ4, (byte) 4);
                return Unit.a;
            case SizeUtil.textSize0 /* 20 */:
                c6n c6nVarQ5 = nb6.Q((m3c) obj);
                c6nVarQ5.C = (Function1) obj2;
                c6nVarQ5.d = new ec1(c6nVarQ5, (byte) 5);
                c6nVarQ5.e = true;
                c6nVarQ5.r.invoke();
                return Unit.a;
            case 21:
                c6n c6nVarQ6 = nb6.Q((m3c) obj);
                c6nVarQ6.E = (Function1) obj2;
                c6nVarQ6.g = new ec1(c6nVarQ6, (byte) 3);
                return Unit.a;
            case SizeUtil.textSize1 /* 22 */:
                c6n c6nVarQ7 = nb6.Q((m3c) obj);
                c6nVarQ7.C = (Function1) obj2;
                c6nVarQ7.d = new ec1(c6nVarQ7, (byte) 5);
                c6nVarQ7.e = true;
                c6nVarQ7.r.invoke();
                return Unit.a;
            case 23:
                c6n c6nVarQ8 = nb6.Q((m3c) obj);
                c6nVarQ8.E = (Function1) obj2;
                c6nVarQ8.g = new ec1(c6nVarQ8, (byte) 3);
                return Unit.a;
            case SizeUtil.textSize2 /* 24 */:
                c8e c8eVar = (c8e) obj2;
                c6n c6nVarQ9 = nb6.Q((m3c) obj);
                if (c8eVar != c6nVarQ9.h) {
                    c6nVarQ9.h = c8eVar;
                    q3 q3Var = c6nVarQ9.i;
                    if (q3Var != null) {
                        q3Var.invoke(c8eVar);
                    }
                }
                return Unit.a;
            case 25:
                n27 n27Var = (n27) obj2;
                c6n c6nVarQ10 = nb6.Q((m3c) obj);
                if (n27Var != c6nVarQ10.j) {
                    c6nVarQ10.j = n27Var;
                    z3 z3Var = c6nVarQ10.k;
                    if (z3Var != null) {
                        z3Var.invoke(n27Var);
                    }
                }
                return Unit.a;
            case 26:
                g0c g0cVar = (g0c) obj;
                g0cVar.getClass();
                zhj.a(new a0c(), 4099).c(g0cVar.a);
                return Unit.a;
            case 27:
                int[] iArr5 = (int[]) obj2;
                ((g8j) ((d8j) obj)).b(Arrays.copyOf(iArr5, iArr5.length));
                return Unit.a;
            case 28:
                return Boolean.valueOf(((SettingsManager) obj2).i((String) obj));
            default:
                u42 u42Var = (u42) obj;
                if (!((Boolean) obj2).booleanValue() || u42Var == null) {
                    return null;
                }
                return new ju4(u42Var.c.a);
        }
    }
}
