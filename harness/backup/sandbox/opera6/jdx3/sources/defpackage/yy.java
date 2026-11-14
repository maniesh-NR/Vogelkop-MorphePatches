package defpackage;

import androidx.annotation.NonNull;
import com.opera.android.annotations.WeakOwner;

/* loaded from: classes.dex */
public final class yy extends lim implements due {
    public final wy a;
    public final fqe b;
    public final fue c;

    @NonNull
    @WeakOwner
    private final q8j d = new xy(this, 0);
    public boolean e;

    public yy(cue cueVar, wy wyVar, fqe fqeVar, fue fueVar) {
        this.a = wyVar;
        this.b = fqeVar;
        this.c = fueVar;
        String str = cueVar.ordinal() != 1 ? "" : "Newsfeed";
        i5o i5oVar = (i5o) wyVar.e.d;
        i5oVar.n = str;
        i5oVar.i();
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        this.c.b(this);
        this.b.a(this.d);
    }

    @Override // defpackage.due
    public final void b(cue cueVar) {
        String str = cueVar.ordinal() != 1 ? "" : "Newsfeed";
        i5o i5oVar = (i5o) this.a.e.d;
        i5oVar.n = str;
        i5oVar.i();
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        this.c.e(this);
        this.e = true;
    }
}
