package defpackage;

import com.opera.android.annotations.WeakOwner;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gte {
    public final t5j a;
    public final vr9 b;

    @WeakOwner
    private fte c;
    public final /* synthetic */ i3j d;

    public gte(i3j i3jVar, String str, t5j t5jVar, vr9 vr9Var) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) i3jVar.d;
        ArrayList arrayList = t5jVar.c;
        String str2 = t5jVar.b;
        this.d = i3jVar;
        this.a = t5jVar;
        this.b = vr9Var;
        wv1 wv1Var = (wv1) i3jVar.a;
        fqe fqeVar = (fqe) wv1Var.get();
        dqe dqeVar = fqeVar.i;
        dqeVar.a = str;
        dqeVar.b = true;
        uqe uqeVar = fqeVar.c;
        if (uqeVar != null) {
            uqeVar.i.c();
        }
        if (str2 == null && arrayList.isEmpty()) {
            vr9Var.run();
            return;
        }
        linkedHashSet.add(this);
        l0c l0cVarA = str2 != null ? l0c.a(str2) : null;
        if (l0cVarA != null) {
            ((fqe) wv1Var.get()).b().g(l0cVarA);
        }
        if (arrayList.isEmpty()) {
            linkedHashSet.remove(this);
            vr9Var.run();
            return;
        }
        ((SettingsManager) i3jVar.b).V(1, "enable_newsfeed");
        if (arrayList.size() != 1 || !Intrinsics.a(CollectionsKt.K(arrayList), "<existing>")) {
            this.c = new fte(this, l0cVarA, (fqe) wv1Var.get());
        } else {
            linkedHashSet.remove(this);
            vr9Var.run();
        }
    }
}
