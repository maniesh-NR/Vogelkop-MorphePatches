package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class du extends eu implements h4a {
    public final jt c;
    public final bs d;
    public hs e;
    public final int f;
    public vmj g;

    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    public du(ViewGroup viewGroup, bs bsVar) {
        Object objN = j7c.n(viewGroup, 2131558449, viewGroup, false);
        if (objN == null) {
            t3p.q("rootView");
            throw null;
        }
        ?? r3 = (OperaListItem) objN;
        jt jtVar = new jt(r3, (byte) 1);
        super((View) r3);
        this.c = jtVar;
        this.d = bsVar;
        this.f = fan.a(32.0f, r3.getResources());
        r3.setOnClickListener(new ks8(new gf((Object) this, (byte) 7), (byte) 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    @Override // defpackage.eu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U(defpackage.js r6) {
        /*
            r5 = this;
            hs r6 = (defpackage.hs) r6
            jt r0 = r5.c
            com.opera.android.ui.catalog.widget.OperaListItem r0 = r0.b
            java.lang.String r1 = r6.c
            qxh r2 = new qxh
            r2.<init>(r1)
            r0.E(r2)
            vmj r2 = r5.g
            if (r2 == 0) goto L32
            hs r2 = r5.e
            r3 = 1
            if (r2 == 0) goto L30
            anj r4 = lah.h(r1)
            java.lang.String r2 = r2.c
            anj r2 = lah.h(r2)
            java.lang.String r4 = r4.a()
            java.lang.String r2 = r2.a()
            boolean r2 = kotlin.jvm.internal.Intrinsics.a(r4, r2)
            r3 = r3 ^ r2
        L30:
            if (r3 == 0) goto L52
        L32:
            int r2 = defpackage.vmj.g
            android.content.Context r2 = r0.getContext()
            java.lang.String r3 = "https://"
            org.chromium.url.GURL r3 = defpackage.wqm.b(r3, r1)
            boolean r4 = org.chromium.url.GURL.i(r3)
            if (r4 != 0) goto L48
            java.lang.String r1 = r3.g()
        L48:
            r3 = 16
            int r4 = r5.f
            vmj r1 = defpackage.tmj.j(r2, r1, r4, r4, r3)
            r5.g = r1
        L52:
            vmj r1 = r5.g
            mxh r2 = new mxh
            r2.<init>(r1)
            r0.z(r2)
            r5.e = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.du.U(js):void");
    }

    @Override // defpackage.h4a
    public final void l(Rect rect) {
        rect.set(0, 0, 0, 0);
    }
}
