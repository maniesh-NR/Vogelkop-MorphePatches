package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.opera.android.annotations.WeakOwner;

/* loaded from: classes.dex */
public final class kyg extends an8 {

    @NonNull
    @WeakOwner
    private final b2l b;

    public kyg(zcj zcjVar, b2l b2lVar) {
        super(zcjVar);
        this.b = b2lVar;
    }

    @Override // defpackage.wcj
    public final void a(Context context) {
        this.a.e(".print_share");
        dx3 dx3VarP = q9n.p(context);
        if (dx3VarP != null) {
            hyg.n(dx3VarP, this.b);
        }
    }

    @Override // defpackage.wcj
    public final Drawable b(Context context) {
        return j14.i0(2131232188, context);
    }

    @Override // defpackage.wcj
    public final CharSequence d(Context context) {
        return context.getResources().getString(2132020554);
    }

    @Override // defpackage.wcj
    public final String getId() {
        return ".print_share";
    }
}
