package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class z5k extends v5k {
    public final /* synthetic */ byte d;
    public final k6k e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5k(Class cls, ijc ijcVar, e6k e6kVar, int i, byte b) {
        super(cls, ijcVar, e6kVar, i);
        this.d = b;
        switch (b) {
            case 1:
                super(cls, ijcVar, e6kVar, i);
                this.e = new o4b(e6kVar, this, (byte) 8);
                break;
            default:
                this.e = new o4b(e6kVar, this, (byte) 7);
                break;
        }
    }

    @Override // defpackage.v5k
    public final ab2 B(ViewGroup viewGroup) {
        switch (this.d) {
        }
        return C().r();
    }

    public abstract agm C();

    @Override // defpackage.u5k
    public final k6k u() {
        switch (this.d) {
        }
        return (o4b) this.e;
    }
}
