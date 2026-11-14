package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class x6n extends o6n implements h4a, y9n {
    public final tjn c;
    public final bt1 d;

    public x6n(Context context, int i, tjn tjnVar) {
        super(new y46(context, (hcb) null, new k6n(tjnVar, (byte) 5)), i, tjnVar);
        this.c = tjnVar;
        this.d = bt1.a(LayoutInflater.from(((i) this).itemView.getContext()), (ViewGroup) ((i) this).itemView);
        q9n.f(((i) this).itemView, new svk(this, (byte) 17));
        ((i) this).itemView.setOnClickListener(new pkm(this, (byte) 6));
    }

    @Override // defpackage.y9n
    public final void T(View view, int i, int i2) {
        if (i2 >= 100 || i < 100) {
            return;
        }
        this.c.l();
    }

    @Override // defpackage.h4a
    public final void l(Rect rect) {
        rect.top = fan.a(16.0f, ((i) this).itemView.getResources());
    }
}
