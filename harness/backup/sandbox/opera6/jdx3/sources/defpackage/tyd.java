package defpackage;

import com.opera.api.Callback;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class tyd implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wyd b;

    public /* synthetic */ tyd(wyd wydVar, byte b) {
        this.a = b;
        this.b = wydVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) throws Throwable {
        byte b = this.a;
        this.b.a((List) obj);
    }
}
