package defpackage;

import J.N;

/* loaded from: classes.dex */
public final class z0h implements j6l {
    public gwi a;
    public boolean b;

    @Override // defpackage.j6l
    public final void H(b2l b2lVar, b2l b2lVar2, int i) {
        boolean z = false;
        boolean z2 = b2lVar2 != null && ((d7l) b2lVar2).j.m();
        if (b2lVar != null && ((d7l) b2lVar).j.m()) {
            z = true;
        }
        if (z2 == z) {
            return;
        }
        a(z2);
    }

    public final void a(boolean z) {
        if (this.a != null) {
            if (z) {
                if ((!wbc.g.c() ? false : N.MFTJCvBh()) && N.M$PqApPr("IncognitoScreenshot")) {
                    z = false;
                }
            }
            if (z == this.b) {
                return;
            }
            this.b = z;
            this.a.b(z);
        }
    }

    @Override // defpackage.j6l
    public final void onDestroy() {
        a(false);
        this.a = null;
    }
}
