package defpackage;

import com.opera.android.widget.UrlFieldEditText;

/* loaded from: classes.dex */
public final /* synthetic */ class wv7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ UrlFieldEditText b;

    public /* synthetic */ wv7(UrlFieldEditText urlFieldEditText, byte b) {
        this.a = b;
        this.b = urlFieldEditText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        UrlFieldEditText urlFieldEditText = this.b;
        switch (b) {
            case 0:
                urlFieldEditText.y = true;
                break;
            case 1:
                urlFieldEditText.y = true;
                break;
            default:
                int i = UrlFieldEditText.i0;
                urlFieldEditText.D();
                break;
        }
    }
}
