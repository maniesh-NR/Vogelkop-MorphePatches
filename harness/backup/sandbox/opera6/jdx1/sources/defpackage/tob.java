package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class tob extends j0i implements Function2 {
    public final /* synthetic */ byte u;
    public byte v;
    public /* synthetic */ Object w;
    public Object x;
    public Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tob(byte b, mt5 mt5Var, Object obj) {
        super(2, mt5Var);
        this.u = b;
        this.z = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tob(ro9 ro9Var, eyi eyiVar, mgl mglVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.u = (byte) 2;
        this.x = ro9Var;
        this.y = eyiVar;
        this.z = mglVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.u;
        Object obj2 = this.z;
        switch (b) {
            case 0:
                tob tobVar = new tob((byte) 0, mt5Var, (xob) obj2);
                tobVar.w = obj;
                return tobVar;
            case 1:
                tob tobVar2 = new tob((byte) 1, mt5Var, (gu6) obj2);
                tobVar2.w = obj;
                return tobVar2;
            case 2:
                tob tobVar3 = new tob((ro9) this.x, (eyi) this.y, (mgl) obj2, mt5Var);
                tobVar3.w = obj;
                return tobVar3;
            default:
                tob tobVar4 = new tob((byte) 3, mt5Var, (rjk) obj2);
                tobVar4.w = obj;
                return tobVar4;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.u) {
        }
        return create((uuk) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0230, code lost:
    
        if (r3 != r1) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (r10 != r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0327, code lost:
    
        if (defpackage.dgh.j(r5, r2, r1, r6, r18) != r3) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x033f, code lost:
    
        if (defpackage.dgh.o(r5, r8, r6, r18) == r3) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x034a, code lost:
    
        if (defpackage.dgh.p(r5, r8, r6, r1, r18) == r3) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0396, code lost:
    
        if (r5 != r2) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03b7, code lost:
    
        if (r3 == r2) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x01ab, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ca, code lost:
    
        if (r3 != r1) goto L36;
     */
    /* JADX WARN: Path cross not found for [B:27:0x00ad, B:22:0x008d], limit reached: 298 */
    /* JADX WARN: Path cross not found for [B:30:0x00b2, B:32:0x00b7], limit reached: 298 */
    /* JADX WARN: Removed duplicated region for block: B:175:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0453  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x0230 -> B:130:0x0234). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:208:0x03b7 -> B:210:0x03bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:239:0x0455 -> B:241:0x046a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ca -> B:36:0x00cc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tob.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
