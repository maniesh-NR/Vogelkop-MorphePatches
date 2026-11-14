package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class oz1 extends kuk implements Function2 {
    public Object A;
    public Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte t = 0;
    public boolean u;
    public Object v;
    public Object w;
    public Serializable x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz1(ArrayList arrayList, tz1 tz1Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.C = arrayList;
        this.w = tz1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz1(p12 p12Var, String str, z21 z21Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.A = p12Var;
        this.B = str;
        this.C = z21Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.C;
        switch (b) {
            case 0:
                return new oz1((ArrayList) obj2, (tz1) this.w, mt5Var);
            default:
                oz1 oz1Var = new oz1((p12) this.A, (String) this.B, (z21) obj2, mt5Var);
                oz1Var.z = obj;
                return oz1Var;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
        }
        return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0261  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x015e -> B:29:0x0160). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0254 -> B:63:0x0258). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oz1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
