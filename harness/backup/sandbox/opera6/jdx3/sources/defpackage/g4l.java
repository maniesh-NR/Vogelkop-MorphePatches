package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g4l {
    public final pde a;
    public final c9l b;
    public final c4l c;
    public final pde d;
    public final z77 e;
    public final j1k f;
    public final bp3 g;
    public final tn h;
    public final pde i;
    public final ArrayList j;
    public boolean k;
    public bz0 l;
    public boolean m;
    public float n;
    public a4l o;
    public boolean p;

    /* JADX WARN: Multi-variable type inference failed */
    public g4l(pde pdeVar, pde pdeVar2, r9l r9lVar, c9l c9lVar, pde pdeVar3, c9l c9lVar2, c4l c4lVar, pde pdeVar4, z77 z77Var, j1k j1kVar) {
        this.a = pdeVar3;
        this.b = c9lVar2;
        this.c = c4lVar;
        this.d = pdeVar4;
        this.e = z77Var;
        this.f = j1kVar;
        this.g = new bp3(r9lVar, c9lVar2, c4lVar.d, new d4l(this, (byte) 3), new d4l(this, (byte) 4), new d4l(this, (byte) 5));
        wci wciVar = c4lVar.e;
        Object[] objArr = 0;
        this.h = new tn(false, (Object) wciVar, (Object) c9lVar, (Object) c9lVar2);
        a4l a4lVar = a4l.c;
        pde pdeVar5 = new pde(a4lVar);
        this.i = pdeVar5;
        this.j = new ArrayList();
        this.n = ((Number) pdeVar4.g()).floatValue();
        this.o = a4lVar;
        a26.T(pdeVar, pdeVar2, new wj(new lqh(), this, (byte) 9));
        if (!ru9.c(((nw3) wciVar.b).b).a.getBoolean("tab_gallery.tabui2_selection_menu_hint_bubble_shown", false)) {
            final Object[] objArr2 = objArr == true ? 1 : 0;
            a26.T(pdeVar3, pdeVar2, new f7f(this) { // from class: e4l
                public final /* synthetic */ g4l b;

                {
                    this.b = this;
                }

                public final void d0(Object obj) {
                    switch (objArr2) {
                        case 0:
                            if (!Intrinsics.a((qyi) obj, oyi.a)) {
                                g4l g4lVar = this.b;
                                g4lVar.d(new j1k(0, g4lVar, g4l.class, "maybeShowOrScheduleSelectModeMenuHintBubble", "maybeShowOrScheduleSelectModeMenuHintBubble()V", 0, (byte) 12));
                                break;
                            }
                            break;
                        default:
                            a4l a4lVar2 = (a4l) obj;
                            a4l a4lVar3 = a4l.d;
                            g4l g4lVar2 = this.b;
                            if (a4lVar2 != a4lVar3) {
                                g4lVar2.o = a4lVar2;
                            }
                            g4lVar2.d(new d4l(g4lVar2, (byte) 6));
                            break;
                    }
                }
            });
        }
        final byte b = 1;
        a26.T(pdeVar5, pdeVar2, new f7f(this) { // from class: e4l
            public final /* synthetic */ g4l b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                switch (b) {
                    case 0:
                        if (!Intrinsics.a((qyi) obj, oyi.a)) {
                            g4l g4lVar = this.b;
                            g4lVar.d(new j1k(0, g4lVar, g4l.class, "maybeShowOrScheduleSelectModeMenuHintBubble", "maybeShowOrScheduleSelectModeMenuHintBubble()V", 0, (byte) 12));
                            break;
                        }
                        break;
                    default:
                        a4l a4lVar2 = (a4l) obj;
                        a4l a4lVar3 = a4l.d;
                        g4l g4lVar2 = this.b;
                        if (a4lVar2 != a4lVar3) {
                            g4lVar2.o = a4lVar2;
                        }
                        g4lVar2.d(new d4l(g4lVar2, (byte) 6));
                        break;
                }
            }
        });
        a26.T(pdeVar4, pdeVar2, new w4i(this, (byte) 21));
    }

    public static void a(g4l g4lVar, uz3 uz3Var, int i) {
        f4l f4lVar = f4l.a;
        if ((i & 2) != 0) {
            uz3Var = null;
        }
        g4lVar.j.add(f4lVar);
        g4lVar.d(new eek((Object) g4lVar, (Object) uz3Var, (byte) 7));
    }

    public static void e(g4l g4lVar) {
        g4lVar.j.remove(f4l.a);
        g4lVar.d(new d4l(g4lVar, (byte) 0));
    }

    public final boolean b(boolean z) {
        if (((Number) this.d.g()).floatValue() <= 0.0f && !this.k && !this.m) {
            ArrayList arrayList = this.j;
            if (arrayList.isEmpty()) {
                return true;
            }
            if (z) {
                if (arrayList != null && arrayList.isEmpty()) {
                    return true;
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((f4l) obj) != f4l.b) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void c() {
        b4l b4lVar;
        if (b(false)) {
            pde pdeVar = this.i;
            a4l a4lVar = (a4l) pdeVar.g();
            c4l c4lVar = this.c;
            c4lVar.getClass();
            nw3 nw3Var = c4lVar.a;
            int iOrdinal = a4lVar.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                b4lVar = b4l.b;
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    h9o.p();
                    return;
                }
                b4lVar = b4l.b;
            } else {
                b4lVar = (ru9.c(nw3Var.b).a.getBoolean("tab_gallery.installed_with_tabui2", false) || ru9.c(nw3Var.b).a.getBoolean("tab_gallery.tabui2_upgrade_dialog_shown", false) || ru9.c(nw3Var.b).a.getBoolean("tab_gallery.tabui2_bubble_tour_shown", false)) ? (!c4lVar.b.b.J().i("feature_tips_notification") || ru9.c(nw3Var.b).a.getBoolean("tab_gallery.tabui2_upgrade_dialog_shown", false) || ru9.c(nw3Var.b).a.getBoolean("tab_gallery.tabui2_bubble_tour_shown", false)) ? b4l.c : b4l.b : b4l.a;
            }
            int iOrdinal2 = b4lVar.ordinal();
            if (iOrdinal2 == 0) {
                this.k = true;
                h4l h4lVar = new h4l((Context) this.f.invoke(), new tvk(this));
                z77 z77Var = this.e;
                z77Var.getClass();
                z77Var.b(h4lVar, ijm.b);
                return;
            }
            if (iOrdinal2 != 1) {
                if (iOrdinal2 == 2) {
                    xf8.F0(pdeVar, a4l.c);
                    return;
                } else {
                    h9o.p();
                    return;
                }
            }
            this.m = true;
            Object objG = pdeVar.g();
            a4l a4lVar2 = a4l.d;
            bp3 bp3Var = this.g;
            if (objG == a4lVar2) {
                sz3 sz3Var = (sz3) bp3Var.j;
                if (sz3Var != null) {
                    bp3Var.j = null;
                    sz3Var.invoke();
                    return;
                }
                return;
            }
            zg zgVar = (zg) bp3Var.e;
            uz3 uz3Var = (uz3) zgVar.d;
            int iIndexOf = uz3Var == null ? -1 : uz3.j.indexOf(uz3Var);
            h58 h58Var = uz3.j;
            int i = iIndexOf + 1;
            List<uz3> listSubList = h58Var.subList(i < h58Var.d() ? i : 0, h58Var.d());
            ArrayList arrayList = new ArrayList();
            for (uz3 uz3Var2 : listSubList) {
                if (((r9l) bp3Var.c).e(uz3Var2) == null) {
                    uz3Var2 = null;
                }
                if (uz3Var2 != null) {
                    arrayList.add(uz3Var2);
                }
            }
            int i2 = zgVar.a;
            new tz3(zgVar, bp3Var, arrayList, i2 + 1, arrayList.size() + i2).c();
        }
    }

    public final void d(Function0 function0) {
        this.b.b.p.postOnAnimation(new l31(function0, (byte) 6));
    }
}
