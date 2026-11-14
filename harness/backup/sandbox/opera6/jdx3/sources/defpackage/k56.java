package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class k56 extends xkj {
    public BaseInterpolator h = lf1.a;
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
    public final ArrayList s = new ArrayList();

    public long A(long j) {
        return j;
    }

    public final void B(i iVar) {
        iVar.itemView.animate().setInterpolator(this.h);
        e(iVar);
    }

    public final boolean b(i iVar, List list) {
        return (list.isEmpty() && this.g && !iVar.isInvalid()) ? false : true;
    }

    public final void e(i iVar) {
        View view = iVar.itemView;
        if (!view.hasTransientState()) {
            view.animate().start();
        }
        view.animate().cancel();
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j56) arrayList.get(size)).a == iVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                o(iVar);
                arrayList.remove(size);
            }
        }
        x(this.l, iVar);
        if (this.i.remove(iVar)) {
            view.setAlpha(1.0f);
            c(iVar);
        }
        if (this.j.remove(iVar)) {
            view.setAlpha(1.0f);
            c(iVar);
        }
        ArrayList arrayList2 = this.o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            x(arrayList3, iVar);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.n;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((j56) arrayList5.get(size4)).a == iVar) {
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
        ArrayList arrayList6 = this.m;
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
        this.r.remove(iVar);
        this.p.remove(iVar);
        this.s.remove(iVar);
        this.q.remove(iVar);
        w();
    }

    public void f() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j56 j56Var = (j56) arrayList.get(size);
            View view = j56Var.a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            o(j56Var.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.i;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((i) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.j;
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
        ArrayList arrayList4 = this.l;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            i56 i56Var = (i56) arrayList4.get(size4);
            i iVar2 = i56Var.a;
            if (iVar2 != null) {
                y(i56Var, iVar2);
            }
            i iVar3 = i56Var.b;
            if (iVar3 != null) {
                y(i56Var, iVar3);
            }
        }
        arrayList4.clear();
        if (h()) {
            ArrayList arrayList5 = this.n;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    j56 j56Var2 = (j56) arrayList6.get(size6);
                    View view2 = j56Var2.a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    o(j56Var2.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.m;
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
            ArrayList arrayList9 = this.o;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    i56 i56Var2 = (i56) arrayList10.get(size10);
                    i iVar5 = i56Var2.a;
                    if (iVar5 != null) {
                        y(i56Var2, iVar5);
                    }
                    i iVar6 = i56Var2.b;
                    if (iVar6 != null) {
                        y(i56Var2, iVar6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            v(this.r);
            v(this.q);
            v(this.p);
            v(this.s);
            d();
        }
    }

    public final boolean h() {
        return (this.j.isEmpty() && this.l.isEmpty() && this.k.isEmpty() && this.i.isEmpty() && this.q.isEmpty() && this.r.isEmpty() && this.p.isEmpty() && this.s.isEmpty() && this.n.isEmpty() && this.m.isEmpty() && this.o.isEmpty()) ? false : true;
    }

    public final void j() {
        ArrayList arrayList = this.i;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.k;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.l;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.j;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u((i) obj);
        }
        arrayList.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.n.add(arrayList5);
            arrayList2.clear();
            e56 e56Var = new e56(this, arrayList5, (byte) 0);
            if (zIsEmpty) {
                e56Var.run();
            } else {
                ((j56) arrayList5.get(0)).a.itemView.postOnAnimationDelayed(e56Var, A(((e) this).d));
            }
        }
        if (!zIsEmpty3) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.o.add(arrayList6);
            arrayList3.clear();
            Runnable vr9Var = new vr9((byte) 7, this, arrayList6, false);
            if (zIsEmpty) {
                vr9Var.run();
            } else {
                ((i56) arrayList6.get(0)).a.itemView.postOnAnimationDelayed(vr9Var, ((e) this).d);
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.m.add(arrayList7);
        arrayList4.clear();
        e56 e56Var2 = new e56(this, arrayList7, (byte) 1);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            e56Var2.run();
        } else {
            ((i) arrayList7.get(0)).itemView.postOnAnimationDelayed(e56Var2, z(!zIsEmpty ? ((e) this).d : 0L, !zIsEmpty2 ? g() : 0L, zIsEmpty3 ? 0L : ((e) this).f));
        }
    }

    @Override // defpackage.xkj
    public boolean k(i iVar) {
        B(iVar);
        iVar.itemView.setAlpha(0.0f);
        this.j.add(iVar);
        return true;
    }

    @Override // defpackage.xkj
    public boolean l(i iVar, i iVar2, int i, int i2, int i3, int i4) {
        if (iVar == iVar2) {
            return m(iVar, i, i2, i3, i4);
        }
        float translationX = iVar.itemView.getTranslationX();
        float translationY = iVar.itemView.getTranslationY();
        float alpha = iVar.itemView.getAlpha();
        B(iVar);
        int i5 = (int) ((i3 - i) - translationX);
        iVar.itemView.setTranslationX(translationX);
        iVar.itemView.setTranslationY(translationY);
        iVar.itemView.setAlpha(alpha);
        B(iVar2);
        iVar2.itemView.setTranslationX(-i5);
        iVar2.itemView.setTranslationY(-((int) ((i4 - i2) - translationY)));
        iVar2.itemView.setAlpha(0.0f);
        i56 i56Var = new i56();
        i56Var.a = iVar;
        i56Var.b = iVar2;
        i56Var.c = i;
        i56Var.d = i2;
        i56Var.e = i3;
        i56Var.f = i4;
        this.l.add(i56Var);
        return true;
    }

    @Override // defpackage.xkj
    public boolean m(i iVar, int i, int i2, int i3, int i4) {
        View view = iVar.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) iVar.itemView.getTranslationY());
        B(iVar);
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
        j56 j56Var = new j56();
        j56Var.a = iVar;
        j56Var.b = translationX;
        j56Var.c = translationY;
        j56Var.d = i3;
        j56Var.e = i4;
        this.k.add(j56Var);
        return true;
    }

    @Override // defpackage.xkj
    public boolean n(i iVar) {
        B(iVar);
        this.i.add(iVar);
        return true;
    }

    public void s(i iVar) {
        View view = iVar.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.p.add(iVar);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(((e) this).c).setListener(new f56(this, iVar, view, viewPropertyAnimatorAnimate, (byte) 1)).start();
    }

    public void t(i iVar, int i, int i2, int i3, int i4) {
        View view = iVar.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.q.add(iVar);
        viewPropertyAnimatorAnimate.setDuration(g()).setListener(new g56(this, iVar, i5, view, i6, viewPropertyAnimatorAnimate, (byte) 0)).start();
    }

    public void u(i iVar) {
        View view = iVar.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.r.add(iVar);
        viewPropertyAnimatorAnimate.setDuration(((e) this).d).alpha(0.0f).setListener(new f56(this, iVar, viewPropertyAnimatorAnimate, view)).start();
    }

    public final void v(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((i) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    public final boolean w() {
        if (h()) {
            return false;
        }
        d();
        return true;
    }

    public final void x(ArrayList arrayList, i iVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i56 i56Var = (i56) arrayList.get(size);
            if (y(i56Var, iVar) && i56Var.a == null && i56Var.b == null) {
                arrayList.remove(i56Var);
            }
        }
    }

    public final boolean y(i56 i56Var, i iVar) {
        if (i56Var.b == iVar) {
            i56Var.b = null;
        } else {
            if (i56Var.a != iVar) {
                return false;
            }
            i56Var.a = null;
        }
        iVar.itemView.setAlpha(1.0f);
        iVar.itemView.setTranslationX(0.0f);
        iVar.itemView.setTranslationY(0.0f);
        c(iVar);
        return true;
    }

    public long z(long j, long j2, long j3) {
        return Math.max(j2, j3) + j;
    }
}
