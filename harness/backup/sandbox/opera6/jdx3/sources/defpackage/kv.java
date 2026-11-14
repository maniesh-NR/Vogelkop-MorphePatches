package defpackage;

import android.widget.EditText;

/* loaded from: classes.dex */
public final /* synthetic */ class kv implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ EditText b;

    public /* synthetic */ kv(EditText editText, byte b) {
        this.a = b;
        this.b = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        EditText editText = this.b;
        switch (b) {
            case 0:
                q9n.H(editText);
                break;
            default:
                if (editText.requestFocus()) {
                    l5b l5bVar = q9n.c;
                    q9n.G(editText.getContext(), editText);
                    break;
                }
                break;
        }
    }
}
