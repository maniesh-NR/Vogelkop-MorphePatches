package defpackage;

import com.opera.android.autofill.passwords.picker.AutofillPasswordPickerActivity;

/* loaded from: classes.dex */
public final class hu2 extends l7n {
    public final gjm b;
    public final yu2 c;
    public final AutofillPasswordPickerActivity d;
    public final x5g e;
    public final zg7 f;
    public final umi g;
    public oml h;
    public final jk i = new jk();
    public final h42 j;

    public hu2(gjm gjmVar, yu2 yu2Var, AutofillPasswordPickerActivity autofillPasswordPickerActivity, x5g x5gVar, zg7 zg7Var, umi umiVar) {
        this.b = gjmVar;
        this.c = yu2Var;
        this.d = autofillPasswordPickerActivity;
        this.e = x5gVar;
        this.f = zg7Var;
        this.g = umiVar;
        h42 h42Var = new h42();
        this.j = h42Var;
        h42Var.s((kze) zg7Var.e, new ug(new gu2(this, (byte) 0), (byte) 9));
        h42Var.s((h42) zg7Var.f, new ug(new gu2(this, (byte) 1), (byte) 9));
    }

    public final void e() {
        zg7 zg7Var = this.f;
        zg7Var.i(null);
        zg7Var.m();
    }

    public final void f() {
        oml omlVar = this.h;
        if (omlVar != null) {
            omlVar.cancel(true);
        }
        this.h = new rml(((h42) this.f.f).g(), this.g).a(new gu2(this, (byte) 2)).t(new gu2(this, (byte) 3)).l();
    }
}
