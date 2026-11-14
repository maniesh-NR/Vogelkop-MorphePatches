package defpackage;

import com.opera.android.custom_views.FadingRecyclerView;

/* loaded from: classes.dex */
public final class rqk implements Runnable {
    public final FadingRecyclerView a;
    public final hqk b;
    public final int[] c;
    public final qqk d;
    public pa3 e;
    public int f;

    public rqk(FadingRecyclerView fadingRecyclerView, hqk hqkVar) {
        int i;
        this.a = fadingRecyclerView;
        this.b = hqkVar;
        int[] iArr = new int[20];
        for (int i2 = 0; i2 < 20; i2++) {
            if (i2 != 0) {
                i = 1;
                if (i2 != 1) {
                    i = 0;
                }
            } else {
                i = 2;
            }
            iArr[i2] = i;
        }
        this.c = iArr;
        qqk qqkVar = new qqk();
        this.d = qqkVar;
        this.a.D0(qqkVar);
    }

    public final void a() {
        if (this.f < this.c.length || this.e != null) {
            ava.a.a(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        hqk hqkVar = this.b;
        if (hqkVar.y.size() != 0) {
            return;
        }
        pa3 pa3Var = this.e;
        if (pa3Var != null) {
            if (pa3Var.V()) {
                pa3Var.X();
            }
            if (!pa3Var.V()) {
                this.e = null;
            }
            a();
            return;
        }
        pa3 pa3Var2 = (pa3) hqkVar.createViewHolder(this.a, this.c[this.f]);
        qqk qqkVar = this.d;
        qqkVar.l.add(pa3Var2);
        qqkVar.F(pa3Var2);
        if (pa3Var2.V()) {
            this.e = pa3Var2;
        }
        this.f++;
        a();
    }
}
