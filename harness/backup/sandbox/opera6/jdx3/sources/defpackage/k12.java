package defpackage;

import android.net.Uri;
import com.opera.api.Callback;
import org.chromium.ui.base.Clipboard;

/* loaded from: classes.dex */
public final /* synthetic */ class k12 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pjn b;

    public /* synthetic */ k12(pjn pjnVar, byte b) {
        this.a = b;
        this.b = pjnVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        pjn pjnVar = this.b;
        switch (b) {
            case 0:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    Clipboard.getInstance().e(uri);
                    break;
                } else {
                    pjnVar.m(2132019200);
                    break;
                }
            default:
                pjnVar.m(((Boolean) obj).booleanValue() ? 2132022313 : 2132019200);
                break;
        }
    }
}
