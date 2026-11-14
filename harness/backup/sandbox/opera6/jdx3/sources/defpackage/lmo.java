package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class lmo implements xoo {
    public final /* synthetic */ byte a;
    public final Function0 b;

    public /* synthetic */ lmo(Function0 function0, byte b) {
        this.a = b;
        this.b = function0;
    }

    private final void c() {
    }

    @Override // defpackage.xoo
    public final void a() {
        byte b = this.a;
        qqo qqoVar = this.b;
        switch (b) {
            case 0:
                qqoVar.invoke();
                break;
            default:
                qqoVar.invoke();
                break;
        }
    }

    @Override // defpackage.xoo
    public final void b() {
        switch (this.a) {
            case 0:
                this.b.invoke();
                break;
        }
    }
}
