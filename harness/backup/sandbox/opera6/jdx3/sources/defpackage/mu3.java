package defpackage;

import J.N;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.SessionStore;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public final class mu3 implements j6l {
    public final /* synthetic */ BrowserActivity a;

    public mu3(BrowserActivity browserActivity) {
        this.a = browserActivity;
    }

    @Override // defpackage.j6l
    public final void z() {
        v08 v08Var;
        BrowserActivity browserActivity = this.a;
        fnh fnhVar = browserActivity.C;
        if (fnhVar == null) {
            v08Var = v08.a;
        } else {
            SessionStore sessionStore = fnhVar.f;
            sessionStore.getClass();
            ArrayList arrayList = new ArrayList();
            N.MqkthI77(sessionStore.a, arrayList);
            v08Var = (Set) arrayList.stream().map(new mn((byte) 18)).collect(Collectors.toSet());
        }
        u4l u4lVar = (u4l) browserActivity.y.a.s.get();
        mr3 mr3Var = new mr3((byte) 4);
        u4lVar.getClass();
        u4lVar.d.f(new jbd(u4lVar, new lt(v08Var, (byte) 1), mr3Var, (byte) 24));
    }
}
