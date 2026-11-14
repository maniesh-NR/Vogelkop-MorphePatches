package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class my9 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ py9 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Callback d;

    public /* synthetic */ my9(py9 py9Var, String str, Callback callback, byte b) {
        this.a = b;
        this.b = py9Var;
        this.c = str;
        this.d = callback;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        Callback callback = this.d;
        String str = this.c;
        py9 py9Var = this.b;
        dy9 dy9Var = (dy9) obj;
        switch (b) {
            case 0:
                py9Var.d(str, dy9Var, callback);
                break;
            default:
                py9Var.d(str, dy9Var, callback);
                break;
        }
    }
}
