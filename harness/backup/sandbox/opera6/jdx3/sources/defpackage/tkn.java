package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class tkn implements View.OnScrollChangeListener {
    public boolean a;
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ ukn c;

    public tkn(ukn uknVar, RecyclerView recyclerView) {
        this.b = recyclerView;
        this.c = uknVar;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        if (this.b.N == 1) {
            this.a = true;
        } else if (this.a) {
            mnn mnnVar = this.c.t.g;
            if (mnnVar != null) {
                mnnVar.b++;
            }
            this.a = false;
        }
    }
}
