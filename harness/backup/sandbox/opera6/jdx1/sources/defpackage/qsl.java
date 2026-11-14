package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class qsl implements lud {
    public itd a;
    public ptd b;
    public final /* synthetic */ Toolbar c;

    public qsl(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.lud
    public final boolean b(akk akkVar) {
        return false;
    }

    @Override // defpackage.lud
    public final boolean c(ptd ptdVar) {
        Toolbar toolbar = this.c;
        KeyEvent.Callback callback = toolbar.h;
        if (callback instanceof j85) {
            ((j85) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.h);
        toolbar.removeView(toolbar.g);
        toolbar.h = null;
        ArrayList arrayList = toolbar.D;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.b = null;
        toolbar.requestLayout();
        ptdVar.C = false;
        ptdVar.n.p(false);
        toolbar.G();
        return true;
    }

    @Override // defpackage.lud
    public final void e() {
        if (this.b != null) {
            itd itdVar = this.a;
            if (itdVar != null) {
                int size = itdVar.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            c(this.b);
        }
    }

    @Override // defpackage.lud
    public final void f(itd itdVar, boolean z) {
    }

    @Override // defpackage.lud
    public final boolean g() {
        return false;
    }

    @Override // defpackage.lud
    public final boolean h(ptd ptdVar) {
        Toolbar toolbar = this.c;
        toolbar.c();
        ViewParent parent = toolbar.g.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.g);
            }
            toolbar.addView(toolbar.g);
        }
        View actionView = ptdVar.getActionView();
        toolbar.h = actionView;
        this.b = ptdVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.h);
            }
            rsl rslVarH = Toolbar.h();
            rslVarH.a = (toolbar.m & 112) | 8388611;
            rslVarH.b = (byte) 2;
            toolbar.h.setLayoutParams(rslVarH);
            toolbar.addView(toolbar.h);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((rsl) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.D.add(childAt);
            }
        }
        toolbar.requestLayout();
        ptdVar.C = true;
        ptdVar.n.p(false);
        KeyEvent.Callback callback = toolbar.h;
        if (callback instanceof j85) {
            ((j85) callback).onActionViewExpanded();
        }
        toolbar.G();
        return true;
    }

    @Override // defpackage.lud
    public final void i(Context context, itd itdVar) {
        ptd ptdVar;
        itd itdVar2 = this.a;
        if (itdVar2 != null && (ptdVar = this.b) != null) {
            itdVar2.d(ptdVar);
        }
        this.a = itdVar;
    }
}
