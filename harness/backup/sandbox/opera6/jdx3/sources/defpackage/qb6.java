package defpackage;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.OperaApplication;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final /* synthetic */ class qb6 implements vlf, n5o {
    public final /* synthetic */ OperaListItem a;

    public /* synthetic */ qb6(OperaListItem operaListItem) {
        this.a = operaListItem;
    }

    public final Object g(Object obj) {
        v0g.m(this.a, (String) obj);
        return null;
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        ConstraintLayout constraintLayout = this.a;
        String string = constraintLayout.getTag().toString();
        Context context = constraintLayout.getContext();
        String[] strArr = OperaApplication.K;
        ((OperaApplication) context.getApplicationContext()).J().V(constraintLayout.isChecked() ? 1 : 0, string);
    }
}
