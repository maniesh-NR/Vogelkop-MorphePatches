package defpackage;

import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class wjb extends y08 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z1h b;

    public /* synthetic */ wjb(z1h z1hVar, byte b) {
        this.a = b;
        this.b = z1hVar;
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void G(b2l b2lVar) {
        byte b = this.a;
        boolean zA0 = false;
        z1h z1hVar = this.b;
        switch (b) {
            case 0:
                String url = ((d7l) b2lVar).j.getUrl();
                if (url != null && url.length() != 0) {
                    zA0 = z5i.a0(url);
                }
                z1hVar.b(Boolean.valueOf(zA0));
                break;
            default:
                String url2 = ((d7l) b2lVar).j.getUrl();
                if (url2 != null && url2.length() != 0) {
                    GURL gurl = new GURL(url2);
                    if (gurl.b && (gurl.f().equals("http") || gurl.f().equals("https"))) {
                        zA0 = true;
                    }
                }
                z1hVar.b(Boolean.valueOf(zA0));
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void x(b2l b2lVar) {
        byte b = this.a;
        boolean zA0 = false;
        z1h z1hVar = this.b;
        switch (b) {
            case 0:
                String url = ((d7l) b2lVar).j.getUrl();
                if (url != null && url.length() != 0) {
                    zA0 = z5i.a0(url);
                }
                z1hVar.b(Boolean.valueOf(zA0));
                break;
            default:
                String url2 = ((d7l) b2lVar).j.getUrl();
                if (url2 != null && url2.length() != 0) {
                    GURL gurl = new GURL(url2);
                    if (gurl.b && (gurl.f().equals("http") || gurl.f().equals("https"))) {
                        zA0 = true;
                    }
                }
                z1hVar.b(Boolean.valueOf(zA0));
                break;
        }
    }
}
