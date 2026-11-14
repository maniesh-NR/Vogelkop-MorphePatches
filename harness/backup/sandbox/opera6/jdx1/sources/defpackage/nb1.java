package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class nb1 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ ob1 a;

    public nb1(ob1 ob1Var) {
        this.a = ob1Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.c.removeCallbacks(this);
        this.a.P();
        ob1 ob1Var = this.a;
        synchronized (ob1Var.d) {
            if (ob1Var.i) {
                ob1Var.i = false;
                ArrayList arrayList = ob1Var.f;
                ob1Var.f = ob1Var.g;
                ob1Var.g = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.P();
        ob1 ob1Var = this.a;
        synchronized (ob1Var.d) {
            if (ob1Var.f.isEmpty()) {
                ob1Var.b.removeFrameCallback(this);
                ob1Var.i = false;
            }
        }
    }
}
