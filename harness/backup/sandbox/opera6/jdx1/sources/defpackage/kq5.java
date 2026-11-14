package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class kq5 extends kuk implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte t = 0;
    public boolean u;
    public final /* synthetic */ long v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq5(vnm vnmVar, mq5 mq5Var, xs3 xs3Var, long j, unb unbVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.x = vnmVar;
        this.y = mq5Var;
        this.z = xs3Var;
        this.v = j;
        this.A = unbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq5(wgg wggVar, String str, long j, xjl xjlVar, dil dilVar, i9f i9fVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.w = wggVar;
        this.x = str;
        this.v = j;
        this.y = xjlVar;
        this.z = dilVar;
        this.A = i9fVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.A;
        Object obj3 = this.z;
        Object obj4 = this.y;
        Object obj5 = this.x;
        switch (b) {
            case 0:
                kq5 kq5Var = new kq5((vnm) obj5, (mq5) obj4, (xs3) obj3, this.v, (unb) obj2, mt5Var);
                kq5Var.w = obj;
                return kq5Var;
            default:
                return new kq5((wgg) this.w, (String) obj5, this.v, (xjl) obj4, (dil) obj3, (i9f) obj2, mt5Var);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((qpi) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
