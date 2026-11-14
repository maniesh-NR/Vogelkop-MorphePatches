package defpackage;

import com.opera.android.browser.BrowserDataManager$SizeCallback;
import com.opera.android.readermode.ReaderModeHelper$SizeCallback;

/* loaded from: classes.dex */
public final /* synthetic */ class u25 implements BrowserDataManager$SizeCallback, ReaderModeHelper$SizeCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v25 b;
    public final /* synthetic */ s25 c;
    public final /* synthetic */ iu2 d;

    public /* synthetic */ u25(v25 v25Var, s25 s25Var, iu2 iu2Var, byte b) {
        this.a = b;
        this.b = v25Var;
        this.c = s25Var;
        this.d = iu2Var;
    }

    @Override // com.opera.android.browser.BrowserDataManager$SizeCallback, com.opera.android.readermode.ReaderModeHelper$SizeCallback
    public final void run(long j) {
        byte b = this.a;
        iu2 iu2Var = this.d;
        s25 s25Var = this.c;
        v25 v25Var = this.b;
        switch (b) {
            case 0:
                v25Var.f += j;
                v25Var.e(s25Var, iu2Var);
                break;
            default:
                v25Var.f += j;
                v25Var.e(s25Var, iu2Var);
                break;
        }
    }
}
