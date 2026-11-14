package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class xr6 extends xkj {
    public static TimeInterpolator s;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList o = new ArrayList();
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();
    public final ArrayList r = new ArrayList();

    public final boolean b(i iVar, List list) {
        return (list.isEmpty() && ((xkj) this).g && !iVar.isInvalid()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(i iVar) {
        View view = iVar.itemView;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((wr6) arrayList.get(size)).a == iVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                o(iVar);
                arrayList.remove(size);
            }
        }
        u(this.k, iVar);
        if (this.h.remove(iVar)) {
            view.setAlpha(1.0f);
            c(iVar);
        }
        if (this.i.remove(iVar)) {
            view.setAlpha(1.0f);
            c(iVar);
        }
        ArrayList arrayList2 = this.n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            u(arrayList3, iVar);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((wr6) arrayList5.get(size4)).a == iVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    o(iVar);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(iVar)) {
                view.setAlpha(1.0f);
                c(iVar);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.q.remove(iVar);
        this.o.remove(iVar);
        this.r.remove(iVar);
        this.p.remove(iVar);
        t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            wr6 wr6Var = (wr6) arrayList.get(size);
            View view = wr6Var.a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            o(wr6Var.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((i) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            i iVar = (i) arrayList3.get(size3);
            iVar.itemView.setAlpha(1.0f);
            c(iVar);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            vr6 vr6Var = (vr6) arrayList4.get(size4);
            i iVar2 = vr6Var.a;
            if (iVar2 != null) {
                v(vr6Var, iVar2);
            }
            i iVar3 = vr6Var.b;
            if (iVar3 != null) {
                v(vr6Var, iVar3);
            }
        }
        arrayList4.clear();
        if (h()) {
            ArrayList arrayList5 = this.m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    wr6 wr6Var2 = (wr6) arrayList6.get(size6);
                    View view2 = wr6Var2.a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    o(wr6Var2.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    i iVar4 = (i) arrayList8.get(size8);
                    iVar4.itemView.setAlpha(1.0f);
                    c(iVar4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    vr6 vr6Var2 = (vr6) arrayList10.get(size10);
                    i iVar5 = vr6Var2.a;
                    if (iVar5 != null) {
                        v(vr6Var2, iVar5);
                    }
                    i iVar6 = vr6Var2.b;
                    if (iVar6 != null) {
                        v(vr6Var2, iVar6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            s(this.q);
            s(this.p);
            s(this.o);
            s(this.r);
            d();
        }
    }

    public final boolean h() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j() {
        ArrayList arrayList = this.h;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.j;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.k;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.i;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            i iVar = (i) arrayList.get(i);
            View view = iVar.itemView;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.q.add(iVar);
            viewPropertyAnimatorAnimate.setDuration(this.d).alpha(0.0f).setListener(new tr6(this, iVar, viewPropertyAnimatorAnimate, view)).start();
        }
        arrayList.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.m.add(arrayList5);
            arrayList2.clear();
            sr6 sr6Var = new sr6(this, arrayList5, (byte) 0);
            if (zIsEmpty) {
                sr6Var.run();
            } else {
                View view2 = ((wr6) arrayList5.get(0)).a.itemView;
                long j = this.d;
                WeakHashMap weakHashMap = r5n.a;
                view2.postOnAnimationDelayed(sr6Var, j);
            }
        }
        if (!zIsEmpty3) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.n.add(arrayList6);
            arrayList3.clear();
            Runnable wr9Var = new wr9((byte) 6, this, arrayList6, false);
            if (zIsEmpty) {
                wr9Var.run();
            } else {
                View view3 = ((vr6) arrayList6.get(0)).a.itemView;
                long j2 = this.d;
                WeakHashMap weakHashMap2 = r5n.a;
                view3.postOnAnimationDelayed(wr9Var, j2);
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.l.add(arrayList7);
        arrayList4.clear();
        sr6 sr6Var2 = new sr6(this, arrayList7, (byte) 1);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            sr6Var2.run();
            return;
        }
        long jMax = Math.max(!zIsEmpty2 ? this.e : 0L, zIsEmpty3 ? 0L : this.f) + (!zIsEmpty ? this.d : 0L);
        View view4 = ((i) arrayList7.get(0)).itemView;
        WeakHashMap weakHashMap3 = r5n.a;
        view4.postOnAnimationDelayed(sr6Var2, jMax);
    }

    public final boolean k(i iVar) {
        w(iVar);
        iVar.itemView.setAlpha(0.0f);
        this.i.add(iVar);
        return true;
    }

    public final boolean l(i iVar, i iVar2, int i, int i2, int i3, int i4) {
        if (iVar == iVar2) {
            return m(iVar, i, i2, i3, i4);
        }
        float translationX = iVar.itemView.getTranslationX();
        float translationY = iVar.itemView.getTranslationY();
        float alpha = iVar.itemView.getAlpha();
        w(iVar);
        int i5 = (int) ((i3 - i) - translationX);
        iVar.itemView.setTranslationX(translationX);
        iVar.itemView.setTranslationY(translationY);
        iVar.itemView.setAlpha(alpha);
        w(iVar2);
        iVar2.itemView.setTranslationX(-i5);
        iVar2.itemView.setTranslationY(-((int) ((i4 - i2) - translationY)));
        iVar2.itemView.setAlpha(0.0f);
        vr6 vr6Var = new vr6();
        vr6Var.a = iVar;
        vr6Var.b = iVar2;
        vr6Var.c = i;
        vr6Var.d = i2;
        vr6Var.e = i3;
        vr6Var.f = i4;
        this.k.add(vr6Var);
        return true;
    }

    public final boolean m(i iVar, int i, int i2, int i3, int i4) {
        View view = iVar.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) iVar.itemView.getTranslationY());
        w(iVar);
        int i5 = i4 - translationY;
        if (i3 - translationX != 0) {
            view.setTranslationX(-r1);
        } else if (i5 == 0) {
            o(iVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationY(-i5);
        }
        wr6 wr6Var = new wr6();
        wr6Var.a = iVar;
        wr6Var.b = translationX;
        wr6Var.c = translationY;
        wr6Var.d = i3;
        wr6Var.e = i4;
        this.j.add(wr6Var);
        return true;
    }

    public boolean n(i iVar) {
        w(iVar);
        this.h.add(iVar);
        return true;
    }

    public final void s(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((i) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t() {
        if (h()) {
            return;
        }
        d();
    }

    public final void u(ArrayList arrayList, i iVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            vr6 vr6Var = (vr6) arrayList.get(size);
            if (v(vr6Var, iVar) && vr6Var.a == null && vr6Var.b == null) {
                arrayList.remove(vr6Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean v(vr6 vr6Var, i iVar) {
        if (vr6Var.b == iVar) {
            vr6Var.b = null;
        } else {
            if (vr6Var.a != iVar) {
                return false;
            }
            vr6Var.a = null;
        }
        iVar.itemView.setAlpha(1.0f);
        iVar.itemView.setTranslationX(0.0f);
        iVar.itemView.setTranslationY(0.0f);
        c(iVar);
        return true;
    }

    public final void w(i iVar) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        iVar.itemView.animate().setInterpolator(s);
        e(iVar);
    }
}
