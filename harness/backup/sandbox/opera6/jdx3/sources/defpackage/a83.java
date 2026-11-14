package defpackage;

import android.view.MenuItem;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.leanplum.utils.SizeUtil;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.widget.RecyclerViewEmptyViewSwitcher;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a83 extends gph {
    public final /* synthetic */ byte a;
    public final Object b;

    public a83(byte b) {
        this.a = b;
        switch (b) {
            case 15:
                this.b = new h7f();
                break;
            default:
                this.b = new ArrayList();
                break;
        }
    }

    public a83(dm8 dm8Var, Runnable runnable) {
        this.a = (byte) 5;
        this.b = runnable;
    }

    public /* synthetic */ a83(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                jh3 jh3Var = (jh3) obj;
                if (jh3Var.H0()) {
                    jh3Var.I0(false);
                    MenuItem menuItem = jh3Var.C;
                    if (menuItem != null) {
                        menuItem.collapseActionView();
                    }
                }
                jh3Var.J0();
                break;
            case 1:
                l();
                break;
            case 2:
                ((c76) obj).h0();
                break;
            case 3:
                ((yz7) obj).d();
                break;
            case 4:
                ((x77) obj).p();
                break;
            case 5:
                ((Runnable) obj).run();
                break;
            case 6:
                ((ar8) obj).p0();
                break;
            case 7:
                ((vu8) obj).t();
                break;
            case 8:
                dda ddaVar = (dda) obj;
                aud audVar = new aud(ddaVar.l.o());
                while (audVar.hasNext()) {
                    ddaVar.N0((MenuItem) audVar.next(), ddaVar.L0().f.e());
                }
                cda cdaVar = ddaVar.E;
                cda cdaVar2 = cdaVar != null ? cdaVar : null;
                yz7 yz7Var = (yz7) cdaVar2.d;
                if (!cdaVar2.b) {
                    cdaVar2.b = true;
                    vml.a(cdaVar2);
                    yz7Var.b(cdaVar2.b ? ((bca) cdaVar2.c).G() : 2132019252);
                    yz7Var.c();
                    break;
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                y83 y83Var = ((zse) obj).t;
                ((RecyclerViewEmptyViewSwitcher) (y83Var != null ? y83Var : null).e).b();
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((m0e) obj).b();
                break;
            case 12:
                xke xkeVar = (xke) obj;
                xkeVar.e = xkeVar.c.getItemCount();
                rma rmaVar = xkeVar.d;
                ((x93) rmaVar.c).notifyDataSetChanged();
                rmaVar.e();
                break;
            case 14:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.p((String) null);
                recyclerView.h0.f = true;
                recyclerView.l0(true);
                if (!recyclerView.e.s()) {
                    recyclerView.requestLayout();
                    break;
                }
                break;
            case 15:
                g7f g7fVar = new g7f((h7f) obj);
                while (g7fVar.hasNext()) {
                    ((szi) g7fVar.next()).a.e();
                }
                break;
            case 16:
                ((kok) obj).c();
                break;
        }
    }

    public final void c(int i, int i2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                ((c76) obj).h0();
                break;
            case 6:
                ((ar8) obj).p0();
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((m0e) obj).b();
                break;
            case 12:
                xke xkeVar = (xke) obj;
                rma rmaVar = xkeVar.d;
                ((x93) rmaVar.c).notifyItemRangeChanged(i + rmaVar.g(xkeVar), i2, (Object) null);
                break;
            case 15:
                b();
                break;
        }
    }

    public final void e(int i, int i2, Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 12:
                xke xkeVar = (xke) obj2;
                rma rmaVar = xkeVar.d;
                ((x93) rmaVar.c).notifyItemRangeChanged(i + rmaVar.g(xkeVar), i2, obj);
                break;
            case 13:
            default:
                super.e(i, i2, obj);
                break;
            case 14:
                RecyclerView recyclerView = (RecyclerView) obj2;
                recyclerView.p((String) null);
                pr prVar = recyclerView.e;
                ArrayList arrayList = (ArrayList) prVar.c;
                if (i2 >= 1) {
                    arrayList.add(prVar.t(4, i, i2, obj));
                    prVar.a |= 4;
                    if (arrayList.size() == 1) {
                        k();
                        break;
                    }
                }
                break;
        }
    }

    public final void f(int i, int i2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((jh3) obj).J0();
                break;
            case 1:
                l();
                break;
            case 3:
                ((yz7) obj).d();
                break;
            case 4:
                ((x77) obj).p();
                break;
            case 5:
                ((Runnable) obj).run();
                break;
            case 6:
                ((ar8) obj).p0();
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((m0e) obj).b();
                break;
            case 11:
                FadingRecyclerView fadingRecyclerView = ((fge) obj).A;
                if (fadingRecyclerView != null) {
                    fadingRecyclerView.H0((i + i2) - 1);
                    break;
                }
                break;
            case 12:
                xke xkeVar = (xke) obj;
                xkeVar.e += i2;
                rma rmaVar = xkeVar.d;
                ((x93) rmaVar.c).notifyItemRangeInserted(i + rmaVar.g(xkeVar), i2);
                if (xkeVar.e > 0 && xkeVar.c.getStateRestorationPolicy() == eph.b) {
                    rmaVar.e();
                    break;
                }
                break;
            case 13:
                ((ArrayList) obj).add(new ooh(i, i2));
                break;
            case 14:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.p((String) null);
                pr prVar = recyclerView.e;
                ArrayList arrayList = (ArrayList) prVar.c;
                if (i2 >= 1) {
                    arrayList.add(prVar.t(1, i, i2, (Object) null));
                    prVar.a |= 1;
                    if (arrayList.size() == 1) {
                        k();
                        break;
                    }
                }
                break;
            case 15:
                g7f g7fVar = new g7f((h7f) obj);
                while (g7fVar.hasNext()) {
                    tzi tziVar = ((szi) g7fVar.next()).a;
                    int i3 = tziVar.f;
                    for (int i4 = i; i4 < i + i2; i4++) {
                        if (tziVar.e.a(i4)) {
                            tziVar.f++;
                        }
                    }
                    if (i3 != tziVar.f) {
                        tziVar.a();
                    }
                }
                break;
            case 16:
                ((kok) obj).c();
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                j();
                break;
        }
    }

    public final void g(int i, int i2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((m0e) obj).b();
                break;
            case 12:
                xke xkeVar = (xke) obj;
                rma rmaVar = xkeVar.d;
                int iG = rmaVar.g(xkeVar);
                ((x93) rmaVar.c).notifyItemMoved(i + iG, i2 + iG);
                break;
            case 13:
                ((ArrayList) obj).add(new qoh());
                break;
            case 14:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.p((String) null);
                pr prVar = recyclerView.e;
                ArrayList arrayList = (ArrayList) prVar.c;
                if (i != i2) {
                    arrayList.add(prVar.t(8, i, i2, (Object) null));
                    prVar.a |= 8;
                    if (arrayList.size() == 1) {
                        k();
                        break;
                    }
                }
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                j();
                break;
        }
    }

    public final void h(int i, int i2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                jh3 jh3Var = (jh3) obj;
                if (jh3Var.H0()) {
                    jh3Var.I0(false);
                    MenuItem menuItem = jh3Var.C;
                    if (menuItem != null) {
                        menuItem.collapseActionView();
                    }
                }
                jh3Var.J0();
                break;
            case 1:
                l();
                break;
            case 3:
                ((yz7) obj).d();
                break;
            case 4:
                ((x77) obj).p();
                break;
            case 5:
                ((Runnable) obj).run();
                break;
            case 6:
                ((ar8) obj).p0();
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((m0e) obj).b();
                break;
            case 12:
                xke xkeVar = (xke) obj;
                xkeVar.e -= i2;
                rma rmaVar = xkeVar.d;
                ((x93) rmaVar.c).notifyItemRangeRemoved(i + rmaVar.g(xkeVar), i2);
                if (xkeVar.e < 1 && xkeVar.c.getStateRestorationPolicy() == eph.b) {
                    rmaVar.e();
                    break;
                }
                break;
            case 13:
                ((ArrayList) obj).add(new qoh());
                break;
            case 14:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.p((String) null);
                pr prVar = recyclerView.e;
                ArrayList arrayList = (ArrayList) prVar.c;
                if (i2 >= 1) {
                    arrayList.add(prVar.t(2, i, i2, (Object) null));
                    prVar.a |= 2;
                    if (arrayList.size() == 1) {
                        k();
                        break;
                    }
                }
                break;
            case 15:
                b();
                break;
            case 16:
                ((kok) obj).c();
                break;
            case 17:
                c1f c1fVar = ((mrk) obj).P;
                if (c1fVar != null && i2 == 1 && !c1fVar.c) {
                    ((vqk) c1fVar.g).v = true;
                    break;
                }
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                j();
                break;
        }
    }

    public final void i() {
        d dVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 12:
                ((xke) obj).d.e();
                break;
            case 14:
                RecyclerView recyclerView = (RecyclerView) obj;
                if (recyclerView.d != null && (dVar = recyclerView.m) != null && dVar.canRestoreState()) {
                    recyclerView.requestLayout();
                    break;
                }
                break;
        }
    }

    public final void j() {
        z5l z5lVar = (z5l) this.b;
        z5lVar.f.a0();
        ((y2c) z5lVar.y.g()).invalidate();
    }

    public final void k() {
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (!recyclerView.t || !recyclerView.s) {
            recyclerView.A = true;
            recyclerView.requestLayout();
        } else {
            dph dphVar = recyclerView.i;
            WeakHashMap weakHashMap = r5n.a;
            recyclerView.postOnAnimation(dphVar);
        }
    }

    public final void l() {
        m93 m93Var = (m93) this.b;
        m93Var.r0(2131364146).setVisible(!m93Var.r.I());
        m93Var.r0(2131362507).setVisible(!m93Var.r.I());
    }
}
