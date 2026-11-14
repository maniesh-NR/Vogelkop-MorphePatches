package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class e5l implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h5l b;

    public /* synthetic */ e5l(h5l h5lVar, byte b) {
        this.a = b;
        this.b = h5lVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        h5l h5lVar = this.b;
        switch (b) {
            case 0:
                h5lVar.e0();
                break;
            case 1:
                Drawable drawable = (Drawable) obj;
                h5lVar.k = drawable;
                h5lVar.b.i.setBackground(drawable);
                break;
            default:
                h5lVar.b.j.setBackground((Drawable) obj);
                break;
        }
        return Unit.a;
    }
}
