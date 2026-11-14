package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class wtj extends j0i implements Function2 {
    public long[] u;
    public int v;
    public int w;
    public byte x;
    public /* synthetic */ Object y;
    public final /* synthetic */ xtj z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wtj(xtj xtjVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.z = xtjVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        wtj wtjVar = new wtj(this.z, mt5Var);
        wtjVar.y = obj;
        return wtjVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((l1j) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0081 -> B:26:0x0098). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a9 -> B:36:0x00c4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wtj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
