package defpackage;

import android.view.View;
import com.opera.android.history.g;

/* loaded from: classes.dex */
public abstract class exn extends jxn {
    public exn(View view, tzi tziVar) {
        super(view, tziVar);
        view.setOnClickListener(t0h.i(new pkm(this, (byte) 15)));
        view.setOnLongClickListener(new zt((Object) this, (byte) 18));
    }

    public abstract void k0();

    public void l0() {
        g gVar = (g) this.f;
        if (gVar == null) {
            return;
        }
        this.b.a.d(gVar.b.getId());
    }
}
