package defpackage;

import android.view.ViewParent;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class h7n extends nr9 implements Function1 {
    public static final h7n a = new h7n();

    public h7n() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    public final Object invoke(Object obj) {
        return ((ViewParent) obj).getParent();
    }
}
