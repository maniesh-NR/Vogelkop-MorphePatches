package androidx.recyclerview.widget;

import android.view.View;
import defpackage.vph;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e {
    public yhe a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public short f;

    public static int a(i iVar) {
        int i = iVar.mFlags;
        int i2 = i & 14;
        if (iVar.isInvalid()) {
            return 4;
        }
        if ((i & 4) != 0) {
            return i2;
        }
        int oldPosition = iVar.getOldPosition();
        int absoluteAdapterPosition = iVar.getAbsoluteAdapterPosition();
        return (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) ? i2 : i2 | 2048;
    }

    public abstract boolean b(i iVar, List list);

    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(androidx.recyclerview.widget.i r10) {
        /*
            r9 = this;
            yhe r9 = r9.a
            if (r9 == 0) goto L8e
            java.lang.Object r9 = r9.b
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            r0 = 1
            r10.setIsRecyclable(r0)
            androidx.recyclerview.widget.i r1 = r10.mShadowedHolder
            r2 = 0
            if (r1 == 0) goto L17
            androidx.recyclerview.widget.i r1 = r10.mShadowingHolder
            if (r1 != 0) goto L17
            r10.mShadowedHolder = r2
        L17:
            r10.mShadowingHolder = r2
            boolean r1 = r10.shouldBeKeptAsChild()
            if (r1 != 0) goto L8e
            android.view.View r1 = r10.itemView
            androidx.recyclerview.widget.g r2 = r9.c
            r9.I0()
            zv4 r3 = r9.f
            yv4 r4 = r3.b
            isd r5 = r3.a
            byte r6 = r3.d
            r7 = 0
            if (r6 != r0) goto L3d
            android.view.View r0 = r3.e
            if (r0 != r1) goto L37
        L35:
            r0 = r7
            goto L66
        L37:
            java.lang.String r9 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            qp2.n(r9)
            return
        L3d:
            r8 = 2
            if (r6 == r8) goto L89
            r3.d = r8     // Catch: java.lang.Throwable -> L85
            java.lang.Object r6 = r5.b     // Catch: java.lang.Throwable -> L85
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6     // Catch: java.lang.Throwable -> L85
            int r6 = r6.indexOfChild(r1)     // Catch: java.lang.Throwable -> L85
            r8 = -1
            if (r6 != r8) goto L51
            r3.l(r1)     // Catch: java.lang.Throwable -> L85
            goto L60
        L51:
            boolean r8 = r4.i(r6)     // Catch: java.lang.Throwable -> L85
            if (r8 == 0) goto L63
            r4.q(r6)     // Catch: java.lang.Throwable -> L85
            r3.l(r1)     // Catch: java.lang.Throwable -> L85
            r5.I(r6)     // Catch: java.lang.Throwable -> L85
        L60:
            r3.d = r7
            goto L66
        L63:
            r3.d = r7
            goto L35
        L66:
            if (r0 == 0) goto L72
            androidx.recyclerview.widget.i r1 = androidx.recyclerview.widget.RecyclerView.U(r1)
            r2.m(r1)
            r2.j(r1)
        L72:
            r1 = r0 ^ 1
            r9.K0(r1)
            if (r0 != 0) goto L8e
            boolean r0 = r10.isTmpDetached()
            if (r0 == 0) goto L8e
            android.view.View r10 = r10.itemView
            r9.removeDetachedView(r10, r7)
            return
        L85:
            r9 = move-exception
            r3.d = r7
            throw r9
        L89:
            java.lang.String r9 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            qp2.n(r9)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.e.c(androidx.recyclerview.widget.i):void");
    }

    public final void d() {
        ArrayList arrayList = this.b;
        if (arrayList.size() > 0) {
            throw fki.n(0, arrayList);
        }
        arrayList.clear();
    }

    public abstract void e(i iVar);

    public abstract void f();

    public long g() {
        return this.e;
    }

    public abstract boolean h();

    public fr i(vph vphVar, i iVar, int i, List list) {
        fr frVar = new fr((byte) 20, false);
        View view = iVar.itemView;
        frVar.b = view.getLeft();
        frVar.c = view.getTop();
        view.getRight();
        view.getBottom();
        return frVar;
    }

    public abstract void j();
}
