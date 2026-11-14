package defpackage;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class mx1 extends kuk implements Function2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ ole B;
    public final /* synthetic */ LinkedHashMap C;
    public final /* synthetic */ qca D;
    public File t;
    public ole u;
    public Map v;
    public qca w;
    public Iterator x;
    public boolean y;
    public final /* synthetic */ esk z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx1(esk eskVar, List list, ole oleVar, LinkedHashMap linkedHashMap, qca qcaVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.z = eskVar;
        this.A = list;
        this.B = oleVar;
        this.C = linkedHashMap;
        this.D = qcaVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new mx1(this.z, this.A, this.B, this.C, this.D, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x012f, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Path cross not found for [B:114:0x00ef, B:43:0x012a], limit reached: 124 */
    /* JADX WARN: Path cross not found for [B:25:0x00c5, B:47:0x0136], limit reached: 124 */
    /* JADX WARN: Path cross not found for [B:34:0x00eb, B:30:0x00dd], limit reached: 124 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x012f A[EDGE_INSN: B:123:0x012f->B:45:0x012f BREAK  A[LOOP:1: B:26:0x00c9->B:46:0x0131], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0131 A[LOOP:1: B:26:0x00c9->B:46:0x0131, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0223  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0056 -> B:96:0x021c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01f2 -> B:97:0x021e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mx1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
