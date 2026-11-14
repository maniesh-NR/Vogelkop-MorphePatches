package defpackage;

import com.leanplum.internal.ResourceQualifiers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.ranges.a;

/* loaded from: classes.dex */
public final /* synthetic */ class v5f implements Function1 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v5f(List list, g1b g1bVar, clg clgVar, long j, long j2) {
        this.d = list;
        this.e = g1bVar;
        this.f = clgVar;
        this.b = j;
        this.c = j2;
    }

    public /* synthetic */ v5f(jd0 jd0Var, String str, long j, long j2, String str2) {
        this.d = jd0Var;
        this.e = str;
        this.b = j;
        this.c = j2;
        this.f = str2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                String str = (String) obj2;
                ld0 ld0Var = (ld0) ((nd0) obj).c.getValue();
                kd0 kd0Var = ld0Var.b;
                kd0Var.getClass();
                kd0Var.q(8, 1, (jd0) obj4);
                id0 id0Var = (id0) ld0Var.c.getValue();
                id0Var.a.y(0, (String) obj3);
                id0Var.a.p(1, 1, this.b);
                id0Var.a.p(2, 1, this.c);
                if (str != null) {
                    id0Var.a.y(3, str);
                }
                break;
            default:
                g1b g1bVar = (g1b) obj3;
                clg clgVar = (clg) obj2;
                mk7 mk7Var = (mk7) obj;
                Iterator it = ((List) obj4).iterator();
                while (it.hasNext()) {
                    float fA = clgVar.a(((tol) it.next()).a);
                    float fO0 = mk7Var.o0(2.0f);
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (mk7Var.e() & 4294967295L));
                    mk7.p0(mk7Var, this.c, (Float.floatToRawIntBits(fA) << 32) | (Float.floatToRawIntBits(fO0) & 4294967295L), (Float.floatToRawIntBits(fA) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), mk7Var.o0(1.0f), ResourceQualifiers.Qualifier.AnonymousClass14.DENSITY_XXHIGH);
                }
                if (!g1bVar.isEmpty()) {
                    IntRange intRangeG = j95.g(g1bVar);
                    d91 d91VarA = f91.a();
                    float fA2 = clgVar.a(0);
                    float f = clgVar.e;
                    d91VarA.a.moveTo(fA2, clgVar.b(0));
                    Iterator it2 = CollectionsKt.G(intRangeG, 1).iterator();
                    while (it2.hasNext()) {
                        int iIntValue = ((Number) it2.next()).intValue();
                        d91VarA.e(clgVar.a(iIntValue), clgVar.b(iIntValue));
                    }
                    d91 d91VarA2 = f91.a();
                    d91.a(d91VarA2, d91VarA);
                    d91VarA2.e(clgVar.a(((a) intRangeG).b), f);
                    d91VarA2.e(clgVar.a(0), f);
                    d91VarA2.a.close();
                    long j = this.b;
                    mk7.m0(mk7Var, d91VarA2, new vec(Arrays.asList(new u95(u95.b(j, 0.4f)), new u95(u95.b(j, 0.0f))), (ArrayList) null, Float.floatToRawIntBits(clgVar.d) & 4294967295L, Float.floatToRawIntBits(f) & 4294967295L, 0), 0.0f, (nk7) null, 60);
                    mk7.F0(mk7Var, d91VarA, j, 0.0f, new qik(0, 0, mk7Var.o0(1.0f), 0.0f, 30), 52);
                }
                break;
        }
        return Unit.a;
    }
}
