package defpackage;

/* loaded from: classes.dex */
public final class ht3 extends y08 {
    public final /* synthetic */ byte a;

    public /* synthetic */ ht3(byte b) {
        this.a = b;
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void G(b2l b2lVar) {
        switch (this.a) {
            case 1:
                String url = ((d7l) b2lVar).j.m() ? "<private tab>" : ((d7l) b2lVar).j.getUrl();
                if (url != null) {
                    String[] strArr = aik.a;
                    int iIndexOf = url.indexOf(63);
                    if (iIndexOf >= 0) {
                        url = url.substring(0, iIndexOf);
                    }
                    ks3.I(45, aik.p(url));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void x(b2l b2lVar) {
        switch (this.a) {
            case 1:
                d7l d7lVar = (d7l) b2lVar;
                String url = d7lVar.j.m() ? "<private tab>" : d7lVar.j.getUrl();
                if (d7lVar.j.isActive() && url != null) {
                    String[] strArr = aik.a;
                    int iIndexOf = url.indexOf(63);
                    if (iIndexOf >= 0) {
                        url = url.substring(0, iIndexOf);
                    }
                    ks3.I(45, aik.p(url));
                    break;
                }
                break;
        }
    }
}
