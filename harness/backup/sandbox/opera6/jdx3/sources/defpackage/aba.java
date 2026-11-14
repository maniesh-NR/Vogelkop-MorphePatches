package defpackage;

import android.content.SharedPreferences;
import android.text.StaticLayout;
import android.view.animation.Animation;
import com.opera.android.settings.SettingsManager;
import com.opera.android.startpage.layout.feed_specific.HiddenStartPageContentHintView;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class aba {
    public static final long o;
    public static final long p;
    public final umi a;
    public final HiddenStartPageContentHintView b;
    public final ru9 c;
    public final nue d;
    public final pde e;
    public final pde f;
    public final pde g;
    public final pde h;
    public final pde i = new pde(new zaa(0, 0.0f));
    public final q65 j = new q65(new vaa(this, (byte) 0), (byte) 4);
    public final tsd k;
    public boolean l;
    public boolean m;
    public k1g n;

    static {
        on7 on7Var = pn7.b;
        o = cs5.x0(150, un7.d);
        p = cs5.x0(5, un7.e);
    }

    public aba(pde pdeVar, umi umiVar, HiddenStartPageContentHintView hiddenStartPageContentHintView, ru9 ru9Var, pde pdeVar2, nue nueVar, pde pdeVar3, pde pdeVar4, pde pdeVar5, pde pdeVar6, SettingsManager settingsManager) {
        this.a = umiVar;
        this.b = hiddenStartPageContentHintView;
        this.c = ru9Var;
        this.d = nueVar;
        this.e = pdeVar3;
        this.f = pdeVar4;
        this.g = pdeVar5;
        this.h = pdeVar6;
        final byte b = 0;
        final byte b2 = 4;
        final byte b3 = 2;
        tsd tsdVarE = uyg.e(settingsManager, "addressbar_position", new q9a((byte) 2));
        this.k = tsdVarE;
        this.n = xaa.i;
        a26.T(pdeVar2, pdeVar, new f7f(this) { // from class: waa
            public final /* synthetic */ aba b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b4 = b;
                aba abaVar = this.b;
                switch (b4) {
                    case 0:
                        f8k f8kVar = (f8k) obj;
                        HiddenStartPageContentHintView hiddenStartPageContentHintView2 = abaVar.b;
                        if (!Intrinsics.a(hiddenStartPageContentHintView2.o, f8kVar)) {
                            hiddenStartPageContentHintView2.o = f8kVar;
                            if (hiddenStartPageContentHintView2.f) {
                                hiddenStartPageContentHintView2.a(true);
                                break;
                            }
                        }
                        break;
                    case 1:
                        abaVar.l = true;
                        abaVar.d();
                        break;
                    case 2:
                        ((Boolean) obj).getClass();
                        abaVar.d();
                        break;
                    case 3:
                        abaVar.d();
                        break;
                    case 4:
                        ((Integer) obj).getClass();
                        abaVar.c();
                        break;
                    case 5:
                        abaVar.c();
                        break;
                    default:
                        abaVar.c();
                        break;
                }
            }
        });
        final byte b4 = 1;
        a26.T(nueVar.getVisibility(), pdeVar, new f7f(this) { // from class: waa
            public final /* synthetic */ aba b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b42 = b4;
                aba abaVar = this.b;
                switch (b42) {
                    case 0:
                        f8k f8kVar = (f8k) obj;
                        HiddenStartPageContentHintView hiddenStartPageContentHintView2 = abaVar.b;
                        if (!Intrinsics.a(hiddenStartPageContentHintView2.o, f8kVar)) {
                            hiddenStartPageContentHintView2.o = f8kVar;
                            if (hiddenStartPageContentHintView2.f) {
                                hiddenStartPageContentHintView2.a(true);
                                break;
                            }
                        }
                        break;
                    case 1:
                        abaVar.l = true;
                        abaVar.d();
                        break;
                    case 2:
                        ((Boolean) obj).getClass();
                        abaVar.d();
                        break;
                    case 3:
                        abaVar.d();
                        break;
                    case 4:
                        ((Integer) obj).getClass();
                        abaVar.c();
                        break;
                    case 5:
                        abaVar.c();
                        break;
                    default:
                        abaVar.c();
                        break;
                }
            }
        });
        a26.T(pdeVar3, pdeVar, new f7f(this) { // from class: waa
            public final /* synthetic */ aba b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b42 = b3;
                aba abaVar = this.b;
                switch (b42) {
                    case 0:
                        f8k f8kVar = (f8k) obj;
                        HiddenStartPageContentHintView hiddenStartPageContentHintView2 = abaVar.b;
                        if (!Intrinsics.a(hiddenStartPageContentHintView2.o, f8kVar)) {
                            hiddenStartPageContentHintView2.o = f8kVar;
                            if (hiddenStartPageContentHintView2.f) {
                                hiddenStartPageContentHintView2.a(true);
                                break;
                            }
                        }
                        break;
                    case 1:
                        abaVar.l = true;
                        abaVar.d();
                        break;
                    case 2:
                        ((Boolean) obj).getClass();
                        abaVar.d();
                        break;
                    case 3:
                        abaVar.d();
                        break;
                    case 4:
                        ((Integer) obj).getClass();
                        abaVar.c();
                        break;
                    case 5:
                        abaVar.c();
                        break;
                    default:
                        abaVar.c();
                        break;
                }
            }
        });
        final byte b5 = 3;
        a26.T(tsdVarE, pdeVar, new f7f(this) { // from class: waa
            public final /* synthetic */ aba b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b42 = b5;
                aba abaVar = this.b;
                switch (b42) {
                    case 0:
                        f8k f8kVar = (f8k) obj;
                        HiddenStartPageContentHintView hiddenStartPageContentHintView2 = abaVar.b;
                        if (!Intrinsics.a(hiddenStartPageContentHintView2.o, f8kVar)) {
                            hiddenStartPageContentHintView2.o = f8kVar;
                            if (hiddenStartPageContentHintView2.f) {
                                hiddenStartPageContentHintView2.a(true);
                                break;
                            }
                        }
                        break;
                    case 1:
                        abaVar.l = true;
                        abaVar.d();
                        break;
                    case 2:
                        ((Boolean) obj).getClass();
                        abaVar.d();
                        break;
                    case 3:
                        abaVar.d();
                        break;
                    case 4:
                        ((Integer) obj).getClass();
                        abaVar.c();
                        break;
                    case 5:
                        abaVar.c();
                        break;
                    default:
                        abaVar.c();
                        break;
                }
            }
        });
        a26.T(pdeVar4, pdeVar, new f7f(this) { // from class: waa
            public final /* synthetic */ aba b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b42 = b2;
                aba abaVar = this.b;
                switch (b42) {
                    case 0:
                        f8k f8kVar = (f8k) obj;
                        HiddenStartPageContentHintView hiddenStartPageContentHintView2 = abaVar.b;
                        if (!Intrinsics.a(hiddenStartPageContentHintView2.o, f8kVar)) {
                            hiddenStartPageContentHintView2.o = f8kVar;
                            if (hiddenStartPageContentHintView2.f) {
                                hiddenStartPageContentHintView2.a(true);
                                break;
                            }
                        }
                        break;
                    case 1:
                        abaVar.l = true;
                        abaVar.d();
                        break;
                    case 2:
                        ((Boolean) obj).getClass();
                        abaVar.d();
                        break;
                    case 3:
                        abaVar.d();
                        break;
                    case 4:
                        ((Integer) obj).getClass();
                        abaVar.c();
                        break;
                    case 5:
                        abaVar.c();
                        break;
                    default:
                        abaVar.c();
                        break;
                }
            }
        });
        final byte b6 = 5;
        a26.T(pdeVar5, pdeVar, new f7f(this) { // from class: waa
            public final /* synthetic */ aba b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b42 = b6;
                aba abaVar = this.b;
                switch (b42) {
                    case 0:
                        f8k f8kVar = (f8k) obj;
                        HiddenStartPageContentHintView hiddenStartPageContentHintView2 = abaVar.b;
                        if (!Intrinsics.a(hiddenStartPageContentHintView2.o, f8kVar)) {
                            hiddenStartPageContentHintView2.o = f8kVar;
                            if (hiddenStartPageContentHintView2.f) {
                                hiddenStartPageContentHintView2.a(true);
                                break;
                            }
                        }
                        break;
                    case 1:
                        abaVar.l = true;
                        abaVar.d();
                        break;
                    case 2:
                        ((Boolean) obj).getClass();
                        abaVar.d();
                        break;
                    case 3:
                        abaVar.d();
                        break;
                    case 4:
                        ((Integer) obj).getClass();
                        abaVar.c();
                        break;
                    case 5:
                        abaVar.c();
                        break;
                    default:
                        abaVar.c();
                        break;
                }
            }
        });
        final byte b7 = 6;
        a26.T(pdeVar6, pdeVar, new f7f(this) { // from class: waa
            public final /* synthetic */ aba b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b42 = b7;
                aba abaVar = this.b;
                switch (b42) {
                    case 0:
                        f8k f8kVar = (f8k) obj;
                        HiddenStartPageContentHintView hiddenStartPageContentHintView2 = abaVar.b;
                        if (!Intrinsics.a(hiddenStartPageContentHintView2.o, f8kVar)) {
                            hiddenStartPageContentHintView2.o = f8kVar;
                            if (hiddenStartPageContentHintView2.f) {
                                hiddenStartPageContentHintView2.a(true);
                                break;
                            }
                        }
                        break;
                    case 1:
                        abaVar.l = true;
                        abaVar.d();
                        break;
                    case 2:
                        ((Boolean) obj).getClass();
                        abaVar.d();
                        break;
                    case 3:
                        abaVar.d();
                        break;
                    case 4:
                        ((Integer) obj).getClass();
                        abaVar.c();
                        break;
                    case 5:
                        abaVar.c();
                        break;
                    default:
                        abaVar.c();
                        break;
                }
            }
        });
    }

    public final zaa a() {
        HiddenStartPageContentHintView hiddenStartPageContentHintView = this.b;
        if (hiddenStartPageContentHintView.getVisibility() == 0) {
            StaticLayout staticLayout = hiddenStartPageContentHintView.h;
            height = staticLayout != null ? staticLayout.getHeight() : 0;
            int i = hiddenStartPageContentHintView.l;
            if (height < i) {
                height = i;
            }
            height += hiddenStartPageContentHintView.a;
        }
        return new zaa(height, hiddenStartPageContentHintView.getAlpha());
    }

    public final void b(boolean z) {
        k1g k1gVar = this.n;
        k1gVar.getClass();
        if (k1gVar instanceof yaa) {
            this.n = xaa.i;
            this.j.S();
            this.b.animate().setDuration(z ? pn7.f(o) : 0L).alpha(0.0f).withEndAction(new vaa(this, (byte) 1)).setUpdateListener(new nl2(this, (byte) 11)).start();
        }
    }

    public final void c() {
        int iMax = Math.max(((mnf) this.g.g()).b, ((Number) this.f.g()).intValue());
        HiddenStartPageContentHintView hiddenStartPageContentHintView = this.b;
        if (hiddenStartPageContentHintView.e != iMax) {
            hiddenStartPageContentHintView.e = iMax;
            if (hiddenStartPageContentHintView.f) {
                hiddenStartPageContentHintView.invalidate();
            }
        }
    }

    public final void d() {
        k1g yaaVar = xaa.i;
        if (!this.m && ((lo3) this.h.g()).a && this.k.g() == b7j.c) {
            if (((lue) this.d.getVisibility().g()).d()) {
                yaaVar = new yaa(bba.NEWS);
            } else if (((Boolean) this.e.g()).booleanValue()) {
                yaaVar = new yaa(bba.MORE);
            }
        }
        if (!(yaaVar instanceof yaa)) {
            b(false);
            return;
        }
        yaa yaaVar2 = (yaa) yaaVar;
        k1g k1gVar = this.n;
        k1gVar.getClass();
        if ((k1gVar instanceof yaa) || !this.l) {
            return;
        }
        this.l = false;
        this.n = yaaVar2;
        this.j.B0(this.a, pn7.f(p), TimeUnit.MILLISECONDS);
        bba bbaVar = yaaVar2.i;
        HiddenStartPageContentHintView hiddenStartPageContentHintView = this.b;
        if (hiddenStartPageContentHintView.g != bbaVar) {
            hiddenStartPageContentHintView.g = bbaVar;
            hiddenStartPageContentHintView.b();
        }
        Animation animation = hiddenStartPageContentHintView.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        hiddenStartPageContentHintView.setAlpha(1.0f);
        ru9 ru9Var = this.c;
        int i = ru9Var.a.getInt("startpage.swipe_up_hint_animation_play_count", 0);
        hiddenStartPageContentHintView.m = i < 3;
        hiddenStartPageContentHintView.setVisibility(0);
        f3d f3dVar = hiddenStartPageContentHintView.j;
        if (i < 3) {
            if (f3dVar != null) {
                f3dVar.p(0);
                f3dVar.k();
            } else {
                hiddenStartPageContentHintView.n = true;
            }
            nv6 nv6VarB = ru9Var.b();
            ((SharedPreferences.Editor) nv6VarB.a).putInt("startpage.swipe_up_hint_animation_play_count", i + 1);
            nv6VarB.w();
        } else if (f3dVar != null) {
            f3dVar.p((int) f3dVar.b.c());
        }
        xf8.F0(this.i, a());
    }
}
