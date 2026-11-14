package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

/* loaded from: classes.dex */
public final class nve extends uue {
    public final TextView p;

    public nve(View view, mve mveVar, rl3 rl3Var, p0c p0cVar) {
        super(view, mveVar, rl3Var, p0cVar);
        this.p = (TextView) view.findViewById(2131362919);
    }

    @Override // defpackage.uue, defpackage.gu8, defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) throws Resources.NotFoundException {
        int i;
        super.V(ja2Var, z);
        if (z) {
            return;
        }
        mve mveVar = (mve) this.d;
        msh mshVarM0 = m0();
        switch (mveVar.h) {
            case 0:
                i = ((dre) mshVarM0).D.e.c;
                break;
            default:
                i = ((ure) mshVarM0).G;
                break;
        }
        int i2 = i / 3600;
        int i3 = i - (i2 * 3600);
        int i4 = i3 / 60;
        String str = String.format(Locale.getDefault(), (i2 > 0 ? "%02d" : "%d").concat(":%02d"), Integer.valueOf(i4), Integer.valueOf(i3 - (i4 * 60)));
        if (i2 > 0) {
            str = String.format(Locale.getDefault(), "%d:%s", Integer.valueOf(i2), str);
        }
        this.p.setText(str);
    }

    @Override // defpackage.uue
    public final r9i u0() {
        return (mve) this.d;
    }
}
