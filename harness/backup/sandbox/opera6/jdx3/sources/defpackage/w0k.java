package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class w0k implements yl2 {
    public final String a;
    public final String b;
    public final int c;
    public final iuh d;
    public final aua e;
    public final SpannableStringBuilder f;
    public Drawable g;
    public boolean h;
    public final ArrayList i;

    public w0k(Context context, esk eskVar, String str, String str2, int i, roj rojVar, iuh iuhVar) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = iuhVar;
        aua auaVar = new aua(eskVar, new vg4(context, (byte) 18), fan.a(8.0f, context.getResources()));
        this.e = auaVar;
        this.i = new ArrayList();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sko.u(str, " "));
        spannableStringBuilder.setSpan(auaVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.f = spannableStringBuilder;
        ldh ldhVar = new ldh(1, this, w0k.class, "setIcon", "setIcon(Landroid/graphics/drawable/Drawable;)V", 0, (byte) 28);
        cbk cbkVar = (cbk) rojVar.b;
        l2g l2gVar = (l2g) rojVar.c;
        lgf lgfVar = (lgf) cbkVar.e;
        qbe.v((Context) lgfVar.c, lgfVar.a, l2gVar.b, l2gVar.f, new ilm(ldhVar, (byte) 4));
    }

    @Override // defpackage.yl2
    public final aua b() {
        return this.e;
    }

    @Override // defpackage.yl2
    public final void c() {
        b3g b3gVar = new b3g(4);
        b3gVar.a(this.c).c++;
        ((ole) this.d.b).C(b3gVar);
    }

    @Override // defpackage.yl2
    public final CharSequence d() {
        return this.f;
    }

    @Override // defpackage.yl2
    public final boolean e(xl2 xl2Var) {
        if (this.h) {
            xl2Var.c(this.g);
            return true;
        }
        xl2Var.d();
        this.i.add(new tu(xl2Var, (byte) 9));
        return true;
    }

    @Override // defpackage.yl2
    public final float f() {
        return 0.0f;
    }

    @Override // defpackage.yl2
    public final boolean g(String str) {
        Locale locale = Locale.getDefault();
        String str2 = this.a;
        return c.q(str2.toLowerCase(locale), str.toLowerCase(Locale.getDefault()), false) && str2.length() != str.length();
    }

    @Override // defpackage.yl2
    public final String h() {
        return this.b;
    }

    @Override // defpackage.yl2
    public final void i() {
        iuh iuhVar = this.d;
        LinkedHashSet linkedHashSet = (LinkedHashSet) iuhVar.c;
        int i = this.c;
        if (linkedHashSet.add(Integer.valueOf(i))) {
            b3g b3gVar = new b3g(4);
            b3gVar.a(i).b++;
            ((ole) iuhVar.b).C(b3gVar);
        }
    }

    @Override // defpackage.yl2
    public final boolean j(String str) {
        return c.m(this.f.toString(), str, true);
    }
}
