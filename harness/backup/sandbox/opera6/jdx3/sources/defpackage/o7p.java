package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class o7p extends pxo {
    public iko k;
    public View l;
    public igi m;
    public ne5 n;
    public ny3 o;
    public jkp p;
    public final m42 q;
    public phe r;
    public final zyk s;
    public final bxk t;

    public o7p(Context context, q5p q5pVar) {
        super(context, q5pVar);
        this.q = new m42(this, (byte) 11);
        phe.a.getClass();
        this.r = phe.b;
        this.s = z4c.b(new qqo(this, (byte) 13));
        this.t = new bxk((Object) this, (byte) 18);
    }

    @Override // defpackage.pxo
    public final void b(voo vooVar) {
        p7p p7pVar;
        p7p p7pVar2;
        Unit unit;
        y2p y2pVar = (y2p) vooVar;
        String str = (String) y2pVar.z.i.getValue();
        if ((str == null || StringsKt.N(str)) && (p7pVar = this.i) != null) {
            LinkedHashSet linkedHashSet = p7p.c;
            p7pVar.g(9010, null);
        }
        String str2 = (String) y2pVar.z.n.getValue();
        if ((str2 == null || StringsKt.N(str2)) && (p7pVar2 = this.i) != null) {
            LinkedHashSet linkedHashSet2 = p7p.c;
            p7pVar2.g(9011, null);
        }
        gqo gqoVar = new gqo(this, y2pVar, (byte) 1);
        ylp ylpVar = (ylp) y2pVar.F.getValue();
        if (ylpVar != null) {
            new agm(this.a, (wjh) this.b.c, this.i, (byte) 11).g(ylpVar, new n6p(gqoVar, this));
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            p7p p7pVar3 = this.i;
            dcl dclVar = new dcl(p7pVar3);
            n6p n6pVar = new n6p(this, gqoVar);
            sro sroVar = (sro) y2pVar.D.getValue();
            if (sroVar == null) {
                if (p7pVar3 != null) {
                    LinkedHashSet linkedHashSet3 = p7p.c;
                    p7pVar3.g(9006, null);
                }
                p0i p0iVar = t0i.b;
                n6pVar.invoke(new t0i(new q0i(new vjo(9006, "Mandatory asset isn't present!"))));
            } else {
                File file = sroVar.c;
                if (!file.exists()) {
                    file.mkdirs();
                }
                gep gepVar = new gep(n6pVar, y2pVar, dclVar, sroVar, (byte) 2);
                l5b l5bVar = new l5b((byte) 14, false);
                sa7 sa7Var = l1p.a;
                l1p.a(sroVar.b, sroVar.a(), l5bVar, null, gepVar);
            }
        }
        sro sroVar2 = (sro) y2pVar.E.getValue();
        if (sroVar2 != null) {
            File file2 = sroVar2.c;
            if (!file2.exists()) {
                file2.mkdirs();
            }
            gqo gqoVar2 = new gqo(sroVar2, this, (byte) 2);
            l5b l5bVar2 = new l5b((byte) 14, false);
            sa7 sa7Var2 = l1p.a;
            l1p.a(sroVar2.b, sroVar2.a(), l5bVar2, null, gqoVar2);
        }
    }

    public final String f(View view) {
        String str;
        if (view == this.f) {
            return "root";
        }
        if ((view instanceof kko) || (view.getParent() instanceof kko)) {
            return "ac";
        }
        igi igiVar = this.m;
        if (igiVar != null) {
            if (view.equals((ksd) igiVar.b)) {
                str = "media";
            } else if (view.equals((View) igiVar.c)) {
                str = "title";
            } else if (view.equals((View) igiVar.d)) {
                str = "description";
            } else if (view.equals((View) igiVar.e)) {
                str = "cta";
            } else if (view.equals((ImageView) igiVar.f)) {
                str = "icon";
            } else {
                Set set = (Set) igiVar.g;
                str = (set == null || !set.contains(view)) ? null : "extra";
            }
            if (str != null) {
                return str;
            }
        }
        view.toString();
        return "unknown";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            bap r0 = r5.e
            boolean r0 = r0.e
            if (r0 != 0) goto L12
            bap r0 = r5.e
            r0.d()
            sxo r0 = r5.g
            if (r0 == 0) goto L12
            r0.b()
        L12:
            jkp r0 = r5.p
            if (r0 == 0) goto L19
            r0.a()
        L19:
            uuj r0 = r5.c
            if (r0 == 0) goto L20
            r0.onAdClicked()
        L20:
            voo r0 = r5.d
            y2p r0 = (defpackage.y2p) r0
            if (r0 == 0) goto L56
            agm r1 = new agm
            android.content.Context r2 = r5.a
            sm r3 = defpackage.sm.c
            r4 = 9
            r1.<init>(r2, r3, r6, r4)
            java.lang.String r6 = r0.o
            java.lang.String r2 = r0.p
            if (r7 == 0) goto L40
            boolean r3 = kotlin.text.StringsKt.N(r7)
            if (r3 == 0) goto L3e
            r7 = 0
        L3e:
            if (r7 != 0) goto L46
        L40:
            c4p r7 = r0.z
            a5p r7 = r7.a
            java.lang.String r7 = r7.a
        L46:
            c4p r0 = r0.z
            a5p r0 = r0.a
            java.lang.String r0 = r0.b
            h1p r3 = new h1p
            r3.<init>(r6, r2, r7, r0)
            p7p r5 = r5.i
            r1.e(r3, r5)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7p.h(java.lang.String, java.lang.String):void");
    }

    public final void i(boolean z) {
        int i;
        iko ikoVar = this.k;
        if (ikoVar != null) {
            FrameLayout frameLayout = ikoVar.a;
            if (z) {
                kko kkoVar = (kko) frameLayout.findViewById(iko.b);
                if (kkoVar != null) {
                    xgh.g(kkoVar);
                    return;
                }
                return;
            }
            phe pheVar = this.r;
            cfn cfnVar = new cfn(0, this, o7p.class, "onPrivacyClick", "onPrivacyClick()V", 0, (byte) 20);
            int i2 = iko.b;
            kko kkoVar2 = (kko) frameLayout.findViewById(i2);
            if (kkoVar2 != null) {
                xgh.g(kkoVar2);
            }
            kko kkoVar3 = new kko(frameLayout.getContext(), this.q, cfnVar);
            kkoVar3.setId(i2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            int i3 = lgo.a[pheVar.ordinal()];
            if (i3 == 1) {
                i = 51;
            } else if (i3 == 2) {
                i = 53;
            } else if (i3 == 3) {
                i = 83;
            } else {
                if (i3 != 4) {
                    h9o.p();
                    return;
                }
                i = 85;
            }
            layoutParams.gravity = i;
            int dimensionPixelSize = frameLayout.getContext().getResources().getDimensionPixelSize(2131167275);
            layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            frameLayout.addView(kkoVar3, layoutParams);
        }
    }

    public final c4p j() {
        y2p y2pVar = (y2p) this.d;
        if (y2pVar != null) {
            return y2pVar.z;
        }
        return null;
    }

    public final void k() {
        y2p y2pVar;
        String str;
        if (!(this.e instanceof u9p) || (y2pVar = (y2p) this.d) == null || (str = y2pVar.u) == null) {
            return;
        }
        jkp jkpVar = this.p;
        if (jkpVar != null) {
            jkpVar.a();
        }
        Set set = blp.a;
        blp.c(this.a, Uri.parse(str));
        p7p p7pVar = this.i;
        if (p7pVar != null) {
            voo vooVar = p7pVar.a;
            p7p.e(new nio(vooVar.c, vooVar.b.a, vooVar.j, vooVar.l), null, p7pVar.b);
        }
    }
}
