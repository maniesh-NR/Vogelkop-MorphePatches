package defpackage;

import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v4k implements ile {
    public boolean a;
    public final /* synthetic */ c5k b;

    public v4k(c5k c5kVar) {
        this.b = c5kVar;
    }

    public final void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        if (i2 != i4) {
            c5k c5kVar = this.b;
            c5kVar.q.p.c.d();
            ArrayList arrayList = c5kVar.A.a;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                xw8 xw8Var = ((zw8) obj).b;
                if (xw8Var != null && xw8.class.isAssignableFrom(xw8.class)) {
                    xw8Var.l();
                }
            }
            b();
            c5kVar.h.run(Integer.valueOf(i2));
            cv8 cv8Var = c5kVar.q;
            km5 km5Var = cv8Var.B;
            x5f x5fVar = (x5f) km5Var.d;
            zpa zpaVar = x5fVar.d;
            tsd tsdVar = (tsd) km5Var.c;
            if (((Boolean) tsdVar.g()).booleanValue() || i2 <= 0 || i4 != 0) {
                if (((Boolean) tsdVar.g()).booleanValue() && ((!km5Var.a) & km5Var.b) && x5fVar.h) {
                    x56 x56VarF = zpa.F();
                    am2.f(zpaVar, x56VarF).b.p(33, 1, 1L);
                    x5fVar.U0(x56VarF);
                }
            } else if (x5fVar.h) {
                x56 x56VarF2 = zpa.F();
                am2.f(zpaVar, x56VarF2).b.p(33, 1, 1L);
                x5fVar.U0(x56VarF2);
            }
            km5Var.b = km5Var.a;
            cv8Var.m.a();
            c5kVar.j((rmn) ((kze) c5kVar.b0.h).g());
            u85 u85Var = (u85) c5kVar.H.b;
            if (u85Var != null) {
                if (((q85) ((pde) u85Var.k).g()).a) {
                    if (i2 <= u85Var.c) {
                        u85Var.a = false;
                    }
                } else if (i2 > u85Var.b) {
                    u85Var.a = true;
                }
                u85Var.g();
            }
            aba abaVar = c5kVar.G;
            boolean z = i2 > z8b.c.k(abaVar.b.getContext());
            if (z == abaVar.m) {
                return;
            }
            abaVar.m = z;
            abaVar.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, com.opera.android.feed.FeedScrollView] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r5 = this;
            c5k r0 = r5.b
            nue r1 = r0.k
            com.opera.android.feed.FeedScrollView r2 = r0.l
            ize r1 = r1.getVisibility()
            java.lang.Object r1 = r1.g()
            lue r1 = (defpackage.lue) r1
            boolean r1 = r1.d()
            if (r1 == 0) goto L23
            int r1 = r2.getScrollY()
            if (r1 <= 0) goto L23
            r1 = 1
            boolean r2 = r2.canScrollVertically(r1)
            if (r2 == 0) goto L24
        L23:
            r1 = 0
        L24:
            boolean r2 = r5.a
            if (r1 == r2) goto L76
            r5.a = r1
            kze r2 = r0.e0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            r2.r(r3)
            lv3 r2 = r0.x
            boolean r5 = r5.a
            com.opera.android.BrowserActivity r2 = r2.a
            kze r3 = r2.i0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)
            r3.r(r4)
            z43 r2 = r2.z
            if (r2 != 0) goto L47
            r2 = 0
        L47:
            r2.w(r5)
            if (r1 == 0) goto L76
            x5f r5 = r0.u
            boolean r1 = r5.h
            if (r1 == 0) goto L67
            zpa r1 = r5.d
            x56 r2 = defpackage.zpa.F()
            fi0 r3 = r2.E(r1)
            lj0 r1 = r3.z(r1)
            r3 = 2
            r1.e(r3)
            r5.U0(r2)
        L67:
            com.opera.android.settings.SettingsManager r5 = r0.j
            java.lang.String r1 = "speed_dial.enabled"
            boolean r5 = r5.i(r1)
            if (r5 == 0) goto L76
            ete r5 = r0.w
            r5.a()
        L76:
            h5k r5 = r0.K
            t8k r1 = r0.e
            s8k r1 = r1.c
            s8k r2 = defpackage.s8k.a
            if (r1 == r2) goto L83
            yul r0 = yul.e
            goto L98
        L83:
            bvl r0 = r0.i
            pde r0 = r0.getState()
            java.lang.Object r0 = r0.g()
            avl r0 = (defpackage.avl) r0
            int r0 = r0.c
            if (r0 != 0) goto L96
            yul r0 = yul.e
            goto L98
        L96:
            yul r0 = yul.d
        L98:
            r5.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v4k.b():void");
    }
}
