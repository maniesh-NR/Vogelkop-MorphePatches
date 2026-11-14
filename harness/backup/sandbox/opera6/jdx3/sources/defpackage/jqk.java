package defpackage;

import J.N;
import com.opera.android.suggestion.SuggestionManagerBridge;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class jqk {
    public final umi a;
    public final SuggestionManagerBridge b;
    public final x5f c;
    public eyi d;
    public List e = new ArrayList();
    public String f;
    public String g;
    public oml h;
    public boolean i;
    public boolean j;
    public boolean k;

    public jqk(umi umiVar, SuggestionManagerBridge suggestionManagerBridge, x5f x5fVar) {
        this.a = umiVar;
        this.b = suggestionManagerBridge;
        this.c = x5fVar;
    }

    public final void a() {
        this.g = null;
        this.e.clear();
        N.MFZ1dBII(this.b.a);
        oml omlVar = this.h;
        if (omlVar != null) {
            omlVar.cancel(false);
            this.h = null;
        }
        this.d.k(this.f, this.e, false);
    }
}
