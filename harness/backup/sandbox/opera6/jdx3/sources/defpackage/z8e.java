package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final /* synthetic */ class z8e implements gdb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ z8e(Fragment fragment, byte b) {
        this.a = b;
        this.b = fragment;
    }

    public final void q(IntentSender intentSender, int i) {
        switch (this.a) {
            case 0:
                this.b.startIntentSenderForResult(intentSender, i, (Intent) null, 0, 0, 0, (Bundle) null);
                break;
            default:
                this.b.startIntentSenderForResult(intentSender, i, (Intent) null, 0, 0, 0, (Bundle) null);
                break;
        }
    }
}
