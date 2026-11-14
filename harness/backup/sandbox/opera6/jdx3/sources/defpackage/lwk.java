package defpackage;

import android.view.View;
import com.opera.android.ui.catalog.widget.OperaIconedMessage;

/* loaded from: classes.dex */
public final class lwk implements a5n {
    public final /* synthetic */ byte a;
    public final OperaIconedMessage b;

    public /* synthetic */ lwk(OperaIconedMessage operaIconedMessage, byte b) {
        this.a = b;
        this.b = operaIconedMessage;
    }

    public static lwk a(View view) {
        if (view != null) {
            return new lwk((OperaIconedMessage) view, (byte) 1);
        }
        t3p.q("rootView");
        return null;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        return this.b;
    }
}
