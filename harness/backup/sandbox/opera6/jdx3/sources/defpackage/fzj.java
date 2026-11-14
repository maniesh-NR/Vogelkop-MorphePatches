package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import java.util.Locale;

/* loaded from: classes.dex */
public final class fzj implements yl2 {
    public final String a;
    public final String b;
    public final SpannableStringBuilder c;
    public final aua d;
    public final Drawable e;
    public final int f;
    public final boolean g;
    public final qpm h;
    public final Runnable i;

    public fzj(Context context, esk eskVar, String str, String str2, int i, boolean z, Drawable drawable, qpm qpmVar, Runnable runnable) {
        this.a = str;
        this.b = str2;
        this.f = i;
        this.g = z;
        this.h = qpmVar;
        this.i = runnable;
        aua auaVar = new aua(eskVar, new vg4(context, (byte) 17), fan.a(8.0f, context.getResources()));
        this.d = auaVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sko.u(str, " "));
        spannableStringBuilder.setSpan(auaVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.c = spannableStringBuilder;
        this.e = drawable;
    }

    @Override // defpackage.yl2
    public final aua b() {
        return this.d;
    }

    @Override // defpackage.yl2
    public final void c() {
        this.i.run();
    }

    @Override // defpackage.yl2
    public final CharSequence d() {
        return this.c;
    }

    @Override // defpackage.yl2
    public final boolean e(xl2 xl2Var) {
        xl2Var.c(this.e);
        return true;
    }

    @Override // defpackage.yl2
    public final float f() {
        return this.g ? r1 + 10000 : this.f + 0.5f;
    }

    @Override // defpackage.yl2
    public final boolean g(String str) {
        Locale locale = Locale.getDefault();
        String str2 = this.a;
        return str2.toLowerCase(locale).startsWith(str.toLowerCase(Locale.getDefault())) && str2.length() != str.length();
    }

    @Override // defpackage.yl2
    public final String h() {
        return this.b;
    }

    @Override // defpackage.yl2
    public final void i() {
        qpm qpmVar = this.h;
        if (qpmVar != null) {
            qpmVar.run();
        }
    }

    @Override // defpackage.yl2
    public final boolean j(String str) {
        return this.c.toString().equalsIgnoreCase(str);
    }
}
