package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;

/* loaded from: classes.dex */
public final class rue extends PagerAdapter {
    public final /* synthetic */ sue a;

    public rue(sue sueVar) {
        this.a = sueVar;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        ((View) obj).setVisibility(4);
    }

    public final int getCount() {
        return ((j82) this.a.b) == null ? 1 : 3;
    }

    public final int getItemPosition(Object obj) {
        return -2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object instantiateItem(android.view.ViewGroup r5, int r6) {
        /*
            r4 = this;
            r5 = 2
            r0 = 1
            sue r4 = r4.a
            if (r6 == 0) goto L1b
            if (r6 == r0) goto L18
            if (r6 != r5) goto Ld
            android.widget.ImageView r1 = r4.t
            goto L1d
        Ld:
            java.lang.String r4 = "Invalid position: "
            java.lang.String r4 = defpackage.sko.i(r6, r4)
            defpackage.qp2.o(r4)
            r4 = 0
            return r4
        L18:
            android.widget.ImageView r1 = r4.s
            goto L1d
        L1b:
            android.widget.ImageView r1 = r4.g
        L1d:
            ga6 r2 = r4.j
            ga6 r3 = r4.j
            if (r2 != 0) goto L24
            return r1
        L24:
            r2 = 0
            r1.setVisibility(r2)
            if (r6 != 0) goto L2e
            defpackage.sue.v0(r4)
            return r1
        L2e:
            if (r6 != r0) goto L5d
            jre r5 = r4.w0()
            android.net.Uri r5 = r5.D
            if (r3 == 0) goto L55
            java.lang.Object r6 = r3.b
            android.graphics.Point r6 = (android.graphics.Point) r6
            int r0 = r6.x
            if (r0 <= 0) goto L55
            int r0 = r6.y
            if (r0 <= 0) goto L55
            r9i r4 = r4.u0()
            java.lang.Object r4 = r4.b
            uqe r4 = (defpackage.uqe) r4
            int r0 = r6.x
            int r6 = r6.y
            java.lang.String r4 = r4.m(r5, r0, r6)
            goto L59
        L55:
            java.lang.String r4 = r5.toString()
        L59:
            defpackage.gu8.g0(r4, r1, r3)
            return r1
        L5d:
            if (r6 != r5) goto L8b
            jre r5 = r4.w0()
            android.net.Uri r5 = r5.E
            if (r3 == 0) goto L84
            java.lang.Object r6 = r3.b
            android.graphics.Point r6 = (android.graphics.Point) r6
            int r0 = r6.x
            if (r0 <= 0) goto L84
            int r0 = r6.y
            if (r0 <= 0) goto L84
            r9i r4 = r4.u0()
            java.lang.Object r4 = r4.b
            uqe r4 = (defpackage.uqe) r4
            int r0 = r6.x
            int r6 = r6.y
            java.lang.String r4 = r4.m(r5, r0, r6)
            goto L88
        L84:
            java.lang.String r4 = r5.toString()
        L88:
            defpackage.gu8.g0(r4, r1, r3)
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rue.instantiateItem(android.view.ViewGroup, int):java.lang.Object");
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return obj == view;
    }
}
