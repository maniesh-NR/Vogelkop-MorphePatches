package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class emc extends kuk implements Function1 {
    public final /* synthetic */ byte t;
    public byte u;
    public final /* synthetic */ gmc v;
    public final /* synthetic */ ArrayList w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ emc(gmc gmcVar, ArrayList arrayList, mt5 mt5Var, byte b) {
        super(1, mt5Var);
        this.t = b;
        this.v = gmcVar;
        this.w = arrayList;
    }

    public final mt5 create(mt5 mt5Var) {
        byte b = this.t;
        ArrayList arrayList = this.w;
        gmc gmcVar = this.v;
        switch (b) {
            case 0:
                return new emc(gmcVar, arrayList, mt5Var, (byte) 0);
            default:
                return new emc(gmcVar, arrayList, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        mt5 mt5Var = (mt5) obj;
        switch (this.t) {
        }
        return create(mt5Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (kfo.Z(r10.a, new defpackage.ulc(r10, r1, r5), r9) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (kfo.a0(r9, r10.a, false, true, new defpackage.ulc(r10, r1, r6)) == r0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.t
            java.util.ArrayList r1 = r9.w
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            gmc r4 = r9.v
            r5 = 1
            r6 = 2
            switch(r0) {
                case 0: goto L59;
                default: goto Le;
            }
        Le:
            px5 r0 = px5.a
            byte r7 = r9.u
            if (r7 == 0) goto L24
            if (r7 == r5) goto L20
            if (r7 != r6) goto L1c
            ybh.y(r10)
            goto L56
        L1c:
            defpackage.qp2.n(r3)
            goto L58
        L20:
            ybh.y(r10)
            goto L3d
        L24:
            ybh.y(r10)
            j4c r10 = r4.a
            java.lang.Object r10 = r10.get()
            wlc r10 = (defpackage.wlc) r10
            oi9 r2 = defpackage.oi9.c
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r9.u = r5
            java.lang.Object r10 = r10.b(r2, r9)
            if (r10 == r0) goto L54
        L3d:
            j4c r10 = r4.a
            java.lang.Object r10 = r10.get()
            wlc r10 = (defpackage.wlc) r10
            r9.u = r6
            com.opera.android.live_score.data.db.LiveScoreDatabase_Impl r2 = r10.a
            ulc r3 = new ulc
            r3.<init>()
            java.lang.Object r9 = kfo.Z(r2, r3, r9)
            if (r9 != r0) goto L56
        L54:
            r2 = r0
            goto L58
        L56:
            kotlin.Unit r2 = kotlin.Unit.a
        L58:
            return r2
        L59:
            px5 r0 = px5.a
            byte r7 = r9.u
            r8 = 0
            if (r7 == 0) goto L70
            if (r7 == r5) goto L6c
            if (r7 != r6) goto L68
            ybh.y(r10)
            goto La8
        L68:
            defpackage.qp2.n(r3)
            goto Laa
        L6c:
            ybh.y(r10)
            goto L8c
        L70:
            ybh.y(r10)
            j4c r10 = r4.a
            java.lang.Object r10 = r10.get()
            wlc r10 = (defpackage.wlc) r10
            r9.u = r5
            com.opera.android.live_score.data.db.LiveScoreDatabase_Impl r10 = r10.a
            g8c r2 = new g8c
            r3 = 15
            r2.<init>(r3)
            java.lang.Object r10 = kfo.a0(r9, r10, r8, r5, r2)
            if (r10 == r0) goto La6
        L8c:
            j4c r10 = r4.a
            java.lang.Object r10 = r10.get()
            wlc r10 = (defpackage.wlc) r10
            r9.u = r6
            r10.getClass()
            com.opera.android.live_score.data.db.LiveScoreDatabase_Impl r2 = r10.a
            ulc r3 = new ulc
            r3.<init>()
            java.lang.Object r9 = kfo.a0(r9, r2, r8, r5, r3)
            if (r9 != r0) goto La8
        La6:
            r2 = r0
            goto Laa
        La8:
            kotlin.Unit r2 = kotlin.Unit.a
        Laa:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
