package defpackage;

import ads_mobile_sdk.a2;
import ads_mobile_sdk.cy0;
import ads_mobile_sdk.ev2;
import ads_mobile_sdk.n13;
import ads_mobile_sdk.nj3;
import ads_mobile_sdk.p30;
import ads_mobile_sdk.rr1;
import ads_mobile_sdk.sc2;
import ads_mobile_sdk.sy0;
import android.app.Activity;
import android.net.Uri;
import android.view.ViewGroup;
import android.view.Window;
import com.opera.android.settings.SettingsManager;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class r71 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r71(ftn ftnVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 16;
        this.z = ftnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r71(Object obj, Serializable serializable, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.y = obj;
        this.z = serializable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r71(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj;
        this.w = obj2;
        this.x = obj3;
        this.y = obj4;
        this.z = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r71(Object obj, Object obj2, Object obj3, Object obj4, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.w = obj;
        this.x = obj2;
        this.y = obj3;
        this.z = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r71(Object obj, Object obj2, Object obj3, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r71(String str, Object obj, mt5 mt5Var, n13 n13Var, a2 a2Var, xzh xzhVar) {
        super(2, mt5Var);
        this.t = (byte) 18;
        this.w = str;
        this.v = obj;
        this.x = n13Var;
        this.y = a2Var;
        this.z = xzhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object invokeSuspend$ads_mobile_sdk$b30(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r71.invokeSuspend$ads_mobile_sdk$b30(java.lang.Object):java.lang.Object");
    }

    private final Object invokeSuspend$ads_mobile_sdk$lj3(Object obj) {
        px5 px5Var = px5.a;
        boolean z = this.u;
        if (!z) {
            ybh.y(obj);
            nj3 nj3Var = (nj3) this.v;
            cy0 cy0Var = ((sy0) this.w).a;
            String str = (String) this.x;
            String str2 = (String) this.y;
            String str3 = (String) this.z;
            this.u = true;
            int i = nj3.Y;
            if (nj3Var.a(cy0Var, str, str2, str3, this) == px5Var) {
                return px5Var;
            }
        } else {
            if (!z) {
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ybh.y(obj);
        }
        return Unit.a;
    }

    private final Object invokeSuspend$ads_mobile_sdk$qc2(Object obj) {
        sc2 sc2Var;
        pfe pfeVar;
        Pair pair;
        px5 px5Var = px5.a;
        boolean z = this.u;
        if (!z) {
            ybh.y(obj);
            sc2Var = (sc2) this.y;
            pfe pfeVar2 = sc2Var.l;
            Pair pair2 = (Pair) this.z;
            this.v = pfeVar2;
            this.w = sc2Var;
            this.x = pair2;
            this.u = true;
            if (pfeVar2.i(this) == px5Var) {
                return px5Var;
            }
            pfeVar = pfeVar2;
            pair = pair2;
        } else {
            if (!z) {
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pair = (Pair) this.x;
            sc2Var = (sc2) this.w;
            pfeVar = (pfe) this.v;
            ybh.y(obj);
        }
        try {
            return Boolean.valueOf(sc2Var.m.remove(pair));
        } finally {
            pfeVar.l((Object) null);
        }
    }

    private final Object invokeSuspend$ads_mobile_sdk$qr1(Object obj) {
        px5 px5Var = px5.a;
        boolean z = this.u;
        if (!z) {
            ybh.y(obj);
            rr1 rr1Var = (rr1) this.v;
            ViewGroup viewGroup = (ViewGroup) this.w;
            ev2 ev2Var = (ev2) this.x;
            Activity activity = (Activity) this.y;
            Window window = (Window) this.z;
            cy0 cy0Var = rr1Var.h;
            sy0 sy0Var = rr1Var.g;
            this.u = true;
            if (rr1Var.a(viewGroup, ev2Var, activity, window, cy0Var, sy0Var, this) == px5Var) {
                return px5Var;
            }
        } else {
            if (!z) {
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ybh.y(obj);
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0079 -> B:15:0x007b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r71.o(java.lang.Object):java.lang.Object");
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.z;
        switch (b) {
            case 0:
                r71 r71Var = new r71(this.w, this.x, this.y, obj2, mt5Var, (byte) 0);
                r71Var.v = obj;
                return r71Var;
            case 1:
                return new r71((gbc) this.v, (afe) this.w, (ajl) this.x, (dil) this.y, (k0b) obj2, mt5Var, (byte) 1);
            case 2:
                return new r71((qs3) this.v, (mil) this.w, (gbc) this.x, (ojl) this.y, (i9f) obj2, mt5Var, (byte) 2);
            case 3:
                return new r71((sa6) this.y, (String) obj2, mt5Var, (byte) 3);
            case 4:
                return new r71((g77) this.v, (t9f) this.w, (Uri) this.x, (jcl) this.y, (swh) obj2, mt5Var, (byte) 4);
            case 5:
                r71 r71Var2 = new r71((eqa) this.x, (String) this.y, (Map) obj2, mt5Var, (byte) 5);
                r71Var2.v = obj;
                return r71Var2;
            case 6:
                r71 r71Var3 = new r71(this.w, this.x, this.y, obj2, mt5Var, (byte) 6);
                r71Var3.v = obj;
                return r71Var3;
            case 7:
                return new r71((u6c) this.v, (ndf) this.w, (afe) this.x, (Function1) this.y, (List) obj2, mt5Var, (byte) 7);
            case 8:
                return new r71((bza) this.v, (ylh) this.w, (apj) this.x, (y55) this.y, (jva) obj2, mt5Var, (byte) 8);
            case 9:
                r71 r71Var4 = new r71((hoh) this.x, (goh) this.y, (d9e) obj2, mt5Var, (byte) 9);
                r71Var4.v = obj;
                return r71Var4;
            case 10:
                return new r71((shf) this.v, (jqi) this.w, (iqi) this.x, (String) this.y, (xbf) obj2, mt5Var, (byte) 10);
            case 11:
                r71 r71Var5 = new r71((Function2) this.x, (String) this.y, (SettingsManager) obj2, mt5Var, (byte) 11);
                r71Var5.v = obj;
                return r71Var5;
            case 12:
                r71 r71Var6 = new r71(this.w, this.x, this.y, obj2, mt5Var, (byte) 12);
                r71Var6.v = obj;
                return r71Var6;
            case 13:
                r71 r71Var7 = new r71(this.w, this.x, this.y, obj2, mt5Var, (byte) 13);
                r71Var7.v = obj;
                return r71Var7;
            case 14:
                r71 r71Var8 = new r71(this.w, this.x, this.y, obj2, mt5Var, (byte) 14);
                r71Var8.v = obj;
                return r71Var8;
            case 15:
                r71 r71Var9 = new r71((dzl) this.x, (spi) this.y, (pqh) obj2, mt5Var, (byte) 15);
                r71Var9.v = obj;
                return r71Var9;
            case 16:
                return new r71((ftn) obj2, mt5Var);
            case 17:
                return new r71((p30) this.x, (AtomicReference) this.y, (Long) obj2, mt5Var, (byte) 17);
            case 18:
                return new r71((String) this.w, this.v, mt5Var, (n13) this.x, (a2) this.y, (xzh) obj2);
            case 19:
                return new r71((nj3) this.v, (sy0) this.w, (String) this.x, (String) this.y, (String) obj2, mt5Var, (byte) 19);
            case 20:
                return new r71((sc2) this.y, (Pair) obj2, mt5Var, (byte) 20);
            case 21:
                return new r71((rr1) this.v, (ViewGroup) this.w, (ev2) this.x, (Activity) this.y, (Window) obj2, mt5Var, (byte) 21);
            default:
                return new r71((yjo) this.v, (yjo) this.w, (n1p) this.x, (agm) this.y, (ylp) obj2, mt5Var, (byte) 22);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
                break;
            case 11:
                create((z1h) obj, (mt5) obj2).invokeSuspend(Unit.a);
                break;
            case 20:
                break;
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0524 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013e  */
    /* JADX WARN: Type inference failed for: r1v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v49, types: [txi] */
    /* JADX WARN: Type inference failed for: r1v70, types: [java.lang.Object, txi] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.Object, unb] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x012b -> B:45:0x012f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        /*
            Method dump skipped, instructions count: 2610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r71.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
