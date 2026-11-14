package defpackage;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class gro extends ijo {
    public TextView h;
    public ImageView i;
    public TextView j;

    @Override // defpackage.ejo
    public final void c(cie cieVar) {
        cieVar.getClass();
        b();
        String str = cieVar.p;
        String str2 = cieVar.q;
        String str3 = cieVar.v;
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(str2);
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setText(str3);
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            ejo.e(imageView, str);
        }
        this.h.setText(cieVar.r);
        boolean z = cieVar.s;
        TextView textView3 = this.j;
        if (z) {
            textView3.setVisibility(0);
            this.j.setText(cieVar.t);
        } else {
            textView3.setVisibility(8);
        }
        ejo.e(this.i, cieVar.o);
    }

    @Override // defpackage.ejo
    public final void f() {
        RelativeLayout relativeLayout = (RelativeLayout) this.a;
        this.i = (ImageView) relativeLayout.findViewById(2131361964);
        this.h = (TextView) relativeLayout.findViewById(2131361963);
        this.j = (TextView) relativeLayout.findViewById(2131361951);
    }

    @Override // defpackage.ejo
    public final void g() {
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        this.i.setImageBitmap(null);
    }
}
