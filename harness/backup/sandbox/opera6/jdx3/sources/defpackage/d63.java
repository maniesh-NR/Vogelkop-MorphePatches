package defpackage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class d63 implements b87 {

    @NonNull
    protected hjm mDismissReason = hjm.b;
    private boolean mFinished;

    @Nullable
    private kjm mRequestDismisser;

    @Override // defpackage.jjm
    public final void finish(@NonNull hjm hjmVar) {
        if (this.mFinished) {
            return;
        }
        this.mFinished = true;
        this.mDismissReason = hjmVar;
        kjm kjmVar = this.mRequestDismisser;
        if (kjmVar != null) {
            kjmVar.o(this, hjmVar);
        }
        onFinished(hjmVar);
    }

    @Override // defpackage.oim
    public boolean isFinished() {
        return this.mFinished;
    }

    public void onFinished(@NonNull hjm hjmVar) {
    }

    @Override // defpackage.jjm
    public final void setRequestDismisser(@NonNull kjm kjmVar) {
        this.mRequestDismisser = kjmVar;
    }
}
