package ads_mobile_sdk;

import android.widget.FrameLayout;
import defpackage.pqh;
import defpackage.prb;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class fp0 extends kuk implements Function2 {
    public Object a;
    public Object b;
    public byte c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ String h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ byte t = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp0(b82 b82Var, cy0 cy0Var, String str, pqh pqhVar, z31 z31Var, pqh pqhVar2, boolean z, mt5 mt5Var) {
        super(2, mt5Var);
        this.b = b82Var;
        this.d = cy0Var;
        this.h = str;
        this.e = pqhVar;
        this.f = z31Var;
        this.i = pqhVar2;
        this.j = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp0(qp0 qp0Var, vv1 vv1Var, prb prbVar, String str, FrameLayout frameLayout, boolean z, mt5 mt5Var) {
        super(2, mt5Var);
        this.d = qp0Var;
        this.e = vv1Var;
        this.f = prbVar;
        this.h = str;
        this.i = frameLayout;
        this.j = z;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.i;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                boolean z = this.j;
                return new fp0((qp0) obj5, (vv1) obj4, (prb) obj3, this.h, (FrameLayout) obj2, z, mt5Var);
            default:
                boolean z2 = this.j;
                return new fp0((b82) this.b, (cy0) obj5, this.h, (pqh) obj4, (z31) obj3, (pqh) obj2, z2, mt5Var);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        if (r1.a(r0, "onSdkLoaded", r16) == r13) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b7 A[Catch: all -> 0x02c4, TryCatch #1 {all -> 0x02c4, blocks: (B:41:0x00ce, B:110:0x02b1, B:112:0x02b7, B:113:0x02bc), top: B:205:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02d0 A[Catch: all -> 0x02f7, TryCatch #11 {all -> 0x02f7, blocks: (B:120:0x02c9, B:122:0x02d0, B:124:0x02d7, B:126:0x02db, B:128:0x02df, B:129:0x02e0, B:130:0x02e5, B:131:0x02e6, B:132:0x02ed, B:133:0x02ee, B:134:0x02f5, B:135:0x02f6), top: B:223:0x02c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02f6 A[Catch: all -> 0x02f7, TRY_LEAVE, TryCatch #11 {all -> 0x02f7, blocks: (B:120:0x02c9, B:122:0x02d0, B:124:0x02d7, B:126:0x02db, B:128:0x02df, B:129:0x02e0, B:130:0x02e5, B:131:0x02e6, B:132:0x02ed, B:133:0x02ee, B:134:0x02f5, B:135:0x02f6), top: B:223:0x02c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0325 A[Catch: all -> 0x0331, TryCatch #6 {all -> 0x0331, blocks: (B:37:0x00b6, B:147:0x031f, B:149:0x0325, B:150:0x032a), top: B:214:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x033d A[Catch: all -> 0x0364, TryCatch #2 {all -> 0x0364, blocks: (B:157:0x0336, B:159:0x033d, B:161:0x0344, B:163:0x0348, B:165:0x034c, B:166:0x034d, B:167:0x0352, B:168:0x0353, B:169:0x035a, B:170:0x035b, B:171:0x0362, B:172:0x0363), top: B:207:0x0336 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0363 A[Catch: all -> 0x0364, TRY_LEAVE, TryCatch #2 {all -> 0x0364, blocks: (B:157:0x0336, B:159:0x033d, B:161:0x0344, B:163:0x0348, B:165:0x034c, B:166:0x034d, B:167:0x0352, B:168:0x0353, B:169:0x035a, B:170:0x035b, B:171:0x0362, B:172:0x0363), top: B:207:0x0336 }] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v37, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fp0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
