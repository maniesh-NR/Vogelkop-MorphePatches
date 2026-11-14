package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class wlg {
    public static void a(List list) throws JSONException {
        if (!list.isEmpty()) {
            List list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return;
            }
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() != 0) {
                }
            }
            return;
        }
        throw new JSONException("Contains invalid icons: " + list);
    }

    @NotNull
    public final KSerializer serializer() {
        return vlg.a;
    }
}
