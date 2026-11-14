package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.internal.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class odh implements ndh {
    public final b59 a;

    public odh(Context context, umi umiVar) {
        this.a = w1h.l(context, umiVar, "PushedSpeedDialPrefs", new bg1[0]);
    }

    @Override // defpackage.ndh
    public final Set a() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.a.get();
        v08 v08Var = v08.a;
        v08 v08VarO = w1h.o(sharedPreferences, "removed_speed_dials", v08Var);
        if (v08VarO != null) {
            v08Var = v08VarO;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) v08Var).iterator();
        while (it.hasNext()) {
            Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
            if (intOrNull != null) {
                arrayList.add(intOrNull);
            }
        }
        return CollectionsKt.n0(arrayList);
    }

    @Override // defpackage.ndh
    public final void b(int i) {
        List listF = CollectionsKt.F(b5j.e(a(), Collections.singletonList(Integer.valueOf(i))));
        SharedPreferences.Editor editorEdit = ((SharedPreferences) this.a.get()).edit();
        List list = listF;
        ArrayList arrayList = new ArrayList(k95.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        editorEdit.putStringSet("removed_speed_dials", CollectionsKt.n0(arrayList)).apply();
    }

    @Override // defpackage.ndh
    public final void c() {
        j.d((SharedPreferences) this.a.get(), "user_disabled_feature", true);
    }

    @Override // defpackage.ndh
    public final void d() {
        ((SharedPreferences) this.a.get()).edit().remove("removed_speed_dials").remove("user_disabled_feature").apply();
    }

    @Override // defpackage.ndh
    public final boolean e() {
        return ((SharedPreferences) this.a.get()).getBoolean("user_disabled_feature", false);
    }
}
