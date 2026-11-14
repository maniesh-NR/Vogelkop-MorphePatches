package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class qae extends kuk implements Function2 {
    public final /* synthetic */ pqh A;
    public final /* synthetic */ float B;
    public final /* synthetic */ sae C;
    public final /* synthetic */ float D;
    public final /* synthetic */ spi E;
    public lqh t;
    public lqh u;
    public int v;
    public byte w;
    public /* synthetic */ Object x;
    public final /* synthetic */ mqh y;
    public final /* synthetic */ pqh z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qae(mqh mqhVar, pqh pqhVar, pqh pqhVar2, float f, sae saeVar, float f2, spi spiVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.y = mqhVar;
        this.z = pqhVar;
        this.A = pqhVar2;
        this.B = f;
        this.C = saeVar;
        this.D = f2;
        this.E = spiVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        qae qaeVar = new qae(this.y, this.z, this.A, this.B, this.C, this.D, this.E, mt5Var);
        qaeVar.x = obj;
        return qaeVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((qpi) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x019c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x018e -> B:36:0x018f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x019c -> B:14:0x0068). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qae.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
