package defpackage;

import com.opera.android.custom_views.FadingRecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class u8j implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c9j b;

    public /* synthetic */ u8j(c9j c9jVar, byte b) {
        this.a = b;
        this.b = c9jVar;
    }

    public final Object invoke() {
        byte b = this.a;
        c9j c9jVar = this.b;
        switch (b) {
            case 0:
                xtb[] xtbVarArr = c9j.w;
                return new y8j(c9jVar);
            case 1:
                xtb[] xtbVarArr2 = c9j.w;
                return new yz7((y8j) c9jVar.s.getValue(), 2, 2132021308, 2131951669, 0);
            default:
                ((FadingRecyclerView) c9jVar.t.c).x0(0);
                return Unit.a;
        }
    }
}
