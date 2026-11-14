package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class r2f extends o93 {
    public final /* synthetic */ byte c = 0;
    public boolean d;
    public final Object e;

    public r2f(String str, boolean z) {
        this.e = str;
        this.d = z;
    }

    public r2f(r6l r6lVar) {
        this.e = r6lVar;
    }

    @Override // defpackage.o93
    public final gtj e(View view) {
        byte b = 0;
        switch (this.c) {
            case 0:
                gtj gtjVarE = gtj.e(view, view.getResources().getString(2132020073), 0);
                gtjVarE.f(2132018204, new zvd(this, (byte) 5));
                return gtjVarE;
            default:
                gtj gtjVarD = gtj.d(view, ((r6l) this.e).h(), 5000, null);
                gtjVarD.f(2132021998, new pkm(this, b));
                return gtjVarD;
        }
    }
}
