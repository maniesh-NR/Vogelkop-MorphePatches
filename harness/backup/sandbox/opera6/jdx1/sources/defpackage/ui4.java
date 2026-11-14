package defpackage;

import ads_mobile_sdk.j13;
import ads_mobile_sdk.o32;
import android.app.Application;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ui4 extends kuk implements Function2 {
    public final /* synthetic */ byte t = 1;
    public byte u;
    public final /* synthetic */ boolean v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui4(j13 j13Var, o32 o32Var, boolean z, mt5 mt5Var) {
        super(2, mt5Var);
        this.w = j13Var;
        this.x = o32Var;
        this.v = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui4(List list, mt5 mt5Var, boolean z, rj4 rj4Var) {
        super(2, mt5Var);
        this.w = list;
        this.v = z;
        this.x = rj4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui4(boolean z, Application application, mt5 mt5Var) {
        super(2, mt5Var);
        this.v = z;
        this.x = application;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.x;
        boolean z = this.v;
        switch (b) {
            case 0:
                return new ui4((List) this.w, mt5Var, z, (rj4) obj2);
            case 1:
                return new ui4((j13) this.w, (o32) obj2, z, mt5Var);
            default:
                ui4 ui4Var = new ui4(z, (Application) obj2, mt5Var);
                ui4Var.w = obj;
                return ui4Var;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r0 != r13) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
    
        if (defpackage.na2.Z(r2, r3, r14) == r13) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f5, code lost:
    
        if (ads_mobile_sdk.su2.d(r4, r1, r0, r14) == r6) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0109, code lost:
    
        if (ads_mobile_sdk.su2.c(r4, r1, r0, r14) == r6) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0144, code lost:
    
        if (((defpackage.rj4) r4).q(1000000000, r14) == r0) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
