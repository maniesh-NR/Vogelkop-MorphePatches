package defpackage;

import android.os.Bundle;
import android.view.View;
import com.opera.android.custom_views.OperaTextInputEditText;

/* loaded from: classes.dex */
public class yr extends ss7 {
    public yr() {
        super(2132018052, 0);
    }

    @Override // defpackage.ss7, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        pl3 pl3Var = (pl3) getArguments().getParcelable("bookmark");
        ((OperaTextInputEditText) this.t.d).setText(pl3Var.getTitle());
        this.t.c.setVisibility(0);
        ((OperaTextInputEditText) this.t.f).setText((String) pl3Var.getUrl().b);
        super.onViewCreated(view, bundle);
    }
}
