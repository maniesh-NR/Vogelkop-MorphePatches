package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class hro extends ijo {
    public TextView h;
    public ImageView i;
    public ImageView j;
    public ImageView k;
    public TextView l;

    @Override // defpackage.ejo
    public final void c(cie cieVar) {
        boolean zIsEmpty = TextUtils.isEmpty(cieVar.p);
        ImageView imageView = this.b;
        if (zIsEmpty) {
            b();
            RelativeLayout relativeLayout = this.f;
            if (relativeLayout != null) {
                relativeLayout.setPadding(relativeLayout.getPaddingLeft(), 0, relativeLayout.getPaddingRight(), 0);
            }
            LinearLayout linearLayout = this.g;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            TextView textView = this.e;
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else {
            b();
            String str = cieVar.p;
            String str2 = cieVar.q;
            String str3 = cieVar.v;
            TextView textView2 = this.c;
            if (textView2 != null) {
                textView2.setText(str2);
            }
            TextView textView3 = this.d;
            if (textView3 != null) {
                textView3.setText(str3);
            }
            if (imageView != null) {
                ejo.e(imageView, str);
            }
        }
        String str4 = cieVar.r;
        boolean zIsEmpty2 = TextUtils.isEmpty(str4);
        TextView textView4 = this.h;
        if (zIsEmpty2) {
            textView4.setVisibility(8);
        } else {
            textView4.setVisibility(0);
            this.h.setText(str4);
        }
        boolean z = cieVar.s;
        TextView textView5 = this.l;
        if (z) {
            textView5.setVisibility(0);
            this.l.setText(cieVar.t);
        } else {
            textView5.setVisibility(8);
        }
        if (!TextUtils.isEmpty(cieVar.w)) {
            ejo.e(this.i, cieVar.w);
        }
        if (!TextUtils.isEmpty(cieVar.x)) {
            ejo.e(this.j, cieVar.x);
        }
        if (TextUtils.isEmpty(cieVar.y)) {
            return;
        }
        ejo.e(this.k, cieVar.y);
    }

    @Override // defpackage.ejo
    public final void f() {
        RelativeLayout relativeLayout = (RelativeLayout) this.a;
        this.h = (TextView) relativeLayout.findViewById(2131361969);
        this.i = (ImageView) relativeLayout.findViewById(2131361970);
        this.j = (ImageView) relativeLayout.findViewById(2131361971);
        this.k = (ImageView) relativeLayout.findViewById(2131361972);
        this.l = (TextView) relativeLayout.findViewById(2131361951);
    }

    @Override // defpackage.ejo
    public final void g() {
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        this.i.setImageBitmap(null);
        this.j.setImageBitmap(null);
        this.k.setImageBitmap(null);
    }
}
