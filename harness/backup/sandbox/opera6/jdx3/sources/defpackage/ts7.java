package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.opera.android.custom_views.OperaTextInputEditText;

/* loaded from: classes.dex */
public class ts7 extends ss7 {
    public String D;

    public ts7() {
        super(2132018050, 2131755065);
    }

    @Override // defpackage.ss7
    public final al3 G0(al3 al3Var, String str) {
        if (((OperaTextInputEditText) this.t.f).isEnabled()) {
            String string = ((OperaTextInputEditText) this.t.f).getText().toString();
            return al3Var == null ? lkj.k(-1L, str, string) : lkj.k(((pl3) al3Var).getId(), str, string);
        }
        if (al3Var == null) {
            return lkj.k(-1L, str, this.D);
        }
        pl3 pl3Var = (pl3) al3Var;
        return new lkj(pl3Var.getId(), str, pl3Var.getUrl());
    }

    @Override // defpackage.ss7
    public final x80 H0() {
        return x80.b;
    }

    @Override // defpackage.ss7
    public final boolean J0() {
        return !TextUtils.isEmpty(((OperaTextInputEditText) this.t.f).getText().toString());
    }

    @Override // defpackage.ss7, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        pl3 pl3Var = (pl3) this.v;
        ((OperaTextInputEditText) this.t.d).setText(pl3Var.getTitle());
        this.t.c.setVisibility(0);
        String strF = pl3Var.f();
        this.D = strF;
        boolean zA0 = z5i.a0(strF);
        cr2 cr2Var = this.t;
        if (zA0) {
            ((OperaTextInputEditText) cr2Var.f).setText(2132017532);
            ((OperaTextInputEditText) this.t.f).setEnabled(false);
        } else {
            ((OperaTextInputEditText) cr2Var.f).setText((String) pl3Var.getUrl().b);
        }
        super.onViewCreated(view, bundle);
        N0();
    }
}
