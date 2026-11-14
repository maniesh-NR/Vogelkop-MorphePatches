package defpackage;

import ads_mobile_sdk.a2;
import ads_mobile_sdk.av2;
import ads_mobile_sdk.sy2;
import ads_mobile_sdk.tv2;
import ads_mobile_sdk.xv;
import ads_mobile_sdk.z2;
import android.net.Uri;
import android.os.Bundle;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ld1 extends kuk implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte t;
    public boolean u;
    public Object v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld1(Bundle bundle, Bundle bundle2, fq fqVar, sy2 sy2Var, String str, String str2, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 6;
        this.v = sy2Var;
        this.w = str;
        this.x = str2;
        this.y = bundle;
        this.z = bundle2;
        this.A = fqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj;
        this.w = obj2;
        this.x = obj3;
        this.y = obj4;
        this.z = obj5;
        this.A = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj;
        this.x = obj2;
        this.y = obj3;
        this.z = obj4;
        this.A = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld1(or4 or4Var, cd1 cd1Var, afe afeVar, afe afeVar2, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 0;
        this.x = or4Var;
        this.y = cd1Var;
        this.z = afeVar;
        this.A = afeVar2;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.A;
        Object obj3 = this.z;
        Object obj4 = this.y;
        Object obj5 = this.x;
        switch (b) {
            case 0:
                ld1 ld1Var = new ld1((or4) obj5, (cd1) obj4, (afe) obj3, (afe) obj2, mt5Var);
                ld1Var.w = obj;
                return ld1Var;
            case 1:
                return new ld1((dz1) this.v, (String) this.w, (Uri) obj5, (String) obj4, (String) obj3, (String) obj2, mt5Var, (byte) 1);
            case 2:
                return new ld1((g89) this.v, (qt3) this.w, (qt3) obj5, (ut3) obj4, (qt3) obj3, (qt3) obj2, mt5Var, (byte) 2);
            case 3:
                ld1 ld1Var2 = new ld1(this.v, obj5, obj4, obj3, obj2, mt5Var, (byte) 3);
                ld1Var2.w = obj;
                return ld1Var2;
            case 4:
                ld1 ld1Var3 = new ld1(this.v, obj5, obj4, obj3, obj2, mt5Var, (byte) 4);
                ld1Var3.w = obj;
                return ld1Var3;
            case 5:
                return new ld1((sy2) this.v, (Map.Entry) this.w, (r83) obj5, (Map) obj4, (av2) obj3, (fq) obj2, mt5Var, (byte) 5);
            case 6:
                return new ld1((Bundle) obj4, (Bundle) obj3, (fq) obj2, (sy2) this.v, (String) this.w, (String) obj5, mt5Var);
            default:
                return new ld1((tv2) this.v, (Uri) this.w, (a2) obj5, (xv) obj4, (z2) obj3, (Boolean) obj2, mt5Var, (byte) 7);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Exception {
        switch (this.t) {
            case 2:
                create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
                break;
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0153  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:165:0x0464 -> B:167:0x0468). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
