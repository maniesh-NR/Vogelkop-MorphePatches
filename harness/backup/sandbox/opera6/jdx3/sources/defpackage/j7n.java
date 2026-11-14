package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class j7n implements Runnable {
    final /* synthetic */ Function1<View, Unit> a;
    final /* synthetic */ View b;

    public j7n(o5f o5fVar, View view) {
        this.a = o5fVar;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.invoke(this.b);
    }
}
