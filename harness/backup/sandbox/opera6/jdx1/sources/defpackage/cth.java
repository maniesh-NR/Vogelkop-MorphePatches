package defpackage;

import ads_mobile_sdk.av2;
import ads_mobile_sdk.sc2;
import android.content.Context;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class cth extends kuk implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte t = 1;
    public byte u;
    public int v;
    public Serializable w;
    public Serializable x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cth(sc2 sc2Var, av2 av2Var, hp hpVar, int i, mt5 mt5Var) {
        super(2, mt5Var);
        this.y = sc2Var;
        this.z = av2Var;
        this.A = hpVar;
        this.v = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cth(dk7 dk7Var, Context context, y2d y2dVar, afe afeVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.x = dk7Var;
        this.y = context;
        this.z = y2dVar;
        this.A = afeVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.A;
        Object obj3 = this.z;
        Object obj4 = this.y;
        switch (b) {
            case 0:
                return new cth((dk7) this.x, (Context) obj4, (y2d) obj3, (afe) obj2, mt5Var);
            default:
                return new cth((sc2) obj4, (av2) obj3, (hp) obj2, this.v, mt5Var);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:120|(1:187)|121|(3:124|(1:126)|127)(1:123)|128|(1:133)|134|135|185|136|137|(3:140|141|25c)) */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01ee, code lost:
    
        if (r2 != r11) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01f6, code lost:
    
        if (((java.lang.Boolean) r2).booleanValue() != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0285, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0286, code lost:
    
        r5 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0145, code lost:
    
        if (defpackage.na2.Z(r2, r3, r5) == r6) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:140:0x024f -> B:141:0x0250). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:162:0x028a -> B:113:0x01c0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cth.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
