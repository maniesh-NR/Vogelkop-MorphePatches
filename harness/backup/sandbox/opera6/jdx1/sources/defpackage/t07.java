package defpackage;

import com.opera.android.esim.ui.EsimActivity;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class t07 extends kuk implements Function2 {
    public final /* synthetic */ byte t = 2;
    public boolean u;
    public /* synthetic */ boolean v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t07(cd1 cd1Var, boolean z, a2k a2kVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.w = cd1Var;
        this.v = z;
        this.x = a2kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t07(nx5 nx5Var, EsimActivity esimActivity, mt5 mt5Var) {
        super(2, mt5Var);
        this.w = nx5Var;
        this.x = esimActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t07(u07 u07Var, mt5 mt5Var, boolean z, LinkedHashSet linkedHashSet) {
        super(2, mt5Var);
        this.w = u07Var;
        this.v = z;
        this.x = linkedHashSet;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.x;
        Object obj3 = this.w;
        switch (b) {
            case 0:
                return new t07((u07) obj3, mt5Var, this.v, (LinkedHashSet) obj2);
            case 1:
                t07 t07Var = new t07((nx5) obj3, (EsimActivity) obj2, mt5Var);
                t07Var.v = ((Boolean) obj).booleanValue();
                return t07Var;
            default:
                return new t07((cd1) obj3, this.v, (a2k) obj2, mt5Var);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return ((t07) create((nx5) obj, (mt5) obj2)).invokeSuspend(Unit.a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((t07) create(bool, (mt5) obj2)).invokeSuspend(Unit.a);
            default:
                return ((t07) create((nx5) obj, (mt5) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0077 -> B:31:0x007b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.t
            java.lang.Object r1 = r8.x
            java.lang.Object r2 = r8.w
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            switch(r0) {
                case 0: goto L8c;
                case 1: goto L42;
                default: goto Ld;
            }
        Ld:
            px5 r0 = px5.a
            boolean r6 = r8.u
            if (r6 == 0) goto L1d
            if (r6 != r5) goto L19
            defpackage.ybh.y(r9)
            goto L3f
        L19:
            qp2.n(r4)
            goto L41
        L1d:
            defpackage.ybh.y(r9)
            cd1 r2 = (defpackage.cd1) r2
            boolean r9 = r8.v
            if (r9 == 0) goto L29
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L2c
        L29:
            r9 = 1061997773(0x3f4ccccd, float:0.8)
        L2c:
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r9)
            a2k r1 = (defpackage.a2k) r1
            r8.u = r5
            r9 = 12
            java.lang.Object r8 = defpackage.cd1.a(r2, r3, r1, r8, r9)
            if (r8 != r0) goto L3f
            r3 = r0
            goto L41
        L3f:
            kotlin.Unit r3 = kotlin.Unit.a
        L41:
            return r3
        L42:
            boolean r0 = r8.v
            px5 r6 = px5.a
            boolean r7 = r8.u
            if (r7 == 0) goto L54
            if (r7 != r5) goto L50
            defpackage.ybh.y(r9)
            goto L7b
        L50:
            qp2.n(r4)
            goto L8b
        L54:
            defpackage.ybh.y(r9)
            if (r0 != 0) goto L5c
            kotlin.Unit r3 = kotlin.Unit.a
            goto L8b
        L5c:
            r9 = r2
            nx5 r9 = (nx5) r9
            boolean r9 = defpackage.sgb.M(r9)
            if (r9 == 0) goto L89
            on7 r9 = pn7.b
            r9 = 10
            un7 r3 = un7.e
            long r3 = defpackage.cs5.x0(r9, r3)
            r8.v = r0
            r8.u = r5
            java.lang.Object r9 = defpackage.nb6.q(r3, r8)
            if (r9 != r6) goto L7b
            r3 = r6
            goto L8b
        L7b:
            r9 = r1
            com.opera.android.esim.ui.EsimActivity r9 = (com.opera.android.esim.ui.EsimActivity) r9
            int r3 = com.opera.android.esim.ui.EsimActivity.f0
            com.opera.android.browser.chromium.ChromiumContent r9 = r9.N
            if (r9 == 0) goto L5c
            r3 = 0
            r9.x(r3)
            goto L5c
        L89:
            kotlin.Unit r3 = kotlin.Unit.a
        L8b:
            return r3
        L8c:
            px5 r0 = px5.a
            boolean r6 = r8.u
            if (r6 == 0) goto L9d
            if (r6 != r5) goto L98
            defpackage.ybh.y(r9)
            goto Lb9
        L98:
            qp2.n(r4)
            r9 = r3
            goto Lb9
        L9d:
            defpackage.ybh.y(r9)
            u07 r2 = (defpackage.u07) r2
            ism r9 = r2.n()
            boolean r2 = r8.v
            java.util.LinkedHashSet r1 = (java.util.LinkedHashSet) r1
            h07 r9 = r9.d(r1, r2)
            r8.u = r5
            cd5 r9 = (cd5) r9
            java.lang.Object r9 = r9.A(r8)
            if (r9 != r0) goto Lb9
            r9 = r0
        Lb9:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t07.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
