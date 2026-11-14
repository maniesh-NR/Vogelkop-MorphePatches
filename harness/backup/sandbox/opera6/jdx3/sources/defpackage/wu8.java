package defpackage;

import android.view.View;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.CardView;

/* loaded from: classes.dex */
public abstract class wu8 extends ab2 implements ev8, rjm, y9n {
    public boolean d;
    public boolean e;
    public boolean f;

    public wu8(View view) {
        super(view);
        ((CardView) ((i) this).itemView).a.d(3);
    }

    @Override // defpackage.y9n
    public final void T(View view, int i, int i2) {
        this.d = i > 0;
        b0();
    }

    @Override // defpackage.ab2
    public void Y() {
        if (this.f) {
            this.f = false;
            c0();
        }
    }

    @Override // defpackage.rjm
    public final void b(sjm sjmVar) {
        this.e = sjmVar.a();
        b0();
    }

    public final void b0() {
        boolean z = this.e && this.d;
        if (z && !this.f) {
            this.f = true;
            e0();
        }
        if (z || !this.f) {
            return;
        }
        this.f = false;
        c0();
    }

    public abstract void c0();

    public abstract void e0();
}
