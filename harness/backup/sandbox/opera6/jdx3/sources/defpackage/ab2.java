package defpackage;

import android.view.View;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public abstract class ab2 extends i {
    public ja2 b;
    public final kze c;

    public ab2(View view) {
        super(view);
        this.c = new kze(og.a);
    }

    public int U() {
        return 1;
    }

    public void V(ja2 ja2Var, boolean z) {
    }

    public void X(boolean z) {
    }

    public void Y() {
    }

    public mq Z() {
        return (mq) a0();
    }

    public final ja2 a0() {
        ja2 ja2Var = this.b;
        if (ja2Var != null) {
            return ja2Var;
        }
        qp2.n("Item is null");
        return null;
    }

    public void onDestroy() {
    }
}
