package defpackage;

import android.graphics.drawable.ColorDrawable;
import com.leanplum.internal.RequestBuilder;
import com.opera.android.BrowserActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class tmi implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tmi(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final Object a(Object obj) {
        kol kolVar = (kol) this.b;
        Function0 function0 = (Function0) this.c;
        zwg zwgVar = (zwg) this.d;
        v7l v7lVar = (v7l) obj;
        kolVar.i = null;
        if (Intrinsics.a(v7lVar, t7l.a)) {
            int i = kolVar.f;
            if (i < 1) {
                kolVar.f = i + 1;
                ((j8l) ((BrowserActivity) kolVar.l.c).x0.get()).a(kolVar.e.a.c, 1);
            }
            function0.invoke();
        } else {
            if (!(v7lVar instanceof u7l)) {
                h9o.p();
                return null;
            }
            ColorDrawable colorDrawable = kol.r;
            kolVar.i(xvg.s(kolVar.a, ((u7l) v7lVar).a, kolVar.a()), new znl(zwgVar.j()));
        }
        return Unit.a;
    }

    private final Object b(Object obj) {
        xg1 xg1Var = (xg1) this.b;
        beo beoVar = (beo) this.c;
        String str = (String) this.d;
        spa spaVar = (spa) obj;
        apa apaVar = apa.b;
        spaVar.b = z4o.i0(RequestBuilder.POST);
        z1m.s(beoVar.a, "api/v1/auth/tokens", spaVar.a);
        cam camVarD = null;
        if (xg1Var == null) {
            spaVar.d = b4f.a;
        } else {
            spaVar.d = xg1Var;
        }
        s15 s15VarA = uqh.a(xg1.class);
        try {
            camVarD = uqh.d(xg1.class);
        } catch (Throwable unused) {
        }
        z1m.p(s15VarA, camVarD, spaVar);
        jf2 jf2Var = vpa.a;
        g9a g9aVar = spaVar.c;
        g9aVar.i("X-ApiKey", str);
        g9aVar.i("Content-Type", "application/json");
        return Unit.a;
    }

    private final Object c(Object obj) {
        rk1 rk1Var = (rk1) this.b;
        weo weoVar = (weo) this.c;
        String str = (String) this.d;
        spa spaVar = (spa) obj;
        apa apaVar = apa.b;
        spaVar.b = z4o.i0(RequestBuilder.POST);
        ugm.b(spaVar.a, weoVar.a + "api/v1/market/product/" + l75.f(3, String.valueOf(str)) + "/purchase");
        cam camVarD = null;
        if (rk1Var == null) {
            spaVar.d = b4f.a;
        } else {
            spaVar.d = rk1Var;
        }
        s15 s15VarA = uqh.a(rk1.class);
        try {
            camVarD = uqh.d(rk1.class);
        } catch (Throwable unused) {
        }
        z1m.p(s15VarA, camVarD, spaVar);
        jf2 jf2Var = vpa.a;
        g9a g9aVar = spaVar.c;
        g9aVar.i("Authorization", "");
        g9aVar.i("Accept-Language", "");
        g9aVar.i("Content-Type", "application/json");
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0737  */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.util.LinkedHashSet, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v223 */
    /* JADX WARN: Type inference failed for: r1v224 */
    /* JADX WARN: Type inference failed for: r1v228 */
    /* JADX WARN: Type inference failed for: r1v229 */
    /* JADX WARN: Type inference failed for: r1v232 */
    /* JADX WARN: Type inference failed for: r1v233 */
    /* JADX WARN: Type inference failed for: r1v237 */
    /* JADX WARN: Type inference failed for: r1v238 */
    /* JADX WARN: Type inference failed for: r1v246 */
    /* JADX WARN: Type inference failed for: r1v253 */
    /* JADX WARN: Type inference failed for: r1v256 */
    /* JADX WARN: Type inference failed for: r1v260 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r9v4, types: [wg5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 3116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmi.invoke(java.lang.Object):java.lang.Object");
    }
}
