package defpackage;

import android.content.Context;
import android.text.style.ClickableSpan;

/* loaded from: classes.dex */
public final /* synthetic */ class jgc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ks3 b;

    public /* synthetic */ jgc(ks3 ks3Var, byte b) {
        this.a = b;
        this.b = ks3Var;
    }

    public final ClickableSpan a(String str, String str2) {
        byte b = this.a;
        ks3 ks3Var = this.b;
        switch (b) {
            case 0:
                return new rgc((Context) ks3Var.b);
            default:
                return new sgc((Context) ks3Var.b);
        }
    }
}
