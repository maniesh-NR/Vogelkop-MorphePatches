package ads_mobile_sdk;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import defpackage.fsg;
import defpackage.prb;
import defpackage.zhl;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class hg0 {
    public final nx5 a;
    public final cg0 b;
    public final qr0 c;
    public final String d;
    public final String e;
    public final prb f;
    public final kh3 g;
    public PointF h = new PointF(-1.0f, -1.0f);
    public PointF i = new PointF(-1.0f, -1.0f);
    public eg0 j = eg0.d;
    public final int k;
    public d3k l;

    public hg0(Context context, nx5 nx5Var, cg0 cg0Var, qr0 qr0Var, String str, String str2, prb prbVar, kh3 kh3Var) {
        this.a = nx5Var;
        this.b = cg0Var;
        this.c = qr0Var;
        this.d = str;
        this.e = str2;
        this.f = prbVar;
        this.g = kh3Var;
        this.k = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        if (ads_mobile_sdk.cg0.a(r1, r2, r3, r4, r9, r6) == r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.hg0 r9, nt5 r10) {
        /*
            boolean r0 = r10 instanceof ads_mobile_sdk.gg0
            if (r0 == 0) goto L14
            r0 = r10
            ads_mobile_sdk.gg0 r0 = (ads_mobile_sdk.gg0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ads_mobile_sdk.gg0 r0 = new ads_mobile_sdk.gg0
            r0.<init>(r9, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.b
            px5 r0 = px5.a
            int r1 = r6.d
            r2 = 0
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r4) goto L2d
            defpackage.ybh.y(r10)
            goto L7e
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r9)
            return r2
        L33:
            ads_mobile_sdk.hg0 r9 = r6.a
            defpackage.ybh.y(r10)
            goto L5f
        L39:
            defpackage.ybh.y(r10)
            ads_mobile_sdk.qr0 r10 = r9.c
            r10.getClass()
            on7 r1 = pn7.b
            un7 r1 = un7.e
            pn7 r1 = u0h.b(r4, r1)
            ads_mobile_sdk.fo r5 = ads_mobile_sdk.fo.a$18
            java.lang.String r7 = "gads:debug_hold_gesture:time_millis"
            java.lang.Object r10 = r10.a(r7, r1, r5)
            pn7 r10 = (pn7) r10
            long r7 = r10.a
            r6.a = r9
            r6.d = r3
            java.lang.Object r10 = defpackage.nb6.q(r7, r6)
            if (r10 == r0) goto L7d
        L5f:
            ads_mobile_sdk.eg0 r10 = ads_mobile_sdk.eg0.c
            r9.j = r10
            ads_mobile_sdk.cg0 r1 = r9.b
            r10 = r2
            java.lang.String r2 = r9.d
            java.lang.String r3 = r9.e
            r5 = r4
            prb r4 = r9.f
            ads_mobile_sdk.kh3 r9 = r9.g
            r6.a = r10
            r6.d = r5
            r1.getClass()
            r5 = r9
            java.lang.Object r9 = ads_mobile_sdk.cg0.a(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L7e
        L7d:
            return r0
        L7e:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.hg0.a(ads_mobile_sdk.hg0, nt5):java.lang.Object");
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.j = eg0.a;
            this.h = new PointF(motionEvent.getX(), motionEvent.getY());
            return;
        }
        eg0 eg0Var = this.j;
        if (eg0Var != eg0.d) {
            mt5 mt5Var = null;
            if (eg0Var == eg0.a && actionMasked == 5) {
                this.j = eg0.b;
                this.i = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.l = defpackage.na2.B(this.a, h.a, null, new fsg(new zhl((byte) 17, mt5Var, (Object) this), mt5Var, (byte) 3), 2);
                return;
            }
            if (eg0Var == eg0.b) {
                if (pointerCount == 2) {
                    if (actionMasked != 2) {
                        return;
                    }
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i >= historySize) {
                            break;
                        }
                        if (!a(motionEvent.getHistoricalX(0, i), motionEvent.getHistoricalY(0, i), motionEvent.getHistoricalX(1, i), motionEvent.getHistoricalY(1, i))) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                    if (a(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                        return;
                    }
                }
                d3k d3kVar = this.l;
                if (d3kVar != null) {
                    d3kVar.k((CancellationException) null);
                }
                this.j = eg0.d;
            }
        }
    }

    public final boolean a(float f, float f2, float f3, float f4) {
        float fAbs = Math.abs(this.h.x - f);
        float f5 = this.k;
        return fAbs < f5 && Math.abs(this.h.y - f2) < f5 && Math.abs(this.i.x - f3) < f5 && Math.abs(this.i.y - f4) < f5;
    }
}
