package ads_mobile_sdk;

import defpackage.fsg;
import defpackage.jj4;
import defpackage.rnp;
import defpackage.xep;
import defpackage.y7h;
import kotlin.Unit;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public abstract class on2 {
    public final nx5 a;
    public final nx5 b;
    public final kh3 c;
    public final qr0 d;
    public final ux2 e;
    public final String f;
    public final av2 g;
    public final defpackage.hp h;
    public final boolean i;
    public final i41 j;
    public final j71 k;
    public final gdj l;

    public on2(nx5 nx5Var, nx5 nx5Var2, kh3 kh3Var, qr0 qr0Var, ux2 ux2Var, String str, av2 av2Var, defpackage.hp hpVar, boolean z, i41 i41Var, j71 j71Var, gdj gdjVar) {
        this.a = nx5Var;
        this.b = nx5Var2;
        this.c = kh3Var;
        this.d = qr0Var;
        this.e = ux2Var;
        this.f = str;
        this.g = av2Var;
        this.h = hpVar;
        this.i = z;
        this.j = i41Var;
        this.k = j71Var;
        this.l = gdjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.on2 r6, mt5 r7) throws m2 {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.sm2
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.sm2 r0 = (ads_mobile_sdk.sm2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads_mobile_sdk.sm2 r0 = new ads_mobile_sdk.sm2
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            px5 r1 = px5.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.ybh.y(r7)
            return r7
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L31:
            defpackage.ybh.y(r7)
            goto L4d
        L35:
            defpackage.ybh.y(r7)
            r0.c = r5
            nx5 r7 = r6.a
            kotlin.coroutines.CoroutineContext r7 = r7.l()
            sbl r2 = new sbl
            r5 = 20
            r2.<init>(r5, r3, r6)
            java.lang.Object r7 = defpackage.na2.Z(r7, r2, r0)
            if (r7 == r1) goto L57
        L4d:
            f99 r7 = (f99) r7
            r0.c = r4
            java.lang.Object r6 = defpackage.cs5.E(r7, r0)
            if (r6 != r1) goto L58
        L57:
            return r1
        L58:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.on2.a(ads_mobile_sdk.on2, mt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        if (r0.collect(r12, r1) == r2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.on2 r10, defpackage.y7h r11, nt5 r12) {
        /*
            nx5 r0 = r10.b
            boolean r1 = r12 instanceof ads_mobile_sdk.cn2
            if (r1 == 0) goto L15
            r1 = r12
            ads_mobile_sdk.cn2 r1 = (ads_mobile_sdk.cn2) r1
            int r2 = r1.f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f = r2
            goto L1a
        L15:
            ads_mobile_sdk.cn2 r1 = new ads_mobile_sdk.cn2
            r1.<init>(r10, r12)
        L1a:
            java.lang.Object r12 = r1.d
            px5 r2 = px5.a
            int r3 = r1.f
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L3e
            if (r3 == r5) goto L34
            if (r3 != r4) goto L2e
            defpackage.ybh.y(r12)
            goto La8
        L2e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r10)
            return r6
        L34:
            kotlin.coroutines.CoroutineContext r10 = r1.c
            y7h r11 = r1.b
            ads_mobile_sdk.on2 r0 = r1.a
            defpackage.ybh.y(r12)
            goto L7b
        L3e:
            defpackage.ybh.y(r12)
            kotlin.coroutines.CoroutineContext r12 = r0.l()
            ot5 r3 = kotlin.coroutines.d.Hq
            kotlin.coroutines.CoroutineContext$Element r12 = r12.get(r3)
            boolean r3 = r12 instanceof dx5
            if (r3 == 0) goto L52
            dx5 r12 = (dx5) r12
            goto L53
        L52:
            r12 = r6
        L53:
            if (r12 == 0) goto L5c
            java.lang.String r3 = "Publisher Callback"
            dx5 r12 = r12.K(r5, r3)
            goto L5d
        L5c:
            r12 = r6
        L5d:
            if (r12 != 0) goto L63
            kotlin.coroutines.CoroutineContext r12 = r0.l()
        L63:
            dze r0 = dze.b
            kotlin.coroutines.CoroutineContext r12 = r12.plus(r0)
            r1.a = r10
            r1.b = r11
            r1.c = r12
            r1.f = r5
            java.lang.Object r0 = r10.a(r1)
            if (r0 == r2) goto La7
            r9 = r0
            r0 = r10
            r10 = r12
            r12 = r9
        L7b:
            f99 r12 = (f99) r12
            x11 r3 = new x11
            r7 = 11
            r3.<init>(r10, r11, r6, r7)
            x99 r7 = new x99
            r8 = 0
            r7.<init>(r12, r3, r8)
            wpa r12 = new wpa
            r12.<init>(r0, r10, r11, r6)
            x99 r0 = new x99
            r0.<init>(r7, r12, r5)
            ads_mobile_sdk.mc1 r12 = new ads_mobile_sdk.mc1
            r12.<init>(r10, r11, r5)
            r1.a = r6
            r1.b = r6
            r1.c = r6
            r1.f = r4
            java.lang.Object r10 = r0.collect(r12, r1)
            if (r10 != r2) goto La8
        La7:
            return r2
        La8:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.on2.a(ads_mobile_sdk.on2, y7h, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        if (r11 != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
    
        if (r11.c(r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00be, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(nt5 r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.on2.a(nt5):java.lang.Object");
    }

    public Object a(rnp rnpVar, xm2 xm2Var) {
        return Unit.a;
    }

    public final xep a(xep xepVar, defpackage.hp hpVar) {
        kh3 kh3Var = this.c;
        return (xep) ((xep) ((xep) ((xep) ((xep) ((xep) ((xep) ((xep) ((xep) ((xep) xepVar.a(kh3Var.a)).a(kh3Var.b)).a(this.g)).a(hpVar)).a(this.i)).a(this.k)).a(new dr2())).b()).c(false)).a(new i8(this.d));
    }

    public final void a(y7h y7hVar) {
        mt5 mt5Var = null;
        jj4 jj4Var = new jj4((Object) this, (Object) y7hVar, mt5Var, (byte) 23);
        h hVar = h.a;
        byte b = 3;
        d3k d3kVarB = defpackage.na2.B(this.a, hVar, null, new fsg(jj4Var, mt5Var, b), 2);
        d3kVarB.s(new na7(defpackage.na2.B(this.b, hVar, null, new fsg(new zj((Object) this, (Object) d3kVarB, mt5Var, (byte) 9), mt5Var, b), 2), (byte) 2));
    }

    public abstract Object b(mt5 mt5Var);

    public Object c(nt5 nt5Var) {
        return Unit.a;
    }
}
