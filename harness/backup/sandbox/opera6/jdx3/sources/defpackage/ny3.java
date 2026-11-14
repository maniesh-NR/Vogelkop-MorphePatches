package defpackage;

import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import com.opera.android.settings.SettingsManager;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ny3 implements u9j {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public final Object k;
    public final Object l;

    public ny3(SettingsManager settingsManager, mm6 mm6Var, v3m v3mVar, dj9 dj9Var, ekc ekcVar) {
        this.c = settingsManager;
        this.d = mm6Var;
        this.e = v3mVar;
        this.f = dj9Var;
        this.g = ekcVar;
        this.h = new v9j(this);
        this.i = new ly3(this, (byte) 0);
        this.j = new s9(this, (byte) 8);
        this.k = new vy(this, (byte) 3);
        this.l = new k9((Object) this, (byte) 20);
        yl6 yl6VarA = mm6Var.a();
        yl6VarA.getClass();
        this.a = tl6.a() ? yl6VarA.k() : false;
    }

    public ny3(ylp ylpVar, p7p p7pVar, u6p u6pVar, bxk bxkVar) {
        this.c = ylpVar;
        this.d = p7pVar;
        this.e = u6pVar;
        this.f = bxkVar;
        this.k = new bno(this, (byte) 0);
        this.l = new dpj((byte) 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.zro r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.h
            lzo r0 = (defpackage.lzo) r0
            java.lang.Object r1 = r5.g
            a3p r1 = (defpackage.a3p) r1
            r2 = 0
            if (r0 == 0) goto L13
            if (r1 == 0) goto L13
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r0, r1)
            goto L14
        L13:
            r3 = r2
        L14:
            if (r3 == 0) goto L6e
            java.lang.Object r0 = r3.a
            lzo r0 = (defpackage.lzo) r0
            java.lang.Object r1 = r3.b
            a3p r1 = (defpackage.a3p) r1
            android.view.ViewParent r3 = r1.getParent()
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r3, r6)
            if (r3 != 0) goto L2f
            xgh.g(r1)
            r3 = -1
            r6.addView(r1, r3, r3)
        L2f:
            boolean r3 = r5.b
            java.lang.Object r4 = r5.i
            ne5 r4 = (ne5) r4
            if (r3 == 0) goto L3f
            if (r4 == 0) goto L3c
            r4.o()
        L3c:
            r5.i = r2
            goto L53
        L3f:
            if (r4 != 0) goto L53
            ne5 r2 = new ne5
            android.content.Context r6 = r6.getContext()
            r2.<init>(r6)
            zlo r6 = new zlo
            r6.<init>()
            r2.m(r1, r6)
            goto L3c
        L53:
            ng2 r5 = r0.e
            byte r6 = r5.b
            r1 = 2
            if (r6 == r1) goto L5d
            r1 = 4
            if (r6 != r1) goto L6e
        L5d:
            a3p r6 = r0.a
            j2p r6 = r6.o
            if (r6 == 0) goto L6b
            java.util.Objects.toString(r6)
            ito[] r0 = defpackage.ito.a
            r6.onResume()
        L6b:
            r6 = 3
            r5.b = r6
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ny3.a(zro):void");
    }

    public final void b() {
        if (this.a || ((zro) this.j) == null) {
            return;
        }
        lzo lzoVar = (lzo) this.h;
        if (lzoVar != null) {
            lzoVar.b();
        }
        a3p a3pVar = (a3p) this.g;
        if (a3pVar != null) {
            xgh.g(a3pVar);
        }
        ne5 ne5Var = (ne5) this.i;
        if (ne5Var != null) {
            ne5Var.o();
        }
        this.i = null;
        zro zroVar = (zro) this.j;
        if (zroVar != null) {
            zroVar.removeOnAttachStateChangeListener((bno) this.k);
            zroVar.removeAllViews();
            xgh.g(zroVar);
        }
        this.j = null;
    }

    public final void c() {
        rm5 pm6Var;
        cgh iwkVar;
        v9j v9jVar = (v9j) this.h;
        SettingsManager settingsManager = (SettingsManager) this.c;
        if (this.a) {
            yl6 yl6VarA = ((mm6) this.d).a();
            sl6 sl6VarD = yl6VarA.d();
            ResolveInfo resolveInfo = sl6VarD.c() ? sl6VarD.a : null;
            pad padVar = resolveInfo == null ? null : new pad(resolveInfo, yl6VarA.a.getPackageManager());
            pm6Var = padVar != null ? new pm6((Drawable) padVar.b, (String) padVar.c) : new om6();
        } else {
            pm6Var = nm6.m;
        }
        int iY = settingsManager.y();
        q7j q7jVarC = settingsManager.C();
        iwk iwkVar2 = new iwk(settingsManager.i("tab_auto_grouping"));
        k1c k1cVar = v3m.f(((v3m) this.e).a) ? new k1c(2132021239) : new k1c(2132021240);
        uup pabVar = oab.h;
        cj9 cj9Var = (cj9) ((dj9) this.f).i();
        String str = cj9Var.b;
        String str2 = cj9Var.a;
        if (!Intrinsics.a(str, str2) || this.b) {
            Map map = oy5.a;
            Integer num = (Integer) map.get(str2);
            if (num != null) {
                int iIntValue = num.intValue();
                Integer num2 = (Integer) map.get(str);
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    this.b = true;
                    pabVar = (settingsManager.i("ongoing_installation_location_reset") || Intrinsics.a(str, str2)) ? new pab(new rxh(iIntValue2), null) : new pab(new rxh(iIntValue), new rxh(iIntValue2));
                }
            }
        }
        m18 m18Var = (m18) ((ekc) this.g).g();
        int i = m18Var == null ? -1 : my3.a[m18Var.ordinal()];
        if (i == -1) {
            iwkVar = hwk.a;
        } else if (i == 1) {
            iwkVar = new iwk(true);
        } else if (i != 2) {
            if (i != 3 && i != 4) {
                h9o.p();
                return;
            }
            iwkVar = hwk.a;
        } else {
            iwkVar = new iwk(false);
        }
        v9jVar.r(new ky3(pm6Var, iY, q7jVarC, iwkVar2, k1cVar, pabVar, iwkVar));
    }

    @Override // defpackage.u9j
    public final void j() {
        c();
        ((SettingsManager) this.c).F((s9) this.j);
        mm6 mm6Var = (mm6) this.d;
        mm6Var.g.b((ly3) this.i);
        ((dj9) this.f).F((vy) this.k);
        ((ekc) this.g).k((k9) this.l);
    }

    @Override // defpackage.u9j
    public final void onStopped() {
        ((ekc) this.g).p((k9) this.l);
        ((dj9) this.f).H((vy) this.k);
        mm6 mm6Var = (mm6) this.d;
        mm6Var.g.c((ly3) this.i);
        ((SettingsManager) this.c).H((s9) this.j);
    }
}
