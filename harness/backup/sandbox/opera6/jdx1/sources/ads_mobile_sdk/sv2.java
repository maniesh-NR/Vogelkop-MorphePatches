package ads_mobile_sdk;

import android.net.Uri;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class sv2 extends kuk implements Function2 {
    public long a;
    public byte b;
    public final /* synthetic */ int c;
    public final /* synthetic */ u22 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ tv2 f;
    public final /* synthetic */ Uri g;
    public final /* synthetic */ String h;
    public final /* synthetic */ Map i;
    public final /* synthetic */ z2 j;
    public final /* synthetic */ a2 k;
    public final /* synthetic */ Boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv2(int i, long j, Uri uri, a2 a2Var, z2 z2Var, u22 u22Var, tv2 tv2Var, Boolean bool, String str, Map map, mt5 mt5Var) {
        super(2, mt5Var);
        this.c = i;
        this.d = u22Var;
        this.e = j;
        this.f = tv2Var;
        this.g = uri;
        this.h = str;
        this.i = map;
        this.j = z2Var;
        this.k = a2Var;
        this.l = bool;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new sv2(this.c, this.e, this.g, this.k, this.j, this.d, this.f, this.l, this.h, this.i, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (r13.f.a(r13.g, r13.d, r3, r4, r13.h, r13.i, r13.j, r13.k, r13.l, r13) == r12) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            px5 r12 = px5.a
            byte r0 = r13.b
            int r1 = r13.c
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L19
            if (r0 != r2) goto L12
            defpackage.ybh.y(r14)
            goto L5e
        L12:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r0)
            r0 = 0
            return r0
        L19:
            long r4 = r13.a
            defpackage.ybh.y(r14)
            goto L43
        L1f:
            defpackage.ybh.y(r14)
            ads_mobile_sdk.u22 r0 = r13.d
            if (r1 != r3) goto L31
            on7 r4 = pn7.b
            int r0 = r0.b
            un7 r4 = un7.d
            long r4 = defpackage.cs5.x0(r0, r4)
            goto L39
        L31:
            long r4 = r13.e
            double r6 = r0.d
            long r4 = pn7.o(r4, r6)
        L39:
            r13.a = r4
            r13.b = r3
            java.lang.Object r0 = defpackage.nb6.q(r4, r13)
            if (r0 == r12) goto L5d
        L43:
            int r3 = r3 + r1
            r13.b = r2
            ads_mobile_sdk.tv2 r0 = r13.f
            android.net.Uri r1 = r13.g
            ads_mobile_sdk.u22 r2 = r13.d
            java.lang.String r6 = r13.h
            java.util.Map r7 = r13.i
            ads_mobile_sdk.z2 r8 = r13.j
            ads_mobile_sdk.a2 r9 = r13.k
            java.lang.Boolean r10 = r13.l
            r11 = r13
            java.lang.Object r0 = r0.a(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11)
            if (r0 != r12) goto L5e
        L5d:
            return r12
        L5e:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sv2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
