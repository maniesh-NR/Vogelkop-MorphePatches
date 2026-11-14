package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ac3 extends j0i implements Function2 {
    public final /* synthetic */ byte u = 1;
    public boolean v;
    public /* synthetic */ Object w;
    public Object x;
    public Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac3(d82 d82Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.z = d82Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac3(nx5 nx5Var, ztl ztlVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.y = nx5Var;
        this.z = ztlVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.u;
        Object obj2 = this.z;
        switch (b) {
            case 0:
                ac3 ac3Var = new ac3((nx5) this.y, (ztl) obj2, mt5Var);
                ac3Var.w = obj;
                return ac3Var;
            default:
                ac3 ac3Var2 = new ac3((d82) obj2, mt5Var);
                ac3Var2.w = obj;
                return ac3Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.u) {
            case 0:
                create((uuk) obj, (mt5) obj2).invokeSuspend(Unit.a);
                return px5.a;
            default:
                return create((l1j) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008f -> B:25:0x0093). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.u
            java.lang.Object r1 = r8.z
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L61;
                default: goto Lb;
            }
        Lb:
            java.lang.Object r0 = r8.w
            l1j r0 = (defpackage.l1j) r0
            px5 r5 = px5.a
            boolean r6 = r8.v
            if (r6 == 0) goto L27
            if (r6 != r3) goto L23
            java.lang.Object r1 = r8.y
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r2 = r8.x
            android.graphics.RectF r2 = (android.graphics.RectF) r2
            defpackage.ybh.y(r9)
            goto L39
        L23:
            qp2.n(r2)
            goto L60
        L27:
            defpackage.ybh.y(r9)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            d82 r1 = (d82) r1
            java.lang.Object r9 = r1.b
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r1 = r9.iterator()
        L39:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L5e
            java.lang.Object r9 = r1.next()
            android.graphics.PointF r9 = (android.graphics.PointF) r9
            float r4 = r9.x
            r2.left = r4
            float r9 = r9.y
            r2.top = r9
            r2.right = r4
            r2.bottom = r9
            r8.w = r0
            r8.x = r2
            r8.y = r1
            r8.v = r3
            r0.a(r8, r2)
            r4 = r5
            goto L60
        L5e:
            kotlin.Unit r4 = kotlin.Unit.a
        L60:
            return r4
        L61:
            ztl r1 = (defpackage.ztl) r1
            px5 r0 = px5.a
            boolean r5 = r8.v
            if (r5 == 0) goto L7b
            if (r5 != r3) goto L77
            java.lang.Object r2 = r8.x
            gmg r2 = (defpackage.gmg) r2
            java.lang.Object r5 = r8.w
            uuk r5 = (defpackage.uuk) r5
            defpackage.ybh.y(r9)
            goto L93
        L77:
            qp2.n(r2)
            goto L92
        L7b:
            defpackage.ybh.y(r9)
            java.lang.Object r9 = r8.w
            uuk r9 = (defpackage.uuk) r9
            gmg r2 = defpackage.gmg.b
            r5 = r9
        L85:
            r8.w = r5
            r8.x = r2
            r8.v = r3
            java.lang.Object r9 = r5.a(r2, r8)
            if (r9 != r0) goto L93
            r4 = r0
        L92:
            return r4
        L93:
            fmg r9 = (defpackage.fmg) r9
            java.util.List r6 = r9.a
            r7 = 0
            java.lang.Object r6 = r6.get(r7)
            lmg r6 = (defpackage.lmg) r6
            byte r6 = r6.i
            r7 = 2
            if (r6 != r7) goto L85
            byte r9 = r9.f
            r6 = 4
            if (r9 != r6) goto Lb6
            java.lang.Object r9 = r8.y
            nx5 r9 = (nx5) r9
            vb3 r6 = new vb3
            r6.<init>(r1, r4, r7)
            r7 = 3
            defpackage.na2.B(r9, r4, r4, r6, r7)
            goto L85
        Lb6:
            r6 = 5
            if (r9 != r6) goto L85
            r1.a()
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ac3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
