package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.opera.android.Lazy;
import com.opera.android.custom_views.FadingRecyclerView;

/* loaded from: classes.dex */
public final class rbn extends lj implements on9 {
    public final Lazy r;
    public final cq5 s;
    public final rn9 t;

    /* JADX WARN: Illegal instructions before constructor call */
    public rbn(Lazy lazy, cq5 cq5Var) {
        u7k u7kVarE = u7k.e();
        u7kVarE.s(2132021478);
        super((itl) u7kVarE.a);
        this.r = lazy;
        this.s = cq5Var;
        this.t = new rn9(this, this, (byte) 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ltl
    public final void B0(LayoutInflater layoutInflater, FadingRecyclerView fadingRecyclerView) {
        qbn qbnVar = new qbn(fadingRecyclerView.getContext(), (jbn) this.r.get(), this.s, new lrk(1, this, rbn.class, "onItemClicked", "onItemClicked(Lcom/opera/android/voiceinput/VoiceInputFragment$Item$LanguageItem;)V", 0, (byte) 17));
        fadingRecyclerView.getContext();
        fadingRecyclerView.C0(new LinearLayoutManager());
        fadingRecyclerView.y0(qbnVar);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("highlight_active")) {
            return;
        }
        this.t.E(fadingRecyclerView, qbnVar.c ? 1 : 0);
    }

    @Override // defpackage.on9
    public final qe6 H() {
        return this.j;
    }

    @Override // defpackage.on9
    public final oba a() {
        return null;
    }
}
