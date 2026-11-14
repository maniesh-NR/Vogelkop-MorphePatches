package defpackage;

import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class fq9 implements iq9 {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final /* synthetic */ Object c;

    public fq9(meg megVar, BrowserActivity browserActivity) {
        this.c = megVar;
        this.b = browserActivity;
    }

    public fq9(z1h z1hVar, eq9 eq9Var) {
        this.b = z1hVar;
        this.c = eq9Var;
    }

    private final void a(boolean z) {
    }

    @Override // defpackage.iq9
    public final void F(boolean z, boolean z2) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((z1h) obj).b(Boolean.valueOf(((eq9) obj2).c()));
                break;
            default:
                if (!z) {
                    ((BrowserActivity) obj).moveTaskToBack(true);
                    ((meg) obj2).a();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.iq9
    public final void P(boolean z) {
        switch (this.a) {
            case 0:
                ((z1h) this.b).b(Boolean.valueOf(((eq9) this.c).c()));
                break;
        }
    }
}
