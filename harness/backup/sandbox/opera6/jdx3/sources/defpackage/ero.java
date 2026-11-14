package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class ero extends aoo {
    public final /* synthetic */ byte u;
    public ViewGroup v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ero(Context context, View view, byte b) {
        super(context, view);
        this.u = b;
    }

    @Override // defpackage.aoo
    public final View k() {
        byte b = this.u;
        Context context = this.a;
        switch (b) {
            case 0:
                RecyclerView jxoVar = new jxo(context, null, 0);
                jxoVar.C0(new GridLayoutManager(3));
                new x93().b = context;
                jxoVar.t = true;
                jxoVar.setWillNotDraw(true);
                this.v = jxoVar;
                addView((View) this.v, new FrameLayout.LayoutParams(-1, -1));
                return (jxo) this.v;
            default:
                this.v = new y46(context, (AttributeSet) null, -1);
                addView((y46) this.v, new FrameLayout.LayoutParams(-1, -2));
                return (y46) this.v;
        }
    }

    @Override // defpackage.aoo
    public final void p() {
        switch (this.u) {
            case 1:
                fro froVar = (fro) ((y46) this.v).c;
                if (froVar != null) {
                    froVar.a();
                    break;
                }
                break;
        }
    }
}
