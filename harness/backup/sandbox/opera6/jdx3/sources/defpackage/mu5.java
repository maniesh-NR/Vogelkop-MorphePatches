package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class mu5 extends tjf {
    public final /* synthetic */ byte j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mu5(View view, x1p x1pVar, Function1 function1, byte b) {
        super(view, x1pVar, function1);
        this.j = b;
    }

    @Override // defpackage.tjf
    public final boolean f() {
        switch (this.j) {
            case 1:
                return true;
            default:
                return super.f();
        }
    }
}
