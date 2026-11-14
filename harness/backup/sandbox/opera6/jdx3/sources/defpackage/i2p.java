package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i2p extends kuk implements Function2 {
    public byte t;
    public /* synthetic */ Object u;
    public final /* synthetic */ long v;
    public final /* synthetic */ long w;
    public final /* synthetic */ Context x;
    public final /* synthetic */ String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2p(long j, long j2, Context context, String str, mt5 mt5Var) {
        super(2, mt5Var);
        this.v = j;
        this.w = j2;
        this.x = context;
        this.y = str;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        i2p i2pVar = new i2p(this.v, this.w, this.x, this.y, mt5Var);
        i2pVar.u = obj;
        return i2pVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            px5 r0 = px5.a
            byte r1 = r8.t
            r2 = 0
            android.content.Context r3 = r8.x
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L31
            if (r1 == r6) goto L29
            if (r1 == r5) goto L21
            if (r1 != r4) goto L1b
            java.lang.Object r8 = r8.u
            pqh r8 = (pqh) r8
            ybh.y(r9)
            goto L8e
        L1b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r8)
            return r2
        L21:
            java.lang.Object r1 = r8.u
            nx5 r1 = (nx5) r1
            ybh.y(r9)
            goto L5a
        L29:
            java.lang.Object r1 = r8.u
            nx5 r1 = (nx5) r1
            ybh.y(r9)
            goto L45
        L31:
            ybh.y(r9)
            java.lang.Object r9 = r8.u
            r1 = r9
            nx5 r1 = (nx5) r1
            r8.u = r1
            r8.t = r6
            long r6 = r8.v
            java.lang.Object r9 = nb6.q(r6, r8)
            if (r9 == r0) goto L8c
        L45:
            cv6 r9 = bb7.a
            mr6 r9 = mr6.b
            eno r6 = new eno
            r7 = 9
            r6.<init>(r7, r2, r3)
            r8.u = r1
            r8.t = r5
            java.lang.Object r9 = na2.Z(r9, r6, r8)
            if (r9 == r0) goto L8c
        L5a:
            pqh r9 = new pqh
            r9.<init>()
            p0i r1 = t0i.b     // Catch: java.lang.Throwable -> L67
            h2p r1 = new h2p     // Catch: java.lang.Throwable -> L67
            r1.<init>(r3, r9)     // Catch: java.lang.Throwable -> L67
            goto L70
        L67:
            r1 = move-exception
            p0i r3 = t0i.b
            q0i r3 = new q0i
            r3.<init>(r1)
            r1 = r3
        L70:
            boolean r3 = r1 instanceof q0i
            if (r3 != 0) goto L75
            r2 = r1
        L75:
            h2p r2 = (defpackage.h2p) r2
            if (r2 == 0) goto L80
            r9.a = r2
            java.lang.String r1 = r8.y
            r2.loadUrl(r1)
        L80:
            r8.u = r9
            r8.t = r4
            long r1 = r8.w
            java.lang.Object r8 = nb6.q(r1, r8)
            if (r8 != r0) goto L8d
        L8c:
            return r0
        L8d:
            r8 = r9
        L8e:
            java.lang.Object r8 = r8.a
            f2p r8 = (defpackage.f2p) r8
            if (r8 == 0) goto L9b
            boolean r9 = r8.a
            if (r9 != 0) goto L9b
            r8.destroy()
        L9b:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i2p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
