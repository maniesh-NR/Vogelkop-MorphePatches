package defpackage;

import android.text.Spanned;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class exj extends j0i implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ s15 B;
    public Object[] u;
    public int v;
    public int w;
    public boolean x;
    public /* synthetic */ Object y;
    public final /* synthetic */ Spanned z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exj(Spanned spanned, int i, s15 s15Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.z = spanned;
        this.A = i;
        this.B = s15Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        exj exjVar = new exj(this.z, this.A, this.B, mt5Var);
        exjVar.y = obj;
        return exjVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((l1j) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004a -> B:19:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004c -> B:19:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.y
            l1j r0 = (l1j) r0
            px5 r1 = px5.a
            boolean r2 = r10.x
            r3 = 1
            android.text.Spanned r4 = r10.z
            if (r2 == 0) goto L20
            if (r2 != r3) goto L19
            int r2 = r10.w
            int r5 = r10.v
            java.lang.Object[] r6 = r10.u
            ybh.y(r11)
            goto L63
        L19:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r10)
            r10 = 0
            return r10
        L20:
            ybh.y(r11)
            s15 r11 = r10.B
            java.lang.Class r11 = r11.a()
            r2 = 0
            int r5 = r10.A
            java.lang.Object[] r11 = r4.getSpans(r2, r5, r11)
            if (r11 != 0) goto L35
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        L35:
            int r5 = r11.length
            r6 = r5
            r5 = r2
            r2 = r6
            r6 = r11
        L3a:
            if (r5 >= r2) goto L65
            r11 = r6[r5]
            int r7 = r4.getSpanStart(r11)
            int r8 = r4.getSpanEnd(r11)
            int r9 = r4.getSpanFlags(r11)
            if (r7 < 0) goto L63
            if (r8 < 0) goto L63
            pwj r4 = new pwj
            r4.<init>(r7, r8, r9, r11)
            r10.y = r0
            r10.u = r6
            r10.v = r5
            r10.w = r2
            r10.x = r3
            r0.a(r10, r4)
            px5 r10 = px5.a
            return r1
        L63:
            int r5 = r5 + r3
            goto L3a
        L65:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
