package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class cej implements oim {
    private boolean mFinished;

    @Nullable
    private kjm mRequestDismisser;

    @NonNull
    public final dej create(@NonNull Context context, @Nullable b2l b2lVar) {
        dej dejVarCreateSheet = createSheet(createSheetHost(context), b2lVar);
        dejVarCreateSheet.a.b(new of(this, (byte) 3));
        return dejVarCreateSheet;
    }

    public dej createSheet(mej mejVar, b2l b2lVar) {
        return new e8g(mejVar, mejVar.getContext().getString(2132022183), false);
    }

    public mej createSheetHost(Context context) {
        return new vq3(context);
    }

    @Override // defpackage.jjm
    public final void finish(@NonNull hjm hjmVar) {
        if (this.mFinished) {
            return;
        }
        this.mFinished = true;
        onFinished(hjmVar);
        this.mRequestDismisser.o(this, hjmVar);
    }

    public boolean isAllowed(b2l b2lVar) {
        return true;
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
