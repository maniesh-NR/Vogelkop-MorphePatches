package defpackage;

import ads_mobile_sdk.cy0;
import ads_mobile_sdk.qc1;
import ads_mobile_sdk.r62;
import ads_mobile_sdk.rf1;
import ads_mobile_sdk.ry0;
import ads_mobile_sdk.st2;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class pin extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public byte u;
    public Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pin(byte b, mt5 mt5Var, Object obj) {
        super(2, mt5Var);
        this.t = b;
        this.w = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pin(Object obj, Object obj2, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj;
        this.w = obj2;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                return new pin((rin) this.v, (htm) obj2, mt5Var, (byte) 0);
            case 1:
                return new pin((byte) 1, mt5Var, (b1o) obj2);
            case 2:
                return new pin((rf1) this.v, (on) obj2, mt5Var, (byte) 2);
            case 3:
                return new pin((ry0) this.v, (Uri) obj2, mt5Var, (byte) 3);
            case 4:
                return new pin((byte) 4, mt5Var, (r62) obj2);
            case 5:
                return new pin((byte) 5, mt5Var, (qc1) obj2);
            case 6:
                return new pin((rf1) this.v, (Function1) obj2, mt5Var, (byte) 6);
            case 7:
                return new pin((ry0) this.v, (WebResourceRequest) obj2, mt5Var, (byte) 7);
            case 8:
                pin pinVar = new pin((byte) 8, mt5Var, (st2) obj2);
                pinVar.v = obj;
                return pinVar;
            default:
                return new pin((byte) 9, mt5Var, (cy0) obj2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        Object obj3 = this.w;
        switch (b) {
            case 0:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 2:
                return new pin((rf1) this.v, (on) obj3, (mt5) obj2, (byte) 2).invokeSuspend(Unit.a);
            case 3:
                return new pin((ry0) this.v, (Uri) obj3, (mt5) obj2, (byte) 3).invokeSuspend(Unit.a);
            case 4:
                return new pin((byte) 4, (mt5) obj2, (r62) obj3).invokeSuspend(Unit.a);
            case 5:
                return new pin((byte) 5, (mt5) obj2, (qc1) obj3).invokeSuspend(Unit.a);
            case 6:
                return new pin((rf1) this.v, (Function1) obj3, (mt5) obj2, (byte) 6).invokeSuspend(Unit.a);
            case 7:
                return new pin((ry0) this.v, (WebResourceRequest) obj3, (mt5) obj2, (byte) 7).invokeSuspend(Unit.a);
            case 8:
                pin pinVar = new pin((byte) 8, (mt5) obj2, (st2) obj3);
                pinVar.v = (nx5) obj;
                return pinVar.invokeSuspend(Unit.a);
            default:
                return new pin((byte) 9, (mt5) obj2, (cy0) obj3).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x021c, code lost:
    
        if (ads_mobile_sdk.f72.a(r8, r1, (nt5) r23) == r9) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x026b, code lost:
    
        if (r0.a((mt5) r23) != r9) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0278, code lost:
    
        if (r0.a((mt5) r23) == r9) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02c8, code lost:
    
        if (r1.n(r23) == r0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x030a, code lost:
    
        if (ads_mobile_sdk.sb.a(r2, r0, (nt5) r23) == r1) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0373, code lost:
    
        if (defpackage.na2.Z(r2, r8, r23) != r0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03ee, code lost:
    
        if (r1.d.h(r2, r23) == r0) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (r0 == r9) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0138, code lost:
    
        if (r1.n(r23) == r0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0170, code lost:
    
        if (r1.invoke(r23) == r0) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e4 -> B:33:0x00a3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pin.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
