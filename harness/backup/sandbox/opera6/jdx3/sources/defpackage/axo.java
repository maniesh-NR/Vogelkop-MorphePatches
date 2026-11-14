package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class axo extends kuk implements Function2 {
    public final /* synthetic */ wjo A;
    public final /* synthetic */ Boolean B;
    public byte t;
    public final /* synthetic */ sm u;
    public final /* synthetic */ Context v;
    public final /* synthetic */ ako w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ eq z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axo(sm smVar, eq eqVar, mt5 mt5Var, wjo wjoVar, ako akoVar, Context context, Boolean bool, String str, String str2) {
        super(2, mt5Var);
        this.u = smVar;
        this.v = context;
        this.w = akoVar;
        this.x = str;
        this.y = str2;
        this.z = eqVar;
        this.A = wjoVar;
        this.B = bool;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new axo(this.u, this.z, mt5Var, this.A, this.w, this.v, this.B, this.x, this.y);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r13 != r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        if (r2.f(r3, r4, r5, r6, r7, r8, r9, r10, r12) != r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            r12 = this;
            android.content.Context r0 = r12.v
            px5 r1 = px5.a
            byte r2 = r12.t
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L22
            if (r2 == r5) goto L1e
            if (r2 != r4) goto L18
            ybh.y(r13)
            t0i r13 = (t0i) r13
            java.lang.Object r12 = r13.a
            goto L8b
        L18:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r12)
            return r3
        L1e:
            ybh.y(r13)
            goto L51
        L22:
            ybh.y(r13)
            sm r13 = r12.u
            zyk r13 = r13.b
            java.lang.Object r13 = r13.getValue()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L6e
            r12.t = r5
            java.lang.String r13 = lah.a
            if (r13 == 0) goto L3e
            kotlin.Unit r13 = kotlin.Unit.a
            goto L4f
        L3e:
            android.content.Context r13 = r0.getApplicationContext()
            cv6 r2 = bb7.a
            mr6 r2 = mr6.b
            jho r6 = new jho
            r6.<init>(r13, r5, r3)
            java.lang.Object r13 = na2.Z(r2, r6, r12)
        L4f:
            if (r13 == r1) goto L8a
        L51:
            boolean r13 = defpackage.fcp.e(r0)
            if (r13 != 0) goto L6e
            ako r12 = r12.w
            p0i r13 = t0i.b
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "WebView min version not satisfied"
            r13.<init>(r0)
            q0i r0 = new q0i
            r0.<init>(r13)
            r13 = 0
            r12.a(r13, r0)
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        L6e:
            oxo r2 = defpackage.oxo.a
            android.content.Context r3 = r12.v
            r13 = r4
            java.lang.String r4 = r12.x
            sm r5 = r12.u
            java.lang.String r6 = r12.y
            eq r7 = r12.z
            wjo r8 = r12.A
            java.lang.Boolean r9 = r12.B
            ako r10 = r12.w
            r12.t = r13
            r11 = r12
            java.lang.Object r12 = r2.f(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r12 != r1) goto L8b
        L8a:
            return r1
        L8b:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axo.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
