package defpackage;

import com.opera.android.live_score.data.db.LiveScoreDatabase_Impl;
import java.util.EnumSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class r3 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r3(byte b, mt5 mt5Var, Object obj) {
        super(2, mt5Var);
        this.t = b;
        this.w = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r3(Object obj, Object obj2, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj;
        this.w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(mt5 mt5Var, LiveScoreDatabase_Impl liveScoreDatabase_Impl, Function1 function1) {
        super(2, mt5Var);
        this.t = (byte) 24;
        this.v = liveScoreDatabase_Impl;
        this.w = function1;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                return new r3((lde) this.v, (cma) obj2, mt5Var, (byte) 0);
            case 1:
                return new r3((lde) this.v, (dma) obj2, mt5Var, (byte) 1);
            case 2:
                r3 r3Var = new r3((byte) 2, mt5Var, obj2);
                r3Var.v = obj;
                return r3Var;
            case 3:
                r3 r3Var2 = new r3((byte) 3, mt5Var, obj2);
                r3Var2.v = obj;
                return r3Var2;
            case 4:
                return new r3((tz1) this.v, (vr9) obj2, mt5Var, (byte) 4);
            case 5:
                r3 r3Var3 = new r3((byte) 5, mt5Var, obj2);
                r3Var3.v = obj;
                return r3Var3;
            case 6:
                r3 r3Var4 = new r3((byte) 6, mt5Var, obj2);
                r3Var4.v = obj;
                return r3Var4;
            case 7:
                return new r3((qg9) this.v, (ztl) obj2, mt5Var, (byte) 7);
            case 8:
                r3 r3Var5 = new r3((byte) 8, mt5Var, obj2);
                r3Var5.v = obj;
                return r3Var5;
            case 9:
                return new r3((ns3) this.v, (voh) obj2, mt5Var, (byte) 9);
            case 10:
                return new r3((us3) this.v, (hv) obj2, mt5Var, (byte) 10);
            case 11:
                r3 r3Var6 = new r3((byte) 11, mt5Var, obj2);
                r3Var6.v = obj;
                return r3Var6;
            case 12:
                r3 r3Var7 = new r3((byte) 12, mt5Var, obj2);
                r3Var7.v = obj;
                return r3Var7;
            case 13:
                r3 r3Var8 = new r3((byte) 13, mt5Var, obj2);
                r3Var8.v = obj;
                return r3Var8;
            case 14:
                return new r3((u0i) this.v, (rj4) obj2, mt5Var, (byte) 14);
            case 15:
                r3 r3Var9 = new r3((byte) 15, mt5Var, obj2);
                r3Var9.v = obj;
                return r3Var9;
            case 16:
                r3 r3Var10 = new r3((byte) 16, mt5Var, obj2);
                r3Var10.v = obj;
                return r3Var10;
            case 17:
                return new r3((f99) this.v, (i1j) obj2, mt5Var, (byte) 17);
            case 18:
                return new r3((ls4) this.v, (EnumSet) obj2, mt5Var, (byte) 18);
            case 19:
                return new r3((c65) this.v, (Function1) obj2, mt5Var, (byte) 19);
            case 20:
                return new r3((lg5) this.v, (Runnable) obj2, mt5Var, (byte) 20);
            case 21:
                return new r3((rg5) this.v, (pej) obj2, mt5Var, (byte) 21);
            case 22:
                return new r3((dil) this.v, (qs3) obj2, mt5Var, (byte) 22);
            case 23:
                return new r3((pmg) this.v, (dil) obj2, mt5Var, (byte) 23);
            case 24:
                return new r3(mt5Var, (LiveScoreDatabase_Impl) this.v, (Function1) obj2);
            case 25:
                r3 r3Var11 = new r3((byte) 25, mt5Var, obj2);
                r3Var11.v = obj;
                return r3Var11;
            case 26:
                return new r3((Function2) this.v, (jb6) obj2, mt5Var, (byte) 26);
            case 27:
                r3 r3Var12 = new r3((byte) 27, mt5Var, obj2);
                r3Var12.v = obj;
                return r3Var12;
            case 28:
                r3 r3Var13 = new r3((byte) 28, mt5Var, obj2);
                r3Var13.v = obj;
                return r3Var13;
            default:
                r3 r3Var14 = new r3((byte) 29, mt5Var, obj2);
                r3Var14.v = obj;
                return r3Var14;
        }
    }

    public final Object invoke(Object obj, Object obj2) throws pxb {
        switch (this.t) {
            case 2:
                create((a9b) obj, (mt5) obj2).invokeSuspend(Unit.a);
                break;
        }
        return create((ggb) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:433:0x0793, code lost:
    
        if (r5.Q() == r0) goto L382;
     */
    /* JADX WARN: Path cross not found for [B:340:0x06b5, B:333:0x06a3], limit reached: 501 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x07b4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:345:0x06ea -> B:347:0x06ee). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws pxb {
        /*
            Method dump skipped, instructions count: 2208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
