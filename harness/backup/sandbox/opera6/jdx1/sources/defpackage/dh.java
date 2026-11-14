package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.mediarouter.app.d;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class dh implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dh(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        byte b = this.a;
        byte b2 = 0;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                hh hhVar = (hh) obj;
                if (hhVar.c()) {
                    if (!hhVar.isShown()) {
                        hhVar.b().dismiss();
                        break;
                    } else {
                        hhVar.b().show();
                        ShareActionProvider shareActionProvider = hhVar.i;
                        if (shareActionProvider != null) {
                            shareActionProvider.j(true);
                            break;
                        }
                    }
                }
                break;
            case 1:
                qq1 qq1Var = (qq1) obj;
                pq1 pq1Var = qq1Var.f;
                if (!pq1Var.a()) {
                    pq1Var.i(qq1Var.getTextDirection(), qq1Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = qq1Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            case 2:
                nq1 nq1Var = (nq1) obj;
                qq1 qq1Var2 = nq1Var.G;
                if (!qq1Var2.isAttachedToWindow() || !qq1Var2.getGlobalVisibleRect(nq1Var.E)) {
                    nq1Var.dismiss();
                    break;
                } else {
                    nq1Var.r();
                    nq1Var.show();
                    break;
                }
            case 3:
                nl4 nl4Var = (nl4) obj;
                ArrayList arrayList = nl4Var.i;
                if (nl4Var.a() && arrayList.size() > 0 && !((ml4) arrayList.get(0)).a.A) {
                    View view = nl4Var.p;
                    if (view != null && view.isShown()) {
                        int size = arrayList.size();
                        while (b2 < size) {
                            ((ml4) arrayList.get(b2)).a.show();
                            b2++;
                        }
                        break;
                    } else {
                        nl4Var.dismiss();
                        break;
                    }
                }
                break;
            case 4:
                d dVar = (d) obj;
                dVar.F.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                HashSet hashSet = dVar.I;
                if (hashSet != null && hashSet.size() != 0) {
                    rmd rmdVar = new rmd(dVar, b2);
                    int firstVisiblePosition = dVar.F.getFirstVisiblePosition();
                    boolean z = false;
                    while (i < dVar.F.getChildCount()) {
                        View childAt = dVar.F.getChildAt(i);
                        if (dVar.I.contains((cod) dVar.G.getItem(firstVisiblePosition + i))) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                            alphaAnimation.setDuration(dVar.j0);
                            alphaAnimation.setFillEnabled(true);
                            alphaAnimation.setFillAfter(true);
                            z = z;
                            if (!z) {
                                alphaAnimation.setAnimationListener(rmdVar);
                                z = true;
                            }
                            childAt.clearAnimation();
                            childAt.startAnimation(alphaAnimation);
                        }
                        i++;
                        z = z;
                    }
                    break;
                } else {
                    dVar.l(true);
                    break;
                }
                break;
            default:
                l3k l3kVar = (l3k) obj;
                hud hudVar = l3kVar.i;
                if (l3kVar.a() && !hudVar.A) {
                    View view2 = l3kVar.n;
                    if (view2 != null && view2.isShown()) {
                        hudVar.show();
                        break;
                    } else {
                        l3kVar.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
