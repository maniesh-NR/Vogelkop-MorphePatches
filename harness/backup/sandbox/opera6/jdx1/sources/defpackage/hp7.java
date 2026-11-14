package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class hp7 extends g7h {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hp7(Function0 function0, byte b) {
        super(function0);
        this.b = b;
    }

    @Override // defpackage.g7h
    public final k7h a(Object obj) {
        switch (this.b) {
            case 0:
                return new k7h(this, obj, obj == null, zpa.k, null, true);
            default:
                return new k7h(this, obj, obj == null, null, null, false);
        }
    }
}
