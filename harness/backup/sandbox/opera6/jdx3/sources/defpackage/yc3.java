package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.widget.spotlightcarousel.SpotlightCarouselLayoutManager;
import com.opera.android.widget.spotlightcarousel.SpotlightCarouselRecyclerView;

/* loaded from: classes.dex */
public final class yc3 extends oph {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yc3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v9, types: [android.view.View, com.opera.android.widget.spotlightcarousel.SpotlightCarouselRecyclerView] */
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        View viewY;
        fge fgeVar;
        RecyclerView recyclerView2;
        boolean zCanScrollVertically;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                zc3 zc3Var = (zc3) obj;
                int iS = -1;
                if (i != 1) {
                    zc3Var.j = -1;
                    break;
                } else if (zc3Var.j == -1) {
                    if (zc3Var.i != null && (viewY = zc3Var.y()) != null) {
                        iS = RecyclerView.S(viewY);
                    }
                    zc3Var.j = iS;
                    break;
                }
                break;
            case 3:
                if (i == 0 && (recyclerView2 = (fgeVar = (fge) obj).A) != null && (zCanScrollVertically = recyclerView2.canScrollVertically(1)) != fgeVar.E) {
                    fgeVar.E = zCanScrollVertically;
                    fgeVar.D.animate().alpha(zCanScrollVertically ? 1.0f : 0.0f).withStartAction(new yqd(fgeVar, (byte) 8)).withEndAction(new gh2((byte) 5, fgeVar, zCanScrollVertically)).setDuration(150L).start();
                    break;
                }
                break;
            case 5:
                xoi xoiVar = (xoi) obj;
                if (i == 0 && xoiVar.a()) {
                    xoiVar.b.U(xoiVar);
                    break;
                }
                break;
            case 6:
                d0k d0kVar = (d0k) obj;
                if (i == 0) {
                    d0kVar.k.D();
                    if (!d0kVar.l) {
                        d0kVar.l = true;
                        x5f x5fVar = d0kVar.c;
                        if (x5fVar.h) {
                            zpa zpaVar = x5fVar.d;
                            x56 x56VarF = zpa.F();
                            am2.f(zpaVar, x56VarF).b.p(18, 1, 1L);
                            x5fVar.U0(x56VarF);
                            break;
                        }
                    }
                }
                break;
            case 7:
                ?? r4 = (SpotlightCarouselRecyclerView) obj;
                SpotlightCarouselLayoutManager spotlightCarouselLayoutManager = r4.K0;
                if (spotlightCarouselLayoutManager != null && i == 0) {
                    spotlightCarouselLayoutManager.startSmoothScroll(new v1k(spotlightCarouselLayoutManager.f, r4.getContext(), spotlightCarouselLayoutManager));
                    break;
                }
                break;
            case 8:
                p77 p77Var = (p77) obj;
                p77Var.f(c6l.c, new dnj(p77Var, (byte) 28));
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((aan) obj).d();
                break;
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                eq8 eq8Var = (eq8) obj;
                int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int i3 = eq8Var.a;
                int iComputeVerticalScrollRange = eq8Var.s.computeVerticalScrollRange();
                int i4 = eq8Var.r;
                eq8Var.t = iComputeVerticalScrollRange - i4 > 0 && i4 >= i3;
                int iComputeHorizontalScrollRange = eq8Var.s.computeHorizontalScrollRange();
                int i5 = eq8Var.q;
                boolean z = iComputeHorizontalScrollRange - i5 > 0 && i5 >= i3;
                eq8Var.u = z;
                if (!eq8Var.t) {
                    if (!z) {
                        if (eq8Var.v != 0) {
                            eq8Var.h(0);
                            break;
                        }
                    }
                } else {
                    float f = i4;
                    eq8Var.l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
                    eq8Var.k = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
                }
                if (eq8Var.u) {
                    float f2 = iComputeHorizontalScrollOffset;
                    float f3 = i5;
                    eq8Var.o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
                    eq8Var.n = Math.min(i5, (i5 * i5) / iComputeHorizontalScrollRange);
                }
                byte b2 = eq8Var.v;
                if (b2 == 0 || b2 == 1) {
                    eq8Var.h(1);
                    break;
                }
                break;
            case 2:
                if (i != 0 || i2 != 0) {
                    ar8 ar8Var = (ar8) obj;
                    if (ar8Var.m) {
                        ar8Var.i.d(ar8Var.v);
                        break;
                    }
                }
                break;
            case 4:
                if (Math.abs(i2) > 0) {
                    ((knh) obj).I0();
                    break;
                }
                break;
            case 5:
                xoi xoiVar = (xoi) obj;
                if (i2 > 0 || xoiVar.a() || !sle.d()) {
                    xoiVar.b.U(xoiVar);
                    break;
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((aan) obj).d();
                break;
        }
    }
}
