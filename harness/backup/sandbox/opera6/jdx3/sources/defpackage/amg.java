package defpackage;

import android.graphics.Rect;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class amg implements dmg {
    public static final Rect d = new Rect();
    public final x5f a;
    public final uqe b;
    public final LinkedHashSet c = new LinkedHashSet();

    public amg(x5f x5fVar, uqe uqeVar) {
        this.a = x5fVar;
        this.b = uqeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // defpackage.dmg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.j82 r3, defpackage.ov0 r4, defpackage.cmg r5, int r6, int r7) {
        /*
            r2 = this;
            r7 = 100
            r0 = 0
            if (r6 == 0) goto L1c
            android.view.View r4 = r4.b
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            int r6 = r4.getWidth()
            int r1 = r4.getHeight()
            int r1 = r1 * r6
            if (r1 == 0) goto L1c
            android.graphics.Rect r6 = defpackage.amg.d
            boolean r4 = r4.getGlobalVisibleRect(r6)
            if (r4 != 0) goto L1e
        L1c:
            r6 = r0
            goto L29
        L1e:
            int r4 = r6.width()
            int r6 = r6.height()
            int r6 = r6 * r4
            int r6 = r6 * r7
            int r6 = r6 / r1
        L29:
            java.util.LinkedHashSet r4 = r2.c
            if (r6 < r7) goto L9a
            boolean r4 = r4.add(r3)
            if (r4 == 0) goto L99
            f90 r4 = r5.a
            x5f r6 = r2.a
            boolean r7 = r6.h
            if (r7 == 0) goto L3e
            r6.w(r4, r0)
        L3e:
            boolean r4 = r3 instanceof defpackage.pue
            if (r4 == 0) goto L4f
            pue r3 = (defpackage.pue) r3
            oqe r3 = r3.c
            boolean r4 = r3 instanceof defpackage.msh
            if (r4 == 0) goto L4f
            msh r3 = (defpackage.msh) r3
            p12 r3 = r3.v
            goto L50
        L4f:
            r3 = 0
        L50:
            if (r3 == 0) goto L99
            java.lang.Object r3 = r3.b
            java.lang.String r3 = (java.lang.String) r3
            f90 r4 = r5.a
            uqe r2 = r2.b
            uy8 r2 = r2.h
            f90 r5 = defpackage.f90.e
            r6 = 1
            if (r4 != r5) goto L6f
            r2.getClass()
            sy8 r4 = new sy8
            java.lang.String r5 = "podcast_in_article_card"
            r4.<init>(r5, r3, r6)
            r2.c(r4)
            return
        L6f:
            f90 r5 = defpackage.f90.f
            if (r4 != r5) goto L81
            r2.getClass()
            sy8 r4 = new sy8
            java.lang.String r5 = "podcast_in_article_detail"
            r4.<init>(r5, r3, r6)
            r2.c(r4)
            return
        L81:
            f90 r5 = defpackage.f90.b
            if (r4 != r5) goto L89
            r2.m(r0, r3)
            return
        L89:
            f90 r5 = defpackage.f90.c
            if (r4 != r5) goto L91
            r2.m(r6, r3)
            return
        L91:
            f90 r5 = defpackage.f90.d
            if (r4 != r5) goto L99
            r4 = 2
            r2.m(r4, r3)
        L99:
            return
        L9a:
            r4.remove(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amg.c(j82, ov0, cmg, int, int):void");
    }
}
