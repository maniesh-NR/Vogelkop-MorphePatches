package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.opera.android.custom_views.FadingRecyclerView;
import defpackage.ate;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxjk;", "Late;", "T", "Llj;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class xjk<T extends ate> extends lj {
    public xjk() {
        super((itl) u7k.e().a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ltl
    public void B0(LayoutInflater layoutInflater, FadingRecyclerView fadingRecyclerView) {
        fadingRecyclerView.getContext();
        fadingRecyclerView.C0(new LinearLayoutManager(1, false));
        fadingRecyclerView.y0(G0());
    }

    public abstract ev5 G0();

    public abstract sse H0();

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        pad padVar = H0().b;
        if (padVar == null) {
            padVar = null;
        }
        ate ateVar = (ate) padVar.b;
        if (ateVar != null) {
            this.l.D(ateVar.b);
        }
    }
}
