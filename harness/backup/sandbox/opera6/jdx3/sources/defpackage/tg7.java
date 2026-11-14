package defpackage;

import android.content.res.Resources;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class tg7 extends o93 implements ddn {
    public final /* synthetic */ byte c = 0;
    public int d;
    public Object e;

    public /* synthetic */ tg7() {
    }

    public tg7(int i, tvk tvkVar) {
        this.d = i;
        this.e = tvkVar;
    }

    public tg7(wrl wrlVar, int i) {
        this.d = i;
        Objects.requireNonNull(wrlVar);
        this.e = wrlVar;
    }

    @Override // defpackage.ddn
    public final int a() {
        return this.d;
    }

    @Override // defpackage.ddn
    public final void cancel() {
        b(hjm.b, 3);
    }

    @Override // defpackage.o93
    public final gtj e(View view) {
        switch (this.c) {
            case 0:
                gtj gtjVarC = gtj.c(view, 2132018702, -2);
                gtjVarC.i();
                gtjVarC.h(this.d);
                this.e = gtjVarC;
                return gtjVarC;
            case 1:
                wrl wrlVar = (wrl) this.e;
                int i = this.d;
                Resources resources = wrlVar.a;
                NestedScrollView nestedScrollView = wrlVar.g;
                gtj gtjVarE = gtj.e(nestedScrollView, view.getContext().getString(2132019657, i != 0 ? i != 1 ? i != 2 ? i != 3 ? "" : resources.getString(2132021306) : resources.getString(2132021072) : resources.getString(2132021177) : resources.getString(2132022280)), 5000);
                gtjVarE.f(2132021453, new g63(this, i, (byte) 4));
                gtjVarE.b(nestedScrollView);
                return gtjVarE;
            default:
                return gtj.c(view, 2132022253, Integer.MAX_VALUE);
        }
    }

    @Override // defpackage.o93
    public final void f(int i) {
        switch (this.c) {
            case 0:
                this.e = null;
                break;
            case 2:
                ((cdn) ((tvk) this.e).a).o = null;
                break;
        }
    }
}
