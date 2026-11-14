package defpackage;

import ads_mobile_sdk.ae2;
import ads_mobile_sdk.bz0;
import ads_mobile_sdk.fe2;
import ads_mobile_sdk.vy0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class vf6 extends kuk implements Function2 {
    public final /* synthetic */ byte t = 6;
    public boolean u;
    public Object v;
    public boolean w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf6(bz0 bz0Var, vy0 vy0Var, vy0 vy0Var2, boolean z, boolean z2, mt5 mt5Var) {
        super(2, mt5Var);
        this.v = bz0Var;
        this.x = vy0Var;
        this.y = vy0Var2;
        this.u = z;
        this.w = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf6(afe afeVar, boolean z, lde ldeVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.x = afeVar;
        this.w = z;
        this.y = ldeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf6(cd1 cd1Var, boolean z, a2k a2kVar, Function0 function0, mt5 mt5Var) {
        super(2, mt5Var);
        this.v = cd1Var;
        this.w = z;
        this.x = a2kVar;
        this.y = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf6(eka ekaVar, ks3 ks3Var, boolean z, mt5 mt5Var) {
        super(2, mt5Var);
        this.x = ekaVar;
        this.y = ks3Var;
        this.w = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf6(Boolean bool, d7p d7pVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.x = bool;
        this.y = d7pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    public vf6(mg6 mg6Var, String str, long j, mt5 mt5Var) {
        super(2, mt5Var);
        this.x = mg6Var;
        this.y = str;
        this.w = (int) j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf6(boolean z, ArrayList arrayList, mg6 mg6Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.w = z;
        this.y = arrayList;
        this.x = mg6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf6(boolean z, pqh pqhVar, ae2 ae2Var, fe2 fe2Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.w = z;
        this.v = pqhVar;
        this.x = ae2Var;
        this.y = fe2Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.y;
        Object obj3 = this.x;
        switch (b) {
            case 0:
                vf6 vf6Var = new vf6((mg6) obj3, (String) obj2, this.w ? 1L : 0L, mt5Var);
                vf6Var.v = obj;
                return vf6Var;
            case 1:
                vf6 vf6Var2 = new vf6(this.w, (ArrayList) obj2, (mg6) obj3, mt5Var);
                vf6Var2.v = obj;
                return vf6Var2;
            case 2:
                return new vf6((eka) obj3, (ks3) obj2, this.w, mt5Var);
            case 3:
                return new vf6((cd1) this.v, this.w, (a2k) obj3, (Function0) obj2, mt5Var);
            case 4:
                return new vf6((afe) obj3, this.w, (lde) obj2, mt5Var);
            case 5:
                return new vf6(this.w, (pqh) this.v, (ae2) obj3, (fe2) obj2, mt5Var);
            case 6:
                return new vf6((bz0) this.v, (vy0) obj3, (vy0) obj2, this.u, this.w, mt5Var);
            default:
                vf6 vf6Var3 = new vf6((Boolean) obj3, (d7p) obj2, mt5Var);
                vf6Var3.v = obj;
                return vf6Var3;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018f  */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r13v34, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
