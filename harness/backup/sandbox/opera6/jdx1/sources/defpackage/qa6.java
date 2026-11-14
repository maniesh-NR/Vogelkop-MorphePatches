package defpackage;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class qa6 extends kuk implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte t;
    public Object u;
    public byte v;
    public Object w;
    public Object x;
    public Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qa6(Object obj, Object obj2, Object obj3, Object obj4, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
        this.A = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qa6(Object obj, Object obj2, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.z = obj;
        this.A = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa6(nfe nfeVar, Function1 function1, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 3;
        hfe hfeVar = hfe.a;
        this.z = nfeVar;
        this.A = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa6(sa6 sa6Var, v1e v1eVar, eek eekVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 0;
        this.y = sa6Var;
        this.z = v1eVar;
        this.A = eekVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.A;
        Object obj3 = this.z;
        switch (b) {
            case 0:
                qa6 qa6Var = new qa6((sa6) this.y, (v1e) obj3, (eek) obj2, mt5Var);
                qa6Var.u = obj;
                return qa6Var;
            case 1:
                qa6 qa6Var2 = new qa6(obj3, obj2, mt5Var, (byte) 1);
                qa6Var2.y = obj;
                return qa6Var2;
            case 2:
                qa6 qa6Var3 = new qa6((ks3) this.x, (Uri) this.y, (kcl) obj3, (lqh) obj2, mt5Var, (byte) 2);
                qa6Var3.u = obj;
                return qa6Var3;
            case 3:
                hfe hfeVar = hfe.a;
                qa6 qa6Var4 = new qa6((nfe) obj3, (Function1) obj2, mt5Var);
                qa6Var4.y = obj;
                return qa6Var4;
            case 4:
                qa6 qa6Var5 = new qa6((pqh) this.x, (fme) this.y, (pqh) obj3, (joe) obj2, mt5Var, (byte) 4);
                qa6Var5.u = obj;
                return qa6Var5;
            default:
                return new qa6(obj3, obj2, mt5Var, (byte) 5);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((l99) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create(obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 2:
                return create((is4) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 3:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 4:
                return create((poe) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: i3k */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0605, code lost:
    
        if (defpackage.j14.F(r0, r4, r18) == r3) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        if (r0 != r10) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fa, code lost:
    
        if (r0 != r10) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x019c, code lost:
    
        if (r0 == r4) goto L72;
     */
    /* JADX WARN: Path cross not found for [B:221:0x0540, B:227:0x0565], limit reached: 295 */
    /* JADX WARN: Path cross not found for [B:227:0x0565, B:221:0x0540], limit reached: 295 */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0592  */
    /* JADX WARN: Type inference failed for: r3v3, types: [byte, pfe] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:226:0x0563 -> B:221:0x0540). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:228:0x058e -> B:221:0x0540). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qa6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
