package defpackage;

import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class lz0 implements View.OnClickListener {
    public final bz0 a;
    public final byte b;
    public final hp2 c;
    public final /* synthetic */ nz0 d;

    /* JADX WARN: Multi-variable type inference failed */
    public lz0(nz0 nz0Var, bz0 bz0Var, int i, hp2 hp2Var) {
        this.d = nz0Var;
        this.a = bz0Var;
        this.b = i;
        this.c = hp2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.c.a()) {
            return;
        }
        mz0 mz0Var = this.d.mClickHandler;
        Objects.requireNonNull(mz0Var);
        byte b = this.b;
        bz0 bz0Var = this.a;
        mz0Var.onClick(bz0Var, b);
        bz0Var.dismiss();
    }
}
