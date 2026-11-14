package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* loaded from: classes.dex */
public final class een extends lgn {
    public final /* synthetic */ fen d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public een(fen fenVar) {
        super(fenVar);
        Objects.requireNonNull(fenVar);
        this.d = fenVar;
    }

    @Override // defpackage.lgn
    public final rcn a(ViewGroup viewGroup, View view) throws Resources.NotFoundException {
        Context context = view.getContext();
        String strA = ((bxc) cxc.t(context).i()).a(9, context);
        if (strA == null) {
            strA = context.getString(2132022190);
        }
        String str = strA;
        Context context2 = view.getContext();
        String strA2 = ((bxc) cxc.t(context2).i()).a(10, context2);
        if (strA2 == null) {
            strA2 = context2.getString(2132022189);
        }
        rcn rcnVar = new rcn(viewGroup, view, 0, str, strA2, null, 2131558572, mf0.e);
        rcnVar.a(new den(this, view));
        return rcnVar;
    }
}
