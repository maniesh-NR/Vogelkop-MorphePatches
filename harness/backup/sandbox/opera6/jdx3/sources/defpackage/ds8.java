package defpackage;

import java.util.Collections;

/* loaded from: classes.dex */
public final /* synthetic */ class ds8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ es8 b;

    public /* synthetic */ ds8(es8 es8Var, byte b) {
        this.a = b;
        this.b = es8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        es8 es8Var = this.b;
        switch (b) {
            case 0:
                es8Var.X();
                break;
            default:
                es8Var.X();
                if (!es8.e && es8Var.b.d()) {
                    es8.e = true;
                    StringBuilder sb = new StringBuilder();
                    es8Var.U(sb);
                    ks3.E(new yo8("Stuck placeholders", (String) null), Collections.singletonMap("debug_fav_placeholder", sb.toString()));
                    break;
                }
                break;
        }
    }
}
