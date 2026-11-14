package defpackage;

import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class a3c implements y2c {
    public final /* synthetic */ byte a;
    public final x2c b;

    public a3c(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new x2c(true, true, false, false);
                break;
            default:
                this.b = new x2c(false, false, true, true);
                break;
        }
    }

    private final void b() {
    }

    private final void c() {
    }

    @Override // defpackage.y2c
    public final x2c a(i iVar) {
        byte b = this.a;
        return this.b;
    }

    @Override // defpackage.y2c
    public final void invalidate() {
        byte b = this.a;
    }
}
