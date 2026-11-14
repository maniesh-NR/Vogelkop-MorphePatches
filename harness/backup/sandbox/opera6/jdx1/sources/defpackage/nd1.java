package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class nd1 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public byte u;
    public final /* synthetic */ float v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nd1(cd1 cd1Var, float f, boolean z, Object obj, Object obj2, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.x = cd1Var;
        this.v = f;
        this.w = z;
        this.y = obj;
        this.z = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd1(boolean z, e2d e2dVar, p2d p2dVar, float f, afe afeVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 0;
        o2d[] o2dVarArr = o2d.a;
        this.w = z;
        this.x = e2dVar;
        this.y = p2dVar;
        this.v = f;
        this.z = afeVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.z;
        Object obj3 = this.y;
        Object obj4 = this.x;
        switch (b) {
            case 0:
                o2d[] o2dVarArr = o2d.a;
                return new nd1(this.w, (e2d) obj4, (p2d) obj3, this.v, (afe) obj2, mt5Var);
            case 1:
                return new nd1((cd1) obj4, this.v, this.w, (e24) obj3, (ndb) obj2, mt5Var, (byte) 1);
            default:
                return new nd1((cd1) obj4, this.v, this.w, (ndb) obj3, (afe) obj2, mt5Var, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
        }
        return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r5.e(r18, r3) == r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (defpackage.fx7.a(r5, r2, r3, r9, r18) == r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009e, code lost:
    
        if (r5.e(r18, r3) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00de, code lost:
    
        if (defpackage.fx7.a(r5, r2, r10, (defpackage.ndb) r8, r18) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b8, code lost:
    
        if (r0 == r11) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
