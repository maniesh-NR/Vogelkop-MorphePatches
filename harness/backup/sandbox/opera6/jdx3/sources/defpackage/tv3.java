package defpackage;

import com.opera.android.browser.BrowserContainer;

/* loaded from: classes.dex */
public final class tv3 implements ivj {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tv3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.ivj
    public final void a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                BrowserContainer browserContainer = (BrowserContainer) obj;
                browserContainer.e(1, false);
                browserContainer.requestLayout();
                break;
            case 1:
                ((ar8) obj).o.requestLayout();
                break;
            default:
                ((z1h) obj).b(Boolean.FALSE);
                break;
        }
    }

    @Override // defpackage.ivj
    public final void b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                BrowserContainer browserContainer = (BrowserContainer) obj;
                browserContainer.e(1, true);
                browserContainer.requestLayout();
                break;
            case 1:
                ((ar8) obj).o.requestLayout();
                break;
            default:
                ((z1h) obj).b(Boolean.TRUE);
                break;
        }
    }
}
