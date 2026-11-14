package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class qvl extends d63 implements abf {
    public final ebf a;
    public rzg b;

    public qvl(ebf ebfVar) {
        this.a = ebfVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.Dialog, rzg] */
    @Override // defpackage.b87
    public final rim createDialog(Context context, b2l b2lVar) {
        ?? rzgVar = new rzg(this, this.a.p(context), b2lVar);
        this.b = rzgVar;
        rzgVar.setOnDismissListener(new k93(this, (byte) 2));
        return new mx3(this.b, null);
    }

    @Override // defpackage.abf
    public final void dismiss() {
        rzg rzgVar = this.b;
        if (rzgVar != null) {
            rzgVar.dismiss();
        }
    }
}
