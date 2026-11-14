package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import com.opera.android.custom_views.CircleImageView;
import com.opera.android.custom_views.FadingNestedScrollView;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.mainmenu.MainMenuSheetToggleLayout;
import com.opera.android.mainmenu.ToggleAnimationView;
import com.opera.android.ui.catalog.widget.OperaChip;
import com.opera.android.widget.MenuSettingsListItem;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class y53 extends lim implements hpf {
    public final i7d a;
    public final h73 b;
    public final or2 c;
    public final FadingNestedScrollView d;
    public final qm9 e;
    public final tcc f;
    public final Context g;
    public final d7h h;
    public final d37 i;
    public final xol j;
    public final zol k;
    public final pde l;
    public final r7d m;
    public ivg n;
    public boolean o;
    public final ru9 p;
    public final x53 q;

    /* JADX WARN: Multi-variable type inference failed */
    public y53(i7d i7dVar, h73 h73Var, or2 or2Var, FadingNestedScrollView fadingNestedScrollView, tcc tccVar, x79 x79Var) {
        x53 x53Var = new x53(this);
        this.q = x53Var;
        this.a = i7dVar;
        this.b = h73Var;
        this.c = or2Var;
        this.d = fadingNestedScrollView;
        this.e = new qm9(fadingNestedScrollView);
        if (xug.k(fadingNestedScrollView) == null) {
            fadingNestedScrollView.setTag(2131364495, new atj(fadingNestedScrollView));
        }
        this.f = tccVar;
        Context context = ((LinearLayout) or2Var.c).getContext();
        this.g = context;
        this.h = new d7h(context, h73Var.n, (byte) 11);
        pde pdeVar = new pde(Boolean.valueOf(h73Var.h));
        this.l = pdeVar;
        lom lomVar = mom.a(context).a;
        kze kzeVar = ((yk6) h73Var.r.get()).n;
        boolean z = h73Var.i;
        boolean z2 = h73Var.x;
        ekc ekcVar = (ekc) h73Var.u.get();
        ekc ekcVar2 = (ekc) h73Var.v.get();
        final d37 d37Var = new d37();
        d37Var.c = lomVar;
        d37Var.d = kzeVar;
        d37Var.e = pdeVar;
        d37Var.a = z;
        d37Var.b = z2;
        d37Var.f = ekcVar;
        d37Var.g = ekcVar2;
        h42 h42Var = new h42(d37Var.B());
        final byte b = 0;
        h42Var.s(kzeVar, new t7d(new Function1() { // from class: yol
            public final Object invoke(Object obj) {
                byte b2 = b;
                d37 d37Var2 = d37Var;
                switch (b2) {
                    case 0:
                        xf8.E0((h42) d37Var2.h, d37Var2.B());
                        break;
                    case 1:
                        xf8.E0((h42) d37Var2.h, d37Var2.B());
                        break;
                    case 2:
                        xf8.E0((h42) d37Var2.h, d37Var2.B());
                        break;
                    default:
                        xf8.E0((h42) d37Var2.h, d37Var2.B());
                        break;
                }
                return Unit.a;
            }
        }, (byte) 24));
        final byte b2 = 1;
        h42Var.s(pdeVar, new t7d(new Function1() { // from class: yol
            public final Object invoke(Object obj) {
                byte b22 = b2;
                d37 d37Var2 = d37Var;
                switch (b22) {
                    case 0:
                        xf8.E0((h42) d37Var2.h, d37Var2.B());
                        break;
                    case 1:
                        xf8.E0((h42) d37Var2.h, d37Var2.B());
                        break;
                    case 2:
                        xf8.E0((h42) d37Var2.h, d37Var2.B());
                        break;
                    default:
                        xf8.E0((h42) d37Var2.h, d37Var2.B());
                        break;
                }
                return Unit.a;
            }
        }, (byte) 24));
        final byte b3 = 2;
        h42Var.s(ekcVar, new t7d(new Function1() { // from class: yol
            public final Object invoke(Object obj) {
                byte b22 = b3;
                d37 d37Var2 = d37Var;
                switch (b22) {
                    case 0:
                        xf8.E0((h42) d37Var2.h, d37Var2.B());
                        break;
                    case 1:
                        xf8.E0((h42) d37Var2.h, d37Var2.B());
                        break;
                    case 2:
                        xf8.E0((h42) d37Var2.h, d37Var2.B());
                        break;
                    default:
                        xf8.E0((h42) d37Var2.h, d37Var2.B());
                        break;
                }
                return Unit.a;
            }
        }, (byte) 24));
        final byte b4 = 3;
        h42Var.s(ekcVar2, new t7d(new Function1() { // from class: yol
            public final Object invoke(Object obj) {
                byte b22 = b4;
                d37 d37Var2 = d37Var;
                switch (b22) {
                    case 0:
                        xf8.E0((h42) d37Var2.h, d37Var2.B());
                        break;
                    case 1:
                        xf8.E0((h42) d37Var2.h, d37Var2.B());
                        break;
                    case 2:
                        xf8.E0((h42) d37Var2.h, d37Var2.B());
                        break;
                    default:
                        xf8.E0((h42) d37Var2.h, d37Var2.B());
                        break;
                }
                return Unit.a;
            }
        }, (byte) 24));
        d37Var.h = h42Var;
        this.i = d37Var;
        xol xolVar = new xol(this);
        this.j = xolVar;
        zol zolVar = new zol(xolVar);
        this.k = zolVar;
        ((tx7) zolVar).a = true;
        ru9 ru9VarC = ru9.c(context);
        this.p = ru9VarC;
        ru9VarC.a(x53Var);
        jtg jtgVar = h73Var.o;
        kze kzeVar2 = h73Var.p;
        kze kzeVar3 = h73Var.q;
        x5f x5fVar = h73Var.l;
        f7d f7dVar = h73Var.a;
        Objects.requireNonNull(f7dVar);
        va2 va2Var = new va2(f7dVar, (byte) 12);
        final p12 p12Var = new p12();
        p12Var.a = jtgVar;
        p12Var.b = kzeVar2;
        p12Var.c = kzeVar3;
        p12Var.d = x79Var;
        p12Var.e = ru9VarC;
        p12Var.f = x5fVar;
        p12Var.g = va2Var;
        tsd tsdVar = new tsd(p12Var.n());
        p12Var.h = tsdVar;
        tsdVar.s(kzeVar2, new t7d(new Function1() { // from class: s7d
            public final Object invoke(Object obj) {
                byte b5 = b;
                p12 p12Var2 = p12Var;
                switch (b5) {
                    case 0:
                        xf8.F0((tsd) p12Var2.h, p12Var2.n());
                        break;
                    default:
                        xf8.F0((tsd) p12Var2.h, p12Var2.n());
                        break;
                }
                return Unit.a;
            }
        }, (byte) 0));
        tsdVar.s(kzeVar3, new t7d(new Function1() { // from class: s7d
            public final Object invoke(Object obj) {
                byte b5 = b2;
                p12 p12Var2 = p12Var;
                switch (b5) {
                    case 0:
                        xf8.F0((tsd) p12Var2.h, p12Var2.n());
                        break;
                    default:
                        xf8.F0((tsd) p12Var2.h, p12Var2.n());
                        break;
                }
                return Unit.a;
            }
        }, (byte) 0));
        r7d r7dVar = new r7d(new t02(this, (byte) 20), p12Var);
        this.m = r7dVar;
        tccVar.a(r7dVar);
    }

    public static void R(View view, Runnable runnable) {
        view.setOnClickListener(new s53(runnable, (byte) 0));
    }

    @Override // defpackage.hpf
    public final void I(fpf fpfVar) {
        V();
    }

    public final p1f S(wol wolVar) {
        int iOrdinal = wolVar.ordinal();
        h73 h73Var = this.b;
        if (iOrdinal == 0 || iOrdinal == 1) {
            return h73Var.g.a(2);
        }
        if (iOrdinal == 4) {
            return h73Var.g.a(8);
        }
        if (iOrdinal == 7) {
            return h73Var.g.a(1);
        }
        if (iOrdinal == 9) {
            return h73Var.g.a(4);
        }
        if (iOrdinal != 10) {
            return null;
        }
        return h73Var.g.a(16);
    }

    public final void T(mh0 mh0Var) {
        this.b.l.c0(mh0Var);
    }

    public final void U(MenuSettingsListItem menuSettingsListItem, int i) throws Resources.NotFoundException {
        ((StylingTextView) menuSettingsListItem.b.b).setText(this.g.getResources().getQuantityString(2131886172, i, Integer.valueOf(i)));
    }

    public final void V() {
        CircleImageView circleImageView = ((g7d) ((rf2) this.c.d).b).c;
        dpf dpfVar = (dpf) this.b.m.e.g();
        iu2 iu2Var = new iu2(circleImageView, (byte) 3);
        d7h d7hVar = this.h;
        d7hVar.getClass();
        dpfVar.a(new wzg(d7hVar, iu2Var));
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        or2 or2Var = this.c;
        View view = (CardView) ((rf2) or2Var.d).i;
        final byte b = 0;
        r8n r8nVar = new r8n(this) { // from class: v53
            public final /* synthetic */ y53 b;

            {
                this.b = this;
            }

            @Override // defpackage.r8n
            public final void a(View view2) {
                byte b2 = b;
                y53 y53Var = this.b;
                switch (b2) {
                    case 0:
                        ((CardView) ((rf2) y53Var.c.d).i).b(f03.t(2130970224, y53Var.g, 2131101243));
                        break;
                    default:
                        y53Var.V();
                        break;
                }
            }
        };
        q9n.e(view, r8nVar);
        r8nVar.a(view);
        rf2 rf2Var = (rf2) or2Var.d;
        AppCompatImageView appCompatImageView = (StylingImageButton) rf2Var.c;
        Context context = this.g;
        appCompatImageView.setContentDescription(context.getString(2132018914, context.getString(2132017591)));
        appCompatImageView.setTooltipText(context.getString(2132018914, context.getString(2132017591)));
        g7d g7dVar = (g7d) rf2Var.b;
        g7dVar.b.setClickable(false);
        AppCompatImageView appCompatImageView2 = g7dVar.c;
        final byte b2 = 1;
        r8n r8nVar2 = new r8n(this) { // from class: v53
            public final /* synthetic */ y53 b;

            {
                this.b = this;
            }

            @Override // defpackage.r8n
            public final void a(View view2) {
                byte b22 = b2;
                y53 y53Var = this.b;
                switch (b22) {
                    case 0:
                        ((CardView) ((rf2) y53Var.c.d).i).b(f03.t(2130970224, y53Var.g, 2131101243));
                        break;
                    default:
                        y53Var.V();
                        break;
                }
            }
        };
        q9n.e(appCompatImageView2, r8nVar2);
        r8nVar2.a(appCompatImageView2);
        CardView cardView = (CardView) rf2Var.i;
        cardView.setOnHoverListener(new w53(this, (byte) 0));
        R((OperaChip) rf2Var.k, new r53(this, b));
        R(cardView, new r53(this, b2));
        R((OperaChip) rf2Var.h, new r53(this, (byte) 2));
        byte b3 = 3;
        R((StylingImageButton) rf2Var.g, new r53(this, b3));
        R(appCompatImageView, new r53(this, (byte) 4));
        or2 or2Var2 = (or2) or2Var.b;
        MainMenuSheetToggleLayout mainMenuSheetToggleLayout = (MainMenuSheetToggleLayout) or2Var2.b;
        mainMenuSheetToggleLayout.setOnLongClickListener(new zt(new r53(this, (byte) 5), b3));
        MainMenuSheetToggleLayout mainMenuSheetToggleLayout2 = (MainMenuSheetToggleLayout) or2Var2.e;
        mainMenuSheetToggleLayout2.setOnLongClickListener(new zt(new r53(this, (byte) 6), b3));
        MainMenuSheetToggleLayout mainMenuSheetToggleLayout3 = (MainMenuSheetToggleLayout) or2Var2.d;
        mainMenuSheetToggleLayout3.setOnLongClickListener(new zt(new r53(this, (byte) 7), b3));
        MainMenuSheetToggleLayout mainMenuSheetToggleLayout4 = (MainMenuSheetToggleLayout) or2Var2.f;
        mainMenuSheetToggleLayout4.setOnLongClickListener(new zt(new r53(this, (byte) 8), b3));
        vml.d(new r53(this, (byte) 9), 1800L);
        wrl wrlVar = new wrl(this.g, this.b, mainMenuSheetToggleLayout, mainMenuSheetToggleLayout2, mainMenuSheetToggleLayout3, mainMenuSheetToggleLayout4, this.d, this.e);
        tcc tccVar = this.f;
        tccVar.a(wrlVar);
        or2 or2VarC = or2.c((LinearLayout) or2Var2.c);
        ((ToggleAnimationView) ((MainMenuSheetToggleLayout) or2VarC.b).a.c).A(2130969365, 2130969295, 2130969296);
        ((ToggleAnimationView) ((MainMenuSheetToggleLayout) or2VarC.e).a.c).A(2130969111, 2130969262, 2130969262);
        ((ToggleAnimationView) ((MainMenuSheetToggleLayout) or2VarC.d).a.c).A(2130969092, 2130969257, 2130969257);
        ((ToggleAnimationView) ((MainMenuSheetToggleLayout) or2VarC.f).a.c).A(2130969244, 2130969270, 2130969270);
        RecyclerView recyclerView = (RecyclerView) ((kf) or2Var.f).c;
        recyclerView.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        boolean z = recyclerView.getResources().getConfiguration().screenWidthDp < 360;
        zol zolVar = this.k;
        if (z != zolVar.f) {
            zolVar.f = z;
        }
        gridLayoutManager.g = zolVar;
        recyclerView.C0(gridLayoutManager);
        recyclerView.B0((e) null);
        xol xolVar = this.j;
        recyclerView.y0(xolVar);
        recyclerView.m(new ou1((byte) 4, recyclerView.getResources().getDimensionPixelSize(2131166629)));
        ei eiVar = (ei) or2Var.e;
        R(eiVar.e, new r53(this, (byte) 10));
        R((MenuSettingsListItem) eiVar.f, new r53(this, (byte) 11));
        byte b4 = 12;
        R(eiVar.g, new r53(this, b4));
        R(eiVar.h, new r53(this, (byte) 13));
        R(eiVar.i, new r53(this, (byte) 14));
        r53 r53Var = new r53(this, (byte) 15);
        h73 h73Var = this.b;
        rs2 rs2Var = h73Var.c;
        t53 t53Var = new t53(r53Var, (byte) 0);
        rs2Var.getClass();
        tccVar.a(new qs2(rs2Var, t53Var));
        rs2Var.a.b(t53Var);
        r53Var.run();
        jze jzeVar = h73Var.m.e;
        Objects.requireNonNull(jzeVar);
        this.n = new ivg(new vx(jzeVar, (byte) 11), or2Var);
        jzeVar.j(ndcVar, new f7f(this) { // from class: u53
            public final /* synthetic */ y53 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b5 = b;
                y53 y53Var = this.b;
                switch (b5) {
                    case 0:
                        dpf dpfVar = (dpf) obj;
                        dpfVar.a(y53Var.n);
                        dpfVar.a(y53Var);
                        break;
                    default:
                        ((OperaChip) ((rf2) y53Var.c.d).k).setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                        break;
                }
            }
        });
        new klk(h73Var.e).j(ndcVar, new f7f(this) { // from class: u53
            public final /* synthetic */ y53 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b5 = b2;
                y53 y53Var = this.b;
                switch (b5) {
                    case 0:
                        dpf dpfVar = (dpf) obj;
                        dpfVar.a(y53Var.n);
                        dpfVar.a(y53Var);
                        break;
                    default:
                        ((OperaChip) ((rf2) y53Var.c.d).k).setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                        break;
                }
            }
        });
        h42 h42Var = (h42) this.i.h;
        Objects.requireNonNull(xolVar);
        h42Var.j(ndcVar, new k9(xolVar, b4));
        plh plhVar = h73Var.z;
        i7d i7dVar = this.a;
        Objects.requireNonNull(i7dVar);
        na2.B(cqp.V(tccVar), (CoroutineContext) null, (rx5) null, new mz9(tccVar, plhVar, new q53(i7dVar, (byte) 0), (mt5) null, (byte) 11), 3);
    }

    @Override // defpackage.hpf
    public final void h(cpf cpfVar) {
        V();
    }

    @Override // defpackage.hpf
    public final void n(epf epfVar) {
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        this.o = true;
        this.p.d(this.q);
        this.f.b(this.m);
    }

    @Override // defpackage.as6
    public final void onStart(ndc ndcVar) {
        this.b.g.c(0);
    }

    @Override // defpackage.hpf
    public final void r(gpf gpfVar) {
        V();
    }
}
