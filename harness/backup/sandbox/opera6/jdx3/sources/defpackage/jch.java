package defpackage;

import com.opera.android.PushedContentHandler;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final class jch implements Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public jch(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            PushedContentHandler pushedContentHandler = PushedContentHandler.p;
            pushedContentHandler.g.d(new py4(pushedContentHandler, this.a, this.b, (byte) 1)).a(null);
        }
    }
}
