package defpackage;

import android.util.DisplayMetrics;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.leanplum.messagetemplates.MessageTemplateConstants;

/* loaded from: classes.dex */
public class y1c extends ifc {
    public static final long e;
    public static final DecelerateInterpolator f;
    public final RecyclerView a;
    public final LinearLayoutManager b;
    public final qsh c;
    public boolean d;

    static {
        on7 on7Var = pn7.b;
        e = cs5.x0(MessageTemplateConstants.Values.CENTER_POPUP_WIDTH, un7.d);
        f = lf1.e;
    }

    public y1c(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, qsh qshVar) {
        super(recyclerView.getContext());
        this.a = recyclerView;
        this.b = linearLayoutManager;
        this.c = qshVar;
    }

    public boolean a(int i) {
        return true;
    }

    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSeekTargetStep(int r11, int r12, vph r13, sph r14) {
        /*
            r10 = this;
            boolean r0 = r10.d
            if (r0 != 0) goto L9a
            int r0 = r10.getTargetPosition()
            androidx.recyclerview.widget.LinearLayoutManager r1 = r10.b
            boolean r2 = r1.canScrollHorizontally()
            int r3 = r1.findFirstVisibleItemPosition()
            int r1 = r1.findLastVisibleItemPosition()
            r4 = 1
            r5 = 0
            r6 = -1
            if (r3 == r6) goto L85
            if (r1 == r6) goto L85
            if (r0 == r6) goto L85
            android.graphics.PointF r6 = r10.computeScrollVectorForPosition(r0)
            if (r6 == 0) goto L85
            androidx.recyclerview.widget.RecyclerView r5 = r10.a
            r7 = 0
            r8 = 0
            if (r2 == 0) goto L3d
            int r9 = r5.getLayoutDirection()
            float r6 = r6.x
            if (r9 != r4) goto L38
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L45
            goto L43
        L38:
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L45
            goto L43
        L3d:
            float r6 = r6.y
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L45
        L43:
            r6 = r4
            goto L46
        L45:
            r6 = r8
        L46:
            if (r6 == 0) goto L49
            r3 = r1
        L49:
            int r1 = java.lang.Math.min(r3, r0)
            int r0 = java.lang.Math.max(r3, r0)
            android.graphics.Point r3 = new android.graphics.Point
            r3.<init>(r8, r8)
        L56:
            if (r1 >= r0) goto L84
            boolean r7 = r10.a(r1)
            if (r7 == 0) goto L81
            qsh r7 = r10.c
            android.graphics.Point r7 = r7.b(r5, r1)
            if (r2 == 0) goto L74
            int r8 = r3.x
            int r7 = r7.x
            if (r6 == 0) goto L70
            int r8 = r8 + r7
            r3.x = r8
            goto L81
        L70:
            int r8 = r8 - r7
            r3.x = r8
            goto L81
        L74:
            int r8 = r3.y
            int r7 = r7.y
            if (r6 == 0) goto L7e
            int r8 = r8 + r7
            r3.y = r8
            goto L81
        L7e:
            int r8 = r8 - r7
            r3.y = r8
        L81:
            int r1 = r1 + 1
            goto L56
        L84:
            r5 = r3
        L85:
            if (r5 == 0) goto L9a
            r10.d = r4
            int r10 = r5.x
            int r11 = r5.y
            long r12 = defpackage.y1c.e
            long r12 = pn7.f(r12)
            int r12 = (int) r12
            android.view.animation.DecelerateInterpolator r13 = defpackage.y1c.f
            r14.b(r10, r11, r12, r13)
            return
        L9a:
            boolean r0 = r10.d
            if (r0 != 0) goto La1
            super.onSeekTargetStep(r11, r12, r13, r14)
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y1c.onSeekTargetStep(int, int, vph, sph):void");
    }
}
