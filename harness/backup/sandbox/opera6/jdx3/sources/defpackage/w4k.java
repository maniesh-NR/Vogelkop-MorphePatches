package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import com.opera.android.browser.OperaPageRootView;

/* loaded from: classes.dex */
public final class w4k {
    public final /* synthetic */ c5k a;

    public w4k(c5k c5kVar) {
        this.a = c5kVar;
    }

    @vkk
    public void a(@NonNull u6d u6dVar) {
        t6d t6dVar = u6dVar.a;
        t6d t6dVar2 = t6d.a;
        c5k c5kVar = this.a;
        bp bpVar = c5kVar.F;
        if (t6dVar == t6dVar2) {
            View view = (View) bpVar.b;
            if (view != null) {
                view.setImportantForAccessibility(bpVar.a);
            }
            bpVar.b = null;
            return;
        }
        OperaPageRootView operaPageRootView = c5kVar.c;
        View view2 = (View) bpVar.b;
        if (view2 == operaPageRootView) {
            return;
        }
        if (view2 != null) {
            view2.setImportantForAccessibility(bpVar.a);
        }
        bpVar.b = operaPageRootView;
        bpVar.a = operaPageRootView.getImportantForAccessibility();
        operaPageRootView.setImportantForAccessibility(4);
    }

    @vkk
    public void b(@NonNull aqe aqeVar) {
        boolean z = aqeVar.b;
        c5k c5kVar = this.a;
        if (z) {
            c5kVar.j.V(1, "enable_newsfeed");
        }
        c5kVar.C.run();
        c5kVar.g(new f1p(cue.NewsFeed, aqeVar.a), true, true);
    }
}
