package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class sr6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ xr6 c;

    public /* synthetic */ sr6(xr6 xr6Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.c = xr6Var;
        this.b = arrayList;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.recyclerview.widget.e, xr6] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.recyclerview.widget.e, xkj, xr6] */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                int size = arrayList.size();
                while (true) {
                    ?? r4 = this.c;
                    if (i >= size) {
                        arrayList.clear();
                        r4.m.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i);
                        i++;
                        wr6 wr6Var = (wr6) obj;
                        i iVar = wr6Var.a;
                        int i2 = wr6Var.b;
                        int i3 = wr6Var.c;
                        int i4 = wr6Var.d;
                        int i5 = wr6Var.e;
                        View view = iVar.itemView;
                        int i6 = i4 - i2;
                        int i7 = i5 - i3;
                        if (i6 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i7 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        r4.p.add(iVar);
                        viewPropertyAnimatorAnimate.setDuration(r4.e).setListener(new g56((xkj) r4, iVar, i6, view, i7, viewPropertyAnimatorAnimate, (byte) 1)).start();
                    }
                }
            default:
                int size2 = arrayList.size();
                while (true) {
                    ?? r3 = this.c;
                    if (i >= size2) {
                        arrayList.clear();
                        r3.l.remove(arrayList);
                        break;
                    } else {
                        Object obj2 = arrayList.get(i);
                        i++;
                        i iVar2 = (i) obj2;
                        View view2 = iVar2.itemView;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
                        r3.o.add(iVar2);
                        viewPropertyAnimatorAnimate2.alpha(1.0f).setDuration(r3.c).setListener(new tr6((xr6) r3, iVar2, view2, viewPropertyAnimatorAnimate2)).start();
                    }
                }
        }
    }
}
