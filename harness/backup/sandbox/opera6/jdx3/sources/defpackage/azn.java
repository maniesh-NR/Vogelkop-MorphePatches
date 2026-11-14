package defpackage;

import J.N;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class azn extends y08 implements pke, p5j {
    public final qke a;
    public final xnh b;
    public final ox3 c;
    public final SettingsManager d;
    public final k6l e;
    public final nw3 f;
    public final geb g;
    public boolean h;

    public azn(qke qkeVar, SettingsManager settingsManager, xnh xnhVar, ox3 ox3Var, k6l k6lVar, nw3 nw3Var, geb gebVar) {
        this.a = qkeVar;
        this.d = settingsManager;
        this.b = xnhVar;
        this.c = ox3Var;
        this.e = k6lVar;
        this.f = nw3Var;
        this.g = gebVar;
        this.h = settingsManager.i("collect_website_categories");
        k6lVar.b(this);
        settingsManager.F(this);
        qkeVar.W(this);
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if ("collect_website_categories".equals(str)) {
            this.h = this.d.i("collect_website_categories");
        }
    }

    public final String W(String str) {
        if (((wnh) this.b.i()).b(4194304)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        mea meaVarListIterator = hyg.m(str).listIterator(0);
        while (true) {
            mea meaVar = meaVarListIterator;
            if (!meaVar.hasNext()) {
                return sb.toString();
            }
            int iIntValue = ((Integer) meaVar.next()).intValue();
            if (iIntValue >= 100) {
                if (sb.length() > 0) {
                    sb.append(';');
                }
                sb.append(iIntValue);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0107 A[SYNTHETIC] */
    @Override // defpackage.y08, defpackage.a2l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(defpackage.d7l r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r3 = this;
            boolean r0 = r3.h
            if (r0 == 0) goto L107
            e7l r0 = r4.j
            boolean r0 = r0.m()
            if (r0 != 0) goto L107
            e7l r0 = r4.j
            boolean r0 = r0.c0()
            if (r0 != 0) goto L107
            e7l r0 = r4.j
            boolean r0 = r0.r()
            if (r0 != 0) goto L107
            boolean r0 = r4.o0()
            if (r0 != 0) goto L107
            nw3 r0 = r3.f
            com.opera.android.OperaApplication r0 = r0.b
            ydn r0 = r0.R()
            vdn r0 = r0.d
            boolean r0 = r0.a()
            if (r0 != 0) goto L107
            e7l r0 = r4.j
            java.lang.String r0 = r0.getUrl()
            r1 = 1
            boolean r0 = defpackage.wqm.F(r0, r1)
            if (r0 == 0) goto L107
            java.lang.String r4 = r4.i0()
            java.lang.Object r4 = J.N.MfdpAXw7(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = "unavailable"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L107
            java.lang.String r0 = "uncategorized"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L107
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8}
            r6 = 0
            r7 = r6
        L5f:
            r8 = 4
            if (r7 >= r8) goto L78
            r8 = r5[r7]
            java.lang.String r8 = r8.trim()
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L75
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r5 = r8.toLowerCase(r5)
            goto L7a
        L75:
            int r7 = r7 + 1
            goto L5f
        L78:
            java.lang.String r5 = ""
        L7a:
            geb r7 = r3.g
            java.lang.Object r7 = r7.i()
            feb r7 = (defpackage.feb) r7
            java.util.Set r8 = r7.b
            java.util.Set r8 = (java.util.Set) r8
            if (r8 == 0) goto L9f
            java.util.Iterator r8 = r8.iterator()
        L8c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L9f
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L8c
            goto Lf0
        L9f:
            ehc r8 = hyg.m(r4)
            java.util.ListIterator r6 = r8.listIterator(r6)
        La7:
            r8 = r6
            mea r8 = (mea) r8
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L107
            java.lang.Object r8 = r8.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r0 = 100
            if (r8 >= r0) goto Lce
            xnh r0 = r3.b
            java.lang.Object r0 = r0.i()
            wnh r0 = (defpackage.wnh) r0
            r2 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = r0.b(r2)
            if (r0 == 0) goto La7
        Lce:
            android.util.SparseArray r0 = r7.a
            java.lang.Object r8 = r0.get(r8)
            java.util.Set r8 = (java.util.Set) r8
            java.util.Set r8 = (java.util.Set) r8
            if (r8 == 0) goto La7
            java.util.Iterator r8 = r8.iterator()
        Lde:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto La7
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto Lde
        Lf0:
            ox3 r5 = r3.c
            java.lang.Object r5 = r5.get()
            osf r5 = (defpackage.osf) r5
            java.lang.String r3 = r3.W(r4)
            r5.getClass()
            u5f r4 = new u5f
            r4.<init>(r3, r1)
            r5.a(r4)
        L107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azn.m(d7l, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // defpackage.pke
    public final void w(b2l b2lVar, oke okeVar, long j, boolean z) {
        if (z && !okeVar.d && this.h) {
            String str = (String) N.MfdpAXw7(((d7l) b2lVar).i0());
            boolean zEquals = "unavailable".equals(str);
            byte b = 2;
            ox3 ox3Var = this.c;
            if (zEquals || "uncategorized".equals(str)) {
                osf osfVar = (osf) ox3Var.get();
                osfVar.getClass();
                osfVar.a(new u5f(str, b));
            } else {
                osf osfVar2 = (osf) ox3Var.get();
                String strW = W(str);
                osfVar2.getClass();
                osfVar2.a(new u5f(strW, b));
            }
        }
    }
}
