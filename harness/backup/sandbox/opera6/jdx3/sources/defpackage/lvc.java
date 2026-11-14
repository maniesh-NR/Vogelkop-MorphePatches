package defpackage;

import androidx.annotation.NonNull;
import com.opera.android.annotations.WeakOwner;

/* loaded from: classes.dex */
public final class lvc {
    public final fqe a;
    public final fue b;

    @NonNull
    @WeakOwner
    private final q8j c = new xy(this, 3);
    public final kvc d;
    public String e;
    public bn7 f;
    public uqe g;

    public lvc(fqe fqeVar, fue fueVar) {
        kvc kvcVar = new kvc(this, (byte) 0);
        this.d = kvcVar;
        this.e = "";
        this.a = fqeVar;
        this.b = fueVar;
        fueVar.b(kvcVar);
        fueVar.d();
        b(fueVar.a);
    }

    public final void b(cue cueVar) {
        if (cueVar != cue.NewsFeed) {
            this.g = null;
        } else if (this.g == null) {
            uqe uqeVarC = this.a.c();
            this.g = uqeVarC;
            uqeVarC.g(this.c);
        }
    }
}
